import java.util.Scanner;

//Link: https://codehs.com/sandbox/id/primecheckerlab14-Znojlq
//Checks if a number is primte or not with some pratice of looping

public class MyProgram {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        //1
        for (int i = 1; i < 10; i++) {
            System.out.print(i);
        }

        System.out.println(" ");
        //2
        for (int i = 1; i < 10; i++) {
            System.out.print(i + " ");
        }

        System.out.println(" ");
        //3
        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println();
        //4
        for (int i = 20; i <= 25; i++) {
            System.out.print(i + " ");
        }

        System.out.println(" ");
        //5
        for (int i = 10; i <= 80; i += 10) {
            System.out.print(i + " ");
        }

        System.out.println();
        //6
        for (int i = 0; i >= -10; i--) {
            System.out.print(i + " ");
        }

        System.out.println();
        //7
        System.out.print("Enter an Integer number indicating how many times you want the asterisk to print: ");
        int sum = console.nextInt();
        console.nextLine();
        for (int i = 0; i < sum; i++) {
            System.out.print("* ");
        }

        System.out.println(" ");
        //8
        for (int i = 10; i >= 1; i--) {
            System.out.print(i * i + " ");
        }

        System.out.println(" ");
        //9
        for (int i = 1; i < 10; i++) {
            if (i % 3 == 0) {
                System.out.print("? ");
            } else {
                System.out.print(i + " ");
            }
        }

        System.out.println(" ");
        //10
        System.out.print("Enter an Integer number indicating the number you want the factorial of: ");
        int value = console.nextInt();
        console.nextLine();
        int savedValue = 1;
        for (int i = 1; i <= value; i++) {
            savedValue = savedValue * i;
        }

        System.out.println("The factorial of " + value + " is " + savedValue);

        System.out.println(" ");
        //Lab PrimeChecker
        boolean stillChecking = true;

        while (stillChecking) {
            System.out.print("Enter 1 to check if a number is prime or 2 to exit >>> ");
            int valid = console.nextInt();
            console.nextLine();
            if (valid == 1) {
                System.out.print("Enter an Integer number: ");
                int integer = console.nextInt();
                console.nextLine();

                if (isPrime(integer)) {
                    System.out.println(integer + " is prime");
                } else {
                    System.out.println(integer + " is not prime");
                }
            } else {
                stillChecking = false;
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
