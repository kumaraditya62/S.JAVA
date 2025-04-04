import java.util.Scanner;
public class biggest
{
 public static void main(String args [])
 {
   int x,y,big=0,small=0;
   Scanner s=new Scanner(System.in);
   System.out.println("enter the size of array");
   y=s.nextInt();
   int a[]=new int [y];
   System.out.println("enter the element");
   for(x=0;x<a.length;x++)
   a[x]=s.nextInt();
   small=a[0];
 System.out.println("\n print the element of array");
 for(x=0;x<a.length;x++)
 System.out.println(a[x]+" ");
 for(x=0;x<a.length;x++)
 {
     if(a[x]<small)
     {
       small=a[x];
     }
 }
 System.out.println("smallest number is:" +small);
 }
}