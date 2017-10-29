package EX7_03;

import java.util.Scanner;

import ex2.scannerperson;

public class grade
{
 private int danishgrade;


public grade(int danishgrade)
{
   this.danishgrade=danishgrade;
}

public int printGrade()
{
   if(danishgrade == -3)
   {
      System.out.println("The grade is F");
   }
   else if (danishgrade==0)
   {
      System.out.println("The grade is Fx");
   }
   else if (danishgrade==02)
   {
      System.out.println("the grade is E");
      
   }
   else if(danishgrade==4)
   {
      System.out.println("The grade is D");
   }
   else if (danishgrade==7)
   {
      System.out.println("The grade is C");
      
   }
   else if(danishgrade==10)
   {
      System.out.println("The grade is B");
      
   }
   else if (danishgrade==12)
   {
      System.out.println("The grade is A");
   }
   return danishgrade;
};

public static void main(String[] args)
{
   int n1;
   Scanner scan = new Scanner(System.in);
   
   System.out.println( " enter a number");
  
   n1=scan.nextInt();
   
   
   
   
   
   
   
}

}
