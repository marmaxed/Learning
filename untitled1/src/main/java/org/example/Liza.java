package org.example;

import java.util.Scanner;

public class Liza {
   public void FirstYear(){
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        int[][] arr = new int[length][3];
        for (int i = 0;i<length;i++){
            for(int j =0; j<3;j++){
                arr[i][j]=scan.nextInt();
            }
        }
        int index = 0;
        int time = 0;
        while (index<length){
            if (index+2==length)
            {
                if ((arr[index][0]+arr[index+1][0])/2>arr[index][1]) {
                    time+=arr[index][1];
                    index+=2;
                }
                else{
                    time+=arr[index][0];
                    index++;
                }}
            else
            if(index+1==length) {
                time+=arr[index][0];
                index++;
            }

            else{
                if ((arr[index][0]+arr[index+1][0]+arr[index+2][0])/3>=arr[index][2]
                        &&((arr[index][0]+(arr[index+1][1]/2))/2)>=arr[index][2]){
                    time+=arr[index][2];
                    index+=3;
                } else if ((arr[index][0]+arr[index+1][0])/2>=arr[index][1]) {
                    time+=arr[index][1];
                    index+=2;
                }
                else{
                    time+=arr[index][0];
                    index++;
                }
            }
        }
        System.out.println(time);
      }
   }

