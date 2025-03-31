//program to find that the sum & average of the elements present in array
import java.util.Scanner;
public class check{
    public static void main(String[] args) {
        int sum = 0;
        Scanner s = new Scanner(System.in);
        
        System.out.println("Input the size of the array: ");
        int size = s.nextInt();
        int arr[] = new int[size];
        
        System.out.println("Input the elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
            sum += arr[i];
        }

        float avg = (float) sum / arr.length;
        System.out.println("Sum is: " + sum + " | Avg is: " + avg);

        s.close();
    }
}

