package sequence;


import java.util.Scanner;

public class EightTask {
    Scanner scan = new Scanner(System.in);
    private int max=0;
    private int secondMax=0;
    private int value = -1;
    public int findSecondMax(){
     while (value!=0) {
         value = scan.nextInt();
         if(secondMax<value){
             secondMax = value;
         }
         if (secondMax>max){
             int temp = max;
             max = secondMax;
             secondMax = temp;
         }
     }
     System.out.println(secondMax);
     return secondMax;
    }

}
