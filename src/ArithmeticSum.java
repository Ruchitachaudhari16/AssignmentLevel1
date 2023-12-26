import java.util.Scanner;

public class ArithmeticSum {
    /*  Java Program to Find Arithmetic Sum by Passing Argument Using Method Overloading
 This is a Java Program to Find Arithmetic Sum of 2 or 3 or 4 Variables by Passing Arguments using Method Overloading. Two or more methods within the same class that share the same name but with different parameter declarations are called overloaded methods, and the process is referred to as method overloading.
Here we define a class with three different methods with the same name but different number of parameters. Now these methods can be called depending upon the number of arguments passed. Hence we get three different values as output.
*/
    public static void main(String[] args)
    {
        // calling Sum function for 2 arguments
        ArithmeticSum arSum=new ArithmeticSum();
       int result= arSum.sum(10,20);
       System.out.println("Sum of 2 numbers is:"+result);

       //Calling Sum function for 3 arguments
       int resultOne= arSum.sum(20,30,40);
       System.out.println("Sum of 3 numbers is:"+resultOne);

       //Calling sum function for 4 arguments
        int resultTwo=arSum.sum(10,20,30,40);
        System.out.println("Sum of four numbers :"+resultTwo);

    }
    public int sum(int numberone,int numbertwo)
    {//Sum function with 2 arguments
        int addition=numberone+numbertwo;
        return addition;
    }
    public int sum(int numberone,int numbertwo,int numberthree)
    {//sum function with 3 arguments
        int addition;
        addition=numberone+numbertwo+numberthree;
        return  addition;
    }
    public int sum(int numberone,int numbertwo,int numberthree,int numberfour)
    {//sum function with 4 arguments
        int addition;
        addition=numberone+numbertwo+numberthree+numberfour;
        return addition;
    }
}
