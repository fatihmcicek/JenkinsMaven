package org.example;

public class App
{
    public static void main( String[] args )
    {
        System.out.println("Notest");
        System.out.println(new App().Add(2,3));
    }

    public int Add(int number1, int number2){
        return number1 + number2;
    }

    public int Subtract(int number1, int number2){
        return number1 - number2;
    }

    public int Multiply(int number1, int number2){
        return number1 * number2;
    }
}