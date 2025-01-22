public class Product {
  
  int productID;
  String productName;
  
  public Product(int productID, String productName) {
    this.productID = productID;
    this.productName = productName;
  };

  public int getID() {
    return productID;
  }

  public String getName() {
    return productName;
  };

  public void setName(String newName) {
    productName = newName;
  }
}
