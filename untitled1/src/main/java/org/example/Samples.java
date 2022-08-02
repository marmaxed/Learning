package org.example;

import java.util.*;

public class Samples {
   static void samples(){
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();
        int columns = scan.nextInt();
        int size = scan.nextInt();
        int[] arr = new int[size];
        for(int i =0; i<size;i++){
            arr[i]=scan.nextInt();
        }
        int[][] boolArr = new int[rows][columns];
        int[] rowVal = new int[size];
        for (int q =0; q<size;q++){
           int length = arr[q];
           rowVal[q]=-1;
            for (int i=0; i<rows; i++){
                if(length==0){
                    break;
                }
                for (int j=0; j<columns; j++){
                    if(boolArr[i][j]==0&&j+length<=columns&&length!=0){
                        boolArr[i][j]=arr[q];
                        length--;
                        rowVal[q]=i+1;
                    }
                }
            }
        }
       for(int i =0; i<size;i++){
           System.out.println(rowVal[i]);
       }
    }
}
