import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("------------ Electricity Bill Generator --------------");
        System.out.println("------------------------------------------------------");

        // Get user input for customer details
        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();

        System.out.print("Enter customer ID: ");
        String customerID = scanner.nextLine();

        System.out.print("Enter units consumed: ");
        int unitsConsumed = scanner.nextInt();

        // Get current date and time
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);

        // Calculate bill amount
        double billAmount = calculateBillAmount(unitsConsumed);

        // Generate bill
        System.out.println("\n------------------ Electricity Bill ------------------");
        System.out.println("Date and Time: " + formattedDateTime);
        System.out.println("------------------------------------------------------");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Customer ID: " + customerID);
        System.out.println("------------------------------------------------------");
        System.out.printf("%-20s %-20s %-10s%n", "Units Consumed", "Rate (Rs./Unit)", "Amount (Rs.)");
        System.out.println("------------------------------------------------------");
        System.out.printf("%-20d %-20.2f %-10.2f%n", unitsConsumed, getRatePerUnit(), billAmount);
        System.out.println("------------------------------------------------------");

        scanner.close();
    }

    private static double calculateBillAmount(int unitsConsumed) {
        // Calculation logic for bill amount, unit
        double perUnitRate = getRatePerUnit();
        double billAmount = perUnitRate * unitsConsumed;
        return billAmount;
    }

    private static double getRatePerUnit() {
        return 7.50; // Sample rate per unit
    }
}