package Ex10_5;

import java.util.Scanner;

public class printInverse
{

   public String textReverse(String text)
   {

      return text;
   }

   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);

      System.out.println("Enter a string:");

      String text = scan.nextLine();

 
     if (text =="quit")
      {
        
         System.out.println("You entered quit");
      }

      else
      {

         String reverse = new StringBuffer(text).reverse().toString();

         System.out.println(reverse);
      }

   }

}
