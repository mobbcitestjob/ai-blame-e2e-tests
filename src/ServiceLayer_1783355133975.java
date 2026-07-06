public class SurvivalTarget {
    private static final String PREFIX = "processed";
    private static final int MAX_SCORE = 100;
    public String processUserRequest(String input) {
        if (input == null) {
            return PREFIX + ": null";
        }
        String processed = PREFIX + ": " + input.trim().toLowerCase();
        return processed;
    }
    public int calculateComplexScore(int baseValue, int multiplier) {
        return Math.min(baseValue * multiplier + baseValue / 2, MAX_SCORE);
    }
}