package exercices1;

import java.util.Scanner;

public class Tax
{

   public static void main(String[] args)
   {
      final double TAX_RATE ;
      int price1;
      int price2;
      int price3 ;
      
      
      
      Scanner keyboard = new Scanner(System.in);
      

      System.out.println("Enter tax rate ");
      TAX_RATE = keyboard.nextDouble();
      

      System.out.println("Enter numnbers");
      
      price1 = keyboard.nextInt();
      price2 = keyboard.nextInt();
      price3 = keyboard.nextInt();
      
      
      int totalprice = price1 +price2+price3; 
      

      
       System.out.println( "total price is:" + totalprice);
       
       System.out.println( "The tax is :"  + totalprice*TAX_RATE);
   }

}
