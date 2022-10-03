import java.util.Scanner;
public class Lab_06_03_RectangleInfo
{
    public static void main(String[] args)
    {



                Scanner in = new Scanner(System.in);

        System.out.println("Enter the length");
            double length = in.nextInt();

        System.out.println("Enter the Width");
            double width = in.nextInt();
        double Perimeter = width*2 + length*2;
        double area = (width * length);
        System.out.println("The Perimeter is " + Perimeter + "and the area of the triangle is "+ area);

        double diagonal = Math.sqrt((length*length)+(width*width));
        System.out.println("diagonal: " + diagonal);
    }
}

