package org.example;

import java.util.Scanner;

public class NeonSky {
    int gcdByEuclidsAlgorithm(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return gcdByEuclidsAlgorithm(n2, n1 % n2);
    }

    void res(){
        Scanner scan = new Scanner(System.in);
        int amount = scan.nextInt();
        int[][] arr = new int[amount][];
        int[][] b = arr;
        for (int i = 0;i<amount;i++){
            int val = scan.nextInt();
                for (int j =0; j<val;j++){
                    arr[i][j]=scan.nextInt();
                }
        }
        /*for(int i =0; i<amount;i++){
            arr[i][0]
        }*/
    }
}

