package DigitAnalysis;

public class Pages {

    private int pageCapacity;
    private int lineNumber;

    private int result;

    public int whichPage(int pageCapacity, int lineNumber){
        this.lineNumber = lineNumber;
        this.pageCapacity=pageCapacity;
        result = (int)(lineNumber/pageCapacity)+1;
        return result;
    }
}
