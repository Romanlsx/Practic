package practice1.com.example;
import java.util.Scanner;

public class Main{

    public static void input(String text, Dot dot){
        System.out.print(text);
        Scanner in = new Scanner(System.in);
        String coords = in.nextLine();

        if (InputValidator.isValidPointInput(coords)){
            String[] values = coords.trim().split("\\s+");
            dot.setX(Double.parseDouble(values[0]));
            dot.setY(Double.parseDouble(values[1]));
        }
        else{
            System.out.print("Введите коректные координаты!\n");
            input(text, dot);
        }
    }


    public static void main(String[] args){
        Dot first = new Dot(0,0);
        Dot second = new Dot(0,0);
        String[] values;
        String coords;
        Scanner in = new Scanner(System.in);


        input("Введите координаты первой точки:\n", first);

        input("Введите координаты второй точки:\n", second);


        Line line = new Line(first, second);

        System.out.printf("Длина отрезка из точек %s и %s - %.2f", first, second, line.lenght());
    }
}