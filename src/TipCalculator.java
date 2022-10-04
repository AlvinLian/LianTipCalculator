// package to receive user input
import java.util.Scanner;
public class TipCalculator {
    public static void main (String[] args) {

        // creating Scanner object called input to read user input
        Scanner input = new Scanner (System.in);

        // prompting user for total bill and storing it bill
        System.out.print("Enter total bill: ");
        double bill = input.nextDouble();

        // prompting user for tip % and storing it in tipPercent
        System.out.print("Enter tip percentage: ");
        int tipPercent = input.nextInt();

        // prompting user for number of people and storing it in numbOfPeople
        System.out.print("Enter number of people: ");
        int numOfPeople = input.nextInt();

        // calculations for four variables
        double tipAmount = (tipPercent / 100.0) * bill;
        double totalBillAndTip = (bill + tipAmount) ;
        double tipPerPerson = tipAmount / numOfPeople;
        double totalPerPerson = totalBillAndTip / numOfPeople;

        // displays tipAmount, totalBillAndTip, tipPerPerson, and totalPerPerson that are rounded to two decimal places
        System.out.printf("The total tip amount is $%.2f.", tipAmount);
        System.out.println();
        System.out.printf("The total bill including tip is $%.2f.", totalBillAndTip);
        System.out.println();
        System.out.printf("Tip per person is $%.2f.", tipPerPerson);
        System.out.println();
        System.out.printf("The total bill per person is $%.2f.", totalPerPerson);
    }
}
