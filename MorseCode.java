import java.util.Scanner;

//Emulating a real world morse code encyrption and decyrption
//Link: https://codehs.com/sandbox/id/morsecodecodescyhers-rJtezQ

public class MyProgram {
    static final String alphabet = "abcdefghijklmnopqrstuvwxyz0123456789 ";
    static final String[] morse = {".- ", "-... ", "-.-. ", "-.. ", ". ", "..-. ", 
                             "--. ", ".... ", ".. ", ".--- ", "-.- ", ".-.. ",
                             "-- ", "-. ", "--- ", ".--. ", "--.- ", ".-. ", 
                             "... ", "- ", "..- ", "...- ", ".-- ", "-..- ", 
                             "-.-- ", "--.. ", "----- ", ".---- ", "..--- ", 
                             "...-- ", "....- ", "..... ", "-.... ", "--... ", "---.. ", "----. ", "| "};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter text to encrypt: ");
        String textToEncrypt = scanner.nextLine().toLowerCase();
        System.out.println("Encrypted text: " + encrypt(textToEncrypt));
        
        System.out.print("Enter Morse code to decrypt: ");
        String morseToDecrypt = scanner.nextLine();
        System.out.println("Decrypted text: " + decrypt(morseToDecrypt));
        
        scanner.close();
    }
    
    public static String encrypt(String s) {
        StringBuilder result = new StringBuilder();
        char[] letters = s.toCharArray();
        for (char letter : letters) {
            for (int k = 0; k < alphabet.length(); k++) {
                if (letter == alphabet.charAt(k)) {
                    result.append(morse[k]);
                }
            }
        }
        return result.toString();
    }
    
    public static String decrypt(String s) {
        String[] fragments = s.split(" ");
        StringBuilder word = new StringBuilder();
        
        for (String fragment : fragments) {
            for (int k = 0; k < morse.length; k++) {
                if ((fragment + " ").equals(morse[k])) {
                    word.append(alphabet.charAt(k));
                }
            }
        }
        
        return word.toString();
    }
}
