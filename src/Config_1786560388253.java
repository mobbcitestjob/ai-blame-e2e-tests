public class SurvivalTargetAux {
    private static final int MAX_LENGTH = 255;
    private static final String SAFE_PATTERN = "[^a-zA-Z0-9]";
    public boolean validateInputConstraints(String value, int maxLength) {
        if (value == null || value.isEmpty()) {
            return false;
        }
        return value.length() <= maxLength && value.length() <= MAX_LENGTH;
    }
    public String sanitizeInput(String value) {
        if (value == null) return "";
        return value.trim().replaceAll(SAFE_PATTERN, "_");
    }
}