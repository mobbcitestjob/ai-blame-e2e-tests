public class Order {
  private String orderId;
  private String userId;
  private double total;

  public Order(String orderId, String userId, double total) {
    this.orderId = orderId;
    this.userId = userId;
    this.total = total;
  }

  public String getOrderId() {
    return orderId;
  }

  public String getUserId() {
    return userId;
  }

  public double getTotal() {
    return total;
  }
}