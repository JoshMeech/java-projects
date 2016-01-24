//Joshua Meech
//IT145
//2-3 Practice Problem
//
//This is a program to convert user's weight input in kilogram to pounds.

import javax.swing.JOptionPane;
public class ModuleTwoProgrammingProblem{
   public static void main(String[] args){
   
   double kilograms;
   double pounds;
   
   
   String kilogramsString;
   String outputStr;
   
                                                   //Step 1
   kilogramsString = JOptionPane.showInputDialog ("Enter your weight in kilograms: ");
   kilograms = Double.parseDouble(kilogramsString);
   
   pounds =  2.20 * kilograms;
                 
                  //Step 2
   outputStr =   "Your weight in pounds: "  + String.format("%.2f", pounds);
   
   
   
   JOptionPane.showMessageDialog(null, outputStr, "Pounds", JOptionPane.PLAIN_MESSAGE);
   System.exit(0);
   }
}