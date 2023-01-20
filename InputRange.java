public class InputRange {
    boolean inputCheck(String input) {
        boolean inputRange = false;
        if (input.length() == 2) {
            if (input.charAt(1) >= 49 && input.charAt(1) <= 56 && input.charAt(0) >= 65 && input.charAt(0) <= 72) {
                inputRange = true;
            }
        }
        return inputRange;
    }
}
