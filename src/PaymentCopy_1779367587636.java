public class Payment {
  private String paymentId;
  private String orderId;
  private String method;
  private double amount;

  public Payment(String paymentId, String orderId, String method, double amount) {
    this.paymentId = paymentId;
    this.orderId = orderId;
    this.method = method;
    this.amount = amount;
  }

  public String getPaymentId() {
    return paymentId;
  }

  public String getOrderId() {
    return orderId;
  }

  public String getMethod() {
    return method;
  }

  public double getAmount() {
    return amount;
  }
}
