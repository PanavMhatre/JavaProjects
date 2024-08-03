import java.util.*;

//Link: https://codehs.com/sandbox/id/romannumerallab23-1lqSyy
//Program to make a number into a roman numeral

public class MyProgram {
    public static void main(String[] args) {
        // 1
        Scanner console = new Scanner(System.in);
        String[] s = {"Hello", "Goodbye", "Computer", "Science", "Um", "Do", "What", "Now"};
        
        // 2
        System.out.println(s.length);
        
        // 3
        for(int i = 0; i < s.length; i++) {
            System.out.println(s[i].substring(0, 1));
        }
        
        // 4
        int counter = 0;
        for(int i = 0; i < s.length; i++) {
            if(s[i].substring(s[i].length() - 1).equals("e")) {
                counter++;
            }
        }
        System.out.println("Number of Words with E's at end: " + counter);
        
        // 5
        for(int i = 0; i < s.length; i++) {
            System.out.println(s[i].length());
        }
        
        // 6
        counter = 0;
        for(int i = 0; i < s.length; i++) {
            if(s[i].length() >= 7) {
                counter++;
            }
        }
        
        if(counter >= 2) {
            System.out.println("Two length 7");
        } else {
            System.out.println("Under 2 length 7");
        }
        
        // 7
        counter = 0;
        for(int i = 0; i < s.length; i++) {
            boolean hasE = false;
            for(int z = 0; z < s[i].length(); z++) {
                if(s[i].substring(z, z + 1).equals("e")) {
                    hasE = true;
                }
            }
            if(hasE) {
                counter++;
            }
        }
        System.out.println(counter);
        
        // 8
        counter = 0;
        for(int i = 0; i < s.length; i++) {
            boolean hasO = false;
            for(int z = 0; z < s[i].length(); z++) {
                if(s[i].substring(z, z + 1).equals("o")) {
                    hasO = true;
                }
            }
            if(hasO) {
                counter++;
            }
        }
        System.out.println(counter);
        
        // ROMAN NUMERAL
        final int[] NUMBERS = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        final String[] LETTERS = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        
        System.out.print("Enter an integer less than 4000 >>> ");
        int num = console.nextInt();
        console.nextLine();
        int originalNum = num;
        String romanNumeral = ""; 
        
        for(int i = 0; i < NUMBERS.length; i++) {
            while(num >= NUMBERS[i]) {
                num -= NUMBERS[i];
                romanNumeral += LETTERS[i];
            }
        }
        
        System.out.println("Roman Numeral: " + romanNumeral);
    }
}
