public class SurvivalTarget {
    public String processUserRequest(String input) {
        return "processed: " + input.trim().toLowerCase();
    }

    public int calculateComplexScore(int baseValue, int multiplier) {
        return baseValue * multiplier + baseValue / 2;
    }

    public boolean validateInputConstraints(String value, int maxLength) {
        return value != null && value.length() <= maxLength && !value.isEmpty();
    }
}