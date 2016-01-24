import java.util.*;
public class BostonMarathon{
static Scanner console = new Scanner(System.in);
public static void main(String[] args){
double[] milesWeek={2.6, 5.2, 7.8, 19.4, 13, 15.6, 18.2, 20.8, 23.4, 26};  
double average=0;
double sum = 0;


System.out.print("The array is: ");
for (int index=0; index<milesWeek.length; index++)
     System.out.print(milesWeek[index]+" ");
     System.out.println(); 

for (int index=0; index<milesWeek.length; index++)
      sum = sum + milesWeek[index];
      System.out.println("Sum: "+sum);    
  
if (milesWeek.length !=0)
    average = sum / milesWeek.length;
    System.out.println("Average: "+average);      

    

  
  }
}