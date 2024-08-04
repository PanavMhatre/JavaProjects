import java.util.*;
import java.util.Scanner;

//Link: https://codehs.com/sandbox/id/luckydicelab15-Hy4Vfo
//A game that test luck by rolling two dices and hoping they are the same

public class MyProgram {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        // Task 1: Factors of a number
        System.out.print("Enter an Integer >>> ");
        int usersInteger = console.nextInt();
        console.nextLine();

        System.out.print("Factors of " + usersInteger + " >>> ");
        for (int i = 1; i <= usersInteger; i++) {
            if (usersInteger % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n");

        // Task 2: Count "cool numbers" (for loop)
        System.out.print("Enter an Integer? >>> ");
        int inputInteger = console.nextInt();
        console.nextLine();

        int amountOfCoolNumbers = 0;
        for (int i = 1; i <= inputInteger; i++) {
            if ((i % 3 == 1) && (i % 4 == 1) && (i % 5 == 1) && (i % 6 == 1)) {
                amountOfCoolNumbers++;
            }
        }
        System.out.println("There are " + amountOfCoolNumbers + " cool numbers up to " + inputInteger);
        System.out.println(" ");

        // Task 3: Count "cool numbers" (while loop)
        System.out.print("Enter an Integer? >>> ");
        inputInteger = console.nextInt();
        console.nextLine();

        amountOfCoolNumbers = 0;
        int c = 1;
        while (c <= inputInteger) {
            if ((c % 3 == 1) && (c % 4 == 1) && (c % 5 == 1) && (c % 6 == 1)) {
                amountOfCoolNumbers++;
            }
            c++;
        }
        System.out.println("There are " + amountOfCoolNumbers + " cool numbers up to " + inputInteger);
        System.out.println(" ");

        // Task 4: Sum of perfect numbers (for loop)
        System.out.print("Enter an Integer >>> ");
        inputInteger = console.nextInt();
        console.nextLine();

        int value = 0;
        for (int j = 1; j < inputInteger; j++) {
            if (inputInteger % j == 0) {
                value = value + j;
            }
        }
        System.out.println("Sum of perfect numbers: " + value);
        System.out.println(" ");

        // Task 5: Sum of perfect numbers (do-while loop)
        System.out.print("Enter an Integer >>> ");
        inputInteger = console.nextInt();
        console.nextLine();

        value = 0;
        int j = 1;
        do {
            if (inputInteger % j == 0) {
                value = value + j;
            }
            j++;
        } while (j < inputInteger);
        System.out.println("Sum of perfect numbers: " + value);
        System.out.println(" ");

        // Task 6: Dice simulation
        System.out.print("Number of faces on each die? >>> ");
        int numFaces = console.nextInt();
        console.nextLine();

        System.out.print("Number of simulations? >>> ");
        int numSims = console.nextInt();
        console.nextLine();
        System.out.println("");

        Random randomGen = new Random();
        int sumAccumulateVariable = 0;

        for (int i = 1; i <= numSims; i++) {
            int roleCounter = 0, points = 0;

            while (points <= 1000) {
                int die1 = randomGen.nextInt(numFaces) + 1; // generates new random int from 1 to amount of sides
                int die2 = randomGen.nextInt(numFaces) + 1; // generates new random int from 1 to amount of sides

                int total = die1 + die2;
                roleCounter++;
                points = points + total;
            }
            sumAccumulateVariable = sumAccumulateVariable + roleCounter;
            System.out.println("Simulation: " + i + " - number of rolls to reach 1000 >>> " + roleCounter);
        }

        sumAccumulateVariable /= numSims;
        System.out.println(" ");
        System.out.println("Average number of rolls, for all simulations >>> " + sumAccumulateVariable);
    }
}
