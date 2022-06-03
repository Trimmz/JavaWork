
import java.util.Locale;
import java.util.Scanner;

import static java.sql.Types.NULL;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("What type of shape would you like to calculate the perimeter for? S/C");
        String shape = input.nextLine();
        System.out.println("What is the side length or radius of your shape?");
        double number = input.nextInt();
        System.out.println(perimeter(shape, number));

    }

    public static double perimeter(String type, double num)
    {
        type = type.toLowerCase();
        switch (type){
            case "c":
                return 2*3.14 * num;
            case "s":
                return 4*num;
            default:
                return NULL;
        }
    }
}