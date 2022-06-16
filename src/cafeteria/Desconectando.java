package cafeteria;


import java.sql.*;


public class Desconectando {
    
  static Connection con; 
    
    public static void desconectar (){
       
        try {
                con.close();
                System.out.println("Desconectados de Cafeteria");
            } catch (SQLException sqe) {
                System.out.println("No se pudo desconectar" + sqe.getMessage());
            }
     
        }
        
    }
    

