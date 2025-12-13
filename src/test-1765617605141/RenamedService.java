// Renamed Service

public class Service {
  private String serviceName;

  public Service(String serviceName) {
    this.serviceName = serviceName;
  }

  public String getServiceName() {
    return serviceName;
  }

  public void execute() {
    System.out.println("Executing: " + serviceName);
  }
}
