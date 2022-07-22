package org.example;


import org.example.NameSpaceFirst.myFunc;
import org.example.NameSpaceSecond.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        myFunc myfunc = new myFunc();
        myfunc.foo();
    }
}