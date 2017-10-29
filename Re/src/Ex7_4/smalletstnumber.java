package Ex7_4;

import java.util.Scanner;

public class smalletstnumber
{
private int nr1;

private int nr2;

    public smalletstnumber(int nr1,int nr2)
{
   this.nr1 = nr1;
   this.nr2 = nr2;
   
}

public int printSmallest()
{
   if (nr1<nr2)
   {
      System.out.println(nr1);
   }
   if(nr2<nr1)
   {
      System.out.println(nr2);
   }
   return 0;
}
public static void main(String[] args)
{
   smalletstnumber sm1= new smalletstnumber(1,5);
   
   
//Scanner scan = new Scanner(System.in);
//System.out.println("Enter nr1");
 System.out.println(sm1.printSmallest());
}
}