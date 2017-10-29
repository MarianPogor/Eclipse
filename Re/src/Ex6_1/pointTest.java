package Ex6_1;

public class pointTest
{

   public static void main(String[] args)
   {
      point p1= new point(100, 300);
      point p2 = new point (150,400);
      
      
     
      p1.setX(999);
      p2.setX(3);
      p2.setY(4);
      
      System.out.println(p1.getX() +"  " + p1.getY());
      System.out.println(p2.getX() +"  " + p2.getY());
      
      System.out.println(p2.toString());
      
   }

}
