public class Person{
    public String FIO;
    public String Telephone;
    private int Age;
    Person(String FIO, String Telephone, int age){
        this.FIO = FIO;
        this.Telephone = Telephone;
        this.Age = age;
    }
    public int getAge() {
        return Age;
    }
    public void setAge(int Age) {
        this.Age = Age;
    }
}
