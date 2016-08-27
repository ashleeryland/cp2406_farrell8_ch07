/**
 * Created by rylan on 27/08/2016.
 */
import java.util.*;
public class babyNameComparasion
{
    public static void main(String[] args)
    {
        String nameOne, nameTwo, nameThree;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a name: ");
        nameOne = input.nextLine();
        System.out.println("Enter a name: ");
        nameTwo = input.nextLine();
        System.out.println("Enter a name: ");
        nameThree = input.nextLine();

        System.out.println("The possible name combinations are:");
        System.out.println(nameOne + " " + nameTwo);
        System.out.println(nameOne + " " + nameThree);
        System.out.println(nameTwo + " " + nameOne);
        System.out.println(nameTwo + " " + nameThree);
        System.out.println(nameThree + " " + nameOne);
        System.out.println(nameThree + " " + nameTwo);
    }
}
