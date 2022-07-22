import Array.Calendar;
import Array.OneDemensialArray;
import Array.TwoDemensialArray;
import DigitAnalysis.Pages;
import DigitAnalysis.SumOfNumeric;
import MathAndDigitAlgorithms.ArithmeticAlgorithms;
import SearchingAndSorting.*;
import TypesOfData.*;
import sequence.EightTask;
import sequence.FirstTask;
import sequence.LocalMaxSize;
import sequence.Twelve;

import java.util.Scanner;

public class Theory {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        FirstTask firstTask = new FirstTask();
        //firstTask.countNumber();
        EightTask eightTask = new EightTask();
        //eightTask.findSecondMax();
        Twelve twelve = new Twelve();
        //twelve.findLongestSequence();
        LocalMaxSize localMaxSize = new LocalMaxSize();
        //localMaxSize.FindMinDistance();
        SumOfNumeric sumOfNumeric = new SumOfNumeric();
        //sumOfNumeric.countSumOfNumeric();
        Pages pages = new Pages();
        //int line = scan.nextInt();
        //int page = scan.nextInt();
        //System.out.println(pages.whichPage(page,line));
        LongestWord longestWord = new LongestWord();
        //longestWord.longestWord();
        SpecialFavoriteCase myCase = new SpecialFavoriteCase();
        //String word = scan.nextLine();
        //System.out.println(myCase.isPalindrome(word));
        SubString subStringTest = new SubString("Строка попроще", "рощ");
        //System.out.println(subStringTest.isSubString());
        //System.out.println(subStringTest.KMP());
        ConvertSubString convertSubString = new ConvertSubString("redtguyfj");
        //convertSubString.convert(3,6);
        Structures structures = new Structures();
        /*structures.FirstTask(2);
        structures.SecondTask(2);
        structures.SortedArr(4);
        structures.SortedStudents(3);
        structures.PersonalData(3);*/
        SetsAndRealNumber setsAndRealNumber = new SetsAndRealNumber();
        //setsAndRealNumber.DifferentNum();
        //setsAndRealNumber.matchingNumbers();
        //setsAndRealNumber.yesNo();
        //setsAndRealNumber.morningRun();
        //System.out.println(setsAndRealNumber.IsEnough());
        //OneDemensialArray oneDemensialArray = new OneDemensialArray();
        //oneDemensialArray.RotateRight();
        //oneDemensialArray.doubleReverse();
        //OneDemensialArray secondArray = new OneDemensialArray(9, 2, 5, 6, 9);
        //secondArray.doubleReverse();
        //oneDemensialArray.circle();
        TwoDemensialArray twoDemensialArray = new TwoDemensialArray();
        //twoDemensialArray.secondaryDioganal();
        //int n = scan.nextInt();
        //System.out.println(twoDemensialArray.symmetryMainDiagonal(n));
        TwoDemensialArray twoDemensialArray1 = new TwoDemensialArray(3, 2);
        //twoDemensialArray1.sportsmens(3,2);
        //int[][] arr= twoDemensialArray.multiplicationTable(3);
        // int[][] arr = twoDemensialArray.pascalsTriangle(3);
        /*for(int i =0;i<3;i++){
            for (int j =0;j<3;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println(" ");
        }*/
        TwoDemensialArray demar = new TwoDemensialArray(2);
        //demar.spiralMassive(2);
        //demar.snakeMassive(3,4);
        //demar.diagonalArray(4,4);
        //twoDemensialArray.Sapper(4,4,3);
        //twoDemensialArray.Spiral(3);
        Calendar calendar = new Calendar();
        /*calendar.JulianCalendar(66);
        calendar.TheDayAfterTomorrow(28,2,2003);
        calendar.BeginningOfEra(1,1,2);*/
        linearArraySearch search = new linearArraySearch();
        //search.starWars(7);
        binarySearch binarySearch = new binarySearch();
        //binarySearch.approximateSearch(5,5);
        //binarySearch.SearchTime(5);
        //binarySearch.IsInArray(10,5);
        //binarySearch.RightAndLeftBinarySearch(10,5);
        //System.out.println(binarySearch.binary_search(8,7));
        quadraticSorting quadraticSorting = new quadraticSorting();
        //quadraticSorting.resultsOfOlimpia(4);
        //quadraticSorting.expedition(2,3,6);
        //AnotherTypesOfSorting anotherTypesOfSorting = new AnotherTypesOfSorting(10);
        //anotherTypesOfSorting.DifNum();
        //anotherTypesOfSorting.heapSort();
        // anotherTypesOfSorting.heapCommands();
        // anotherTypesOfSorting.minOnSegment(4);
        //anotherTypesOfSorting.SortingSocks();
        SomeTask someTask = new SomeTask();
        //someTask.Forum();
        //someTask.anotherPalindrome();
        MergeSorting mergeSorting = new MergeSorting();
       // mergeSorting.mergingSequences();
        /*int[] i ={1,9,7};
        int[] j ={9,7,7,1};
        mergeSorting.mergeSort(j);
        for(int a = 0;a<j.length;a++){
            System.out.print(j[a]+" ");
        }
        System.out.println();
        System.out.println(mergeSorting.isSimilar(i,j));*/
        ArithmeticAlgorithms arithmeticAlgorithms = new ArithmeticAlgorithms();
       // arithmeticAlgorithms.lagrangesTheorem(66);
        //arithmeticAlgorithms.friendlyNum(300);
        //arithmeticAlgorithms.goldbachsConjecture(8);
        //arithmeticAlgorithms.primeFactors(30);
        arithmeticAlgorithms.squareCut(15,3);
    }
}
