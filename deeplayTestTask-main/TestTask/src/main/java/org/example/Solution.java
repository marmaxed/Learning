package org.example;

import java.io.IOException;
import java.util.Scanner;

public class Solution {
    static Scanner scan = new Scanner(System.in);
    public static void getResult() throws IOException {
        //Процесс сборки приложения

        //Получаем входные данные
        System.out.println("Enter the value of game cells");
        String filedType = scan.next();
        System.out.println("Enter the creature's race");
        String creatureRace = scan.next();

        //Объявляем новую логику игры с полученными данными
        GameLogic gameLogic = new GameLogic(filedType,creatureRace);

        //Заполняем игровое поле
        int[][] gameField = gameLogic.fillArray();

        //Вызываем основную функцию
        gameLogic.solve(0,0,-1,gameField);

        //Получаем результат
        gameLogic.getResult();
    }
}
