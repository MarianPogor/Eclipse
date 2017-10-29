package Ex3;

public class testPerson
{

   public static void main(String[] args)
   {
     person p1 =  new person();
     person p2 =  new person();
     
     p1.setBirthday("08-09-1986");
     p1.setName("Mario");
     
     p2.setBirthday("03-05-1999");
     p2.setName("Jonny");
     
     
     System.out.println(p1.getBirthday()+ " and name   "+ p1.getName());
     
     System.out.println(p2.getBirthday()+ " and name   " + p2.getName());

   }

}
