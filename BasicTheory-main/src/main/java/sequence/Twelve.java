package sequence;

import java.util.Scanner;

public class Twelve {
    Scanner scan = new Scanner(System.in);
    private int lengthCount=0;
    private int maxCount=0;
    private int value = -1;
    private int compareElement;
    public int findLongestSequence(){
        while (value!=0) {
            compareElement = scan.nextInt();
            if (value==compareElement){
                lengthCount++;
            }
            value=compareElement;
            if(maxCount<lengthCount){
                maxCount = lengthCount;
            }
        }
        System.out.println(maxCount);
        return maxCount;
    }
}
