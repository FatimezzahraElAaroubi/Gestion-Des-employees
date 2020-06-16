
package gestion.des.employes;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.*;

public class Traitement {
     public ArrayList<Employe> chercher(String mc){
        ArrayList<Employe> Emp = new ArrayList<Employe>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con =  (Connection) DriverManager.getConnection("jdbc:mysql://localhost/gestiondesemployées","root","");
            PreparedStatement ps = con.prepareStatement("SELECT * FROM employe WHERE codeEMP= ?");
            ps.setString(1,mc);
            ResultSet rs = ps.executeQuery();
           while(rs.next()){
               Employe E = new Employe();
               E.setCodeEmp(rs.getString(1));
               E.setNom(rs.getString(2));
               E.setPrenom(rs.getString(3));
               E.setAdresse(rs.getString(4));
               E.setTelephone(rs.getString(5));
               E.setSex(rs.getString(6));
               E.setService(rs.getString(7));
               E.setNumeroSo(rs.getString(8));
               Emp.add(E);
           }
           ps.close();
           con.close();
           
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Emp;
    }
     public void ajouterEmp(Employe E){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con =  (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/gestiondesemployées","root","");
PreparedStatement ps= con.prepareStatement("INSERT INTO employe(codeEMP,nom,prenom,adresse,telephone,sexe,Service,Numero)VALUES(?,?,?,?,?,?,?,?)");
            ps.setString(1, E.getCodeEmp());
            ps.setString(2, E.getNom());
            ps.setString(3, E.getPrenom());
            ps.setString(4, E.getAdresse());
            ps.setString(5, E.getTelephone());
            ps.setString(6, E.getSex());
            ps.setString(7, E.getService());
            ps.setString(8, E.getNumeroSo());
            int n = ps.executeUpdate();
            ps.close();
            con.close();
}
catch(Exception e){System.err.println(e);
}
     }
 public ResultSet remplircombo(){
         ResultSet rs=null;
         try{
         Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection con =  (java.sql.Connection) DriverManager.getConnection("jdbc:mysql://localhost/gestiondesemployées","root","");
            PreparedStatement ps = con.prepareStatement("SELECT CodeEmp FROM employe");
             rs = ps.executeQuery();
     }catch(Exception ex){
       System.out.println(ex);
     }
         return rs;
     }         
         public ArrayList<Employe> affichEmp(){
        ArrayList<Employe> Employes = new ArrayList<Employe>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection con =  (java.sql.Connection) DriverManager.getConnection("jdbc:mysql://localhost/gestiondesemployées","root","");
            PreparedStatement ps = con.prepareStatement("SELECT * FROM employe order by codeEMP");
            ResultSet rs = ps.executeQuery();
            
           while(rs.next()){
               Employe p = new Employe();
               p.setCodeEmp(rs.getString(1));
               p.setNom(rs.getString(2));
               p.setPrenom(rs.getString(3));
               p.setAdresse(rs.getString(4));
               p.setTelephone(rs.getString(5));
               p.setSex(rs.getString(6));
               p.setService(rs.getString(7));
               p.setNumeroSo(rs.getString(8));
               Employes.add(p);
           }
           ps.close();
           con.close();
           
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Employes;
        
    }
  public void modifierEmploye(Employe p,String code){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con =  (Connection) DriverManager.getConnection("jdbc:mysql://localhost/gestiondesemployées","root","");
            PreparedStatement ps = con.prepareStatement("update employe set nom = ?, prenom = ?,adresse=?,telephone=?,sexe=?,Service=?,Numero=? where codeEmp=?");
                                                               
            ps.setString(1, p.getNom());
            ps.setString(2, p.getPrenom());
            ps.setString(3, p.getAdresse());
             ps.setString(4, p.getTelephone());
              ps.setString(5, p.getSex());
               ps.setString(6, p.getService());
                 ps.setString(7, p.getNumeroSo());
               ps.setString(8,code); 
            ps.executeUpdate();
            ps.close();
            con.close();
            JOptionPane.showMessageDialog(null,"modification  bien effectuée!");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
       public void supprimerEmploye(String c){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con =  (Connection) DriverManager.getConnection("jdbc:mysql://localhost/gestiondesemployées","root","");
            PreparedStatement ps = con.prepareStatement("delete from employe  where CodeEmp='"+c+"'");
          
            
            ps.executeUpdate();
            
            ps.close();
            con.close();
             JOptionPane.showMessageDialog(null,"Suppretion bien effectuée!");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
     
    
}
     }


