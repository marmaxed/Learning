package TypesOfData;

/*Входные данные
Программа получает на вход набор точек на плоскости.
Сначала задано количество точек n, затем идет последовательность из n строк,
каждая из которых содержит два числа: координаты точки.
 Величина n не превосходит 100, все исходные координаты – целые числа, не превосходящие 10^310
3  по абсолютной величине.*/

/*Центр тяжести
Выведите координаты центра тяжести данного множества точек.*/

//Выведите все исходные точки в порядке возрастания их расстояний от начала координат.

/*
* Отсортировать по среднему баллу
Выведите фамилии и имена учащихся в порядке убывания их среднего балла.
Входные данные
Заданы сначала количество учащихся n, затем n строк,
* каждая из которых содержит фамилию,
* имя и три числа (оценки по трем предметам: математике, физике, информатике).
*  Данные в строке разделены одним пробелом. Оценки принимают значение от 1 до 5.*/

import java.util.Scanner;



public class Structures {
    Scanner scan = new Scanner(System.in);
    int x;
    int y;
    int[][] arr;


    public void FirstTask(int n) {
        int max = 0;
        arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = scan.nextInt();
            arr[i][1] = scan.nextInt();
            if ((arr[i][0] + arr[i][1]) > max) {
                max = arr[i][0] + arr[i][1];
                x = n;
                y = Math.max(arr[i][0], arr[i][1]);
            }
        }
        System.out.println(x + " " + y);
    }


    public void SecondTask(int n) {
        double horizontalMax = 0;
        double verticalMax = 0;
        arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = scan.nextInt();
            arr[i][1] = scan.nextInt();
        }
        for (int i = 1; i < n; i++) {
            if (verticalMax <= (double) (arr[i - 1][0] + arr[i][0]) / 2) {
                verticalMax = (double) (arr[i - 1][0] + arr[i][0]) / 2;
            }
            if (horizontalMax <= (double) (arr[i][0] + arr[i][1]) / 2) {
                horizontalMax = (double) (arr[i][0] + arr[i][1]) / 2;

            }
        }
        System.out.println(verticalMax);
        System.out.println(horizontalMax);
    }


    public void SortedArr(int n) {
        arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = scan.nextInt();
            arr[i][1] = scan.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((arr[i][0] + arr[i][1]) > (arr[j][0] + arr[j][1])) {
                    int temp = arr[i][0];
                    arr[i][0] = arr[j][0];
                    arr[j][0] = temp;
                    temp = arr[i][1];
                    arr[i][1] = arr[j][1];
                    arr[j][1] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println(" ");
        }
    }


    public void SortedStudents(int n) {
        int[] sum = new int[n];
        int max = 0;
        int[] index = new int[n];
        String[] line = new String[n];
        String[][] insideWords = new String[n][5];
        for (int i = 0; i < n; i++) {
            line[i] = scan.nextLine();
            insideWords[i]=line[i].split(" ");
            for (int j = 2; j < 5; j++){
                sum[i]+=Integer.parseInt(insideWords[i][j]);
            }
        }
        for (int i = 0; i<n-1; i++){
            for (int j = 1; j < n; j++){
                if (sum[i]>sum[j]){
                    String temp = line[i];
                    line[i] = line[j];
                    line[j] = temp;
                }
            }
        }
        for (int i =0;i<n;i++){
            System.out.println(line[i]);
        }
    }


    public void PersonalData(int n){
        String[][] perData = new String[n][4];
        String[][] sortData = new String[n][4];
        for (int i = 0; i<n; i++){
            perData[i][0] = scan.nextLine();
            perData[i][1] = scan.nextLine();
            perData[i][2] = scan.nextLine();
            perData[i][3] = scan.nextLine();
        }
       for (int i = 1; i<n;i++){
           for(int j = 0;j<i;j++){
               if(getNum(perData[i][2])>getNum(perData[j][2])){
                   String[] temp = perData[i];
                   perData[i]=perData[j];
                   perData[j]=temp;
               }
               if(getNum(perData[i][2])==getNum(perData[j][2])){
                   if(getSymb(perData[i][2])>getSymb(perData[j][2])){
                       String[] temp = perData[i];
                       perData[i]=perData[j];
                       perData[j]=temp;
                   }
               }
               if(perData[i][2].equals(perData[j][2])){
                   if(perData[i][1].compareTo(perData[j][1])<0){
                       String[] temp = perData[i];
                       perData[i]=perData[j];
                       perData[j]=temp;
                   }
               }
           }
       }
               for (int i=0; i<n;i++){
                   System.out.println(perData[i][0]);
                   System.out.println(perData[i][1]);
                   System.out.println(perData[i][2]);
                   System.out.println(perData[i][3]);
               }
    }
    int getNum(String strings){
        if (strings.length()==2){
            return Integer.parseInt(strings.substring(0,1));
        }
        else return Integer.parseInt(strings.substring(0,2));
    }
    char getSymb(String string){
        if(string.length()==2){
            return string.toCharArray()[1];
        }
        else return string.toCharArray()[2];
    }
}
