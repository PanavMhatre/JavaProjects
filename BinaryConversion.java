//I made this in CodeHS. Here is the link: https://codehs.com/sandbox/id/binaryconversionlab22-2dmVyv
import java.util.*;

public class MyProgram
{
    public static void main(String[] args)
    {
        
        Scanner console = new Scanner(System.in);
        
        //1
        int[] nums = {2, 4, 5, 8, 6, 2, 3, 5, 9, 0, 9, 6};
        
        //2
        int total = 0;
        for(int index = 0;index < nums.length;index++){
            total = total + nums[index];
        }
        
        System.out.println(total);
        
        
        
        //3
        boolean foundOdd = false;
        for(int index = 0;index < nums.length;index++){
            if(nums[index] % 2 == 1){
                foundOdd = true;
            }
        }
        
        
        
        if(foundOdd == true){
            System.out.println("Found an odd");
        }
        
        //4
        boolean foundZero = false;
        for(int index = 0;index < nums.length;index++){
            if(nums[index] == 0){
                foundZero = true;
            }
        }
        
        if(foundZero == true){
            System.out.println("Found an Zero");
        } else{
            System.out.println("No Zeros");

        }
        
        //5
        int numSix = 0;
        
        for(int i = 0; i < nums.length;i++){
            if(nums[i] == 6){
                numSix++;
            }
        }
        
        if(numSix >= 2){
            System.out.println("Two 6s");
        } else{
            System.out.println("Less than two 6s");
        }
        
        //6
        boolean foundTwoAndThree = false;
        for(int i = 0; i < nums.length-1;i++){
            if(nums[i] ==2 && nums[i+1] == 3){
                foundTwoAndThree = true;
            }
        }
        
        if(foundTwoAndThree == true){
            System.out.println("Found 2,3");
        }
        
        //7
        boolean inOrder = true;
        for(int i = 0; i < nums.length-1;i++){
            if(nums[i] < nums[i+1]){
                
            } else{
                inOrder = false;
            }
        }
        
        if(inOrder == true){
            System.out.println("In order");
        } else {
            System.out.println("Not in order");
        }
        
        //8
        int numberOfEvens = 0;
        for(int index = 0;index < nums.length;index++){
            if(nums[index] % 2 == 0){
                numberOfEvens++;
            }
        }
        
        if(numberOfEvens % 2 == 0){
            System.out.println("Even evens");
        } else{
            System.out.println("Uneven evens");
        }
        
        //9
        
        int number;
        boolean hasThreeInRow = false;
        number = nums[0];
        for(int index = 0;index < nums.length-1;index++){
            if(nums[index] == nums[index+1]){
                number = nums[index]; 
                
            }
            
            if(number == nums[index+1]){
                
                hasThreeInRow = true;
            }
        }
        
        if(hasThreeInRow == true){
            System.out.println("Three in a row");
        }
        
        
        //Binary Conversion
        String binaryString = console.nextLine(); //get a binary number String from the keyboard
        
        int[] binaryArray = new int[binaryString.length()]; //create new array
        
        
        for (int i = 0; i < binaryString.length(); i++) //loop through all digits 
        {
        	binaryArray[i] = Integer.parseInt(binaryString.substring(i, i+1)); //convert to int
        }
        
        //binaryArray will now store the values: {1, 0, 1, 0}

        
        
        
    }
}
