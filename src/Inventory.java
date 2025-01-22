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
    if (database.size() - 1 < id) {
      System.out.println(id + " does not exist.");
    }
    try {
      database.get(id);
      database.remove(id - 1);
      System.out.println(id + "successfully deleted.");
    } catch (IndexOutOfBoundsException e) {
      System.out.println(id + " does not exist.");
    }
  }

  public void view() {
    for (Product product : database) {
      System.out.println("ID:"+ product.getID() + "|" + product.getName());
    }
  }
}
