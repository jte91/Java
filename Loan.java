import java.util.Scanner;
class Loan 
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter annual interest rate: "); 
        double annualInterestRate = input.nextDouble();
        double monthlyInterestRate = annualInterestRate / 1200;
        System.out.print("Enter number of years as an int: ");
        int numOfYears = input.nextInt();
        System.out.print("Enter loan amount: ");
        double loanAmount = input.nextDouble();
        double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numOfYears * 12));
        double totalPayment = monthlyPayment * numOfYears * 12;
        System.out.println("The monthly payment is $" + (int)(monthlyPayment * 100) / 100.0);
        System.out.println("The total payment is $" + (int)(totalPayment * 100) / 100.0);
    }
    

}
