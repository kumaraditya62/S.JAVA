import java.util.Scanner;
class check
{
    public static void main(String args [])
    {
        int sum=0;
        Scanner s=new Scanner(System.in);
     System.out.println("input the size of array");
     int size=s.nextInt();
     int arr[]=new int[size];
   
  System.out.println("input the element of array");
  for(int i=0;i<arr.length;i++)
  {
      arr[i]=s.nextInt();
      sum+=arr[i];
  }
  float avg=(float)(sum/arr.length);
  System.out.println("SUM IS:"+sum+"AVG I S:"+avg);
    }}