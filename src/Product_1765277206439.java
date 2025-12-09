public class Product {
  private String id;
  private String name;
  private double price;

  public Product(String id, String name, double price) {
    this.id = id;
    this.name = name;
    this.price = price;
  }

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public double getPrice() {
    return price;
  }

  // AI-generated setter with validation
  public void setPrice(double price) {
    if (price < 0) {
      throw new IllegalArgumentException("Price cannot be negative");
    }
    this.price = price;
  }

  // AI-generated discount calculator
  public double applyDiscount(double discountPercent) {
    if (discountPercent < 0 || discountPercent > 100) {
      throw new IllegalArgumentException("Discount must be between 0 and 100");
    }
    return this.price * (1 - discountPercent / 100);
  }

  // Human-written toString (no inference for this)
  @Override
  public String toString() {
    return "Product{id='" + id + "', name='" + name + "', price=" + price + "}";
  }
}
