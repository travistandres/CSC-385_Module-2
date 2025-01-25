import java.util.ArrayList;

public class Inventory {
  ArrayList<Product> database;
  int id = 1;

  public Inventory() {
    database = new ArrayList<Product>();
  };

  public void add(String productName) {
    database.add(new Product(id,productName));
    id++;
  }

  public void delete(int id) {
    Product productToDelete = null;

    //Iterates through the database to find the product with the given id
    for (Product product : database) {
        if (product.getID() == id) {
            productToDelete = product;
            break;
        }
    }
    
    if (productToDelete == null) {
        System.out.println(id + " does not exist.");
        return;
    }
    
    try {
        database.remove(productToDelete);
        System.out.println(id + " successfully deleted.");
    } catch (Exception e) {
        System.out.println("An error occurred while trying to delete " + id + ": " + e.getMessage());
    }
  }

  public void update(int id, String newProductName) {
    Product productToUpdate = null;
    for (Product product : database) {
        if (product.getID() == id) {
            productToUpdate = product;
            break;
        }
    }
    
    if (productToUpdate == null) {
        System.out.println(id + " does not exist.");
        return;
    }
    
    try {
        productToUpdate.setName(newProductName);
        System.out.println(id + " successfully updated.");
    } catch (Exception e) {
        System.out.println("An error occurred while trying to update " + id + ": " + e.getMessage());
    }
  }

  public void view() {
    for (Product product : database) {
      System.out.println("ID:"+ product.getID() + "|" + product.getName());
    }
  }
}
