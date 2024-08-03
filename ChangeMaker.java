import java.util.Scanner;

//Emulating a real life change maker machine 
//Created using CodeHS. Here is the link: https://codehs.com/sandbox/id/changemakerlab26-ywippJ


public class MyProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1
        System.out.print("Enter a value to search for in the array {8, 6, 7, 4, 3, 6, 5}: ");
        int searchValue = scanner.nextInt();
        System.out.println(simpleSearch(new int[]{8, 6, 7, 4, 3, 6, 5}, searchValue));

        // 2
        System.out.print("Enter the size for the square board: ");
        int squareSize = scanner.nextInt();
        squareBoard(squareSize);

        // 3
        System.out.print("Enter the size for the checkerboard: ");
        int checkerSize = scanner.nextInt();
        checkerBoard(checkerSize);

        // 4
        System.out.print("Enter the number of powers of 2 to print: ");
        int powers = scanner.nextInt();
        printPow2(powers);

        // 5
        System.out.print("Enter a temperature to convert: ");
        double temp = scanner.nextDouble();
        System.out.print("Is this temperature in Fahrenheit (true/false)? ");
        boolean isF = scanner.nextBoolean();
        System.out.println(convertTemp(temp, isF));

        // 6
        System.out.print("Enter a number to check if it is an Armstrong number: ");
        int armstrongNumber = scanner.nextInt();
        System.out.println(isArmstrong(armstrongNumber));

        // 7
        System.out.println("Checking if the array {1, 2, 1, 2, 3} contains the sequence {1, 2, 3}:");
        System.out.println(contains(new int[]{1, 2, 1, 2, 3}, new int[]{1, 2, 3}));

        // LAB
        System.out.print("Enter the amount paid: ");
        double paid = scanner.nextDouble();
        System.out.print("Enter the cost: ");
        double cost = scanner.nextDouble();
        makeChange(paid, cost);

        System.out.print("Enter a number to print in reverse: ");
        int number = scanner.nextInt();
        printReverse(number);

        scanner.close();
    }

    public static int simpleSearch(int[] nums, int value) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static void squareBoard(int n) {
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n; k++) {
                System.out.print("#");
            }
            System.out.println("");
        }
    }

    public static void checkerBoard(int n) {
        for (int i = 0; i < n; i++) {
            for (int k = i; k < n + i; k++) {
                if (i % 2 == 0) {
                    System.out.print("# ");
                } else {
                    System.out.print(" #");
                }
            }
            System.out.println("");
        }
    }

    public static void printPow2(int n) {
        System.out.println("Here are the first " + n + " powers of 2:");
        for (int i = 0; i < n; i++) {
            System.out.println("2^" + i + "= " + (int) Math.pow(2, i));
        }
    }

    public static double convertTemp(double temp, boolean isF) {
        if (isF) {
            return (temp - 32) * (5.0 / 9);
        } else {
            return (temp * (9.0 / 5)) + 32;
        }
    }

    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int total = 0;
        while (num >= 1) {
            total += Math.pow(num % 10, 3);
            num = num / 10;
        }
        return originalNum == total;
    }

    public static boolean contains(int[] a, int[] b) {
        String numA = "";
        String numB = "";
        for (int value : a) {
            numA = numA + value;
        }
        for (int j : b) {
            numB = numB + j;
        }
        return numA.contains(numB);
    }

    public static void makeChange(double paid, double cost) {
        double change = paid - cost;
        double[] bills = {20, 10, 5, 1, 0.25, 0.10, 0.05, 0.01};
        int[] totalBills = new int[bills.length];

        for (int i = 0; i < bills.length; i++) {
            while (change >= bills[i]) {
                change = Math.round((change - bills[i]) * 100.0) / 100.0;
                totalBills[i]++;
            }
        }

        System.out.println("Change:");
        for (int i = 0; i < totalBills.length; i++) {
            if (bills[i] >= 1) {
                System.out.println("$" + (int) bills[i] + ": " + totalBills[i]);
            } else {
                System.out.printf("%.0f cents: %d\n", bills[i] * 100, totalBills[i]);
            }
        }
    }

    public static void printReverse(int num) {
        int reverseNum = 0;
        while (num > 0) {
            reverseNum = reverseNum * 10 + num % 10;
            num = num / 10;
        }
        System.out.println(reverseNum);
    }
}
