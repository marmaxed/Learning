package SearchingAndSorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
* Даны две бесконечных возрастающих последовательности чисел A и B.
*  i-ый член последовательности A равен i2. i-ый член последовательности B равен i3.
Требуется найти Cx, где C – возрастающая последовательность,
*  полученная при объединении последовательностей A и B.
*  Если существует некоторое число, которое встречается и в последовательности
*  A и в последовательности B, то в последовательность C это число попадает в единственном экземпляре.*/

//Отсортируйте данный массив, используя сортировку слиянием.

public class MergeSorting {
    Scanner scan = new Scanner(System.in);

    public void mergingSequences() {
        int x = scan.nextInt();
        int[] A = new int[x + 1];
        int[] B = new int[x + 1];
        int[] C = new int[A.length+B.length];
        for (int i = 0; i <= x; i++) {
            A[i] = i * i;
            B[i] = i * i * i;
        }
        mergeWithoutRep(C,A,B);
        for (int i = 1; i<C.length;i++){
            if (C[i]==0){
                break;
            }
            System.out.println(C[i]);
        }
        //or we can use arrayList for size control
        //or we can count repetitions before initialization the final array
    }
    public void mergeSort(int[] arr){
        int n = arr.length;
        if (n==1) return;
        int mid = n/2;
        int[] l = new int[mid];
        for (int i =0; i< mid; i++){
            l[i]=arr[i];
        }
        int[] r = new int[mid];
        for (int i = mid; i<n; i++){
            r[i-mid]=arr[i];
        }
        mergeSort(l);
        mergeSort(r);
        merge(arr,l,r);
    }
    public void mergeWithoutRep(int[] first, int[] second, int[] third) {
        int left = second.length;
        int right = third.length;
        int i = 0;
        int j = 0;
        int index = 0;

        while (i < left && j < right) {
            if (second[i]==third[j]){
                first[index]= second[i];
                i++;
                j++;
            }
            else if (second[i] < third[j]) {
                first[index] = second[i];
                i++;
            } else {
                first[index] = third[j];
                j++;
            }
            index++;
        }
        for (int leftEnd = i; leftEnd<left; leftEnd++){
            first[index++] = second[leftEnd];
        }
        for(int rightEnd = j; rightEnd<right; rightEnd++){
            first[index++] = third[rightEnd];
        }
    }
    public void merge(int[] first, int[] second, int[] third){
        int left = second.length;
        int right = third.length;
        int i = 0;
        int j = 0;
        int index = 0;

        while (i < left && j < right) {
            if (second[i] < third[j]) {
                first[index] = second[i];
                i++;
            }
            else{
                if (second[i]>third[j]){
                first[index] = third[j];
                j++;}

            else {
                first[index]=second[i];
                index++;
                first[index]=third[j];
                i++;
                j++;
                    }
                index++;
            }
        }
        for (int leftEnd = i; leftEnd<left; leftEnd++){
            first[index++] = second[leftEnd];
        }
        for(int rightEnd = j; rightEnd<right; rightEnd++){
            first[index++] = third[rightEnd];
        }
    }
    public boolean isSimilar(int[] second, int[] third){
        int left = second.length;
        int right = third.length;
        int[] first = new int[left+right];
        int i = 0;
        int j = 0;
        int index = 0;
        while (i < left && j < right) {
            if (second[i] < third[j]) {
                first[index] = second[i];
                i++;
            } else {
                first[index] = third[j];
                j++;
            }
            index++;
        }
        for (int leftEnd = i; leftEnd<left; leftEnd++){
            first[index++] = second[leftEnd];
        }
        for(int rightEnd = j; rightEnd<right; rightEnd++){
            first[index++] = third[rightEnd];
        }
        for(int a = 0; a<first.length;a++){
            boolean isIn = false;
            boolean IsIn = false;
            for (int b = 0;b<second.length;b++){
                if (first[a]==second[b]){
                    isIn = true;
                }
                if((!isIn)&&(b==second.length-1)){
                    return false;
                }
            }
            for (int b = 0;b<third.length;b++){
                if (first[a]==third[b]){
                    IsIn = true;
                }
                if((!IsIn)&&(b==third.length-1)){
                    return false;
                }
            }
        }
        return true;
    }

}
