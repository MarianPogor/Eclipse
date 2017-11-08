/*Retrieve all mothers joined with their children
For all mother/child combination
 If mother is blond and child born in 2012
 increment counter
 End-if
 End-for*/
  import java.sql.*;


public class QuestionSix extends QuestionRunner
{
 


      public QuestionSix (Connection iconn) {

         this.conn = iconn;
      }

      public void runCase() throws SQLException {

         Statement stmtMother = conn.createStatement();
         Statement stmtChild = conn.createStatement();
         int noOfChildren = 0;
         
         stmtMother.executeQuery("ALTER SYSTEM FLUSH SHARED_POOL");
         stmtChild.executeQuery("ALTER SYSTEM FLUSH SHARED_POOL");
         ResultSet rsMother = stmtMother.
 executeQuery("select mother.id, child.yearborn ,mother.haircolor from mother join child on Mother.ID = Child.MotherId where mother.haircolor='blond'");
         
         
         while (rsMother.next())
         {
            if(rsMother.getString("haircolor").equals("blond") && rsMother.getInt("yearBorn")==2012)
            
               noOfChildren++;
            
             }
         
         rsMother.close();
         rsMother = null;
        
         stmtMother.close();
         stmtChild.close();
         
         System.out.println("Result is : " + noOfChildren);
   
}
}

