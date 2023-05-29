import java.util.Scanner;

public class CgpaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("CGPA Calculator");
        System.out.println("----------------");

        // Get the number of courses
        System.out.print("Enter the number of courses: ");
        int numCourses = scanner.nextInt();

        double totalGradePoints = 0.0;
        int totalCreditHours = 0;

        // Get the grades and credit hours for each course
        for (int i = 1; i <= numCourses; i++) {
            System.out.println("\nCourse " + i + ":");
            System.out.print("Enter the grade points (0-10): ");
            double gradePoints = scanner.nextDouble();

            System.out.print("Enter the credit hours: ");
            int creditHours = scanner.nextInt();

            totalGradePoints += gradePoints * creditHours;
            totalCreditHours += creditHours;
        }

        // Calculate CGPA
        double cgpa = totalGradePoints / totalCreditHours;

        // Display the CGPA
        System.out.println("\nCGPA: " + cgpa);

        scanner.close();
    }
}
