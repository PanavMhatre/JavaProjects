import java.util.*;

//Link: https://codehs.com/sandbox/id/wordscramblelab27-n8kHoA
//Real life world scrable in java

public class MyProgram {
    public static void main(String[] args) {
        System.out.println(isLetterA('a'));
        System.out.println(hasTwoA("aa"));
        System.out.println(isVowel('p'));
        System.out.println(numVowels("aeioup"));
        System.out.println(evenChars("aabb", 'a', 'b'));
        System.out.println(twoInARow("aabb", 'b'));
        System.out.println(capitalizeVowels("aabb"));
        System.out.println(longestWord("Hello my name is Panav Mhatre who likes videogames"));
        wordScramble("Letters Are Fun!");
    }

    public static boolean hasTwoA(String s) {
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                counter++;
            }
        }
        return counter >= 2;
    }

    public static boolean isLetterA(char letter) {
        return letter == 'a';
    }

    public static boolean isVowel(char letter) {
        String vowels = "aeiou";
        for (int i = 0; i < vowels.length(); i++) {
            if (vowels.charAt(i) == letter) {
                return true;
            }
        }
        return false;
    }

    public static int numVowels(String s) {
        String vowels = "aeiou";
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int k = 0; k < vowels.length(); k++) {
                if (s.charAt(i) == vowels.charAt(k)) {
                    counter++;
                }
            }
        }
        return counter;
    }

    public static boolean evenChars(String s, char a, char b) {
        int counterA = 0;
        int counterB = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == a) {
                counterA++;
            }
            if (s.charAt(i) == b) {
                counterB++;
            }
        }
        return counterA % 2 == 0 && counterB % 2 == 0;
    }

    public static boolean twoInARow(String s, char a) {
        for (int i = 0; i < s.length(); i++) {
            if (i > 0 && s.charAt(i) == s.charAt(i - 1) && s.charAt(i) == a) {
                return true;
            }
        }
        return false;
    }

    public static String capitalizeVowels(String s) {
        String vowels = "aeiou";
        StringBuilder newString = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            boolean alreadyCapitalized = false;
            for (int k = 0; k < vowels.length(); k++) {
                if (s.charAt(i) == vowels.charAt(k)) {
                    newString.append(Character.toUpperCase(s.charAt(i)));
                    alreadyCapitalized = true;
                }
            }
            if (!alreadyCapitalized) {
                newString.append(s.charAt(i));
            }
        }
        return newString.toString();
    }

    public static String longestWord(String s) {
        String[] words = s.split(" ");
        int indexOfLargestWord = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > words[indexOfLargestWord].length()) {
                indexOfLargestWord = i;
            }
        }
        return words[indexOfLargestWord];
    }

    public static void wordScramble(String line) {
        String[] words = line.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 4) {
                int indexOfFirstLetter = -1;
                int indexOfLastLetter = -1;
                String beginning = "";
                String ending = "";
                String fullWord = words[i];
                for (int k = 0; k < words[i].length(); k++) {
                    if (Character.isLetter(words[i].charAt(k))) {
                        indexOfFirstLetter = k;
                        break;
                    } else {
                        beginning += words[i].charAt(k);
                    }
                }
                for (int k = words[i].length() - 1; k >= 0; k--) {
                    if (Character.isLetter(words[i].charAt(k))) {
                        indexOfLastLetter = k;
                        break;
                    } else {
                        ending += words[i].charAt(k);
                    }
                }
                String inBetweenLetters = words[i].substring(indexOfFirstLetter + 1, indexOfLastLetter);
                char[] lettersArray = inBetweenLetters.toCharArray();
                char[] allLetters = words[i].toCharArray();
                Random randomGen = new Random();
                for (int f = 0; f < lettersArray.length; f++) {
                    int random = randomGen.nextInt(lettersArray.length);
                    if (random != f) {
                        char temp = lettersArray[random];
                        lettersArray[random] = lettersArray[f];
                        lettersArray[f] = temp;
                    }
                }
                String result = new String(lettersArray);
                words[i] = beginning + allLetters[indexOfFirstLetter] + result + allLetters[indexOfLastLetter] + ending;
            }
        }
        for (String word : words) {
            System.out.print(word + " ");
        }
    }
}
