package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//Дан массив, состоящий из целых чисел.
//Нумерация элементов начинается с 0.
//Напишите программу, которая выведет элементы массива, номера которых четны (0, 2, 4...).
// * четные элементы - if %2=0; положительные - if >0/count++;больше предыдущего - if a[i]>a[i-1]/int i=1;

//Дан массив, состоящий из целых чисел.
// Напишите программу, которая определяет,
// есть ли в массиве пара соседних элементов с одинаковыми знаками.
// / оба сосдених меньше - (arr[i-1]<arr[i]&&arr[i]>arr[i+1])

//Напишите программу, которая переставляет элементы массива
// в обратном порядке без использования дополнительного массива.
// Программа должна считать массив, поменять порядок его элементов,
// затем вывести результат (просто вывести элементы массива в обратном порядке – недостаточно!)
// /переставляет соседние элементы массива - i+=2, temp, a[i]->a[i+1]

//Напишите программу, которая циклически сдвигает элементы массива вправо
// (например, если элементы нумеруются, начиная с нуля, то 0-й элемент становится 1-м,
// 1-й становится 2-м, ..., последний становится 0-м, то есть массив {3, 5, 7, 9}
// превращается в массив {9, 3, 5, 7}).

//Вводится массив, состоящий из целых чисел. Найти наибольшее среди них. / max = 0, if arr[i]>max->max=arr[i]

//Дан массив, состоящий из целых чисел.
// Известно, что числа упорядочены по неубыванию (то есть каждый следующий элемент не меньше предыдущего).
// Напишите программу, которая определит количество различных чисел в этом массиве.
// /if(arr[i]!=arr[i+1]){count++}

/*Дана последовательность натуральных чисел 1, 2, 3, ..., N (1 ≤ N ≤ 1000).
 Необходимо сначала расположить в обратном порядке часть этой последовательности
 от элемента с номером A до элемента с номером B,
 а затем от C до D (A < B; C < D; 1 ≤ A, B, C, D ≤ N).
Входные данные
Вводятся натуральные числа числа N, A, B, C, D.*/

/*
* Дана последовательность из N (1 ≤ N ≤ 100000) целых чисел и число K (|K| ≤ 100000).
* Сдвинуть всю последовательность (сдвиг - циклический) на |K| элементов вправо,
*  если K – положительное и влево, если отрицательное.
В данной задаче нельзя использовать дополнительные массивы (списки).
*  Обратите внимание, что нужно именно преобразовать имеющийся список и распечатать его целиком,
*  а не создать новый, даже назвав его тем же самым именем (это возможно в языке Python).*/

public class OneDemensialArray {
    private int amount;
    private int[] arr;
    private int[] clone;
    private int A,B,C,D,N;
    Scanner scan = new Scanner(System.in);
    private int count=0;
    public OneDemensialArray() {
        this.amount = scan.nextInt();
        arr = new int[amount];
        clone = new int[amount];
        for (int i = 0; i < amount; i++) {
            arr[i] = scan.nextInt();
        }
    }
    public OneDemensialArray(int N,int A,int B,int C,int D) {
        arr = new int[N];
        this.N=N;
        this.A=A;
        this.B=B;
        this.C=C;
        this.D=D;
    }
    public void selectEven() {
        for (int i = 0; i < amount; i += 2) {
            System.out.println(arr[i]);
        }
    }

    public String sameSigns() {
        for (int i = 1; i < amount - 1; i++) {
            if (!(arr[i - 1] * arr[i] < 0 || arr[i] * arr[i + 1] < 0)) {
                return "YES";
            }
        }
        return "NO";
    }

    public int[] reverse() {
        for (int i = 0; i < amount / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[amount - 1 - i];
            arr[amount - 1 - i] = temp;
        }
        return arr;
    }

    public int[] RotateRight() {
        int temp = arr[amount - 1];
        for (int i = amount - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
        for (int i = 0; i < amount; i++) {
            System.out.println(arr[i]);
        }
        return arr;
    }

    public int[] doubleReverse(){
           int[] result = new int[N];
           arr[0]=1;
           int BADif = B-A;

           for (int i= BADif+1;i>0;i--){
               arr[i]= A;
               A++;
           }
           for (int i = N-1; i>BADif+1; i--){
               arr[i]=C;
               C++;
           }
           for (int i =0; i<N;i++){
               System.out.print(arr[i]+" ");
           }
           return result;
       }
    public int[] SuperRotate() {
        //без отрезания куска
        //через многократное сдвигание массива на одну единицу
        System.out.println("Enter index rotate");
        int index = scan.nextInt();
        if (index > 0) {
            for (int j = 0; j < index; j++) {
                int temp = arr[amount - 1];
                for (int i = amount - 1; i > 0; i--) {
                    arr[i] = arr[i - 1];
                }
                arr[0] = temp;

            }
            for (int i = 0; i < amount; i++) {
                System.out.println(arr[i]);
            }
            return arr;
        }
            if (index < 0) {
                for (int j = 0; j < Math.abs(index); j++) {
                    int temp = arr[0];
                    for (int i = 0; i < amount-1; i++) {
                        arr[i] = arr[i + 1];
                    }
                    arr[amount-1] = temp;
                }
                for (int i = 0; i < amount; i++) {
                    System.out.println(arr[i]);
                }
            }
            return arr;
        }
        public void circle(){
         //with arrayList
            List<Integer> circle = new ArrayList<>();
            for (int i =0;i<amount;i++){
                circle.add(arr[i]);
            }
            for (int i = 0; i < circle.size() - 2; i++) {
                if (circle.get(i).equals(circle.get(i + 1)) && circle.get(i).equals(circle.get(i + 2))) {
                    circle.remove(i + 2);
                    circle.remove(i + 1);
                    circle.remove(i);
                    i = i == 0 ? -1 : i - 2;
                }
            }
                System.out.println(amount-circle.size());
        }

}




