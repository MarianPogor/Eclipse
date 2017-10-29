package Ex5;

public class studentTest
{

   public static void main(String[] args)
   {
     Student s1 = new Student("Mario", 'M', 239783);
     Student s2 = new Student("George", 'M', 239783);
     Student s3 = new Student("Alex", 'M', 239783);
     
    // System.out.println(s1.getName() + "   "+ s1.getStudentNumber()+ "   "+ s1.getGender());
     
     
   //  System.out.println(s2.getName() + "   "+ s2.getStudentNumber()+ "   "+ s2.getGender());
     
     
     s1.setName("Aaaa");
     s1.setGender('M');
     s1.setStudentNumber(32547);
    
   
           // System.out.println(s1.getName() + "  "+ s1.getStudentNumber() +"   "+ s1.getGender() );
   
   System.out.println(s1.toString());
   
   }
   
   
   

}
