package src.main.com.example;

import src.main.com.example.input.InputInterface;

public class Game {
    private static int hidden_number;
    private int number;

    private void getHidden(InputInterface input) {
        hidden_number = input.getNumber();
    }

    public void startGame(InputInterface inputMain, InputInterface inputHidden){
        getHidden(inputHidden);
        while (true){
            this.number = inputMain.getNumber();
            if (number > hidden_number){
                System.out.println("Загаданное число меньше \n");
            } else if (number < hidden_number){
                System.out.println("Загаданное число больше \n");
            } else{
                break;
            }
        }

        System.out.println("Вы угадали загаданное число! - " + hidden_number);
    }


}
