package src.main.com.example.input;

import java.util.Scanner;

public class InputHands implements InputInterface{
    private String number;

    @Override
    public void input() {
        System.out.print("Введите число");
        Scanner in = new Scanner(System.in);
        String number = in.nextLine();

        if (InputValidator.isValidInt(number)) {
            this.number = number;
        } else {
            System.out.print("Введите целое число \n");
            input();
        }
    }

    public int getNumber() {
        input();
        return Integer.parseInt(this.number);
    }
}
