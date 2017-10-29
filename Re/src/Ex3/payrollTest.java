package Ex3;

import java.util.Scanner;

public class payrollTest
{

   public static void main(String[] args)
   {
     
      Scanner keyboard = new Scanner(System.in);
      
      payroll p1 = new payroll("mario", 200, 300);
      
      System.out.println("enter:");
      p1.setName(keyboard.next());
      p1.setHoursworked(keyboard.nextDouble());
      p1.setPriceperhour(keyboard.nextDouble());
      
      
      System.out.println(p1.getName()+p1.getHoursworked()+ p1.getPriceperhour());
      
      /*p1.setHoursworked(keyboard.nextDouble());*/
      
     System.out.println(p1.grosspay()); 
      
   }

}
