package Ex7_02;

import java.lang.ProcessBuilder.Redirect;
import java.util.Scanner;

public class readGender
{
   Scanner scan = new Scanner(System.in);

   private  String sex;
   private int age;

   public readGender( String sex, int age)
   {
      this.sex=sex;
      this.age = age;
   }

   public String readInput()
   {
      if (sex !="M" && sex != "F" && age ==0)
      {
         System.out.println("Error in typed values");
      }

      else if (sex=="M" && age < 18)
      {
         System.out.println("Is a boy");
      }

      else if (sex == "M" && age >= 18)
      {
         System.out.println("it's a men");
      }
      else if (sex == "F" && age < 18)
      {
         System.out.println("It's a girl");
      }
      else if (sex== "F" && age >= 18)
      {
         System.out.println(" she is a woman");
      }
      return sex+ " " + age ;
   }

   public static void main(String[] args)
   {


      readGender pp1 = new readGender("M", 20);
      
      readGender pp2 = new readGender("M", 17);
      
      
    
      
     /* System.out.println("Enter sex");
      sex=scan.next();
      System.out.println(" Enter age");
      age = scan.nextInt();*/

      System.out.println("Person1 result: ");
      System.out.println(pp2.readInput());
      
      System.out.println("Person2 result: ");
      System.out.println(pp1.readInput());

   }
}
