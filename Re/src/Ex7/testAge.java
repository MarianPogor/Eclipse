package Ex7;

import java.util.Scanner;

public class testAge
{

   public static void main(String[] args)
      {
         Scanner scan = new Scanner(System.in);
          System.out.println("Enter age");
         readAge age = new readAge(5);
         
         System.out.println(age.printAge());
         
         
      }

}
