

public class PatientLinkedList implements PatientList{

    private PositiveIntegerOrZero tamano = new PositiveIntegerOrZero(0);
    
    public PositiveIntegerOrZero size(){
        return tamano;
    }

    private Node head;


    public boolean add(Patient newPatient){

        if(contains(newPatient)){
            return false;
        }

        if (head == null) {
			head = new Node(newPatient);
        }
        
        Node temp = new Node(newPatient);
        Node current = head;

        if (current != null) {
			while (current.getNextNode() != null) {
				current = current.getNextNode();
			}
			current.setNextNode(temp);
        }
        tamano.setValue((tamano.getValue())+1);
        return true;
    }

    public Patient[] all(){
        Patient[] patientsarray = new Patient[size().getValue()];

        for(int i = 0; i < tamano.getValue(); i++){
            patientsarray[i] = get(i);
        }


        return patientsarray;
    }

    public boolean removePat(int index) {
		if (index < 1 || index > size().getValue())
			return false;
 
		Node current = head;
		if (head != null) {
			for (int i = 0; i < index; i++) {
				if (current.getNextNode() == null)
					return false;
 
				current = current.getNextNode();
			}
			current.setNextNode(current.getNextNode().getNextNode());
            tamano.setValue((tamano.getValue())-1);
			
			
			return true;
 
		}
		return false;
    }
    
    public boolean remove(Patient somePatient){
        if(!contains(somePatient)){
            return false;
        }else{
            for(int i = 0; i < size().getValue();i++){
                if(somePatient.equals(get(i))){
                    return removePat(i);
                }
            }
        }
        return false;
    }


    public boolean contains(Patient somePatient){
        if(head == null){
            return false;
        }

        for(int i = 0; i < size().getValue();i++){
            if(somePatient.getFullName().equals(get(i).getFullName())){
                return true;
            }
        }

        return false;
    }



    public Patient get(int index){
		if (index < 0)
			return null;
		Node current = null;
		if (head != null) {
			current = head.getNextNode();
			for (int i = 0; i < index; i++) {
				if (current.getNextNode() == null)
					return null;
				current = current.getNextNode();
			}
			return current.getDataNode();
		}
		return current;
 
	}

   

    private class Node extends Patient {
        Node next;
        Patient dataNode;

        public Node(Patient dataNode) {
			next = null;
			this.dataNode = dataNode;
        }
           
        public Patient getDataNode() {
			return dataNode;
        }
        
        public Node getNextNode() {
			return next;
		}
 
        public void setNextNode(Node next) {
			this.next = next;
		}
    }
}