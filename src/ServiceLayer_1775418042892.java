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
}
