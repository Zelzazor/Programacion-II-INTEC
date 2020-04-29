public class Main{
    public static void main(String[] args) {
        //PositiveIntegerOrZero num = new PositiveIntegerOrZero(3);
        
        
        //System.out.println(num.getValue());
        //System.out.println(num.toString());

        //---------------------------------------------------------

        Patient pat1 = new Patient("Felipe","Ramirez");
        Patient pat2 = new Patient("Juan", "Perez");
        pat1.addDisorder(5);
        pat1.addDisorder(16);
        
        
        //System.out.println(pat1.disorders.get(1));
        //System.out.println(pat1.getIsHealthy());
        //System.out.println(pat1.toString());

        //---------------------------------------------------------

        System.out.println("ArrayList");

        PatientArrayList lista = new PatientArrayList();

        System.out.println(lista.add(pat1)?"Patient inserted successfully":"Patient not inserted");
        System.out.println(lista.add(pat1)?"Patient inserted successfully":"Patient not inserted");
        System.out.println(lista.add(pat2)?"Patient inserted successfully":"Patient not inserted");
        System.out.println("There is "+lista.getSize()+" patient(s) on the list.");
        
        Patient[] lista_array = lista.all();

        for(int i = 0; i < lista_array.length; i++){
            System.out.println(lista_array[i].getFullName() +": "+(lista_array[i].getIsHealthy()?"Healthy":"Not Healthy"));
            System.out.println(lista_array[i].toString());
        }

        

        System.out.println(lista.remove(pat2)?"Patient removed successfully": "Patient not existant");
        System.out.println("There is "+lista.getSize()+" patient(s) on the list.");

        lista_array = lista.all();

        for(int i = 0; i < lista_array.length; i++){
            System.out.println(lista_array[i].getFullName() +": "+(lista_array[i].getIsHealthy()?"Healthy":"Not Healthy"));
            System.out.println(lista_array[i].toString());
        }

        //-----------------------------------------------------------------------------------------

        System.out.println("LinkedList");

        PatientLinkedList listaEnlazada = new PatientLinkedList();

        System.out.println(listaEnlazada.add(pat1)?"Patient inserted successfully":"Patient not inserted");
        System.out.println(listaEnlazada.add(pat1)?"Patient inserted successfully":"Patient not inserted");
        System.out.println(listaEnlazada.add(pat2)?"Patient inserted successfully":"Patient not inserted");
        System.out.println("There is "+listaEnlazada.getSize()+" patient(s) on the list.");

        lista_array = listaEnlazada.all();
        

        for(int i = 0; i < lista_array.length; i++){
            System.out.println(lista_array[i].getFullName() +": "+(lista_array[i].getIsHealthy()?"Healthy":"Not Healthy"));
            System.out.println(lista_array[i].toString());
        }

        

        System.out.println(listaEnlazada.remove(pat2)?"El paciente removed successfully": "Patient not existant");
        System.out.println("There is "+listaEnlazada.getSize()+" patient(s) on the list.");

        lista_array = listaEnlazada.all();

        for(int i = 0; i < lista_array.length; i++){
            System.out.println(lista_array[i].getFullName() +": "+(lista_array[i].getIsHealthy()?"Healthy":"Not Healthy"));
            System.out.println(lista_array[i].toString());
        }

        
    }
}