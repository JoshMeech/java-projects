/* 
Joshua Meech
IT145
Module Five Programming Problem
   
Write a program that declares an array "alpha" of 50 elements of type "double".  Initialize the array so that the first 25 elements
are equal to the square of the index variable and the last 25 elements are equal to three times the index variable. Output the array 
so that 10 elements per line are printed.
*/

import java.util.*;

public class ModFiveProb
{
   static Scanner console = new Scanner(System.in);

   public static void main (String[] args)
   {
   
   double[] alpha = new double[50];            // this statement declares and instantiate array object "alpha"
   
   
      
      for (int i = 0; i < 50 ; i++)            // step 1: process array
      {
          if (i < 25);                         // if statement for first 25 elements
           alpha[i] = i * i;
          
          if (i >= 25);                        // if statement for second 25 elements
            alpha[i] = i * 3;
            
          
          System.out.print(alpha[i] + " ");     // step 2: outputs
          
          if (i % 10 == 9)                      // determines length of line
               System.out.print("\n");          // inserts new line after 10 doubles
      
       }
      
      
      
      
   }
}
      