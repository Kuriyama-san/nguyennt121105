package service;

import model.Student;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentService {
    ArrayList<Student> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void addStudent() {
        System.out.println("Enter ID:");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Enter Name:");
        String name = sc.nextLine();
        System.out.println("Enter GPA:");
        double gpa = Double.parseDouble(sc.nextLine());

        list.add(new Student(id, name, gpa));
    }

    public void deleteStudent() {
        System.out.println("Enter ID to delete:");
        int id = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).id == id) {
                list.remove(i);
                break;
            }
        }
    }

    public void displayAll() {
        for (Student s : list) {
            System.out.println(s);
        }
    }
}
