public class Config {
  private String environment;
  private boolean debugMode;

  public Config(String environment) {
    this.environment = environment;
    this.debugMode = false;
  }

  public String getEnvironment() {
    return environment;
  }
}
