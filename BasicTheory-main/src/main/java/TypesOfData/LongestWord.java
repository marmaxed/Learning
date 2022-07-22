package TypesOfData;

//Дана строка, содержащая пробелы.
// Найдите в ней самое длинное слово,
// выведите  это слово и его длину.
// Если таких слов несколько, выведите первое из них.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LongestWord {
    Scanner scan = new Scanner(System.in);
    private String[] lineArray;
    private String line;
    private String maxWord;
    private int maxSize;
    public void longestWord(){
        line=scan.nextLine();
        lineArray = line.split(" ");
        for (int i = 1; i<lineArray.length; i++){
             if (lineArray[i].length()>lineArray[i-1].length()){
                 maxWord = lineArray[i];
                 maxSize = lineArray[i].length();
             }
            }
        System.out.println(maxWord);
        System.out.println(maxSize);
        }
    }

