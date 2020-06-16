
import com.mysql.jdbc.Connection;
import gestion.des.employes.Employe;
import gestion.des.employes.societer;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class operations {
     public ArrayList<societer> chercher(String mc){
        ArrayList<societer> soc = new ArrayList<societer>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con =  (Connection) DriverManager.getConnection("jdbc:mysql://localhost/gestiondesemployées","root","");
            PreparedStatement ps = con.prepareStatement("SELECT * FROM societe WHERE Numero= ?");
            ps.setString(1,mc);
            ResultSet rs = ps.executeQuery();
           while(rs.next()){
               societer S = new societer();
               S.setNumero(rs.getInt(1));
               S.setNom(rs.getString(2));
               S.setAdreese(rs.getString(3));
               S.setRaison_sociale(rs.getString(4));
               S.setTelephone(rs.getString(5));
               S.setVille(rs.getString(6));
               soc.add(S);
           }
           ps.close();
           con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return soc;
    }
     public void ajouterSoc(societer S){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con =  (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/gestiondesemployées","root","");
PreparedStatement ps= con.prepareStatement("INSERT INTO societe(Numero,nom,Adresse,raison_social,telephone,Ville)VALUES(?,?,?,?,?,?)");
            ps.setInt(1, S.getNumero());
            ps.setString(2, S.getNom());
            ps.setString(3, S.getAdreese());
            ps.setString(4, S.getRaison_sociale());
            ps.setString(5, S.getTelephone());
            ps.setString(6, S.getVille());
            int n = ps.executeUpdate();
            ps.close();
            con.close();
}
catch(Exception e){System.err.println(e);
}
     }
         public ArrayList<societer> afficheSoc(){
        ArrayList<societer> societes = new ArrayList<societer>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection con =  (java.sql.Connection) DriverManager.getConnection("jdbc:mysql://localhost/gestiondesemployées","root","");
            PreparedStatement ps = con.prepareStatement("SELECT *FROM societe");
            ResultSet rs = ps.executeQuery();
            
           while(rs.next()){
               societer p = new societer();
               p.setNumero(rs.getInt(1));
               p.setNom(rs.getString(2));
                p.setAdreese(rs.getString(3));
                 p.setRaison_sociale(rs.getString(4));
                 p.setTelephone(rs.getString(5));
               p.setVille(rs.getString(6));
               societes.add(p);
           }
           ps.close();
           con.close(); 
        } catch (Exception e) {
            e.printStackTrace();
        }
        return societes;
    }
  public void modifierSocieter(societer p,int code){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con =  (Connection) DriverManager.getConnection("jdbc:mysql://localhost/gestiondesemployées","root","");
            PreparedStatement ps = con.prepareStatement("update societe set nom = ?,adresse=?,Telephone=?,raison_social=?,Ville=? where Numero=?");
                                                               
            ps.setString(1, p.getNom());
            ps.setString(2, p.getAdreese());
            ps.setString(3, p.getRaison_sociale());
             ps.setString(4, p.getTelephone());
              ps.setString(5, p.getVille());
               ps.setInt(6,code); 
            ps.executeUpdate();
            ps.close();
            con.close();
            JOptionPane.showMessageDialog(null,"modification  bien effectuée!");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
       public void supprimerSocieter(String c){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con =  (Connection) DriverManager.getConnection("jdbc:mysql://localhost/gestiondesemployées","root","");
            PreparedStatement ps = con.prepareStatement("delete from societe  where Numero='"+c+"'");
            ps.executeUpdate();
            ps.close();
            con.close();
             JOptionPane.showMessageDialog(null,"Suppretion bien effectuée!");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
       }
        public ResultSet remplircombo(){
         ResultSet rs=null;
         try{
         Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection con =  (java.sql.Connection) DriverManager.getConnection("jdbc:mysql://localhost/gestiondesemployées","root","");
            PreparedStatement ps = con.prepareStatement("SELECT Numero FROM societe");
             rs = ps.executeQuery();
     }catch(Exception ex){
       System.out.println(ex);
     }
         return rs;
     }
        public ArrayList<Employe> chercherListEmp( String num){
        ArrayList<Employe> Employes = new ArrayList<Employe>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection con =  (java.sql.Connection) DriverManager.getConnection("jdbc:mysql://localhost/gestiondesemployées","root","");
            PreparedStatement ps = con.prepareStatement("SELECT * FROM employe where Numero =?");
            ps.setString(1, num);
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
               Employes.add(p);
           }
           ps.close();
           con.close();
           
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Employes;
        
    }
        public ArrayList<Employe> trieDes(String code){
             ArrayList<Employe> Employes = new ArrayList<Employe>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection con =  (java.sql.Connection) DriverManager.getConnection("jdbc:mysql://localhost/gestiondesemployées","root","");
            PreparedStatement ps = con.prepareStatement("SELECT * FROM employe where Numero=? order by nom DESC");
            ps.setString(1,code);
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
               Employes.add(p);
           }
           ps.close();
           con.close();
           
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Employes;
        }
          public ArrayList<Employe> trieAsd(String code){
             ArrayList<Employe> Employes = new ArrayList<Employe>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection con =  (java.sql.Connection) DriverManager.getConnection("jdbc:mysql://localhost/gestiondesemployées","root","");
            PreparedStatement ps = con.prepareStatement("SELECT * FROM employe where Numero=? order by nom ");
            ps.setString(1,code);
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
     }
