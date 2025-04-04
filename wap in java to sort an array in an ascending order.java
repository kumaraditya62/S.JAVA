import java.util.Scanner;
public class Arraysorting
{
public static void main(String args[])
{
int i,j,temp=0;
Scanner s=new Scanner(System.in);
System.out.println("Enter the size of the Array");
int size=s.nextInt();
int a[]=new int[size];
System.out.println("Enter the array element");
for (i=0;i<a.length;i++)
{
a[i]=s.nextInt();
for (j=0;j<a.length;j++)
{
if (a[i]<a[j])
{
temp=a[j];
a[j]=a[i];
a[i]=temp;
}
}
}
System.out.println("\n sort the Array in Ascending order\n");
for (i=0;i<a.length;i++)
{
System.out.println(a[i]+"\t");
}
}
}