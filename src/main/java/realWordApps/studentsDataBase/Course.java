package realWordApps.studentsDataBase;

public class Course {
    private String courseName;
    private double price;

    public Course(String courseName, double price) {
        this.courseName = courseName;
        this.price = price;
    }

    public String getCourseName() {
        return courseName;
    }

    public double getPrice() {
        return price;
    }
}
