public class One {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("Original Array");
        printArray(numbers);
        
        numbers[2] = 35; // Updating value
        System.out.println("\nModified Array");
        printArray(numbers);

        int length = numbers.length; // Length of the array
        System.out.println("\nLength of the Array: " + length);

        int[] copyArray = new int[length];
        System.arraycopy(numbers, 0, copyArray, 0, length); // Array copy
        printArray(copyArray);

        int target = 40;
        int index = searchElements(numbers, target);
        if (index != -1) {
            System.out.println("\nElement " + target + " found at index " + index);
        } else {
            System.out.println("\nElement " + target + " not found in the array");
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); // Print on the same line
        }
        System.out.println(); // Move to next line
    }

    public static int searchElements(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1; // If target not found
    }
}
