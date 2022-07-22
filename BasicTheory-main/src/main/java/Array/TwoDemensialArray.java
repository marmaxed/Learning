package Array;
/*
* Дано число n, n ≤ 100 . Создайте массив n×n и заполните его по следующему правилу:
- числа на диагонали, идущей из правого верхнего в левый нижний угол, равны 1;
- числа, стоящие выше этой диагонали, равны 0;
- числа, стоящие ниже этой диагонали, равны 2.
*/
//Проверьте, является ли двумерный массив симметричным относительно главной диагонали.
//Главная диагональ — та, которая идёт из левого верхнего угла двумерного массива в правый нижний.

/*
* В метании молота состязается n спортcменов. Каждый из них сделал mбросков.
*  Победителем считается тот спортсмен, у которого сумма результатов по всем броскам максимальна.
Если перенумеровать спортсменов числами от 0 до n-1, а попытки каждого из них – от 0 до m-1,
*  то на вход программа получает массив A[n][m], состоящий из неотрицательных целых чисел.
*  Программа должна определить максимальную сумму чисел в одной строке и вывести на экран
*  эту сумму и номер строки, для которой достигается эта сумма./
// Таким образом, программа должна найти значение максимального элемента в данном массиве,
*  а также его индексы (то есть номер спортсмена и номер попытки). arr[i][j]>max
* index=i;indexx=j
* /Определите количество участников состязаний, которые разделили первое место, то есть определите количество строк в массиве,
*  которые содержат значение, равное наибольшему.
* int find = max;
* for(..)
* if sum = find -> count++;
* /Сначала программа выводит количество спортсменов, показавших наилучший результат, затем
* , на следующей строке, их номера в порядке возрастания (через пробел).
* String[] winners = n*2{" "..." "}(for)
* if sum = find -> count++;
* string winners[i-1] = " "
* winners[i]=i
* */

/*
 * Даны два числа n и m. Создайте двумерный массив A[n][m],
 *  заполните его таблицей умножения A[i][j]=i*j и выведите на экран.
 *  При этом нельзя использовать вложенные циклы,
 *  все заполнение массива должно производиться одним циклом.
 */
/*
* Даны два числа n и m. Создайте двумерный массив [n][m] и заполните его по следующим правилам:
* Числа, стоящие в строке 0 или в столбце 0 равны 1 (A[0][j]=1, A[i][0]=1).
*  Для всех остальных элементов массива A[i][j]=A[i-1][j]+A[i][j-1],
*  то есть каждый элемент равен сумме двух элементов, стоящих слева и сверху от него.*/

/*Сапер
Напишите программу, отображающую игровое поле для игры "Сапер".
Входные данные
Даны числа N и M (целые, положительные, не превышают 32)
 – количество строк и столбцов в поле соответственно,
 далее число W (целое, неотрицательное, не больше 1000) – количество мин на поле*/

/* Спираль
Требуется заполнить массив размера N × N единичками по спирали
* (начиная с верхнего левого угла по часовой стрелке, см. пример).
Входные данные
С клавиатуры вводится число N (нечетное, натуральное и не превышающее 50).*/

import java.util.Scanner;

public class TwoDemensialArray {
    private int n;
    private int arr[][];
    Scanner scan = new Scanner(System.in);

    public TwoDemensialArray() {
        //this.n=scan.nextInt();
        //this.arr=new int[n][n];
    }

    public TwoDemensialArray(int n) {
        this.n = n;
        this.arr = new int[n][n];
    }

    public TwoDemensialArray(int n, int m) {
        this.arr = new int[n][m];
    }

    public void secondaryDioganal() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i + j) == n - 1) {
                    arr[i][j] = 1;
                } else if ((j + i) > n - 1) {
                    arr[i][j] = 2;
                } else arr[i][j] = 0;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println(" ");
        }
    }

    public boolean symmetryMainDiagonal(int a) {
        String[] line = new String[a];
        String[][] insideWords = new String[a][a];
        for (int i = 0; i < a; i++) {
            line[i] = scan.nextLine();
            insideWords[i] = line[i].split(" ");
            for (int j = 0; j < a; j++) {
                arr[i][j] = (Integer.parseInt(insideWords[i][j]));
            }
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (arr[i][j] != arr[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public void sportsmens(int n, int m) {
        String[] line = new String[n];
        String[][] insideWords = new String[n][m];
        for (int i = 0; i < n; i++) {
            line[i] = scan.nextLine();
            insideWords[i] = line[i].split(" ");
            for (int j = 0; j < m; j++) {
                arr[i][j] = (Integer.parseInt(insideWords[i][j]));
            }
        }
        int max = 0;
        int sum = 0;
        int index = -1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sum += arr[i][j];
            }
            if (sum > max) {
                max = sum;
                index = n;
            }
            sum = 0;
        }
        System.out.println(max);
        System.out.println(index);
    }

    public int[][] multiplicationTable(int n) {
        int[][] array = new int[n][n];
        for (int i = 0, j = 0; j < n; i++) {
            array[j][i] = j * i;
            if (i == n - 1) {
                j++;
                i = 0;
            }
        }
        return array;
    }

    public int[][] pascalsTriangle(int n) {
        int[][] array = new int[n][n];
        for (int k = 0; k < n; k++) {
            array[0][k] = 1;
            array[k][0] = 1;
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                array[i][j] = array[i - 1][j] + array[i][j - 1];
            }
        }
        return array;
    }

    //
    public int[][] spiralMassive(int n) {
        int[][] array = new int[2 * n + 1][2 * n + 1];
        int value = (2 * n + 1) * (2 * n + 1) - 1;
        array[0][0] = value;
        for (int x = 0; x < 2 * n + 1; x++) {
            array[x][0] = value;
            value--;
        }
        for (int x = 1; x < 2 * n + 1; x++) {
            array[2 * n][x] = value;
            value--;
        }
        for (int x = 2 * n - 1; x >= 0; x--) {
            array[x][2 * n] = value;
            value--;
        }
        for (int x = 2 * n - 1; x > 0; x--) {
            array[0][x] = value;
            value--;
        }
        int verticalIndex = 1;
        int horizontalIndex = 1;

        while (value >= 1) {
            while (array[verticalIndex + 1][horizontalIndex] == 0) {
                array[verticalIndex][horizontalIndex] = value;
                value--;
                verticalIndex++;
            }
            while (array[verticalIndex][horizontalIndex + 1] == 0) {
                array[verticalIndex][horizontalIndex] = value;
                value--;
                horizontalIndex++;

            }
            while (array[verticalIndex - 1][horizontalIndex] == 0) {
                array[verticalIndex][horizontalIndex] = value;
                value--;
                verticalIndex--;
            }
            while (array[verticalIndex][horizontalIndex - 1] == 0) {
                array[verticalIndex][horizontalIndex] = value;
                value--;
                horizontalIndex--;
            }
        }
        for (int i = 0; i < n * n + 1; i++) {
            for (int j = 0; j < n * n + 1; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println(" ");
        }
        return array;
    }

    public void snakeMassive(int n, int m) {
        int[][] array = new int[n][m];
        int verticalIndex = n;
        int horizontalIndex = 0;
        int value = 0;
        for (int i = 0; i < verticalIndex; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < m; j++) {
                    array[i][j] = value;
                    value++;
                }
            } else {
                for (int j = m - 1; j >= 0; j--) {
                    array[i][j] = value;
                    value++;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println(" ");
        }
    }

    public void diagonalArray(int verticalSize, int horizontalSize) {
        int[][] Array = new int[verticalSize][horizontalSize];
        int horizontalPosition = 0, verticalIndex = 0;
        int startIndex = 0;
        int number = 1;
        for (int verticalPosition = 0; verticalPosition < verticalSize; verticalPosition++) {
            if (verticalPosition > 0) startIndex = horizontalPosition - 1;
            else startIndex = 0;
            for (horizontalPosition = startIndex; horizontalPosition < horizontalSize; horizontalPosition++) {
                verticalIndex = verticalPosition;
                for (int horizontalIndex = horizontalPosition; horizontalIndex >= 0; horizontalIndex--) {
                    if (verticalIndex < verticalSize) {
                        Array[verticalIndex][horizontalIndex] = number;
                        number++;
                        verticalIndex++;
                    } else break;
                }
            }
        }

        for (int i = 0; i < verticalSize; i++) {
            for (int j = 0; j < horizontalSize; j++) {
                System.out.print(Array[i][j]);
            }
            System.out.println(" ");
        }
    }

    public void Sapper(int columns, int lines, int amount) {
        String[][] field = new String[columns][lines];
        boolean[][] bomb = new boolean[columns][lines];
        int x = 0;
        int y = 1;
        int[][] coordinates = new int[amount][2];
        for (int i = 0; i < amount; i++) {
            coordinates[i][x] = scan.nextInt();
            coordinates[i][y] = scan.nextInt();
        }
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < lines; j++) {
                for (int k = 0; k < amount; k++) {
                    if (i == coordinates[k][x] && j == coordinates[k][y]) {
                        bomb[i][j] = true;
                    }
                }
            }
        }
        int value = 0;
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < lines; j++) {
                try {
                    if (bomb[i - 1][j]) value++;
                } catch (java.lang.ArrayIndexOutOfBoundsException e) {
                    //ignore
                }
                try {
                    if (bomb[i + 1][j]) value++;
                } catch (java.lang.ArrayIndexOutOfBoundsException e) {
                    //ignore
                }
                try {
                    if (bomb[i][j - 1]) value++;
                } catch (java.lang.ArrayIndexOutOfBoundsException e) {
                    //ignore
                }
                try {
                    if (bomb[i][j + 1]) value++;
                } catch (java.lang.ArrayIndexOutOfBoundsException e) {
                    //ignore
                }
                field[i][j] = String.valueOf(value);
                value = 0;
                if (bomb[i][j]) field[i][j] = "*";
            }
        }
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < lines; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println(" ");
        }
    }

    public void Spiral(int n) {
        int[][] Array = new int[2 * n + 1][2 * n + 1];
        int value = 1;
        Array[0][0] = value;
        int count = (2 * n + 1) * (2 * n + 1) - 1;
        for (int x = 0; x < 2 * n + 1; x++) {
            Array[0][x] = value;
            count--;
        }
        for (int x = 1; x < 2 * n + 1; x++) {
            Array[x][2*n] = value;
            count--;
        }
        for (int x = 2 * n - 1; x >= 0; x--) {
            Array[2*n][x] = value;
            count--;
        }
        for (int x = 2 * n - 1; x > 1; x--) {
            Array[x][0] = value;
            count--;
        }
        int verticalIndex = 2;
        int horizontalIndex = 1;

        while (count>=0) {
            while (Array[verticalIndex][horizontalIndex+2] == 0) {
                Array[verticalIndex][horizontalIndex] = value;
                horizontalIndex++;
            }
            while (Array[verticalIndex+2][horizontalIndex] == 0) {
                Array[verticalIndex][horizontalIndex] = value;
                verticalIndex++;
            }
            while (Array[verticalIndex][horizontalIndex - 2] == 0) {
                Array[verticalIndex][horizontalIndex] = value;
                horizontalIndex--;
            }
            while (Array[verticalIndex - 2][horizontalIndex] == 0) {
                Array[verticalIndex][horizontalIndex] = value;
                verticalIndex--;
            }
            count++;
        }
        Array[verticalIndex][horizontalIndex]=value;
      for (int i =0;i<2*n+1;i++){
          for (int j =0;j<2*n+1;j++){
              System.out.print(Array[i][j]);
          }
          System.out.println(" ");
      }
    }
}
