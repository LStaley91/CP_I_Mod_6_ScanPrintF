import java.util.Scanner;
public class Lab_06_04_MetricConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double meters;
        double miles;
        double feet;
        double inches;

        System.out.println("What is the measurement in Meters? ");
        meters = in.nextDouble();

        miles = meters * .000621371192;
        feet = meters * 3.2808399;
        inches = meters * 39.3700787;

        System.out.println("Miles: " + miles);
        System.out.println("Feet: " + feet);
        System.out.println("Inches: " + inches);

    }
}
