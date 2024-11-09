package src.main.com.example.input;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InputFile implements InputInterface {
    private String number;

    @Override
    public void input() {
        try {
            File file = new File("/home/roman/Projects/Practic/practice2/src/src/main/com/example/input/hidden_number.txt");
            Scanner scanner = new Scanner(file);
            String number = scanner.nextLine();
            scanner.close();
            if (InputValidator.isValidInt(number)) {
                this.number = number;
            } else {
                System.out.print("В файле не число \n");
                input();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + e.getMessage());
        }
    }

    public int getNumber() {
        input();
        return Integer.parseInt(number);
    }
}