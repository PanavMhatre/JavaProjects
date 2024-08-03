import java.util.*;

public class MyProgram
{
    public static void main(String[] args)
    {
        question();
        Scanner console = new Scanner(System.in);
        
        System.out.print("Enter a Month: ");
        int inputMonth = console.nextInt();
        console.nextLine();
        
        System.out.print("Enter a Year: ");
        int inputYear = console.nextInt();
        console.nextLine();
        
        if(inputMonth > 12 || inputMonth < 1){
            System.out.println("Incorrect Input");
        } else {
            System.out.println(daysInMonth(inputMonth, inputYear) + " days");
        }
        
        System.out.print("Enter a Phone Number: ");
        String phone = console.nextLine();
        System.out.println(phoneNumber(phone));
    }
    
    public static void question(){
        System.out.println("1.  int 1a = 4;");
        System.out.println("2.  double circle-area = 5.78;");
        System.out.println("3.  String s = 'hello!';");
        System.out.println("4.  boolean whoaNow = true;");
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Which of the following is a valid variable declaration in Java? ");
        int answer = scanner.nextInt();
        scanner.nextLine();
        
        switch(answer){
            case 4:
                System.out.println("Correct");
                break;
            default:
                System.out.println("Wrong");
        } 
    }
    
    public static int daysInMonth(int month, int year){
        switch(month){
            case 2:
                if(leapYear(year)){
                    return 29;
                } else {
                    return 28;
                }
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 31;
        }
    }
    
    public static boolean leapYear(int years){
        if(years % 4 == 0){
            if(years % 100 == 0){
                return years % 400 == 0;
            } else {
                return true;
            }
        } 
        return false;
    }
    
    public static String phoneNumber(String phone){
        String[] parts = phone.split("-");
        StringBuilder number = new StringBuilder();
        for (String part : parts) {
            char[] letters = part.toCharArray();
            for (int k = 0; k < letters.length; k++) {
                if (Character.isLetter(letters[k])) {
                    letters[k] = mapLetterToNumber(letters[k]);
                }
            }
            number.append(new String(letters)).append("-");
        }
        return number.substring(0, number.length() - 1);
    }
    
    public static char mapLetterToNumber(char letter) {
        letter = Character.toUpperCase(letter);
        switch(letter){
            case 'A': case 'B': case 'C': return '2';
            case 'D': case 'E': case 'F': return '3';
            case 'G': case 'H': case 'I': return '4';
            case 'J': case 'K': case 'L': return '5';
            case 'M': case 'N': case 'O': return '6';
            case 'P': case 'Q': case 'R': case 'S': return '7';
            case 'T': case 'U': case 'V': return '8';
            case 'W': case 'X': case 'Y': case 'Z': return '9';
            default: return letter;
        }
    }
}
