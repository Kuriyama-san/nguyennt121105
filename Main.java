import service.StudentService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentService s = new StudentService();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add | 2. Delete | 3. Show | 4. Exit");
            System.out.print("Your choice: ");
            int choice;
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                continue;
            }

            switch (choice) {
                case 1:
                    s.addStudent();
                    break;
                case 2:
                    s.deleteStudent();
                    break;
                case 3:
                    s.displayAll();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please choose between 1–4.");
            }
        }
    }
}
