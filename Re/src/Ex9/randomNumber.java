package Ex9;

import java.util.Random;
import java.util.Scanner;

public class randomNumber
{

   public static void main(String[] args)
   {
      while (true)
      {
         Random nrrandom = new Random();
         int random = (int) (Math.random() * 10 + 1);
         System.out.println("Guess nr");

         Scanner keyboard = new Scanner(System.in);
         System.out.print("Enter a number in the range 1-10: ");
         int number = keyboard.nextInt();
         while (random == number)
         {
            System.out.println("The number is :" + random);

            System.out.println("enter another number:");
            number = keyboard.nextInt();

         }
      }

   }

}
