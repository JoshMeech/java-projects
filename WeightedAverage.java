/* 
Joshua Meech
IT145
6-4 Programming Problem
This is program used to find the weighted average of four test scores. The program will prompt the user to enter four test scores and their 
weight percentage in decimal format. The user will then click 'Calculate' button to recieve the weighted average.
*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class WeightedAverage extends JFrame{
   private JLabel testScore1L, testScore2L, testScore3L, testScore4L, weight1L, weight2L, weight3L, weight4L, weightedAvgL;
   private JTextField testScore1TF, testScore2TF, testScore3TF, testScore4TF, weight1TF, weight2TF, weight3TF, weight4TF, weightedAvgTF;
   private JButton calculateB, resetB;
   private CalculateButtonHandler cbHandler;
   private ResetButtonHandler rbHandler;
   public WeightedAverage(){
      //window title
   setTitle ("Weighted Average");
      //labels and text fields
   testScore1L=new JLabel("Enter test score 1: ", SwingConstants.RIGHT);
   testScore2L=new JLabel("Enter test score 2: ", SwingConstants.RIGHT);
   testScore3L=new JLabel("Enter test score 3: ", SwingConstants.RIGHT);
   testScore4L=new JLabel("Enter test score 4: ", SwingConstants.RIGHT);
   weight1L=new JLabel("Enter weight: ", SwingConstants.RIGHT);
   weight2L=new JLabel("Enter weight: ", SwingConstants.RIGHT);
   weight3L=new JLabel("Enter weight: ", SwingConstants.RIGHT);
   weight4L=new JLabel("Enter weight: ", SwingConstants.RIGHT);
   weightedAvgL=new JLabel("Weighted average is: ", SwingConstants.RIGHT);
   testScore1TF=new JTextField(2);
   testScore2TF=new JTextField(2);
   testScore3TF=new JTextField(2);
   testScore4TF=new JTextField(2);
   weight1TF=new JTextField(4);
   weight2TF=new JTextField(4);
   weight3TF=new JTextField(4);
   weight4TF=new JTextField(4);
   weightedAvgTF=new JTextField(4);
      //Calculate Button
   calculateB=new JButton("Calculate");
   cbHandler=new CalculateButtonHandler();
   calculateB.addActionListener(cbHandler);
      //Reset Button
   resetB=new JButton("Reset");
   rbHandler=new ResetButtonHandler();
   resetB.addActionListener(rbHandler);
      //container and layout
   Container pane=getContentPane();
   pane.setLayout(new GridLayout(5,4));
      //pane components
   pane.add(testScore1L);
   pane.add(testScore1TF);
   pane.add(weight1L);
   pane.add(weight1TF);
   pane.add(testScore2L);
   pane.add(testScore2TF);
   pane.add(weight2L);
   pane.add(weight2TF);
   pane.add(testScore3L);
   pane.add(testScore3TF);
   pane.add(weight3L);
   pane.add(weight3TF);
   pane.add(testScore4L);
   pane.add(testScore4TF);
   pane.add(weight4L);
   pane.add(weight4TF);
   pane.add(weightedAvgL);
   pane.add(weightedAvgTF);
      //window dimensions
   pane.add(calculateB);
   pane.add(resetB);
   setSize (600,300);
   setDefaultCloseOperation(EXIT_ON_CLOSE);
   setVisible(true);
   }
   private class CalculateButtonHandler implements ActionListener{    //Calculate button action listener
      public void actionPerformed(ActionEvent e){
         double testScore1,testScore2,testScore3,testScore4,weight1,weight2,weight3,weight4,weightedAvg;
         testScore1=Double.parseDouble(testScore1TF.getText());
         testScore2=Double.parseDouble(testScore2TF.getText());
         testScore3=Double.parseDouble(testScore3TF.getText());
         testScore4=Double.parseDouble(testScore4TF.getText());
         weight1=Double.parseDouble(weight1TF.getText());
         weight2=Double.parseDouble(weight2TF.getText());
         weight3=Double.parseDouble(weight3TF.getText());
         weight4=Double.parseDouble(weight4TF.getText());
         weightedAvg=(testScore1*weight1)+(testScore2*weight2)+(testScore3*weight3)+(testScore4*weight4);
         weightedAvgTF.setText(""+weightedAvg);  
      }
   }
   private class ResetButtonHandler implements ActionListener{       //Reset button action listener 
      public void actionPerformed (ActionEvent e){
         testScore1TF.setText("");
         testScore2TF.setText("");
         testScore3TF.setText("");
         testScore4TF.setText("");
         weight1TF.setText("");
         weight2TF.setText("");
         weight3TF.setText("");
         weight4TF.setText("");
         weightedAvgTF.setText(""); 
      }
   }
   public static void main (String[]  args){
   WeightedAverage weightProg=new WeightedAverage();                //Main method
   } 
}   

