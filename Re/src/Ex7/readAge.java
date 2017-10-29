package Ex7;

import java.util.Scanner;

public class readAge
{
   private  int age;

   public readAge(int age)
   {
      this.age = age;
   }

   public int printAge()
   {
      if (age == 0)
      {
         System.out.println("Error age");
      }
      else if (age <= 12)
      {
         System.out.println("Child");
      }

      else if (age < 19 && age > 13)
      {
         System.out.println(" Teenager");
      }

      else if (age >= 20 && age < 65)
      {
         System.out.println("Adult");
      }
      else if (age < 65)
      {
         System.out.println("Senior citizen");
      }
      return age;
   }

   
}
