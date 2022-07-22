package TypesOfData;

//Дано N чисел, требуется выяснить, сколько среди них различных.

//Даны два списка чисел, которые могут содержать до 100000 чисел каждый.
// Посчитайте, сколько чисел содержится одновременно как в первом списке, так и во втором.

/*Во входной строке записана последовательность чисел через пробел.
* Для каждого числа выведите слово YES (в отдельной строке),
* если это число ранее встречалось в последовательности или NO, если не встречалось.*/

/* В первый день спортсмен пробежал x километров,
*  а затем он каждый день увеличивал пробег на 70% от предыдущего значения.
*  По данному числу y определите номер дня,
*  на который пробег спортсмена составит не менее y километров. */

/*
* В некоторой сверхсекретной лаборатории изучаются физические возможности животных.
* Любой живой организм нуждается в трех компонентах пищи – белках, жирах и углеводах.
*  Известен набор продуктов, имеющийся в распоряжении лаборатории,
* и меню животных – сколько единиц каждого продукта они получают.
* Известно также, сколько белков, жиров и углеводов необходимо для нормальной
*  жизнедеятельности животного.
*  Необходимо определить, получает ли животное достаточное количество питательных веществ.
*  Известно, что животному требуется в сутки X белков, Y жиров и Z углеводов.
Известно также, что всего животное получает в сутки N продуктов питания,
*  и для каждого из них известны A_{i}A
соответственно, энергетическая ценность единицы продукта в белках,
*  жирах и углеводах и количество единиц этого продукта.
*  Все числа – действительные, заданные с точностью до 5 знаков после запятой.*/


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SetsAndRealNumber {

    Scanner scan = new Scanner(System.in);
    public void DifferentNum(){
        int value = scan.nextInt();
        int count = 0;
        List<Integer> listik = new ArrayList<>();
        for (int i =0;i<value;i++){
            int a = scan.nextInt();
            if (!listik.contains(a)){
                listik.add(a);
                count++;
            }
        }
        System.out.println(count);
    }

    public void matchingNumbers(){
        //TODO this
        int amount = scan.nextInt();
        String lineFirst = scan.nextLine();
        String lineSecond = scan.nextLine();
        String[] insideNumFirst = lineFirst.split(" ");
        String[] insideNumSecond = lineSecond.split(" ");
        List<String> similarNum = new ArrayList<>();
        for (int i = 0; i < amount; i++){
            if (!similarNum.contains(insideNumFirst[i]))
            {   for (int j = 0; j< amount;j++)
              {
                if (insideNumFirst[i].equals(insideNumSecond[j])) {
                    similarNum.add(insideNumFirst[i]);
                    break;
                }
              }
            }
        }
      System.out.println(similarNum);
    }

    public void yesNo(){
        int amount = scan.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i =0; i< amount; i++){
            int value = scan.nextInt();
            if(list.contains(value)){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            list.add(value);
        }
    }

    public void morningRun(){
        int y = scan.nextInt();
        int x = scan.nextInt();
        int day=1;
        while(x<y){
            x+=0.7*x;
            day++;
        }
        System.out.println(day);
    }


     /*public boolean IsEnough(){
        //TODO this
     String nutrients = scan.nextLine();
     String[] separatedNutrients = nutrients.split(" ");
     double[] requiredNutrients = new double[3];
     for (int i =0;i<3;i++){
         requiredNutrients[i]=Double.parseDouble(separatedNutrients[i]);
     }
     int amount = scan.nextInt();
     String[] energyValue = new String[amount];
     double[] availableNutrients = new double[3];
     double ex = 0;
     String[]separatedValue = new String[amount];
     for (int i = 0; i<amount; i++){
         energyValue[i]= scan.nextLine();
         separatedValue[i]=energyValue[i].split(" ");
         separatedValue[i]=energyValue[i].split(" ");
         separatedValue[i]=energyValue[i].split(" ");
         separatedValue[i][3]=energyValue[i].split(" ");}

     for (int i =0;i<amount;i++){
         System.out.println(energyValue[i].length());
         ex = Double.parseDouble(separatedValue[i][3]);
         availableNutrients[0]+=Double.parseDouble(energyValue[i].split(" ")[0])*ex;
         availableNutrients[1]+=Double.parseDouble(energyValue[i].split(" ")[1])*ex;
         availableNutrients[2]+=Double.parseDouble(energyValue[i].split(" ")[2])*ex;
     }
     for (int i =0; i<3; i++){
         if (availableNutrients[i]<requiredNutrients[i]){
                 return false;
         }
     }
        return true;
    }*/
}
