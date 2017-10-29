package EX4;

import java.util.Scanner;

public class TestBook
{

   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
 
       Book book1 = new Book();
       Book book2 = new Book();
       
       System.out.println("Enter price for book: ");
      book1.setPrice(keyboard.nextDouble());
      
      
      System.out.println("Enter title for book: ");
      book1.setAuthor(keyboard.next());
      
      System.out.println("Enter title for book: ");
      book1.setTitle(keyboard.next());
      
      System.out.println("Enter pages for book: ");
      book1.setPages(keyboard.nextInt());
      
      
      
      
      System.out.println(book1.getPrice());
      System.out.println(book1.getAuthor());
      System.out.println(book1.getPages());
      System.out.println(book1.getTitle());
      
      /*System.out.println("Enter price for book: ");
      book2.setPrice(keyboard.nextDouble());
      System.out.println(book2.getPrice());*/
   }

}
