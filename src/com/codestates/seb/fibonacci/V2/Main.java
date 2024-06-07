package com.codestates.seb.fibonacci.V2;

public class Main {
    public static void main(String[] args) {
        Fibonacci test = new Fibonacci();
        test.printStartMessage();
        int num = test.inputNumber();
        test.printFiboArray(test.fiboArray(num));
    }
}
