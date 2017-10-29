package Ex6;

public class jobTest
{

   public static void main(String[] args)
   {
      job developer = new job("student", 20000);
      
      job developer2 = new  job("senior", 40000);
      
      
      System.out.println(developer.givePercentageRaise());
      
      System.out.println(developer2.getTitle());

   }

}
