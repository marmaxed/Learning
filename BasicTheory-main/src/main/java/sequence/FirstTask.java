package sequence;

import java.util.Scanner;

public class FirstTask {
    Scanner scan = new Scanner(System.in);
     private int count = 0;
     private int value = -1;
     public void countNumber(){
         while (value!=0){
             value = scan.nextInt();
             count++;
         }
         System.out.println(count-1);
     }


}
