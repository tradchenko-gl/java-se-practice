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
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter student name: " );
        this.name = scanner.nextLine();
        System.out.println("Please enter student balance: ");
        this.balance = Double.parseDouble(scanner.nextLine());
        System.out.println("Please enter student year: ");
        this.year = scanner.nextInt();

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


}
