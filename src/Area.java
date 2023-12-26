import java.util.Scanner;

public class Area {

    /*Java Program to create an Area of triangle and rectangle and Passing and Returning Objects in Java
  Enter length and breadth of the rectangle as input.
  After that we create an object of that class and pass the reference variable to two different methods.
  Now we calculate the area for two different objects and return them to the main method.
  Hence we get two different areas as output.*/
    public static void areaoftriangle(double base,double height)
    {
       //Calculating area of triangle
        double tarea=(height*base)/2;
        System.out.println("Area of triangle is:"+tarea);

    }
    public static double areaofrectangle(double base,double height)
    {
        //Calculating area of rectangle
        double areaofrectangle=base*height;
        System.out.println("Area of rectangle is:"+areaofrectangle);
        return 0.0;
    }
    public static  void main(String[] args)
    {
        //Calculate area of triangle
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the height of triangle");
        double height= sc.nextDouble();
        System.out.println("Enter the base of triangle");
        double base= sc.nextDouble();
        areaoftriangle(height,base);
        areaofrectangle(height,base);
    }
}
