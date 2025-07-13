package model;

public class Student {
    public int id;
    public String name;
    public double gpa;

    public Student(int id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    public String toString() {
        return id + " | " + name + " | " + gpa;
    }
}
