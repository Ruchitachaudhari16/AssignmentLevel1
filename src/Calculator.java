import java.util.Scanner;

public class Calculator {
    //1. Java Program to create a calculator and Return a Value from a Method
    /* We make a method named input which is used to get input from the user.
We also make a method named add which is used to perform addition and return the result back to input method where we finally print the result.*/

    public static  void main(String args[])
    {
        //Calling function 1
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number1");
        int numberOne= sc.nextInt();
        System.out.println("enter the number2");
        int numberTwo= sc.nextInt();
        add(numberOne,numberTwo);
        System.out.println("---------------------------------");
        //Calling function 2
        sum(130,40,50);

    }

    public static  void add(int numberOne,int numberTwo)
    {//Addition function using void return type.
        int addition;
        addition=numberOne+numberTwo;
        System.out.println("addition is :"+addition);
        return;
    }
    public static  int sum(int x,int y,int z)
    {
        int result = x + y + z;
        System.out.println("Addition of 3 numbers is:" + result);
        return 0;
    }

    }

