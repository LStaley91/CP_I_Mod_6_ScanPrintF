import java.util.Scanner; //have to add to be able to scan

public class Main
{
    public static void main(String[] args)
    {   // VARIABLES
        Scanner in = new Scanner(System.in);
        String trash = "";
        String name = "";
        int age = 0;
        double salary = 0;

        // NAME
        System.out.print("Enter your name: ");
        name = in.nextLine(); //the reason why we do next line so we can do 1st and last name.
        System.out.println("You said your name is " + name);

        // AGE
        System.out.print("Enter your age: ");
        if (in.hasNextInt())
        {
            age = in.nextInt();
            in.nextLine(); //must clear buffer after reading a number
            System.out.println("You said your age is " + age);
        }
        else
        {
            trash = in.nextLine();
            System.out.println(trash + " is not a valid number!");
        }

        // SALARY
        System.out.print("Enter your salary: ");
        if(in.hasNextDouble())
        {
            salary = in.nextDouble();
            in.nextLine();
            System.out.println("You said your salary is " + salary);
        }
        else
        {
            trash = in.nextLine();
            System.out.println(trash + " is not a valid number!");
        }

    }
}