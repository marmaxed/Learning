package SearchingAndSorting;
/*
* Линейный поиск - 1
Напишите программу, которая определяет, сколько раз встречается заданное число x в данном массиве.
Входные данные
натуральное число N, не превосходящее 1000 – размер массива.
одно целое число x , не превосходящее по модулю 1000.*/


//Вывести значение элемента массива, ближайшее к x. Если таких чисел несколько, выведите любое из них.
/*dif = math.abs(value-a[0]);if math.abs(value-a[i])<dif -> присвой */

//Вывести через пробел номера элементов, равных данному, в порядке возрастания.
//Если таких элементов нет, ничего выводить не нужно.
//System.out.print(" "+(i+1))


import java.util.Scanner;

public class linearArraySearch {
    Scanner scan = new Scanner(System.in);
    public void linearSearchFirst(int N,int x){
        int[] arr = new int[N];
        for (int i =0;i<N;i++){
            arr[i]=scan.nextInt();
        }
        int count = 0;
        for (int i=0;i<N;i++){
            if (arr[i]==x){
                count++;
            }
        }
        System.out.println(count);
    }
    public void starWars(int N){
        int[] arr = new int[N];
        int min = Integer.MAX_VALUE;
        int minIndex = 0;
        int finalMin= Integer.MAX_VALUE;
        int finalMinIndex=0;
        for (int i =0;i<N;i++){
            arr[i]=scan.nextInt();
            if (arr[i]<min){
                min=arr[i];
            }
            if (min<finalMin){
                int temp=min;
                min = finalMin;
                finalMin = temp;
            }
        }
        for (int i =0;i<N;i++){
            if (arr[i]==min){
                minIndex=i+1;
            }
            if(arr[i]==finalMin){
                finalMinIndex=i+1;
            }
        }
        System.out.print(minIndex+" "+finalMinIndex);
    }
    public void minToMax(int N){
        int[] arr = new int[N];
        for(int i = 0;i<N;i++){
            arr[i] = scan.nextInt();
        }
        int min = arr[0];
        int max = arr[0];
        for (int i = 0;i<N;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        for(int i =0;i<N;i++){
            if (arr[i]==max){
                arr[i]=min;
            }
            if(arr[i]==min){
                arr[i]=max;
            }
        }
        for (int i =0;i<N;i++){
            System.out.println(arr[i]);
        }
    }

}
