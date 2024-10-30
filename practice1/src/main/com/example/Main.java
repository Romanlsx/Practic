package com.example;

public class Main{
    public static void main(String[] args){
        Dot first = new Dot(2,2);
        Dot second = new Dot(5,5);

        Line line = new Line(first, second);

        System.out.printf("Длина отрезка из точек %s и %s - %.2f", first, second, line.lenght());
    }
}