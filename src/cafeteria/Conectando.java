package cafeteria;


import java.sql.*;

public class Conectando {

   
   

    protected static  Connection conectar (String bd, String user, String pass) throws SQLException {
     Connection con;
       {
         con = DriverManager.getConnection(bd, user, pass);
         return con;
       }
    }
}    
    

