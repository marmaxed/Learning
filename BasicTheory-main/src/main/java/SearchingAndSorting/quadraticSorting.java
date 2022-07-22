package SearchingAndSorting;

//Требуется поменять местами первый элемент массива с максимальным.
//Месклиниты собрались в экспедицию на край света. У них есть корабль,
// состоящий из N × M плотиков, связанных между собой.
// У каждого плотика есть своя грузоподъемность, а у каждого месклинита – своя масса.
// На каждом плотике может находиться не более одного месклинита.
// Если грузоподъемность выбранного плотика меньше массы месклинита,
// то бедный месклинит утонет при посадке.
//
//Руководитель экспедиции продумывает рассадку по плотикам.
// Помогите ему определить, какому максимальному количеству
// месклинитов удастся отправиться в путь.
//

/*
* Во время проведения олимпиады каждый из участников получил свой идентификационный номер
*  – натуральное число. Необходимо отсортировать список участников олимпиады по количеству
*  набранных ими баллов.*/
import java.util.Scanner;

public class quadraticSorting {
    Scanner scan = new Scanner(System.in);

    public void firstAndMax(int N){

        int[] arr = new int[N];

        for(int i = 0; i<N; i++){
            arr[i]=scan.nextInt();
        }
        int max = arr[0];
        int index =0;
        for(int i = 0; i<N; i++){
            if(arr[i]>max){
                max=arr[i];
                index = i;
            }
            if(i==N-1){
                arr[index]=arr[0];
                arr[0]=max;
            }
        }
        for(int i =0; i<N; i++){
            System.out.println(arr[i]);
        }
    }
    public int[] bubbleSort(int N) {
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scan.nextInt();
        }
        for (int j = N-1; j >-1; j--) {
            for (int i = 0; i < j; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        return arr;
    }
    public void insertNum(int N, int index, int num){
        int[] arr = new int[N+1];
        int[] alterArr = new int[N+1];

        for(int i = 0; i<N; i++){
            arr[i]= scan.nextInt();
        }
        for(int i = N; i>=index;i--){
            arr[i]=arr[i-1];
            if(i==index){
                arr[i]=num;
            }
        }
        for(int i =0; i<N+1;i++){
            System.out.println(arr[i]);
        }
    }
    public void insertSort(int N){
        int[] array = new int[N];
        for(int i = 0; i<N; i++){
            array[i]=scan.nextInt();
        }
        for (int left = 0; left < array.length; left++) {
            // Вытаскиваем значение элемента
            int value = array[left];
            // Перемещаемся по элементам, которые перед вытащенным элементом
            int i = left - 1;
            for (; i >= 0; i--) {
                // Если вытащили значение меньшее — передвигаем больший элемент дальше
                if (value < array[i]) {
                    array[i + 1] = array[i];
                } else {
                    // Если вытащенный элемент больше — останавливаемся
                    break;
                }
            }
            // В освободившееся место вставляем вытащенное значение
            array[i + 1] = value;
        }
    }
    public void bubbleCount(int N){
      int count = 0;
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scan.nextInt();
        }
        for (int j = N-1; j >-1; j--) {
            for (int i = 0; i < j; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    public void expedition(int amount, int kg, int human){
      int[] height = bubbleSort(amount*kg);
      int[] creatures = bubbleSort(human);
      int i = amount*kg;
      int count =0;
      int a = 0;
        for(int j= 0; j<i; j++){
            if(height[j]>=creatures[a]){
                count++;
                a++;
            }
        }
        System.out.println(count);
    }
    public void resultsOfOlimpia(int N){
        int[][] array = new int[N][2];
        for (int i = 0; i<N; i++){
            array[i][0]= scan.nextInt();
            array[i][1]= scan.nextInt();
        }
        for (int j = N-1; j >-1; j--) {
            for (int i = 0; i < j; i++) {
                if (array[i][0] < array[i + 1][0]) {
                    int[] temp = array[i];
                    array[i]= array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        for (int j = N-1; j >-1; j--) {
            for (int i = 0; i < j; i++) {
                if (array[i][0] == array[i + 1][0]) {
                    if (array[i][1] < array[i + 1][1]) {
                        int[] temp = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = temp;
                    }
                }
            }
        }
        for (int i=0; i<N; i++){
            System.out.print(array[i][0]+" ");
            System.out.print(array[i][1]);
            System.out.println(" ");
        }
    }
}
