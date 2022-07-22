package TypesOfData;

import java.util.Scanner;

public class ConvertSubString {

    private String word;
    private char[] wordArray;
    public ConvertSubString(String word){
        this.word = word;
    }
    public void convert(int lowLimit, int upLimit){
        wordArray = word.toCharArray();
        for (int i = lowLimit; i<upLimit/2;i++){
            char temp = wordArray[i];
            wordArray[i]=wordArray[upLimit-i-1];
            wordArray[upLimit-i-1]=temp;
        }
        System.out.println(wordArray);
    }
}
