import java.util.ArrayList;

public class PatientArrayList implements PatientList{

    private PositiveIntegerOrZero size = new PositiveIntegerOrZero(0);

    private ArrayList<Patient> patients = new ArrayList<Patient>();

    public boolean add(Patient newPatient){
        if(contains(newPatient))
            return false;
        else{
            patients.add(newPatient);
            size.setValue((size.getValue())+1);
            return true;
        }
    }

    public boolean contains(Patient somePatient){
        if(patients.isEmpty())
            return false;
        
        for(int i = 0; i < patients.size();i++){
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
        size.setValue((size.getValue())-1);
        return true;
    }

    public int getSize(){
        return size.getValue();
    }

    public Patient[] all(){
        return patients.toArray(new Patient[size.getValue()]);
    }

}