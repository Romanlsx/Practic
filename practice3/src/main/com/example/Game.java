package main.com.example;

import main.com.example.input.InputInterface;

public class Game {
    private static String hidden_number;

    private void getHidden(InputInterface input) {
        hidden_number = input.getNumber();
    }

    public void startGame(InputInterface inputMain, InputInterface inputHidden){
        getHidden(inputHidden);
        int cows, bulls;
        while (true){
            cows = 0;
            bulls = 0;
            String number = inputMain.getNumber();
            if (number.equals(hidden_number)){
                System.out.println("Вы угадали загаданное число! - " + hidden_number);
                break;
            }
            else {
                for (int i = 0; i < number.length(); i++) {
                    for (int j = 0; j < hidden_number.length(); j++) {
                        if (number.charAt(i) == hidden_number.charAt(j)) {
                            if (i == j)
                            {
                                bulls++;
                            }
                            else{
                                cows++;
                            }
                        }
                    }
                }
            }
            System.out.println("Количество коров - " + cows +
                    ", количество быков - " + bulls);
        }


    }


}
