public class SurvivalTargetAux {
    public boolean validateInputConstraints(String value, int maxLength) {
        return value != null && value.length() <= maxLength && !value.isEmpty();
    }
}