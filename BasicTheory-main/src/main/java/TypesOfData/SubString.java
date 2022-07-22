package TypesOfData;

import java.util.Scanner;

//Даны две строки. Определите, является ли первая строка подстрокой второй строки.

public class SubString {

    private String string;
    private String subString;
    private char[] stringToArr;
    private char[] subStringToArr;

    public SubString(String string, String subString){
        this.string = string;
        this.subString = subString;
        stringToArr = string.toCharArray();
        subStringToArr = subString.toCharArray();
    }
    private int[] offsetTable(){
        int[] arr = new int[subStringToArr.length];
        for (int i = subStringToArr.length - 2;i>-1;i--){
            if (!(subStringToArr[i]+1==subStringToArr[i])){
                 arr[i] = (subStringToArr.length - i + 1);
            } else {
                arr[i]= arr[i+1];
            }
        }
        for (int i = subStringToArr.length-2;i>-1;i--){
            if (subStringToArr[subStringToArr.length-1]==subStringToArr[i])
                arr[subStringToArr.length - 1] = i;
        }
        if (arr[subStringToArr.length-1]==0){
            arr[subStringToArr.length-1]=subStringToArr.length;
        }
    return arr;
    }
    private int[] createIndex(){
        int arr[] = new int[(subString.length())+1];
        int prefLength = 0;
        arr[0]=-1;
        arr[1]=0;
        int i =1;

        while (i<subString.length()){
            if (subStringToArr[i]==subStringToArr[prefLength]){
                prefLength++;
                i++;
                arr[i]=prefLength;
            }
            else if(prefLength>0){
                prefLength=arr[prefLength];
            }
            else {
                i++;
                arr[i]=0;
            }
        }
      return arr;
    }


    public boolean isSubString(){
        return string.contains(subString);
    }
    public boolean BMH(){
        boolean isIn = false;
        int index = subStringToArr.length-1;
        System.out.println(string);
        System.out.println(subString);
        int count = 0;
      while (index<=stringToArr.length){
        count = 0;
        for (int i = subStringToArr.length-1; i>-1;i--) {
            System.out.println(stringToArr[index - count] + " " + count);
            System.out.println(subStringToArr[i] + " " + i);
            System.out.println("----------------------");
            if (stringToArr[index - count] != subStringToArr[i]) {
                if (i == subStringToArr.length - 1) {
                    index = index + subString.length() - 1;
                } else {
                    index = index + i;

                }
                break;
            } else count++;

            if (i==0){
                System.out.println("Образ найден");
                isIn = true;
            }
        } if (isIn) break;
      }
    return isIn;}


    public boolean KMP(){
        int count =0;
        int textIndex =0;
        int subStringIndex =0;
        int[] prefLength = createIndex();
        while (textIndex<stringToArr.length){
            if (subStringToArr[subStringIndex]==stringToArr[textIndex]){
                textIndex++;
                subStringIndex++;
                if(subStringIndex==subStringToArr.length){
                    System.out.println("I found it");
                    count++;
                    subStringIndex=prefLength[subStringIndex];
                }
            }
            else {
               subStringIndex=prefLength[subStringIndex];
               if (subStringIndex<0){
                   subStringIndex++;
                   textIndex++;
               }
            }
        }
        if (count>0){
            return true;
        }
        return false;
    }
}
