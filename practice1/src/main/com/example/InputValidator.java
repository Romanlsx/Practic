package practice1.com.example;
public class InputValidator {

    public static boolean isValidDouble(String input) {
        try {
            Double.parseDouble(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean isValidPointInput(String input) {
        String[] values = input.trim().split("\\s+");
        if (values.length != 2) {
            return false;
        }
        return isValidDouble(values[0]) && isValidDouble(values[1]);
    }
}

