import java.util.Scanner;

public class NestingOfMethods {
    /* Java Program to Show the Nesting of Methods
   Explanation: Enter length, breadth and height as input.
   After that we first call the volume method.
   From the volume method we call the area method and from the area method we call perimeter method. Hence we get the perimeter, area and volume of the cuboid as output.
    */

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length");
        int length=sc.nextInt();
        System.out.println("Enter the breadth");
        int breadth= sc.nextInt();
        System.out.println("Enter the height");
        int height=sc.nextInt();

        NestingOfMethods ns=new NestingOfMethods();
        int v=ns.volume(length,breadth,height);
        //Volume
        System.out.println("Volume is:"+v);

    }
    //Perimeter function
    public int perimeter (int breadth,int height)
    {
        int p=2*(breadth+height);
        return p;
    }

    public int area(int breadth,int height)
    {
        //calling perimeter function
        int peri =perimeter(breadth,height);
        System.out.println("Perimeter is:"+peri);

        //Calculate area .
        int ar=breadth*height;
        return ar;

    }
    public int volume(int length,int breadth,int height)
    {
       //Calling area method
        int ar=area(breadth,height);
        System.out.println("Area is :"+ar);
        //Calculate volume.
        int vol = length * breadth * height;
        return vol;
    }

    }

