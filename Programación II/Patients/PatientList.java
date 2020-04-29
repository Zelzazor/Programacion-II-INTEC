public interface PatientList{
    public PositiveIntegerOrZero size();
    public boolean add(Patient newPatient);
    public boolean contains(Patient somePatient);
    public boolean remove(Patient somePatient);
    public Patient[] all();
}