import java.util.LinkedList;

public class PatientLinkedListDefault implements PatientList{
    private LinkedList<Patient> patients = new LinkedList<Patient>();

    private PositiveIntegerOrZero tamano = new PositiveIntegerOrZero(0);
    public PositiveIntegerOrZero size(){
        return tamano;
    }

    public boolean add(Patient newPatient){
        if(contains(newPatient))
            return false;
        else{
            patients.add(newPatient);
            tamano.setValue((tamano.getValue())+1);
            return true;
        }
    }

    public boolean contains(Patient somePatient){
        if(patients.isEmpty())
            return false;
        
        for(int i = 0; i < tamano.getValue();i++){
            if(somePatient.getFullName().equals(patients.get(i).getFullName())){
                return true;
            }
        }

        return false;
    }

    public boolean remove(Patient somePatient){
        if(!contains(somePatient))
            return false;
        patients.remove(somePatient);
        tamano.setValue((tamano.getValue())-1);
        return true;
    }

    public PositiveIntegerOrZero getSize(){
        return tamano;
    }

    public Patient[] all(){
       return patients.toArray(new Patient[tamano.getValue()]);
    }
}