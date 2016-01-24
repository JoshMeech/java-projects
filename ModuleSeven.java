/*
Joshua Meech
IT145
7-3 Programming Problem

Write a method that takes an integer as a parameter and returns the number with its digits reversed.  Also write a program to test the method.
*/

import java.util.*;
public class ModuleSeven{
   
   
   
   //method "reverseDigit" takes an int as a parameter and returns it in reverse order
   public static int reverseDigit(int num){
       int ans=0,rem;
       while (num>0){     //While statement to reverse input integers
           rem=num%10;
           num=num/10;
           ans=ans*10+rem;
       }
       return ans;   
   }
   
   
   //main method driver to test reverseDigit
   public static void main(String[] args){
       Scanner s=new Scanner(System.in);
       System.out.print("Enter a number: ");  //directions to user to input number  
       int input=s.nextInt();
       int ans=reverseDigit(input);  //call to method reverseDigit
       System.out.print("Number in reversed order is: " +ans);   //output statement to user
   }
    
   
   
   
}