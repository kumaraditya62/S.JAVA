import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int num, fact=1;
Scanner s= new Scanner(System.in);

        System.out.print("Enter a number: ");
    num = s.nextInt();
      for (int i=1; i<=num; i++) {
            fact=fact*i;
        }
System.out.println("factorial="+fact);
    }
   s.close();
}