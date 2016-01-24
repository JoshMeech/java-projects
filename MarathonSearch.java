import java.util.*;
public class MarathonSeqSearch{
static Scanner console = new Scanner(System.in);
public static void main(String[] args){
double[] milesWeek={2.6, 5.2, 7.8, 19.4, 13, 15.6, 18.2, 20.8, 23.4, 26};
double number=4;
double index;

   for(index=0;index<milesWeek;index++);
       index=OneDimArrayMethods.seqSearch(milesWeek,milesWeek.length,number);
   if (index!=-1)
   System.out.print( +number+"is in list");
   else
   System.out.print( +number+"is not in list");
  
 
   }
} 