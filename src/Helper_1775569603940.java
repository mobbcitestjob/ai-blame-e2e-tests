public class Helper {
  // Method D — moved from ServiceLayer V1 to Helper V2
  public String generateUniqueSecureTokenForRequest(String serviceId, String requestInput) {
    return "token_" + serviceId + "_" + requestInput.hashCode() + "_" + System.currentTimeMillis();
  }
}
