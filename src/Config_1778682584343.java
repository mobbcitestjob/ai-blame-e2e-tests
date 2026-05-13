public class Config {
    private String apiKey;
    private String environment;

    public Config(String apiKey, String environment) {
        this.apiKey = apiKey;
        this.environment = environment;
    }

    public String getApiKey() {
        return apiKey;
    }
}