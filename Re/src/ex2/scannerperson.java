package ex2;

import java.util.Scanner;

public class scannerperson
{

   public static void main(String[] args)
   {
      String name;
      int age;
      String address;
      Scanner myscan = new Scanner(System.in);

      System.out.println("enter your personal data:");

      name = myscan.next();
      
      
      System.out.println("enter your age:");
      age = myscan.nextInt();
      System.out.println("enter your address:");
      address = myscan.next();

      System.out.println("your personal data are:" + name  + age + address);

   }

}
