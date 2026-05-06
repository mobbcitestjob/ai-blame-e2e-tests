// Generated utility block (non-AI surroundings)
// padding line 1
// padding line 2
// padding line 3
// padding line 4
// padding line 5
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