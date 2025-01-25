import java.io.IOException;
import java.util.Scanner;

public class App {
    static Inventory inventory = new Inventory();
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        nav();
    }

    public static void nav() {
        System.out.println("1. Add Product");
        System.out.println("2. Delete Product");
        System.out.println("3. View Products");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        
        int selection = -1;
        try {
            selection = scn.nextInt();
        } catch (Exception e) {
            System.out.println("Please enter options that are available.");
            scn.next(); // clear the invalid input
            nav();
            return;
        }
        scn.nextLine(); // consume the newline character
        
        switch (selection) {
            case 1:
                System.out.print("Enter product name: ");
                String productName = scn.nextLine();
                inventory.add(productName);
                System.out.println("Product added successfully.");
                break;
            case 2:
                System.out.print("Enter product ID to delete: ");
                int productId = scn.nextInt();
                inventory.delete(productId);
                break;
            case 3:
                System.out.print("Enter product ID to update: ");
                int updateId = scn.nextInt();
                scn.nextLine(); // consume the newline character
                System.out.print("Enter new product name: ");
                String newProductName = scn.nextLine();
                inventory.update(updateId, newProductName);
                break;
            case 4:
                inventory.view();
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid selection. Please try again.");
                nav();
                break;
        }
        
        System.out.println("Press Enter to continue...");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

        nav(); // call nav() again to show the menu after an action is performed
    }
}