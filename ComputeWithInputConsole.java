import java.io.*;
import java.util.Scanner;
public class ComputeWithInputConsole 
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number for radius: ");
        double radius = input.nextDouble();
        double area = radius * radius * 3.14159;
        System.out.println("The area for the circle of the radius " + radius + " is " + area);
        System.out.println(0B1111);

    }
}
