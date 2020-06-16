package gestion.des.employes;
import java.io.Serializable;
public class societer implements Serializable {
    private  int numero;
    private String Nom,adreese,telephone,raison_sociale,ville;

    public societer(int numero, String Nom, String adreese, String raison_sociale, String telephone, String ville) {
        this.numero = numero;
        this.Nom = Nom;
        this.adreese = adreese;
        this.telephone = telephone;
        this.raison_sociale = raison_sociale;
        this.ville = ville;
    }
    public societer() {
    }
    public int getNumero() {
        return numero;
    }
    public String getNom() {
        return Nom;
    }
    public String getVille() {
        return ville;
    }
    public String getAdreese() {
        return adreese;
    }
    public String getTelephone() {
        return telephone;
    }

    public String getRaison_sociale() {
        return raison_sociale;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public void setAdreese(String adreese) {
        this.adreese = adreese;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setRaison_sociale(String raison_sociale) {
        this.raison_sociale = raison_sociale;
    }
    
}
