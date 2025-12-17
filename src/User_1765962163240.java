public class User {
  private String name;
  private List<Order> orders = new ArrayList<>();

  public User(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public List<Order> getOrders() {
    return orders;
  }

  public void addOrder(Order order) {
    this.orders.add(order);
  }
}