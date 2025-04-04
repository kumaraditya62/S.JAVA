public class circle
{
    final double PI=3.14;
    public void area(int r)
    {
        double area=PI*r*r;
   System.out.println("Area of circle="+area);
    }
    public static void main(String args [])
    {
   circle c=new circle();
   c.area(4);
    }
}