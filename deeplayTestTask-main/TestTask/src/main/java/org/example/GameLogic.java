package org.example;

import UtilsForData.ExelData;

import java.io.IOException;

public class GameLogic {
    //объявление переменных, используемых в логике игры
    private static String fieldType;
    private static String creatureRace;
    private static int[][] gameField = new int[4][4];

    private static ExelData myData;
    private static int bestSum = -1;
    private static int numberOfPasses = 0;

    //Публичный конструктор, в который входят основные данные об игре
    public GameLogic(String fieldType,String creatureRace){
        this.creatureRace=creatureRace;
        this.fieldType=fieldType;
        myData =new ExelData(creatureRace);
    }

    /*Процесс заполнение игрового поля, перевод строчного значения
      в символьный массив, значения которого равны номерам столбцов
      в таблице с данными
      В случае ввода слишком которткой строки, происходит выход из приложение с комментраиями
      о неправильном вооде*/
    public int[][] fillArray() throws IOException {
        char[] myString = fieldType.toCharArray();
        int count = myString.length;
        for(int i = 0;i<4;i++){
            for (int j = 0;j<4;j++){
               try{
                    gameField[i][j]=myData.getData(myString[myString.length-count]);
                    count--;
               } catch (ArrayIndexOutOfBoundsException e){
                    System.out.println("It is impossible to get data about the nature and type of the field.\n" +
                            " You may have entered short String.\n" +
                            " Restart the game and enter the data correctly");
                    System.exit(0);
                }
            }
        }
        return gameField;
    }

    /*Основная функция, высчитывающая самый короткий путь за
    наименьшее количество прохождений*/
    public void solve(int x, int y, int sum, int[][] arr){
        numberOfPasses++;
        if (x==3&&y==3){
            if (bestSum<0||sum<bestSum){
                bestSum = sum+arr[x][y];
            }
        } else if (sum<bestSum||bestSum!=0) {
            if (x<3){
                solve(x+1,y,sum+arr[x+1][y],arr);
            }
            if (y<3){
                solve(x,y+1,sum+arr[x][y+1],arr);
            }
        }
    }
    /* Функции, используемые для вывода результата*/
    public void getResult(){
        System.out.println("The shortest way - "+bestSum);
        System.out.println("the number of passes through the field - "+numberOfPasses);
        System.out.println("Sorry for the wait! We are counting fast, but we are slowly navigating in exel");
    }
    public int getBestSum(){
        return bestSum;
    }
    public int getNumberOfPasses(){
        return numberOfPasses;
    }

}
