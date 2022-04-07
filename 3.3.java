import java.util.Scanner;
import java.io.*;
class dummy8 
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a, b, c, d, e, f: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();
        double x = a * d;
        double y = b * c;
        if((x - y) == 0)
        {
            System.out.println("The equation has no solution");
        }
        else 
        {
            System.out.println("x is " + x + " and y is " + y + " ");
        }
    }
}
