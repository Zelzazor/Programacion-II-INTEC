public interface PatientList{
    public boolean add(Patient newPatient);
    public boolean contains(Patient somePatient);
    public boolean remove(Patient somePatient);
    public Patient[] all();
}