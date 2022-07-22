package TypesOfData;

//По данной строке определите, является ли она палиндромом

import java.util.Scanner;

public class SpecialFavoriteCase {
    private char[] symbols;
    public boolean isPalindrome(String line){
        symbols=line.toCharArray();
        for (int i =0; i<line.length()/2;i++){
            if (symbols[i]!=symbols[line.length()-1-i]){
                return false;
            }
        }
        return true;
    }
}
