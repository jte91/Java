import java.io.*;
import java.util.Scanner;
class dummy6 
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius and length of a cylinder: ");
        double radius = input.nextDouble();
        int length = input.nextInt();
        double area = Math.PI * (radius * radius);
        double volume = area * length;
        System.out.println("The area is: " + area);
        System.out.println("The volume is: " + volume);


    }
}
