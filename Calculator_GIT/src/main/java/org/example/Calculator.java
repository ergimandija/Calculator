package org.example;

public class Calculator {
    public int add(int a,int b){
        return a+b;

    }

    public int subtract(int a,int b){
        return a-b;
    }

    public int multiplication(int a, int b){

        return a*b;
    }

    public double division(double a, double b) throws DivideByZeroException{
        if(b==0){
            throw new DivideByZeroException();
        }
        return a/b;

    }

}
