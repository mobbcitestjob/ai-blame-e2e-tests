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

  public boolean removeOrder(Order order) {
    return this.orders.remove(order);
  }

  public int getOrderCount() {
    return this.orders.size();
  }

  public boolean hasOrders() {
    return !this.orders.isEmpty();
  }

  public void clearOrders() {
    this.orders.clear();
  }
}