package Ex3;

import java.io.ObjectInputStream.GetField;

public class myDateTest
{

   public static void main(String[] args)
   {
      
      
     myDate date1 = new myDate(10,04,2017);
      
     // myDate date2 = new myDate(8,9,1986);
      
    //  System.out.println(date1.displayDate());
      
      
     // System.out.println(date2.displayDate());
      
      //System.out.println(date1.daysInMonth(11));
      
     // System.out.println(date1.getAstroSign(8, 9));
      
      
   date1.setMonth(12);
   
   System.out.println(((myDate) date1).getMonthName());
   ;
      
   
   }

}
