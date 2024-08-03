import java.util.*;

//Link: https://codehs.com/sandbox/id/approximatepilab25-9aa06R
//Calculating PI like a real world math mathematician

public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        //1
        System.out.print("Enter a number to check if it's positive: ");
        int num1 = scanner.nextInt();
        System.out.println(isPositive(num1));

        //2
        System.out.print("Enter a number to check if it's odd: ");
        int num2 = scanner.nextInt();
        System.out.println(isOdd(num2));

        //3
        System.out.print("Enter two numbers to find the maximum (separated by space): ");
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        System.out.println(getMax(num3, num4));

        //4
        System.out.println("Rolling a 6-sided dice: " + rollDice());

        //5
        System.out.print("Enter the number of faces on the dice: ");
        int numFaces = scanner.nextInt();
        System.out.println("Rolling a " + numFaces + "-sided dice: " + rollDice(numFaces));

        //6
        System.out.print("Enter a string to capitalize the first letter: ");
        String str = scanner.next();
        System.out.println(capitalizeFirst(str));

        //7
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        System.out.println("Area of the circle: " + circleArea(radius));

        //8
        System.out.print("Enter two numbers to check if the second is a multiple of the first (separated by space): ");
        int num5 = scanner.nextInt();
        int num6 = scanner.nextInt();
        System.out.println(isMultiple(num5, num6));

        //9
        System.out.print("Enter time value: ");
        double time = scanner.nextDouble();
        System.out.print("Is this in minutes? (true/false): ");
        boolean isMinutes = scanner.nextBoolean();
        System.out.println(convertTime(time, isMinutes));

        //10
        System.out.print("Enter a string to print diagonally: ");
        String diagonalStr = scanner.next();
        printDiagonal(diagonalStr);

        //Lab Approximate
        System.out.print("Enter the number of iterations to approximate Pi: ");
        int iterations = scanner.nextInt();
        System.out.println("Approximation of Pi: " + approximatePi(iterations));
        
        scanner.close();
    }

    public static boolean isPositive(int a){
        return a > 0;
    }

    public static boolean isOdd(int a){
        return a % 2 == 1;
    }

    public static int getMax(int a, int b){
        return Math.max(a, b);
    }

    public static int rollDice(){
        Random randomGen = new Random(); 
        return randomGen.nextInt(6) + 1;
    }

    public static int rollDice(int numFaces){
        Random randomGen = new Random(); 
        return randomGen.nextInt(numFaces) + 1;
    }

    public static String capitalizeFirst(String name){
        String firstLetter = name.substring(0, 1).toUpperCase();
        return firstLetter + name.substring(1);
    }

    public static double circleArea(double radius){
        return Math.PI * Math.pow(radius, 2);
    }

    public static boolean isMultiple(int a, int b){
        int i = 1;
        while (true) {
            if (a * i == b) {
                return true;
            } 
            if (a * i > b) {
                return false;
            }
            i++;
        }
    }

    public static String convertTime(double time, boolean isMinutes){
        if (isMinutes) {
            return time + " minutes is " + time * 60 + " seconds";
        } else {
            return time + " seconds is " + time / 60 + " minutes";
        }
    }

    public static void printDiagonal(String s){
        String space = "";
        for (int i = 0; i < s.length(); i++) {
            System.out.println(space + s.substring(i, i + 1));
            space += " ";
        }
    }

    public static double approximatePi(int iterations) {
        boolean positive = true;
        double total = 0.0;
        for (int i = 1; i <= iterations; i += 2) {
            if (positive) {
                total += (1.0 / i);
                positive = false;
            } else {
                total -= (1.0 / i);
                positive = true;
            }
        }
        return 4.0 * total;
    }
}
