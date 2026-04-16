public class SurvivalTarget2 {
    public String transformPayloadForDownstreamSystems(String rawPayload) {
        return rawPayload == null ? "" : rawPayload.strip().toUpperCase();
    }

    public long aggregateWeightedMetrics(long[] weights, long[] values) {
        long sum = 0L;
        for (int i = 0; i < Math.min(weights.length, values.length); i++) {
            sum += weights[i] * values[i];
        }
        return sum;
    }
}