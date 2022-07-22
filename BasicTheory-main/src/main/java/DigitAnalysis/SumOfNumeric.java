package DigitAnalysis;

import java.util.Scanner;

public class SumOfNumeric {
    Scanner scan = new Scanner(System.in);
    private int sum;
    private int numeric=-1;
    private int value;
    public void countSumOfNumeric(){
        value = scan.nextInt();
        while (numeric!=0){
            numeric = value%10;
            sum+=numeric;
            value = (int)value/10;
        }
      System.out.println(sum);
    }
}
