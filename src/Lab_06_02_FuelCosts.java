import java.util.Scanner;

public class Lab_06_02_FuelCosts
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double gasCost =0;
        double fuelMileage =0;
        double gasTank =0;

        System.out.println("Enter how many gallons are in your tank");

        if(in.hasNextDouble())
        {
            gasTank = in.nextDouble();
            in.nextLine();
        }
        else{
            System.out.println("is not a valid input");
        }

        System.out.println("Enter thow many miles you get peer gallon: ");
        if(in.hasNextDouble())
        {
            fuelMileage = in.nextDouble();
            in.nextLine();
        }
        else{
        System.out.println("is not a valid input");
        }

        System.out.println("How much is a Gallon of gas ");
        if(in.hasNextDouble())
        {
            gasCost = in.nextDouble();
            in.nextLine();
        }
        else{
            System.out.println( "is not a valid input");
        }
        System.out.println("You can go another " + gasTank * fuelMileage + "miles. And it will cost you " + (100/fuelMileage) * gasCost + "to go 100 miles.");
    }
}