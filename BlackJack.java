import java.util.*;

//Emulating a real life card game of black jack
//Link: https://codehs.com/sandbox/id/blackjacklab07-09MKmf

public class MyProgram {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        //#1
        System.out.print("Enter Left Pressure >>> ");
        int leftPressure = console.nextInt();
        console.nextLine();
        System.out.print("Enter Right Pressure >>> ");
        int rightPressure = console.nextInt();
        console.nextLine();

        if (leftPressure < 36 || rightPressure < 36) {
            System.out.println("Warning! Low tire pressure");
        }

        //#2
        System.out.print("Enter Left Pressure >>> ");
        leftPressure = console.nextInt();
        console.nextLine();
        System.out.print("Enter Right Pressure >>> ");
        rightPressure = console.nextInt();
        console.nextLine();

        if (Math.abs(leftPressure - rightPressure) >= 4) {
            System.out.println("Warning! Uneven tire pressure!");
        }

        //#3
        System.out.print("Enter Grade >>> ");
        int grade = console.nextInt();
        console.nextLine();
        if (grade >= 90 && grade <= 100) {
            System.out.println("Your grade is A");
        } else if (grade >= 80 && grade <= 89) {
            System.out.println("Your grade is B");
        } else if (grade >= 70 && grade <= 79) {
            System.out.println("Your grade is C");
        } else if (grade >= 60 && grade <= 69) {
            System.out.println("Your grade is D");
        } else if (grade <= 59) {
            System.out.println("Your grade is F");
        }

        //#4
        System.out.print("Enter an Integer >>> ");
        int num = console.nextInt();
        console.nextLine();

        int numRound = num % 10;
        if (numRound <= 4) {
            if (numRound == 0) {
                System.out.println(num);
            } else {
                System.out.println(num - numRound);
            }
        } else {
            System.out.println(num + (10 - numRound));
        }

        // Lab BlackJack
        System.out.print("Player 1, enter hand value >>> ");
        int hand1 = console.nextInt();
        console.nextLine();
        System.out.print("Player 2, enter hand value >>> ");
        int hand2 = console.nextInt();
        console.nextLine();

        if (hand1 > 21 && hand2 > 21) {
            System.out.println("Bust Both!");
        } else if (hand1 == hand2) {
            System.out.println(hand1 <= 21 ? "Tie!" : "Bust Both!");
        } else if (hand1 <= 21 && (hand2 > 21 || hand1 > hand2)) {
            System.out.println(hand1 == 21 ? "P1 wins, P1 blackjack!" : "P1 wins!");
        } else {
            System.out.println(hand2 == 21 ? "P2 wins, P2 blackjack!" : "P2 wins!");
        }
    }
}
