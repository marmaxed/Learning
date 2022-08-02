package org.example;

import java.util.Scanner;

public class Sequence {
   static void printSequence(){
        Scanner scan = new Scanner(System.in);
        int firstAmount = scan.nextInt();
        int secondAmount = scan.nextInt();
        StringBuilder string = new StringBuilder();
        for(int i = 0; i<Math.min(firstAmount,secondAmount);i++){
            if(i>=Math.min(firstAmount,secondAmount)*2){
                string.append('Y');
            } else {
            if(i%2==0){
                string.append('X');
               }
            else {
                string.append('Y');
               }
            }
        }
  }
}
