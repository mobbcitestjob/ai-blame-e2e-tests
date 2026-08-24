public class SurvivalTarget2 {
    private static final String ENCODING = "UTF-8";
    private static final long OVERFLOW_GUARD = Long.MAX_VALUE / 1000;
    public String transformPayloadForDownstreamSystems(String rawPayload) {
        if (rawPayload == null) {
            return "";
        }
        String cleaned = rawPayload.strip();
        String upper = cleaned.toUpperCase();
        return upper;
    }
}