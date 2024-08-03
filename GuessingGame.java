import java.util.*;

//Link: https://codehs.com/sandbox/id/guessinggamelab11-7OpTHY
//A guessing game to guess a number
public class MyProgram {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1: Print numbers from 1 to n");
            System.out.println("2: Sum of numbers from 1 to n");
            System.out.println("3: Sum of even numbers from 1 to n");
            System.out.println("4: Sum of multiples of 7 from 1 to n");
            System.out.println("5: Play the guessing game");
            System.out.println("0: Exit");
            System.out.print("Enter your choice >>> ");
            int choice = console.nextInt();
            console.nextLine(); // Consume newline left-over

            if (choice == 0) {
                break;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter an Integer >>> ");
                    int n = console.nextInt();
                    console.nextLine();
                    int startNum = 1;
                    while (startNum <= n) {
                        System.out.print(startNum + " ");
                        startNum++;
                    }
                    System.out.println("");
                    break;

                case 2:
                    System.out.print("Enter an Integer >>> ");
                    n = console.nextInt();
                    console.nextLine();
                    startNum = 0;
                    int i = 1;
                    while (i <= n) {
                        startNum += i;
                        i++;
                    }
                    System.out.println("Sum of all numbers from 1 to " + n + " >>> " + startNum);
                    break;

                case 3:
                    System.out.print("Enter an Integer >>> ");
                    n = console.nextInt();
                    console.nextLine();
                    startNum = 0;
                    i = 1;
                    while (i <= n) {
                        if (i % 2 == 0) {
                            startNum += i;
                        }
                        i++;
                    }
                    System.out.println("Sum of all even numbers from 1 to " + n + " >>> " + startNum);
                    break;

                case 4:
                    System.out.print("Enter an Integer >>> ");
                    n = console.nextInt();
                    console.nextLine();
                    startNum = 0;
                    i = 1;
                    while (i <= n) {
                        if (i % 7 == 0) {
                            startNum += i;
                        }
                        i++;
                    }
                    System.out.println("Sum of all multiples of 7 from 1 to " + n + " >>> " + startNum);
                    break;

                case 5:
                    Random randomGen = new Random();
                    int number = randomGen.nextInt(1000) + 1;
                    int guesses = 7;
                    while (guesses > 0) {
                        System.out.print("Enter a number from 1 to 1000 as your guess >>> Tries remaining: " + guesses + " >>>> ");
                        n = console.nextInt();
                        console.nextLine();
                        if (n == number) {
                            System.out.println("You guessed the correct number. Congrats!");
                            break;
                        } else {
                            guesses--;
                            if (guesses == 0) {
                                System.out.println("You ran out of tries! Number was: " + number);
                                break;
                            }
                            if (n > number) {
                                System.out.println("Your guess is higher than the actual number. Try again!");
                            } else {
                                System.out.println("Your guess is lower than the actual number. Try again!");
                            }
                        }
                    }
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

        console.close();
    }
}
