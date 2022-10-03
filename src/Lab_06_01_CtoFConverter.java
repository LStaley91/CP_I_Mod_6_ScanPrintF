import java.util.Scanner;

public class Lab_06_01_CtoFConverter
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double celsius = 0;
        String trash ="";

        System.out.println("Enter the tempature: ");

        if(in.hasNextInt())
        {
            celsius = in.nextDouble();
            in.nextLine();
        }
        else{
            trash = in.nextLine();
                System.out.println(trash+ "is not a valid input");
        }
        celsius = in.nextDouble();
        System.out.println("The temp in Fahrenheit is " + (celsius * 1.8 +32));
    }
}
