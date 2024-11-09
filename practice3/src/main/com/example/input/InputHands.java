package main.com.example.input;

import java.util.Scanner;

public class InputHands implements InputInterface{
    private String number;

    @Override
    public void input() {
        System.out.print("Введите число: ");
        Scanner in = new Scanner(System.in);
        String number = in.nextLine();

        if (InputValidator.isValidHidden(number)) {
            this.number = number;
        } else {
            System.out.print("Введите четырехзначное число " +
                    "с неповторяющимися цифрами\n");
            input();
        }
    }

    public String getNumber() {
        input();
        return number;
    }
}
