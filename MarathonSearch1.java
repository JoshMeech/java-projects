import java.util.*;
public class MarathonSearch1{
   public static void main(String[] args){
   double[] miles={2.6, 5.2, 7.8, 19.4, 13, 15.6, 18.2, 20.8, 23.4, 26};
   int x = 4;
   boolean found = false;
  for (int i=0;i<miles.length;i++){
      if (miles[i]==x){
         found = true;
      }   
  }
  if (found){
   System.out.print("Found"+x);
   }
  else{
   System.out.print(x+ " Not found");      
  {
  }
 }
}
} 