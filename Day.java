/* 
Joshua Meech
IT145
8-4 Final Programming Problem
Design and implement the class Day that implements the day of the week in a program.
*/

import java.util.*;
public class Day{
   final static int SUN=0;
   final static int MON=1;
   final static int TUE=2;
   final static int WED=3;
   final static int THU=4;
   final static int FRI=5;
   final static int SAT=6;
   public static int day;

public Day(int day){  
   this.day=day;
}      
//A.Set day
public void setDay(int day){
   this.day=day;
}
//B.Print Day
public void printDay(){
   System.out.print(this.toString());
}
//C. Retrun the day
public int getDay(){
	return day;
}
//D. Return the next day
public int getNext(){
   return (day+1)%7;  
}
//E. Return the previous day
public int getPrevious(){
   return (day-2)%7; 
}
//F. Calculate and return the day by adding certain days to the current day.
public int incrementDay(int addDay){
   return (day+addDay)%7;
}
public String toString() {  //convert day to string to return full day name
		switch (this.day) {
		case SUN:
			return "Sunday";
		case MON:
			return "Monday";
		case TUE:
			return "Tuesday";
		case WED:
			return "Wednesday";
		case THU:
			return "Thursday";
		case FRI:
			return "Friday";
		case SAT:
			return "Saturday";
		}
		return "";
	}
//Test program.
   public static void main(String[] args) {
      //G. Add the appropriate constructors
      Day day=new Day(FRI);	//Test w/SUN,MON,TUE,WED,THU,FRI,SAT,	
      System.out.print("Start day: ");
      day.printDay();
      System.out.print("\nNext day: ");
      day.setDay(day.getNext());
      day.printDay();
      System.out.print("\nPrevious Day: ");
      day.setDay(day.getPrevious());
      day.printDay();
      System.out.print("\n4 days later is: ");
      day.setDay(day.incrementDay(4));
      day.printDay();
      System.out.print("\n13 days later is: ");
      day.setDay(day.incrementDay(13));
      day.printDay();
    
   }
}  
    		
		









