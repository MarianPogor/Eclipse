package EX4;

public class Book
{
   private String author;
   private String title;
   private double price;
   private int pages;
   
   
   public Book()
   {
      this.author= author;
      this.title = title;
      this.price = price; 
      this.pages = pages; 
   }


   public void setAuthor(String author)
   {
      this.author = author;
   }


   public void setTitle(String title)
   {
      this.title = title;
   }


   public void setPages(int pages)
   {
      this.pages = pages;
   }


   public String getAuthor()
   {
      return author;
   }


   public String getTitle()
   {
      return title;
   }


   public double getPrice()
   {
      return price;
   }


   public int getPages()
   {
      return pages;
   }
   public void setPrice( double price)
   {
   this.price=price;
   }
}
