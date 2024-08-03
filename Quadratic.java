import java.util.Scanner;

//Emulating quadratic behavior
//Link: https://codehs.com/sandbox/id/quadraticformulalab16-Qzn3sw

public class MyProgram {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        // 1
        System.out.print("Enter a Double Number for A: ");
        double a = console.nextDouble();
        System.out.print("Enter a Double Number for B: ");
        double b = console.nextDouble();
        System.out.println("The maximum of A and B is: " + Math.max(a, b));

        // 2
        System.out.print("Enter a Double Number To Be Cubed: ");
        double toCubed = console.nextDouble();
        System.out.println("The cube of the number is: " + Math.pow(toCubed, 3));

        // 3
        System.out.print("Enter a Double Number for Base: ");
        double base = console.nextDouble();
        System.out.print("Enter a Double Number for Exponent: ");
        double exponent = console.nextDouble();
        System.out.println("The base raised to the power of the exponent is: " + Math.pow(base, exponent));

        // 4
        System.out.print("Enter a Double Number for Num: ");
        double num = console.nextDouble();
        System.out.println("The rounded number is: " + Math.round(num));

        // 5
        System.out.print("Enter a Double Number for SphereRadius: ");
        double sphereRadius = console.nextDouble();
        double sphereVolume = (4 * Math.PI * Math.pow(sphereRadius, 3)) / 3;
        System.out.println("The volume of the sphere is: " + sphereVolume);

        // 6
        System.out.print("Enter a Double Number for SideA: ");
        double sideA = console.nextDouble();
        System.out.print("Enter a Double Number for SideB: ");
        double sideB = console.nextDouble();
        double hypotenuse = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));
        System.out.println("The hypotenuse is: " + hypotenuse);

        // 7
        System.out.print("Enter a Double Number for C: ");
        double c = console.nextDouble();
        System.out.print("Enter a Double Number for D: ");
        double d = console.nextDouble();
        double lowestNumber = Math.min(Math.abs(c), Math.abs(d));
        System.out.println("The lowest absolute number is: " + lowestNumber);

        // 8
        System.out.print("Enter a Double Radius Number: ");
        double cylinderRadius = console.nextDouble();
        System.out.print("Enter a Double Height Number: ");
        double cylinderHeight = console.nextDouble();
        double cylinderSurfaceArea = (2 * Math.PI * cylinderRadius * cylinderHeight) + (2 * Math.PI * Math.pow(cylinderRadius, 2));
        System.out.println("The surface area of the cylinder is: " + cylinderSurfaceArea);

        // 9
        System.out.print("Enter a Double Number for Num2: ");
        double num2 = console.nextDouble();
        System.out.println("The square root of the number is: " + Math.sqrt(num2));

        // LAB Quadratic
        System.out.print("Enter an A value: ");
        double aVal = console.nextDouble();
        System.out.print("Enter a B value: ");
        double bVal = console.nextDouble();
        System.out.print("Enter a C value: ");
        double cVal = console.nextDouble();
        double discriminant = Math.pow(bVal, 2) - 4 * aVal * cVal;
        
        if (discriminant < 0) {
            System.out.println("NaN");
        } else {
            double firstRoot = (-bVal + Math.sqrt(discriminant)) / (2 * aVal);
            double secondRoot = (-bVal - Math.sqrt(discriminant)) / (2 * aVal);
            System.out.println("The roots of the polynomial are " + firstRoot + ", " + secondRoot);
        }
        
        console.close();
    }
}
