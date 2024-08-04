import java.util.*;

//Link: https://codehs.com/sandbox/id/roadtriplab05-tDecBH
//A calculator to help people travelling

public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        
        //1
        System.out.print("Enter an Integer >>> ");
        int num1 = console.nextInt();
        System.out.println(num1  + 10);
        console.nextLine();
        
        //2
        System.out.print("Enter a name >>> ");
        String name1 = console.nextLine();
        System.out.println("Hello, " + name1);
        
        //3
        System.out.print("Enter a double >>> ");
        double something = console.nextDouble();
        System.out.println(something * something);
        console.nextLine();
        
        //4
        System.out.print("Enter a name >>> ");
        String name2 = console.nextLine();
        System.out.print("Enter an age >>> ");
        int age = console.nextInt();
        System.out.println(name2 + " is " + age + " years old");
        console.nextLine();
        
        //5
        System.out.print("Enter a double >>> ");
        double radius = console.nextDouble();
        System.out.println(3.14 * (radius * radius));
        console.nextLine();
        
        //6
        System.out.print("Enter a double >>> ");
        double time = console.nextDouble();
        System.out.println("Enter the number of seconds of free fall >>> " + time);
        System.out.println("Distance traveled >>> " + 0.50 * 32.174 * (time * time));
        console.nextLine();
        
        //7
        System.out.print("Enter a name >>> ");
        name1 = console.nextLine();
        System.out.println(name1 + name1 + name1);
        
        //ROAD TRIP CALCULATOR
        System.out.print("Vehicle mileage (mpg) >>> ");
        double vehicleMileage = console.nextDouble();
        console.nextLine();
        
        System.out.print("Total miles of trip >>> ");
        double tripMiles = console.nextDouble();
        console.nextLine();
        
        System.out.print("Anticipated average speed (mph) >>> ");
        double averageSpeed = console.nextDouble();
        console.nextLine();
        
        System.out.print("Fuel tank capacity (gallons) >>> ");
        double tankCapacity  = console.nextDouble();
        console.nextLine();
        
        System.out.print("Avg. price of gas (per gallon) >>> ");
        double avgPriceOfGas  = console.nextDouble();
        console.nextLine();
        
        double gallonsOfGas = tripMiles / vehicleMileage;
        
        System.out.println("     ");
        System.out.println("Road Trip Calculations");
        System.out.println("     ");
        System.out.println("Gallons of gas used >>> " + gallonsOfGas);
        System.out.println("Total cost of gas >>> " + gallonsOfGas * avgPriceOfGas);
        System.out.println("Minimum number of refueling stops >>> " + gallonsOfGas / tankCapacity);
        System.out.println("Total driving hours >>> " + tripMiles / averageSpeed);
    }
}
