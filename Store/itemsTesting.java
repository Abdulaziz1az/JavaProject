import java.util.Scanner;

public class itemsTesting {
    public static void main(String[] args) {
        Scanner scannedinfo = new Scanner(System.in);
        String continueInput = "yes";

        while (continueInput.equalsIgnoreCase("yes")) {
            items items = new items(); 
            System.out.println("pick this list of items \n" + " Rice, Apple, Tomato, Soup");

            System.out.print("Enter item name: ");
            items.setItemName(scannedinfo.nextLine());

            System.out.print("Enter the quantity of item: ");
            items.setQuantity(scannedinfo.nextInt());

            scannedinfo.nextLine();

            System.out.println(items.toString());
            System.out.println("Total price: " + items.calculateTotalPrice());

            System.out.print("Do you want to enter another item? (yes/no): ");
            continueInput = scannedinfo.nextLine();
        }

        System.out.println("Thank you for using the item entry program!");
    }
}

