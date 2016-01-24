import java.util.*;

public class ModFourProb
{
   static Scanner console = new Scanner(System.in);
   
   public static void main(String[] args)
   {
        int num, sum, temp;
        String num1 = " ";

        System.out.print("Enter a Number: ");
        num = console.nextInt();
        System.out.println();

        if (num < 0)
            num = -num;

        sum = 0;

        while (num > 0) 
        {
            temp = num;
            sum = sum + num % 10;           //Extracts the last digit and adds it to the sum
            num = num / 10;                 //removes the last digit
            num1 = (temp % 10) + " " + num1;
        }
        System.out.println("You entered: " + num1);
        System.out.println("And the sum is " + sum);
    }
}