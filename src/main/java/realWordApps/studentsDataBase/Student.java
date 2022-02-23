package realWordApps.studentsDataBase;

import javax.swing.plaf.synth.SynthDesktopIconUI;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Student {
    private String name;
    private int year;
    private double balance;
    private int studentID;
    private List<Course> coursesEnrolled;

    public Student(String name, int year, double balance) {
        this.name = name;
        this.year = year;
        this.balance = balance;
        this.studentID = generateStudentID(this.year);
        this.coursesEnrolled = new ArrayList<>();
    }

    public Student () {
        this.name = enterStudentName();
        this.balance = enterStudentBalace();
        this.year = enterStudentYear();

        this.studentID = generateStudentID(this.year);
        this.coursesEnrolled = new ArrayList<>();
    }

    public boolean enrollStudentToACourse(Course course) {
        if(course.getPrice() <= this.balance) {
            if (this.coursesEnrolled.size() == 0) {
                this.coursesEnrolled.add(course);
                this.balance -= course.getPrice();
                return true;
            } else {
                if(this.coursesEnrolled.contains(course)) {
                    return false;

                } else {
                    this.coursesEnrolled.add(course);
                    this.balance -= course.getPrice();
                    return true;
                }
            }
        } else {
            System.out.println("You do not have enough money to enroll to the course. You balance is: " + this.balance);
        }
        return false;
    }

    public void printStudentData () {
        System.out.println("Student name : " + this.name +
                "\nStudent ID: " + this.studentID +
                "\nBalance: " + this.balance +
                "\nCourses enrolled:\n");
        printCoursesEnrolled(this);
    }

    public double getBalance() {
        return balance;
    }

    private void printCoursesEnrolled (Student student) {
        for(int i = 0; i < this.coursesEnrolled.size(); i++) {
            System.out.println(i+1 + ": " + this.coursesEnrolled.get(i).getCourseName());
        }
    }

    private int generateStudentID(int year) {
        int studentID;
        //random 4 digits number
        int randomID;
        //variable to combine year and random 4 digits ID
        String idString ="";

        randomID = (int)Math.round(Math.random()*10000);
        idString = Integer.toString(year) + Integer.toString(randomID);
        studentID = Integer.parseInt(idString);

        return studentID;
    }

    private double enterStudentBalace () {
        Scanner scanner = new Scanner(System.in);
        double bal;
        do {
            System.out.println("Please enter student balance: ");
            while(!scanner.hasNextDouble()) {
                System.out.println("Please enter valid balance: ");
                scanner.next();
            }
            bal = scanner.nextDouble();

        } while (bal < 0);
        return bal;
    }

    private String enterStudentName() {
        String studentName;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter student name: ");
            while (!scanner.hasNextLine()) {
                System.out.println("Please enter student name: ");
                scanner.next();
            } studentName = scanner.nextLine();
        } while (studentName.length() <= 0);
        return studentName;
    }

    private int enterStudentYear() {
        int year;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Please enter student year (between 1 and 5): ");
            while(!scanner.hasNextInt()) {
                System.out.println("Please enter valid student year (number between 1 and 5): ");
                scanner.next();
            }
            year = scanner.nextInt();

        } while (year < 1 || year > 5);
        return year;
    }

}
