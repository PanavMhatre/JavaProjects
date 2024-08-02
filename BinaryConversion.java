//I made this in CodeHS. Here is the link: https://codehs.com/sandbox/id/binaryconversionlab22-2dmVyv
import java.util.*;

public class MyProgram {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        // 1. Input the size of the array and the elements
        System.out.print("Enter the number of elements in the array: ");
        int size = console.nextInt();
        int[] nums = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            nums[i] = console.nextInt();
        }

        // 2. Calculate the total sum of the elements
        int total = 0;
        for (int index = 0; index < nums.length; index++) {
            total += nums[index];
        }
        System.out.println("Total sum: " + total);

        // 3. Check if there is any odd number in the array
        boolean foundOdd = false;
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] % 2 == 1) {
                foundOdd = true;
                break; // Exit the loop early since we've found an odd number
            }
        }
        if (foundOdd) {
            System.out.println("Found an odd number");
        } else {
            System.out.println("No odd numbers found");
        }

        // 4. Check if there is any zero in the array
        boolean foundZero = false;
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] == 0) {
                foundZero = true;
                break; // Exit the loop early since we've found a zero
            }
        }
        if (foundZero) {
            System.out.println("Found a zero");
        } else {
            System.out.println("No zeros found");
        }

        // 5. Count occurrences of the number 6
        int numSix = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 6) {
                numSix++;
            }
        }
        if (numSix >= 2) {
            System.out.println("Two or more 6s found");
        } else {
            System.out.println("Less than two 6s found");
        }

        // 6. Check if there is a sequence of 2 followed by 3
        boolean foundTwoAndThree = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 3) {
                foundTwoAndThree = true;
                break; // Exit the loop early since we've found the sequence
            }
        }
        if (foundTwoAndThree) {
            System.out.println("Found the sequence 2,3");
        } else {
            System.out.println("Sequence 2,3 not found");
        }

        // 7. Check if the array is in ascending order
        boolean inOrder = true;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                inOrder = false;
                break; // Exit the loop early since the array is not in order
            }
        }
        if (inOrder) {
            System.out.println("Array is in ascending order");
        } else {
            System.out.println("Array is not in ascending order");
        }

        // 8. Count the number of even numbers and check if it's even
        int numberOfEvens = 0;
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] % 2 == 0) {
                numberOfEvens++;
            }
        }
        if (numberOfEvens % 2 == 0) {
            System.out.println("Even number of even numbers");
        } else {
            System.out.println("Odd number of even numbers");
        }

        // 9. Check for any number occurring three times in a row
        boolean hasThreeInRow = false;
        for (int index = 0; index < nums.length - 2; index++) {
            if (nums[index] == nums[index + 1] && nums[index] == nums[index + 2]) {
                hasThreeInRow = true;
                break; // Exit the loop early since we've found three in a row
            }
        }
        if (hasThreeInRow) {
            System.out.println("Found three in a row");
        } else {
            System.out.println("No three in a row found");
        }

        // Binary Conversion
        System.out.print("Enter a binary number: ");
        String binaryString = console.next(); // get a binary number String from the keyboard
        int[] binaryArray = new int[binaryString.length()]; // create new array

        for (int i = 0; i < binaryString.length(); i++) { // loop through all digits
            binaryArray[i] = Integer.parseInt(binaryString.substring(i, i + 1)); // convert to int
        }

        System.out.println("Binary array: " + Arrays.toString(binaryArray));

        console.close();
    }
}

