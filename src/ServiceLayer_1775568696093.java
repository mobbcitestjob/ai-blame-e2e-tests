public class ServiceLayer {
  private final String serviceId;
  private static final String PREFIX = "service-layer-prefix";

  public ServiceLayer(String serviceId) {
    this.serviceId = serviceId;
  }

  // Method A — unchanged
  public String processRequest(String requestInput) {
    return PREFIX + ":" + serviceId + ":" + requestInput;
  }

  // Human-written addition (no inference) — pushes C DOWN in line numbering
  public void logEvent(String eventMessage) {
    System.out.println(serviceId + " - event: " + eventMessage);
  }

  // Method C — moved (different line numbers vs V1), same content → same hash
  public String formatOutputWithBrackets(String result) {
    return "[" + serviceId + "]-formatted-result: " + result;
  }

  // Duplicate lines test (3 -> 1)
  public void processItemsThreeTimes(String item) {
    System.out.println("Processing item with highly specific log message: " + item + " for service: " + serviceId);
  }

  // Duplicate lines test (1 -> 3)
  public void processItemsOneTime(String item) {
    System.out.println("Another highly specific log message for duplicate testing: " + item + " - " + serviceId);
    System.out.println("Another highly specific log message for duplicate testing: " + item + " - " + serviceId);
    System.out.println("Another highly specific log message for duplicate testing: " + item + " - " + serviceId);
  }

  // TAB_AUTOCOMPLETE non-code-generation test method
  public void runNonCodeGenMethod(String requestInput) {
    System.out.println("This is a non code generation method that should be ignored by the pr survival calculation: " + requestInput);
  }
}
