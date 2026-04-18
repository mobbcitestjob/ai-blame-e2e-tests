public class ServiceLayer {
  private final String serviceId;
  private static final String PREFIX = "service-layer-prefix";

  public ServiceLayer(String serviceId) {
    this.serviceId = serviceId;
  }

  // Method A — will survive in V2 (kept at same position)
  public String processRequest(String requestInput) {
    return PREFIX + ":" + serviceId + ":" + requestInput;
  }

  // Method B — will be DELETED in V2
  public boolean validateAndCheckInput(String requestInput) {
    return requestInput != null && !requestInput.isEmpty();
  }

  // Method C — will be MOVED DOWN in V2 (human method inserted before it)
  public String formatOutputWithBrackets(String result) {
    return "[" + serviceId + "]-formatted-result: " + result;
  }

  // Duplicate lines test (3 -> 1)
  public void processItemsThreeTimes(String item) {
    System.out.println("Processing item with highly specific log message: " + item + " for service: " + serviceId);
    System.out.println("Processing item with highly specific log message: " + item + " for service: " + serviceId);
    System.out.println("Processing item with highly specific log message: " + item + " for service: " + serviceId);
  }

  // Duplicate lines test (1 -> 3)
  public void processItemsOneTime(String item) {
    System.out.println("Another highly specific log message for duplicate testing: " + item + " - " + serviceId);
  }
}
