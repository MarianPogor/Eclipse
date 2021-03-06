/*
 * Implementation of question number one 
 * 
 * Only contains specific code for the question. Handling of statistics gathering
 * is inherited from QuestionRunner
 */

import java.sql.*;

public class QuestionTwo extends QuestionRunner
{
   public QuestionTwo(Connection iconn)
   {

      this.conn = iconn;
   }

   public void runCase() throws SQLException
   {

      Statement stmtMother = conn.createStatement();
      Statement stmtChild = conn.createStatement();
      int noOfMothers = 0;
      
      stmtChild.executeQuery("ALTER SYSTEM FLUSH SHARED_POOL");
      stmtMother.executeQuery("ALTER SYSTEM FLUSH SHARED_POOL");
      
      ResultSet rsChild = stmtChild
            .executeQuery("select motherID ,yearborn from child");

      while (rsChild.next())
      {
         if (rsChild.getInt("yearBorn") == 2012)
         {
            ResultSet rsMother = stmtMother
                  .executeQuery("select id  ,hairColor from  "
                        + "mother where id= " + rsChild.getInt("motherId"));

            while (rsMother.next())
            {
               if (rsMother.getString("hairColor").equals("blond"))
               {
                  noOfMothers++;
               }
            }

            rsMother.close();
            rsMother = null;
         }

      }

      rsChild.close();
      rsChild = null;
      stmtChild.close();
      stmtMother.close();

      System.out.println("number of  child were mother has blond hair are  : " + noOfMothers++);
   }

}
/*
 * Retrive all children For each child If child is born in 2012 Retrieve mother
 * for this child If haircolor of the mother is blond increment counter End-if
 * End-if End-for
 */

