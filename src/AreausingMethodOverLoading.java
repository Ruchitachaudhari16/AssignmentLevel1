public class AreausingMethodOverLoading {
    /* Java Program to Find Area of Square, Rectangle and Circle using Method Overloading
This is a Java Program to Find Area of Square, Rectangle and Circle using Method Overloading.
We declare three methods of the same name but with different numbers of arguments or with different data types.
Now when we call these methods using objects, corresponding methods will be called as per the number of arguments or their data types.*/

    public static int area(int side)
    {//Area of square
        int area=side*side;
        return area;
    }
    public static double area(double width,double height)
    {
        //Area of rectangle
        double area=width*height;
        return area;
    }
    public static void area(double radius)
    {
        //Area of Circle
        double area=3.14*radius*radius;


    }
  public static void main(String[] args)
    {
        //Calculate area of square
        System.out.print("areaof Square:-");
        System.out.println(AreausingMethodOverLoading.area(20));
        //Calculate area of rectangle
        System.out.print("Area of Rectangle:-");
        System.out.println(AreausingMethodOverLoading.area(20,30));
        //Calculate area of circle
        System.out.println("Area of circle:-");
        System.out.print(AreausingMethodOverLoading.area(30));

    }
}
