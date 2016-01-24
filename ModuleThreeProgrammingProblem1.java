/*
Joshua Meech
IT145
3-3 Programming Problem
This is a program that prompts the user to enter three numbers and then outputs those numbers in nondescending order.
*/

import javax.swing.JOptionPane;

public class ModuleThreeProgrammingProblem1
{
   public static void main(String[] args)
   {
      double firstNum, secondNum, thirdNum;
      String inputStr;
      String outputStr;
      
      inputStr = JOptionPane.showInputDialog("Enter a number");         //step 1
      firstNum = Double.parseDouble(inputStr);
      
      
      inputStr = JOptionPane.showInputDialog("Enter a second number");  //step 2
      secondNum = Double.parseDouble(inputStr);
      
      
      inputStr = JOptionPane.showInputDialog("Enter a third number");    //step 3
      thirdNum = Double.parseDouble(inputStr);
      
      
                                                                     //if else statements to determine nondescending order
      if (firstNum <= secondNum) 
      {   
            if (secondNum < thirdNum)
            outputStr = "Your numbers listed in nondescending order are: " + firstNum + ", " + secondNum + ", " + thirdNum;
         
               else
               outputStr = "Your numbers listed in nondescending order are: " + firstNum + ", " + thirdNum + ", " + secondNum;
      }
         else if (firstNum <= thirdNum)   
         {   
         outputStr = "Your numbers listed in nondescending order are: " + secondNum + ", " + firstNum + ", " + thirdNum;
         }
         else 
         {  
             if (secondNum <thirdNum)
            outputStr = "Your numbers listed in nondescending order are: " + secondNum + ", " + thirdNum + ", " + firstNum; 
      
             else
             outputStr = "Your numbers listed in nondescending order are: " + thirdNum + ", " + secondNum + ", " + firstNum;    
        }
    JOptionPane.showMessageDialog(null, outputStr, "Answer", JOptionPane.INFORMATION_MESSAGE);    //Answer dialog box info
    System.exit(0);
    }
} 