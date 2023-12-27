public class CountNumberOfObjects {
    /* Java Program to Count Number of Objects Created for Class
   Explanation:Whenever an object is made of a class, its constructor is invoked. Whenever the constructor runs we increment the counter value.
   Hence the number of objects created of a class equals the counter value.
     */
   static int counter=0;
    {
        counter +=1;
    }
    CountNumberOfObjects()
    {
        System.out.println("Constructor is invoked.");
    }
    CountNumberOfObjects(int n)
    {
        System.out.println("Constructor is invoked with 1 parameter");
    }
    CountNumberOfObjects(int a,int b)
    {
        System.out.println("Constructor is invoked with 2 parameters");
    }
    public static void main(String[] args)
   {

 CountNumberOfObjects cs=new CountNumberOfObjects();
 CountNumberOfObjects csOne=new CountNumberOfObjects(10);
 CountNumberOfObjects csTwo=new CountNumberOfObjects(10,20);
 CountNumberOfObjects csTh=new CountNumberOfObjects();

 System.out.println("Count for number of objects:" +CountNumberOfObjects.counter);
   }

}
