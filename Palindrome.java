import java.util.*;

//Link: https://codehs.com/sandbox/id/palindromelab18-tU3kxl
//Checks if a word is a palindrome or not like in real life

public class MyProgram {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        // 1
        System.out.print("Enter a string for S: ");
        String s = console.nextLine();
        System.out.println(s.length());

        // 2
        System.out.print("Enter a new string for S: ");
        s = console.nextLine();
        System.out.println(s.substring(1));

        // 3
        System.out.print("Enter a new string for S: ");
        s = console.nextLine();
        System.out.println(s.substring(0, s.length() - 1));

        // 4
        String longword, shortword;
        System.out.print("Enter a string for Word 1: ");
        String wordone = console.nextLine();
        System.out.print("Enter a string for Word 2: ");
        String wordtwo = console.nextLine();

        if (wordone.length() < wordtwo.length()) {
            longword = wordtwo;
            shortword = wordone;
        } else {
            longword = wordone;
            shortword = wordtwo;
        }
        System.out.println(shortword + longword + shortword);

        // 5
        System.out.print("Enter a string for even string: ");
        String evenString = console.nextLine();
        if (evenString.length() % 2 != 0) {
            System.out.println("Not an even word");
        } else {
            System.out.println(evenString.substring(0, evenString.length() / 2));
        }

        // 6
        System.out.print("Enter a string for a: ");
        String a = console.nextLine();
        System.out.print("Enter a string for b: ");
        String b = console.nextLine();
        a = a.substring(1);
        b = b.substring(1);
        System.out.println(a + b);

        // 7
        System.out.print("Enter a string for A: ");
        a = console.nextLine();
        if (a.equals("bad")) {
            System.out.println("HAS BAD");
        }

        // 8
        System.out.print("Enter a string for B: ");
        b = console.nextLine();
        if (!b.equals("way")) {
            System.out.println("No way");
        }

        // 9
        System.out.print("Enter a string for B: ");
        b = console.nextLine();
        b = b.substring(1, b.length() - 1);
        System.out.println(b);

        // 10
        System.out.print("Enter a string for OddString: ");
        String oddstring = console.nextLine();
        int middleIndex = oddstring.length() / 2;
        oddstring = oddstring.substring(middleIndex - 1, middleIndex + 2);
        System.out.println(oddstring);

        // LAB Palindrome
        while (true) {
            System.out.print("Enter a string word (or type 'quit' to exit): ");
            String input = console.nextLine();
            if (input.equalsIgnoreCase("quit")) {
                break;
            }

            String newString = "";
            for (int i = input.length() - 1; i >= 0; i--) {
                newString = newString + input.charAt(i);
            }

            if (input.equals(newString)) {
                System.out.println("Is a palindrome");
            } else {
                System.out.println("Is not a palindrome");
            }
        }
    }
}
