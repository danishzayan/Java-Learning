import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class RestaurantMenu {
    private static final double GST_RATE = 0.18;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-------------------------------");
        System.out.println("Welcome to the Restaurant Menu!");
        System.out.println("-------------------------------");

        // Get user input for menu size
        System.out.print("Enter the number of menu items: ");
        int numItems = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Initialize arrays to store menu items, prices, and quantities
        String[] menuItems = new String[numItems];
        double[] itemPrices = new double[numItems];
        int[] itemQuantities = new int[numItems];

        // Get user inputs for item details
        for (int i = 0; i < numItems; i++) {
            System.out.print("\nEnter the name of item " + (i + 1) + ": ");
            menuItems[i] = scanner.nextLine();

            System.out.print("Enter the price of item " + (i + 1) + ": ");
            itemPrices[i] = scanner.nextDouble();

            System.out.print("Enter the quantity of item " + (i + 1) + ": ");
            itemQuantities[i] = scanner.nextInt();

            scanner.nextLine(); // Consume the newline character
        }

        // Calculate total price
        double totalPrice = 0.0;
        for (int i = 0; i < numItems; i++) {
            totalPrice += itemPrices[i] * itemQuantities[i];
        }

        // Calculate GST amount
        double gstAmount = totalPrice * GST_RATE;

        // Calculate total bill including GST
        double totalBill = totalPrice + gstAmount;

        // Get current date and time for bill
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);

        // Generate bill for zayan restaurant
        System.out.println("\n-------------- Zayan Restaurant --------------");
        System.out.println("Date and Time: " + formattedDateTime);
        System.out.println("----------------------------------------------");
        System.out.println("Item            Price     Quantity      Total");
        System.out.println("----------------------------------------------");

        for (int i = 0; i < numItems; i++) {
            double itemTotal = itemPrices[i] * itemQuantities[i];
            System.out.printf("%-15s %.2f        %d        %.2f%n",
                    menuItems[i], itemPrices[i], itemQuantities[i], itemTotal);
        }

        System.out.println("----------------------------------------------");
        System.out.printf("Total: %.2f%n", totalPrice);
        System.out.printf("GST (%.2f%%): %.2f%n", (GST_RATE * 100), gstAmount);
        System.out.printf("Total Bill: %.2f%n", totalBill);
        System.out.println("--------------Thanks for Visting--------------");

        scanner.close();
    }
}

