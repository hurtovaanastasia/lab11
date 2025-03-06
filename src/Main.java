import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("Смирнов А.А.", "89008554224", 19, 3, "Программирование", 2022);
        students[1] = new Student("Сидоров А.А.", "89998887766", 21, 5, "Журналистика", 2020);
        students[2] = new Student("Петров П.П.", "89898787676", 18, 2, "Ядерная Физика", 2023);
        Scanner input = new Scanner(System.in);
        System.out.println("Студенты: ");
        for (Student student : students) {
            System.out.println(student.FIO + " " + student.getAge() + " лет.");
        }
        System.out.println("Введите факультет для поиска: ");
        String fakul = input.nextLine();
        System.out.println("Студенты данного факультета: " + fakul);
        for (Student student : students) {
            if (student.Faculty.equals(fakul)) {
                System.out.println(student.FIO);
            }
        }
        System.out.println("Введите год поступления: ");
        int year = input.nextInt();
        System.out.println("Студенты, поступившие после " + year + "года");
        for (Student student : students) {
            if (student.getDate() > year) {
                System.out.println(student.FIO);
            }
        }
    }
}
