/*
Joshua Meech
IT145
Module Four Programming Problem
Write a program that prompts the user to input an integer and then outputs both the individual digits of the number 
and the sum of the digits.
*/

import java.util.*;

public class ModFourProb
{
   static Scanner console = new Scanner(System.in);
   
   public static void main(String[] args)
   {
        int num, sum, temp;
        String num1 = " ";

        System.out.print("Enter a Number: ");           //Prompt to user to enter a number
        num = console.nextInt();
        System.out.println();

        if (num < 0)                                     //If the number entered is less than zero it is a negative number
            num = -num;

        sum = 0;

        while (num > 0)                                  //While loop for number entered greater than zero
        {
            temp = num;
            sum = sum + num % 10;                        //Use modulus operator to get last digit in number and add to sum
            num = num / 10;                              //Removes the digit
            num1 = (temp % 10) + " " + num1;             //Installs space between the digits entered
        }
        System.out.println("You entered: " + num1);      //First line of ouptut
        System.out.println("And the sum is " + sum);     //Second line of output
    }
}