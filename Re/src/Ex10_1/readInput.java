package Ex10_1;

import java.util.Scanner;

public class readInput
{

   public static void main(String[] args)
   {
    System.out.println(" Enter a number:");
    Scanner keyboard = new Scanner(System.in);
    
    int number = keyboard.nextInt();
    
    System.out.println("The number is : " +2*number);
    
    System.out.println("The number is : " +number);
    
    System.out.println("The number is : " +Math.pow(number,2));

   }

}
