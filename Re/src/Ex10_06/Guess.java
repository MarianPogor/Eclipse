package Ex10_06;

import java.util.Random;
import java.util.Scanner;

public class Guess
{

   public static void main(String[] args)
   {
      while (true)
      {
         Random nrrandom = new Random();
         int random = (int) (Math.random() * 1000 + 1);
         System.out.println("Guess nr entered:");
         
      

         Scanner keyboard = new Scanner(System.in);
         System.out.print("Enter a number in the range 1-1000: ");
         int number = keyboard.nextInt();

         while (random == number)

         {
            {
            System.out.println("The number is :" + random);
            }
            
         }
         if (random<number)
         {
            System.out.println("is to high");
         }
         else if(random>number)
         {
            System.out.println(" is to low");
         }

      }

   }

}
