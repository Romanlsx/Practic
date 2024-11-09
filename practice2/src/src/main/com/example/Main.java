package src.main.com.example;

import src.main.com.example.input.InputFile;
import src.main.com.example.input.InputHands;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        InputFile fileInput = new InputFile();
        InputHands handsInput = new InputHands();
        Game game = new Game();

        game.startGame(handsInput, fileInput);
    }
}