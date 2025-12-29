import java.util.Scanner;

public class SchoolAttendance {

    public static void takeAttendance() {

        Scanner sc = new Scanner(System.in);
        int students = 10;

        String names[] = new String[students];

        System.out.println("\n--------------------------------------");
        System.out.println("        STUDENT REGISTRATION");
        System.out.println("--------------------------------------");

        for (int i = 0; i < students; i++) {
            System.out.print("Enter name of student " + (i + 1) + " : ");
            names[i] = sc.nextLine();
        }

        int count = 0;

        System.out.println("\n--------------------------------------");
        System.out.println("          ATTENDANCE CHECK");
        System.out.println("--------------------------------------");

        for (int i = 0; i < students; i++) {
            System.out.print(names[i] + " present (yes/no): ");
            String status = sc.next();

            if (status.equalsIgnoreCase("yes")) {
                count++;
            }
        }

        System.out.println("\n--------------------------------------");
        System.out.println("         ATTENDANCE SUMMARY");
        System.out.println("--------------------------------------");
        System.out.println("Total Students        : " + students);
        System.out.println("Students Present      : " + count);
        System.out.println("Students Absent       : " + (students - count));
        System.out.println("--------------------------------------");
    }

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("        SCHOOL ATTENDANCE SYSTEM");
        System.out.println("======================================");

        takeAttendance();
    }
}
