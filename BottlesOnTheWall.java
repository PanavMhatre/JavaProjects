import java.util.Scanner;

//Code for a popular road song caleld 10 bottles on a wall
//Link: https://codehs.com/sandbox/id/bottlesonthewalllab10-VLR30t

public class MyProgram {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        // 1
        int i = 1;
        while (i < 10) {
            System.out.print(i);
            i++;
        }

        System.out.println(" ");
        // 2
        i = 1;
        while (i < 10) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println(" ");
        // 3
        i = 1;
        while (i < 20) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println(" ");
        // 4
        i = 1;
        while (i <= 50) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println(" ");
        // 5
        i = 10;
        while (i > 0) {
            System.out.print(i + " ");
            i--;
        }

        System.out.println(" ");
        // 6
        i = 4;
        while (i <= 40) {
            if (i % 4 == 0) {
                System.out.print("-" + i + " ");
            }
            i++;
        }

        System.out.println(" ");
        // 7
        i = 1;
        while (i <= 256) {
            System.out.print(i + " ");
            i = i * 2;
        }

        System.out.println(" ");
        // 8
        i = 1000;
        while (i >= 3) {
            System.out.print(i + " ");
            i = i / 2;
        }

        System.out.println(" ");
        // 9
        i = 1;
        int a = 1;
        while (i <= 8 || a < 8) {
            if (i < 9) {
                System.out.print(i + " ");
                i++;
            }

            if (a < 9) {
                System.out.print("-" + a + " ");
                a++;
            }
        }

        System.out.println();
        // LAB BottlesOnTheWall
        int num = 99;
        String drink = "";
        System.out.print("Enter your age >>> ");
        int age = console.nextInt();
        console.nextLine();

        if (age > 21) {
            System.out.print("Do you prefer beer or Coke (enter 1 for beer, 2 for Coke) >>> ");
            int choice = console.nextInt();
            console.nextLine();

            if (choice == 1) {
                drink = "beer";
            } else {
                drink = "Coke";
            }
        } else {
            drink = "Coke";
        }

        while (num >= 1) {
            System.out.println(num + " bottles of " + drink + " on the wall");
            System.out.println(num + " bottles of " + drink);
            num--;
            if (num == 0) {
                System.out.println("Take one down, pass it around, zero bottles of " + drink + " on the wall!");
            } else {
                System.out.println("Take one down, pass it around, " + num + " bottles of " + drink + " on the wall!");
            }
        }
    }
}
