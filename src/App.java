import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int selection = -1; 
        String line;
        Scanner scn = new Scanner(System.in);
        Inventory database = new Inventory();

        nav();

        try {
            selection = scn.nextInt();
        } catch (Exception e) {
            System.out.println("Please enter options that are available.");
            nav();
        }
        line = scn.nextLine();
        
        switch (selection) {
            case 1:
                
                break;
            case 2:

                break;
            case 3:

                break;
            case 4:
                
                break;
            case 0:
                System.exit(0);
                break;
            default:
                nav();
                break;
        }
        
        
        
    }

    static public void nav() {
        System.out.println("-----Welcome!-----");
        System.out.println("1. Add a new product");
        System.out.println("2. Delete a product");
        System.out.println("3. Edit a product");
        System.out.println("4. View inventory");
        System.out.println("0. Exit Program");
    }
}
