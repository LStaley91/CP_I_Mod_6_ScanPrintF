public class FormattedPrint
{
    public static void main(String[] args)
    {
        String name = "Logan Michael Staley";
        double salary = 12345.12345;
        int age = 18;
        for (int x = 0; x < 10; x++)
         System.out.printf("\n%-20s%5d%15.2f", name, age, salary);
         // C language d = interger  f= float = double
         // - brings it all th way left rather then centered

        System.out.println(String.format("\n%15.2f ", salary));
    }

}
