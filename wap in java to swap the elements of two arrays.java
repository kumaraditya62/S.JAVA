import java.util.Scanner;
public class swap
{
public static void main(String args[])
{
 int x,y;
 Scanner s1=new Scanner(System.in);
 System.out.println(" \n enter the size of array:");
 y=s1.nextInt();
 int a[]=new int [y];
 int b[]=new int [y];
 System.out.println("\n enter the element in first array");
 for(x=0;x<b.length;x++)
 b[x]=s1.nextInt();
 System.out.println("\n view teh element of first array:");
 for(x=0;x<a.length;x++)
 {
 System.out.print(a[x] + " ");
 }
 System.out.println("\n view the element of second array:");
 for(x=0;x<b.length;x++)
 {
  System.out.println( b[x] + "  ");
 }
 System.out.print(" \n ");
 for(x=0;x<y;x++)
 {
 a[x]=a[x]+b[x];
 b[x]=a[x]-b[x];
 a[x]=a[x]-b[x];
 }
 System.out.println("\n after swapping the output is");System.out.println("\n view the element of first array \n");
 for(x=0;x<a.length;x++)
 {
 System.out.println(a[x] + " " );
 }
 System.out.println("\n view the element of second arrays: \n");
 for(x=0;x<b.length;x++)
 {
  System.out.println(b[x] + " ");
 }
  System.out.print(" \n ");
 }}