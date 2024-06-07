package com.codestates.seb.fibonacci.V2;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {
    private Scanner sc = new Scanner(System.in);
    static int fibo0 = 1;
    static int fibo1 = 1;
    public void printStartMessage(){
      System.out.println("[안내]피보나치 수열 프로그램 시작.");
    }
    public int inputNumber(){
      return Integer.parseInt(sc.nextLine());
    }
    public int[] fiboArray(int num){
      int[] result = new int[num];
      result[0] = fibo0;
      result[1] = fibo1;
      for(int i = 2; i < num; i++){
        result[i] = result[i-2] + result[i-1];
      }
      return result;
    }
    public void printFiboArray(int... array){
      System.out.println("[피보나치 수열 출력]");
      for(int i=0; i < array.length; i++){
        System.out.printf("%d\n",array[i]);
        if(i == array.length-1){
          System.out.println("[안내]프로그램을 종료합니다.");
        }
      }
    }
}