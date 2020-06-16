
package gestion.des.employes;
import java.io.Serializable;
/**
 *
 * @author MEHDI AROUBI
 */
public class Employe implements Serializable{
    private String codeEmp,Nom,Prenom,service,sex,adresse;
    private String telephone, numeroSo;
    
    public Employe(){
        
    }
    public Employe(String codeEmp, String Nom, String Prenom, String adresse, String telephone, String sex, String service, String numeroSo) {
         this.codeEmp=codeEmp;
        this.Nom=Nom;
        this.Prenom=Prenom;
        this.adresse=adresse;
        this.service=service;
        this.sex=sex;
        this.telephone=telephone;
        this.numeroSo=numeroSo;
    }

    public String getCodeEmp() {
        return codeEmp;
    }

    public String getNom() {
        return Nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public String getService() {
        return service;
    }

    public String getSex() {
        return sex;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getNumeroSo() {
        return numeroSo;
    }

    public void setCodeEmp(String codeEmp) {
        this.codeEmp = codeEmp;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public void setPrenom(String Prenom) {
        this.Prenom = Prenom;
    }

    public void setService(String service) {
        this.service = service;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setNumeroSo(String numeroSo) {
        this.numeroSo = numeroSo;
    }

   
   
   
    
    
}
