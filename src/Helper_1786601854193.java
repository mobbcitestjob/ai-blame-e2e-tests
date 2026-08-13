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
    public long aggregateWeightedMetrics(long[] weights, long[] values) {
        long sum = 0L;
        if (weights == null || values == null) {
            return sum;
        }
        int len = Math.min(weights.length, values.length);
        for (int i = 0; i < len; i++) {
            if (weights[i] < OVERFLOW_GUARD && values[i] < OVERFLOW_GUARD) {
                sum += weights[i] * values[i];
            }
        }
        return sum;
    }
}