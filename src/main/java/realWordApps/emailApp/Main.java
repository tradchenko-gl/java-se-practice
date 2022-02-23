package realWordApps.emailApp;

import realWordApps.studentsDataBase.Course;
import realWordApps.studentsDataBase.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee("John", "Doe", Employee.Departments.ACCOUNTING);
        Employee employee2 = new Employee("Ben", "Stevenson", Employee.Departments.NONE);
        //employee1.mailBox().setPassword("Password01");
        employee1.mailBox().setMailBoxCapacity(1000);
        employee1.mailBox().setAlternateEmailAddress("emil@test.com");

        System.out.println(employee1.mailBox().getEmailAddress());
        System.out.println(employee1.mailBox().getPassword());
        System.out.println(employee1.mailBox().getMailBoxCapacity());
        System.out.println(employee1.mailBox().getAlternateEmailAddress());

        //Students DB
        Course math = new Course("Mathematics", 600);
        Course history = new Course("History", 600);
        Course english = new Course("English", 600);
        Course crazyPrice = new Course("Crazy price", 3600);

        Student st1 = new Student("Jon Doe", 1, 5000);
        st1.enrollStudentToACourse(math);
        st1.enrollStudentToACourse(history);
        st1.enrollStudentToACourse(english);
        st1.enrollStudentToACourse(crazyPrice);

        st1.printStudentData();

        //From scanner
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        System.out.println("Please enter number of students to add: ");
        int numberOfStudents = scanner.nextInt();
        if(numberOfStudents > 0) {
            int counter = 1;
            while(counter <= numberOfStudents) {
                System.out.println("Please enter student #" + counter + " data: \n");
                Student student = new Student();
                students.add(student);
                counter++;
            }
        }

        students.get(0).enrollStudentToACourse(math);
        students.get(0).printStudentData();

    }


}
