package SearchingAndSorting;

import java.util.Scanner;

//Реализуйте алгоритм приближенного бинарного поиска.
/*
* В первой строке входных данных содержатся числа N и K (0 < N, K  < 100001).
* Во второй строке задаются N чисел первого массива, отсортированного по неубыванию,
*  а в третьей строке – K чисел второго массива.
*/

public class binarySearch {
   Scanner scan = new Scanner(System.in);

   public void approximateSearch(int N, int K){

      int[] sortedArr = new int[N];
      int[] secArr = new int[K];
      int[] result = new int[N];

      for(int i = 0;i<N;i++){
          sortedArr[i]=scan.nextInt();
      }

      System.out.println("------");

      for(int i = 0;i<K;i++){
          secArr[i] = scan.nextInt();
      }

       for(int i = 0;i<K;i++){
        int index = 0;
       for (int b = sortedArr.length/2; b>=1; b/=2) {
           while (index + b < sortedArr.length && sortedArr[index + b] <= secArr[i])
           {index += b;}
         }
       result[i]=sortedArr[index];
       }
       for(int i = 0;i<K;i++){
           System.out.println(result[i]);
       }
   }

   public void SearchTime(int N){
       int innerCount=0;
       for (int binCount = N; binCount>0;binCount/=2){
           innerCount++;
       }
       System.out.println(innerCount);
   }

   public void IsInArray(int N, int K){
       //сначала для одного элемента без массива К
       int[] array = new int[N];
       int[] secArr = new int[K];
       for(int i = 0;i<N;i++){
           array[i]=scan.nextInt();
       }
       System.out.println("------");
       for(int i = 0;i<K;i++){
           secArr[i] = scan.nextInt();
       }
       System.out.println("------");
       boolean[] isIn = new boolean[K];
       for (int i =0; i<K; i++){
       int low =0;
       int high = N;
       int value = secArr[i];
       while (high>=low) {
           System.out.println("count");
           int mid = (high + low) / 2 ;
           System.out.println(mid);
           if(array[mid]>=value){
               high=mid-1;
           }
           else if(array[mid]<=value){
               low=mid+1;
           }
           if(array[mid]==value){
               isIn[i]=true;
               break;
           }
       }
    }
       for (int i =0; i<K;i++){
           if(isIn[i]){
               System.out.println("Yes");
           } else {
               System.out.println("No");
           }
       }
   }
   public void RightAndLeftBinarySearch(int N, int K){
       int[][] indexOfOccurrence = new int[K][3];
       int[] sortedArr = new int[N];
       int[] secArr = new int[K];
       boolean[] IsIn = new boolean[K];

       for(int i = 0;i<N;i++){
           sortedArr[i]=scan.nextInt();
       }
       System.out.println("------");
       for(int i = 0;i<K;i++){
           secArr[i] = scan.nextInt();
       }
       for(int i = 0;i<K;i++) {
           int value = secArr[i];
           //rightSearch
           int left = -1;
           int right = sortedArr.length;

           while (right - left > 1) {
               int middle = (left + right) / 2;
               if (sortedArr[middle] <= value) {
                   left = middle;
               } else {
                   right = middle;
               }
               if(sortedArr[middle] == value) {
                   IsIn[i]=true;
                   indexOfOccurrence[i][1]=right;
               }
           }


           //leftSearch
           int lleft = -1;
           int lright = sortedArr.length;

           while (lright - lleft > 1) {
               int middle = (lleft + lright) / 2;
               if (sortedArr[middle] < value) {
                   lleft = middle;
               } else {
                   lright = middle;
               }

           if(sortedArr[middle] == value) {
               IsIn[i]=true;
               indexOfOccurrence[i][2]=lleft+2;
           }
       }
       }
       for (int i = 0; i < K; i++){
           if(IsIn[i]){
               System.out.print(indexOfOccurrence[i][1]+"  ");
               System.out.print(indexOfOccurrence[i][2]);
           } else {
               System.out.print(0);
           }
           System.out.println(" ");
       }
   }
}
