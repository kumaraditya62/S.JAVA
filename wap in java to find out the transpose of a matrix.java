import java.util.Scanner;
class transpose
{
	public static void main(String args [])
{
   int i,j,t,r,c;
Scanner s1=new Scanner(System.in);
System.out.println("enter the size of row:");
r=s1.nextInt();
System.out.println("enter the size of column:");
c=s1.nextInt();
System.out.println("\n putting the elements into the array:");
int a[][]=new int [r][c];
int b[][]=new int [c][r];
for(i=0;i<r;i++)
for(j=0;j<c;j++)
a[i][j]=s1.nextInt();
System.out.println("\n view the element of array \n");for(i=0;i<r;i++)
{System.out.print("\n");
for(j=0;j<c;j++)
{
 System.out.println(a[i][j]+ " \n ");	
}
}
for(i=0;i<r;i++)
{
 for(j=0;j<c;j++)
 {
 b [j][i]= a [i][j];
 }
}
System.out.println("\n after transposing print the data");
for(i=0;i<c;i++)
{
System.out.print(" \n ");
for(j=0;j<r;j++)
{
System.out.print(b [i][j]+ " \t ");
}
}
}
}