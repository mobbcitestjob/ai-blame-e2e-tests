public class SurvivalTarget {
    private static final String PREFIX = "processed";
    private static final int MAX_SCORE = 100;
    public String processUserRequest(String input) {
        if (input == null) {
            return PREFIX + ": null";
        }
        return PREFIX + ": " + input.trim().toLowerCase();
    }
    public int calculateComplexScore(int baseValue, int multiplier) {
        return Math.min(baseValue * multiplier + baseValue / 2, MAX_SCORE);
    }
}