package ex2;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardDownRightHandler;

public class scan1
{

   public static void main(String[] args)
   {
      int enternumber1, enternumber2, enternumber3;

      Scanner keyboard = new Scanner(System.in);

      System.out.println("Enter numnber");
      enternumber1 = keyboard.nextInt();

      System.out.println("Enter numnber");
      enternumber2 = keyboard.nextInt();

      System.out.println("Enter numnber");
      enternumber3 = keyboard.nextInt();

      int total = enternumber1 + enternumber2 + enternumber3;

      System.out.println("Total sum is :" + total);

   }

}
