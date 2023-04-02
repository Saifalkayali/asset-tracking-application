/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;


 import java.sql.*;  
/**
 * This is a back up class for the db connection
 * 
 * 
 * @author salkayali
 */
public class DataClass {
    
   

 

   public static void main(String[] args) {  

      // Create a variable for the connection string.  
      String connectionUrl = "jdbc:mysql://localhost:3306/AssetDB?zeroDateTimeBehavior=convertToNull";
      String userName="root";
      String password="password";

      // Declare the JDBC objects.  
      Connection con = null;  
      Statement stmt = null;  
      ResultSet rs = null;  

      try {  
         // Establish the connection.  
         Class.forName("com.mysql.jdbc.Driver");  
         con = DriverManager.getConnection(connectionUrl, userName, password);  

         // Create and execute an SQL statement that returns some data.  
         String SQL = "SELECT firstName FROM assetdb.admins ;";  
         stmt = con.createStatement();  
         rs = stmt.executeQuery(SQL);  

         // Iterate through the data in the result set and display it.  
         while (rs.next()) {  
            System.out.println(rs.toString());
         }
      }

      // Handle any errors that may have occurred.  
      catch (ClassNotFoundException | SQLException e) {  
      }  
      finally {  
         if (rs != null) try { rs.close(); } catch(Exception e) {}  
         if (stmt != null) try { stmt.close(); } catch(Exception e) {}  
         if (con != null) try { con.close(); } catch(Exception e) {}  
      }  
   }  
}  

