
import gestion.des.employes.*;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.SelectionModel;
public class Gestion_des_employes extends javax.swing.JFrame {
     //déclaration 
    int indice;
    DefaultTableModel model = new DefaultTableModel();
    DefaultListModel l= new DefaultListModel();
    public Gestion_des_employes() {
//initcomponent
        initComponents();
        l.addElement("Informatique");
         l.addElement("comptable");
          l.addElement("commerce");
          listeService.setModel(l);
model.addColumn("codeEMP");
model.addColumn("Nom");
model.addColumn("prenom");
model.addColumn("adresse");
model.addColumn("telephone");
model.addColumn("sexe");
model.addColumn("Service");
model.addColumn("Numero");
try {
    Traitement metier = new Traitement();
     ArrayList<Employe> list = metier.affichEmp();
 Object[] rowData=new Object[8];
          for(int i =0;i<list.size();i++)
          {
               rowData[0]=list.get(i).getCodeEmp();
              rowData[1]=list.get(i).getNom();
               rowData[2]=list.get(i).getPrenom();
                rowData[3]=list.get(i).getAdresse();
                 rowData[4]=list.get(i).getTelephone();
                 rowData[5]=list.get(i).getSex();
                  rowData[6]=list.get(i).getService();
                   rowData[7]=list.get(i).getNumeroSo();
                model.addRow(rowData);
          }
}catch(Exception e){System.err.println(e);}

DTGV.setModel(model);
remplircombox();

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtcode = new javax.swing.JTextField();
        txtnom = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtprenom = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txttelephone = new javax.swing.JTextField();
        BtnAjouter = new javax.swing.JButton();
        BTNNouveau = new javax.swing.JButton();
        BtnSupprimer = new javax.swing.JButton();
        BtnModifier = new javax.swing.JButton();
        BtnQuitter = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        DTGV = new javax.swing.JTable();
        BtnRechercher = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        BTNActualiser = new javax.swing.JButton();
        comborech = new javax.swing.JComboBox<>();
        label2 = new java.awt.Label();
        btnSuivant = new javax.swing.JButton();
        btnDernier = new javax.swing.JButton();
        btnPremier = new javax.swing.JButton();
        BtnPrecedant = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        panel = new javax.swing.JPanel();
        radHom = new javax.swing.JRadioButton();
        radFem = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listeService = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtNum = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        jLabel10.setText("jLabel10");

        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(51, 29, 234));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusCycleRoot(false);
        setForeground(new java.awt.Color(255, 0, 51));
        setMaximumSize(new java.awt.Dimension(700, 500));
        setPreferredSize(new java.awt.Dimension(700, 650));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel1.setText("Code:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 90, 59, 17);

        jLabel2.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel2.setText("Nom:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 130, 59, 17);

        jLabel3.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel3.setText("Prenom:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 170, 59, 17);

        txtcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodeActionPerformed(evt);
            }
        });
        getContentPane().add(txtcode);
        txtcode.setBounds(100, 90, 171, 27);

        txtnom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomActionPerformed(evt);
            }
        });
        getContentPane().add(txtnom);
        txtnom.setBounds(100, 130, 171, 27);

        jLabel4.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        jLabel4.setText("Adresse:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 270, 90, 24);
        getContentPane().add(txtprenom);
        txtprenom.setBounds(100, 170, 171, 27);

        jLabel5.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel5.setText("Telephone:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 210, 76, 22);

        txttelephone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttelephoneActionPerformed(evt);
            }
        });
        getContentPane().add(txttelephone);
        txttelephone.setBounds(100, 210, 171, 27);

        BtnAjouter.setBackground(new java.awt.Color(153, 153, 153));
        BtnAjouter.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        BtnAjouter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/icons8-plus-30.png"))); // NOI18N
        BtnAjouter.setText("Ajouter");
        BtnAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAjouterActionPerformed(evt);
            }
        });
        getContentPane().add(BtnAjouter);
        BtnAjouter.setBounds(490, 160, 140, 40);

        BTNNouveau.setBackground(new java.awt.Color(153, 153, 153));
        BTNNouveau.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        BTNNouveau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/icons8-new-30.png"))); // NOI18N
        BTNNouveau.setText("Nouveau");
        BTNNouveau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNNouveauActionPerformed(evt);
            }
        });
        getContentPane().add(BTNNouveau);
        BTNNouveau.setBounds(490, 110, 140, 39);

        BtnSupprimer.setBackground(new java.awt.Color(153, 153, 153));
        BtnSupprimer.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        BtnSupprimer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/icons8-delete-bin-30.png"))); // NOI18N
        BtnSupprimer.setText("Supprimer");
        BtnSupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSupprimerActionPerformed(evt);
            }
        });
        getContentPane().add(BtnSupprimer);
        BtnSupprimer.setBounds(490, 260, 140, 39);

        BtnModifier.setBackground(new java.awt.Color(153, 153, 153));
        BtnModifier.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        BtnModifier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/icons8-edit-file-30.png"))); // NOI18N
        BtnModifier.setText("Modifier");
        BtnModifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModifierActionPerformed(evt);
            }
        });
        getContentPane().add(BtnModifier);
        BtnModifier.setBounds(490, 210, 140, 39);

        BtnQuitter.setBackground(new java.awt.Color(153, 153, 153));
        BtnQuitter.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        BtnQuitter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/icons8-logout-rounded-up-30.png"))); // NOI18N
        BtnQuitter.setText("Quitter");
        BtnQuitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnQuitterActionPerformed(evt);
            }
        });
        getContentPane().add(BtnQuitter);
        BtnQuitter.setBounds(470, 540, 140, 40);

        DTGV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "code", "Nom", "Prenom", "Adresse", "Telephone", "sexe", "Service"
            }
        ));
        DTGV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DTGVMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(DTGV);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 440, 600, 93);

        BtnRechercher.setBackground(new java.awt.Color(153, 153, 153));
        BtnRechercher.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        BtnRechercher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/rechercher.png"))); // NOI18N
        BtnRechercher.setText("Rechercher");
        BtnRechercher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRechercherActionPerformed(evt);
            }
        });
        getContentPane().add(BtnRechercher);
        BtnRechercher.setBounds(420, 380, 160, 41);

        jLabel6.setBackground(new java.awt.Color(153, 153, 153));
        jLabel6.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel6.setText("Rechercher par code:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(60, 380, 147, 40);

        jLabel7.setFont(new java.awt.Font("Arial", 3, 36)); // NOI18N
        jLabel7.setText("Gestion Des Employés");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(120, 20, 448, 41);

        BTNActualiser.setBackground(new java.awt.Color(153, 153, 153));
        BTNActualiser.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        BTNActualiser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/icons8-sync-30.png"))); // NOI18N
        BTNActualiser.setText("Actualiser");
        BTNActualiser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNActualiserActionPerformed(evt);
            }
        });
        getContentPane().add(BTNActualiser);
        BTNActualiser.setBounds(20, 540, 140, 39);

        comborech.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comborechItemStateChanged(evt);
            }
        });
        comborech.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comborechActionPerformed(evt);
            }
        });
        getContentPane().add(comborech);
        comborech.setBounds(230, 380, 160, 40);

        label2.setText("label2");
        label2.setVisible(false);
        getContentPane().add(label2);
        label2.setBounds(10, 20, 38, 20);

        btnSuivant.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        btnSuivant.setText(">>");
        btnSuivant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuivantActionPerformed(evt);
            }
        });
        getContentPane().add(btnSuivant);
        btnSuivant.setBounds(520, 330, 50, 23);

        btnDernier.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        btnDernier.setText(">");
        btnDernier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDernierActionPerformed(evt);
            }
        });
        getContentPane().add(btnDernier);
        btnDernier.setBounds(470, 330, 40, 23);

        btnPremier.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        btnPremier.setText("<");
        btnPremier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPremierActionPerformed(evt);
            }
        });
        getContentPane().add(btnPremier);
        btnPremier.setBounds(370, 330, 40, 23);

        BtnPrecedant.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        BtnPrecedant.setText("<<");
        BtnPrecedant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPrecedantActionPerformed(evt);
            }
        });
        getContentPane().add(BtnPrecedant);
        BtnPrecedant.setBounds(310, 330, 50, 23);

        jLabel8.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        jLabel8.setText("Sexe:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(360, 210, 50, 19);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(100, 250, 170, 60);

        radHom.setText("Homme");
        radHom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radHomActionPerformed(evt);
            }
        });
        panel.add(radHom);

        radFem.setText("Femme");
        radFem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radFemActionPerformed(evt);
            }
        });
        panel.add(radFem);

        getContentPane().add(panel);
        panel.setBounds(290, 240, 170, 30);

        jLabel9.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        jLabel9.setText("Service:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(350, 90, 70, 19);

        jScrollPane2.setViewportView(listeService);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(290, 120, 170, 70);

        jButton1.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/icons8-show-property-30.png"))); // NOI18N
        jButton1.setText("Gérer la societé");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(230, 541, 190, 39);

        jLabel11.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel11.setText("NumeroSo:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(20, 330, 74, 20);
        getContentPane().add(txtNum);
        txtNum.setBounds(100, 320, 170, 30);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/projetJava.jpg"))); // NOI18N
        getContentPane().add(jLabel12);
        jLabel12.setBounds(30, 40, 690, 550);

        pack();
    }// </editor-fold>//GEN-END:initComponents
  private void deplacer(int i){
       try {     //i represente les ligne 
               
          txtcode.setText(model.getValueAt (i, 0).toString());
        txtnom.setText(model.getValueAt (i, 1).toString());
          txtprenom.setText(model.getValueAt (i, 2).toString());
      jTextArea1.setText(model.getValueAt (i, 3).toString());
      txttelephone.setText(model.getValueAt (i, 4).toString());
       txtNum.setText(model.getValueAt (i, 7).toString());  
       }catch (Exception e){ System.out.println(e.getMessage());}
      }
    private void txtcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodeActionPerformed

    private void txtnomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomActionPerformed

    private void txttelephoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttelephoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttelephoneActionPerformed

    private void BTNNouveauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNNouveauActionPerformed
       txtcode.setText("");
        txtnom.setText("");
         txtprenom.setText("");
          jTextArea1.setText("");
           txttelephone.setText("");
            txtNum.setText("");
            radHom.setSelected(false);
            radFem.setSelected(false);
            listeService.setSelectedIndex(0);
    }//GEN-LAST:event_BTNNouveauActionPerformed

    private void DTGVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DTGVMouseClicked
        try {  int i=DTGV.getSelectedRow();
            deplacer(i);
            //sa si quant on choisir un nom dans le tableau il va afficher sur les fieldtext
        }
        catch (Exception e){System.out.println(e.getMessage());}
    }//GEN-LAST:event_DTGVMouseClicked

    private void BtnAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAjouterActionPerformed
             Traitement metier = new Traitement();
             try{
        String codeEmp=txtcode.getText();
        String nom=txtnom.getText();
        String prenom=txtprenom.getText();
        String adresse=jTextArea1.getText();
        String telephone=txttelephone.getText();
        String numeroSo=txtNum.getText();
        String sex=null;
        String service=listeService.getSelectedValue();  
        if (radHom.isSelected()){
            sex=String.valueOf(radHom.getText());
        }
        if (radFem.isSelected()){
            sex=String.valueOf(radFem.getText());
        }  
         if (txtcode.getText().equals("") || txtnom.getText().equals("") || txtprenom.getText().equals("")
                || jTextArea1.getText().equals("") || txttelephone.getText().equals("") || txtNum.getText().equals("")
                || listeService.getSelectedValue().equals("") || radHom.getText().equals("") || radFem.getText().equals("")
                ){
            JOptionPane.showMessageDialog(this, "SVP entrer les informations complete");
        } else {
           Employe E1 = new Employe(codeEmp,nom, prenom, adresse,telephone,sex,service,numeroSo);
        metier.ajouterEmp(E1);
        JOptionPane.showMessageDialog(null,"Bien Ajouter");}
               }catch(Exception e){System.out.println(e.toString());
JOptionPane.showMessageDialog(null,"veuillez changer le code parce que est déja attribue pour un autre employe ");
}
    }//GEN-LAST:event_BtnAjouterActionPerformed
     private void remplircombox(){
        try{
            comborech.removeAllItems();
            Traitement metier=new Traitement();
            ResultSet rs =metier.remplircombo();
            while(rs.next()){
                String CodeEmp=rs.getString("CodeEmp");
                comborech.addItem(CodeEmp);
                
            }
        }catch(Exception ex){
            System.err.println(ex);
        }
    }
    private void BTNActualiserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNActualiserActionPerformed
     try {
         model.setRowCount(0);
    Traitement metier = new Traitement();
     ArrayList<Employe> list = metier.affichEmp();
 Object[] rowData=new Object[8];
          for(int i =0;i<list.size();i++)
          {
               rowData[0]=list.get(i).getCodeEmp();
              rowData[1]=list.get(i).getNom();
               rowData[2]=list.get(i).getPrenom();
                rowData[3]=list.get(i).getAdresse();
                 rowData[4]=list.get(i).getTelephone();
                 rowData[5]=list.get(i).getSex();
                  rowData[6]=list.get(i).getService();
                   rowData[7]=list.get(i).getNumeroSo();
                model.addRow(rowData);
          }
}catch(Exception e){System.err.println(e);}
      DTGV.setModel(model);
       remplircombox();
    }//GEN-LAST:event_BTNActualiserActionPerformed

    private void BtnModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModifierActionPerformed
  Traitement metier = new Traitement();
        try { 
            String sex=null;
            if (radHom.isSelected()){
                    sex=String.valueOf(radHom.getText());
                                    }
            if (radFem.isSelected()){
                    sex=String.valueOf(radFem.getText());
                                    }
            
            if (JOptionPane.showConfirmDialog (null,"confirmer la modification","modification",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION) {
         String codeEmp=txtcode.getText();
        String nom=txtnom.getText();
        String prenom=txtprenom.getText();
        String adresse=jTextArea1.getText();
        String telephone=txttelephone.getText();
        String numeroSo=txtNum.getText();
              String service=listeService.getSelectedValue();  
Employe E1 = new Employe(codeEmp,nom, prenom, adresse,telephone,sex,service,numeroSo);
        metier.modifierEmploye(E1,codeEmp);
            }
        } catch (Exception e){JOptionPane.showMessageDialog(null,"erreur de modification !!!!!!!");
        System.err.println(e.getMessage());}
        
    }//GEN-LAST:event_BtnModifierActionPerformed

    private void BtnSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSupprimerActionPerformed
        try {
             if(JOptionPane.showConfirmDialog(null,"attention voullez_vous vraiment supprimer ce employée?"
                     ,"supprimer employe",JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION)
         
            if(txtcode.getText().length() != 0){
                 Traitement metier = new Traitement();
              String rech=txtcode.getText();
              metier.supprimerEmploye(rech);
             }
            else { JOptionPane.showMessageDialog(null,"veuillez remplire le champ code !");}
        
        }catch (Exception e){JOptionPane.showMessageDialog(null,"erreur de supprition \n"+e.getMessage());}         
    }//GEN-LAST:event_BtnSupprimerActionPerformed

    private void BtnRechercherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRechercherActionPerformed
         Traitement metier = new Traitement();
          
        try {
            model.setRowCount(0);
            ArrayList<Employe> list = metier.chercher(comborech.getSelectedItem().toString());
         //DefaultTableModel model=new  DefaultTableModel();
           Object[] row=new Object[8];
           for(int i =0;i<list.size();i++){
               row[0]=list.get(i).getCodeEmp();
                 row[1]=list.get(i).getNom();
                   row[2]=list.get(i).getPrenom();
                   row[3]=list.get(i).getAdresse();
                   row[4]=list.get(i).getTelephone();
                   row[5]=list.get(i).getSex();
                   row[6]=list.get(i).getService();
                   row[7]=list.get(i).getNumeroSo();
                     model.addRow(row);     
       }
               DTGV.setModel(model);
           if (model.getRowCount () == 0){JOptionPane.showMessageDialog(null,"il y a aucun employe avec ce code");
       
       }
       }catch (Exception e) { System.err.println(e);
       JOptionPane.showMessageDialog(null,e.getMessage());
       }
    }//GEN-LAST:event_BtnRechercherActionPerformed
 
    private void BtnQuitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnQuitterActionPerformed
    this.dispose();
    }//GEN-LAST:event_BtnQuitterActionPerformed

    private void comborechActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comborechActionPerformed

    }//GEN-LAST:event_comborechActionPerformed

    private void comborechItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comborechItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_comborechItemStateChanged

    private void btnPremierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPremierActionPerformed
        indice=0;
       deplacer(indice);
      
    }//GEN-LAST:event_btnPremierActionPerformed

    private void BtnPrecedantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPrecedantActionPerformed
       indice--;
       if(indice<0){
           indice=model.getRowCount()-1;       }
        deplacer(indice);
    }//GEN-LAST:event_BtnPrecedantActionPerformed

    private void btnDernierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDernierActionPerformed

        // TODO add your handling code here:
          indice=model.getRowCount()-1;
        deplacer(indice);
    }//GEN-LAST:event_btnDernierActionPerformed

    private void btnSuivantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuivantActionPerformed
        // TODO add your handling code here:
          indice++;
       if(indice>=model.getRowCount()){
           indice=0;       }
        deplacer(indice);
    }//GEN-LAST:event_btnSuivantActionPerformed

    private void radHomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radHomActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_radHomActionPerformed

    private void radFemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radFemActionPerformed
                 
        // TODO add your handling code here:
    }//GEN-LAST:event_radFemActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
societe s = new societe();
 s.setVisible(true);
                this.dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Gestion_des_employes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gestion_des_employes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gestion_des_employes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gestion_des_employes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gestion_des_employes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNActualiser;
    private javax.swing.JButton BTNNouveau;
    private javax.swing.JButton BtnAjouter;
    private javax.swing.JButton BtnModifier;
    private javax.swing.JButton BtnPrecedant;
    private javax.swing.JButton BtnQuitter;
    private javax.swing.JButton BtnRechercher;
    private javax.swing.JButton BtnSupprimer;
    private javax.swing.JTable DTGV;
    private javax.swing.JButton btnDernier;
    private javax.swing.JButton btnPremier;
    private javax.swing.JButton btnSuivant;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JComboBox<String> comborech;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private java.awt.Label label2;
    private javax.swing.JList<String> listeService;
    private javax.swing.JPanel panel;
    private javax.swing.JRadioButton radFem;
    private javax.swing.JRadioButton radHom;
    private javax.swing.JTextField txtNum;
    private javax.swing.JTextField txtcode;
    private javax.swing.JTextField txtnom;
    private javax.swing.JTextField txtprenom;
    private javax.swing.JTextField txttelephone;
    // End of variables declaration//GEN-END:variables
}
