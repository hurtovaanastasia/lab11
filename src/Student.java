public class Student extends Person{
    public int Course;
    public String Faculty;
    private int Admission;
    Student(String FIO, String Telephone, int Age, int Course, String Faculty, int Admission){
        super(FIO, Telephone, Age);
        this.Course = Course;
        this.Faculty = Faculty;
        this.Admission = Admission;
    }
    public int getDate() {
        return Admission;
    }
    public void setDate(int Admission) {
        this.Admission = Admission;
    }
}
