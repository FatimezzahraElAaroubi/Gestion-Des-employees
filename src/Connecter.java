import java.sql.*;
public class Connecter {
    Connection con;
    public Connecter(){
        try{
        Class.forName("com.mysql.jdbc.Driver");
        
        
        }catch(Exception e){
        System.err.println(e);
        }
        try{
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gestiondesemployées","root","");
        }catch(SQLException ex){
             System.err.println(ex);
        }
    }
    Connection obtenirconnexion(){return con;}
}
