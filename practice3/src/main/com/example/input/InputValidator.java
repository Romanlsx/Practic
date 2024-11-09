package main.com.example.input;

import java.util.HashSet;

public class InputValidator {
    public static boolean isValidHidden(String input) {
        return hasDuplicateCharacters(input) &&
                isInteger(input) && validLenght(input);
    }

    public static boolean validLenght(String input){
        return input.length() == 4;
    }

    public static boolean isInteger(String input){
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean hasDuplicateCharacters(String str) {
        HashSet<Character> charSet = new HashSet<>();

        for (char c : str.toCharArray()) {
            if (!charSet.add(c)) { // Если добавление не удалось, значит, символ уже есть в множестве
                return false; // Повторяющийся символ найден
            }
        }

        return true; // Повторяющихся символов нет
    }
}
