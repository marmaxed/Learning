package SearchingAndSorting;

import java.util.Arrays;
import java.util.Scanner;

//Имеется стол длины L. На столе разложено N носков так, что никакой носок не вылезает за границы стола.
// Далее имеется умный мальчик Васька, который хочет (сугубо в корыстных целях) замерить толщину покрытия
// стола носками в M точках.(сколько носков дотягивается до точки)

/*Клуб Юных Хакеров организовал на своем сайте форум.
Форум имеет следующую структуру: каждое сообщение либо начинает новую тему,
 либо является ответом на какое-либо предыдущее сообщение и принадлежит той же теме.

После нескольких месяцев использования своего форума юных хакеров заинтересовал вопрос
 - какая тема на их форуме наиболее популярна. Помогите им выяснить это.*/

public class AnotherTypesOfSorting {
    Scanner scan = new Scanner(System.in);
    private int[] array;


    public AnotherTypesOfSorting(int N){
        this.array = new int[N];
        for (int i =0; i<N; i++){
        array[i]= scan.nextInt();}
        System.out.println("-------");
    }


    public void DifNum(){
        int count=1;
        array=quickSort(array,0,array.length-1);
        for (int i =1; i<array.length;i++){
            if(array[i-1]!=array[i]){
                count++;
            }
        }
        System.out.print(count);
    }

    public int[] quickSort(int[] arr, int left, int right) {
        int low = left;
        int high= right;
        int midVal = arr[(low + high) / 2];
        while (low<=high){
            while(midVal<arr[high]){
                high--;
            }
            while (midVal>arr[low]){
                low++;
            }
            if (low<=high){
                if (low<high){
                    int temp = arr[low];
                    arr[low]=arr[high];
                    arr[high]=temp;
                }
                low++;
                high--;
            }
        }
        if (low<right){
            quickSort(arr,low,right);
        }
        if(high>left){
            quickSort(arr,left,high);
        }
        return arr;
    }
    public int[] heapSort(){
     int n = array.length;
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(array, n, i);

        for (int i=0; i<n; ++i)
            System.out.print(array[i]+" ");
        System.out.println();
        // Один за другим извлекаем элементы из кучи
        for (int i=n-1; i>=0; i--)
        {
            // Перемещаем текущий корень в конец
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            // Вызываем процедуру heapify на уменьшенной куче
            heapify(array, i, 0);
        }
        for (int i=0; i<n; ++i)
            System.out.print(array[i]+" ");
        System.out.println();

        return array;
    }

    public int[] heapSort(int[] array){
        int n = array.length;
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(array, n, i);

        // Один за другим извлекаем элементы из кучи
        for (int i=n-1; i>=0; i--)
        {
            // Перемещаем текущий корень в конец
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            // Вызываем процедуру heapify на уменьшенной куче
            heapify(array, i, 0);
        }
        for (int i=0; i<n; ++i)
            System.out.print(array[i]+" ");
        System.out.println();

        return array;
    }

    private int[] heapify(int[] array, int n, int i) {
        int largest = i;
        int left = 2*i+1;
        int right = 2*i+2;
        if(left<n&&array[left]>array[largest]){
            largest=left;
        }
        if(right<n&&array[right]>array[largest]){
            largest=right;
        }
        if(largest!=i){
            int temp = array[i];
            array[i]=array[largest];
            array[largest]=temp;
            heapify(array, n, largest);
        }
        return array;
    }

    public void heapCommands(){
       int[] Array = array;
        System.out.println("enter amount of commands");
      int count = scan.nextInt();
      for(int i =0; i<count;i++){
          System.out.println("enter commands");
          int command = scan.nextInt();
          if(command==0){
                  System.out.println("insert value");
                  int key = scan.nextInt();
                  Array= insert(Array,Array.length,key);
                  }
          else if (command==1) {
              Array = deleteRoot(Array, Array.length);
                   }
          }
      }


        public int[] deleteRoot(int arr[], int n)
        { arr = heapSort(arr);
            int[] array = new int[n-1];
            for(int i =0; i<array.length;i++){
                array[i]=arr[i];
            }
            System.out.println(arr[n-1]);
            return array;
        }

        public int[] insert(int arr[], int n, int key){
           int[] array = new int[n+1];
           for(int i = 0; i<n; i++){
               array[i]=arr[i];
           }
           array[n]= key;
           return heapSort(array);
        }

        public void minOnSegment(int segment){
        for (int i =0; i<array.length-segment;i++){
            int min = array[i];
            for(int j =0; j<segment;j++){
                if(array[i+j]<min){
                    min = array[i+j];
                }
            }
            System.out.println(min);
        }
        }
        public int[] countingSorting(){
        int[] sortMass = new int[array.length];
        int k;
        for(int i = 0; i<array.length;i++){
            k=0;
            for(int j =0; j<array.length;j++){
                if(array[i]>array[j]){
                    k++;
                }
                sortMass[i]=array[k];
            }
        }
        return sortMass;
        }
        public void SortingSocks(){
            System.out.println("enter length of table");
        int lenth = scan.nextInt();
            System.out.println("enter amount of pairs");
        int pairs = scan.nextInt();
            System.out.println("enter amount of points");
        int amount = scan.nextInt();
        int[] points = new int[amount];
        int[] intersections = new int[amount];
        boolean[][] cover = new boolean[pairs][lenth];
        for(int i =0; i<pairs;i++){
            System.out.println("введите координаты начала и конца");
            int start = scan.nextInt();
            int end = scan.nextInt();
            for (int k = start; k<=end; k++){
                cover[i][k]=true;
            }
        }
        System.out.println("enter points");
        for(int i = 0; i<amount; i++){
            points[i]= scan.nextInt();
        }
        for(int i = 0; i<amount;i++){
            int count = 0;
            for(int j =0; j<pairs;j++){
                if(cover[j][points[i]]){
                    count++;
                }
            }
            intersections[i]=count;
            System.out.print(intersections[i]+" ");
         }
        }
        public boolean isAnagram(String s1,String s2){
              s1.toLowerCase();
              s2.length();
              char[] c1 = s1.toCharArray();
              char[] c2 = s2.toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            String firstSort = new String(c1);
            String secondSort = new String(c2);
            return firstSort.equals(secondSort);
        }
    }

