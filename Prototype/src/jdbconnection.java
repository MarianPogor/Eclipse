import java.sql.*;

public class jdbconnection
{

   public static void main(String[] args)
   {
      try
      {
         Class.forName("oracle.jdbc.driver.OracleDriver");

         Connection con = DriverManager.getConnection(
               "jdbc:oracle:thin:@localhost:1521:orcl","C##Mario","mario123");
         
         Statement st = con.createStatement();
         String sql = "select * from Mother";
         
         System.out.println("Connection succed");
         ResultSet rs = st.executeQuery(sql);
         while (rs.next())
            System.out.println(rs.getInt(1)+ " " +rs.getInt(2));
         con.close();
         

      }
      catch (Exception e)
      {
         System.out.println(e);
      }
   }
}
