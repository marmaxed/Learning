package sequence;

import java.util.Scanner;

public class LocalMaxSize {
    Scanner scan = new Scanner(System.in);
    private int max = 0;
    private int value= -1;
    private int distance;
    private int SaveDistance;
    private int prevVal;
    private int prevPrevVal;
    private int count;
    public void FindMinDistance(){
         while(value!=0){
             count++;
             distance++;
             prevPrevVal=prevVal;
             prevVal=value;
             value=scan.nextInt();
             if (prevVal>prevPrevVal&&prevVal>value){
                 if(SaveDistance==0||(distance<SaveDistance)){
                     SaveDistance = distance;
                 }
                 distance = 0;
             }
         }
         if (SaveDistance==count){
             System.out.println(0);
         } else
         System.out.println(SaveDistance);
     }
}
