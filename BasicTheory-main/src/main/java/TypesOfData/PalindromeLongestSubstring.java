package TypesOfData;
/*Цвет панциря каждого месклинита обозначается заглавной латинской буквой (от "A" до "Z" ).
        В целях экономии времени руководитель собирается выбрать из шеренги несколько подряд стоящих.
        Кроме того, он считает, что разведка будет более удачной,
        если выбранный отряд будет симметричен по цветам панцирей.
        Например, отряд "RGBGR" будет симметричным, а отряд "RGRB"  – нет.*/

public class PalindromeLongestSubstring {
    private String string;
    private int centerOfPalindrome;
    private int rightLimit;
    private int index;
    private int revIndex;
    private int maxLen;
    private int palindromeLength;
    private char[] DerivativeString;
    public PalindromeLongestSubstring(String string){
        this.string=string;
    }
    public void selectBest(){
        char[] ArrayString = string.toCharArray();
        for (int i =0; i<string.length();i++){
            DerivativeString[i*2+1]=ArrayString[i];
        }
        int[] palindromeRadius = new int[DerivativeString.length];
        for (int i =1; i<DerivativeString.length-1;i++){
            revIndex = 2*centerOfPalindrome-i;
            if (rightLimit>i){
                palindromeRadius[i]= Math.min(palindromeRadius[revIndex],rightLimit-i);
            } else {
                palindromeRadius[i]=0;
            }
            while(i > palindromeRadius[i] &&
                    (i + palindromeRadius[i] + 1) < DerivativeString.length
                    && DerivativeString[i - palindromeRadius[i] - 1] == DerivativeString[i + palindromeRadius[i] + 1])
            {++palindromeRadius[i];}
            if(palindromeRadius[i] + i > rightLimit){
                centerOfPalindrome = i;
                rightLimit = i + palindromeRadius[i];
            }

            if(maxLen < palindromeRadius[i]){
                maxLen = palindromeRadius[i];
                index = i;
            }
        }
    }
}
