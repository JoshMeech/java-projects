// Joshua Meech
// IT145
// 1-3 Programming Problem
// This is a Java program that prompts the user to input a decimal number and outputs the number rounded to the nearest integer.


import java.util.*;  //Allows user to input data

public class ModuleOneProgrammingProblem
{
   public static void main(String[] args)
   {
      Scanner scanner = new Scanner(System.in);
      
      double input;
      int output;
            
                                    
            System.out.print("Please input a decimal number and then press Enter: ");     //Instructions to user
            input = scanner.nextDouble();
            
            System.out.println();
                        
            System.out.print("The nearest integer is: " + (int)(input+.5));              //User's answer
            output = scanner.nextInt();
            
            
                    
        
   }
}
