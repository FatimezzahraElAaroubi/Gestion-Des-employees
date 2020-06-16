
import gestion.des.employes.Employe;
import gestion.des.employes.societer;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class societe extends javax.swing.JFrame {

    int indice;
 DefaultTableModel model=new  DefaultTableModel();
    public societe() {
        initComponents();
        operations metier = new operations();
         ArrayList<societer> list = metier.afficheSoc(); 
         Object[] columns =new  Object[6];
         columns[0]="Numero";
         columns[1]="nom";
          columns[2]="raison_social";
           columns[3]="ville";
            columns[4]="telephone";
             columns[5]="adresse";
           model.setColumnIdentifiers(columns);
          Object[] rowData=new Object[6];
          for(int i =0;i<list.size();i++)
          {
               rowData[0]=list.get(i).getNumero();
              rowData[1]=list.get(i).getNom();
               rowData[2]=list.get(i).getAdreese();
                rowData[3]=list.get(i).getRaison_sociale();
                 rowData[4]=list.get(i).getTelephone();
                  rowData[5]=list.get(i).getVille();
                model.addRow(rowData);
              
          }
            table.setModel(model);
    }
 private void deplacer(int i){
       try {     //i represente les ligne 
     
          txtNum.setText(model.getValueAt (i, 0).toString());
        txtNom.setText(model.getValueAt (i, 1).toString());
        txtAdresse.setText(model.getValueAt (i, 2).toString());
        txtRai.setText(model.getValueAt (i, 3).toString());
        txtTel.setText(model.getValueAt (i, 4).toString());
         txtVille.setText(model.getValueAt (i, 5).toString());
       }catch (Exception e){ System.out.println(e.getMessage());}
      }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNum = new javax.swing.JTextField();
        txtVille = new javax.swing.JTextField();
        txtAdresse = new javax.swing.JTextField();
        txtTel = new javax.swing.JTextField();
        txtRai = new javax.swing.JTextField();
        txtNom = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        txtRech = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Algerian", 3, 24)); // NOI18N
        jLabel1.setText("Gestion Société");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 230, 59));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(null);

        jLabel7.setText("Telephone:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 162, 70, 14);

        jLabel6.setText("Adresse");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 99, 50, 14);

        jLabel5.setText("Ville:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 199, 30, 14);

        jLabel3.setText("Nom");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(11, 61, 30, 14);

        jLabel4.setText("Numero:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 23, 50, 14);
        jPanel1.add(txtNum);
        txtNum.setBounds(122, 16, 156, 29);
        jPanel1.add(txtVille);
        txtVille.setBounds(122, 90, 156, 32);
        jPanel1.add(txtAdresse);
        txtAdresse.setBounds(122, 127, 156, 29);
        jPanel1.add(txtTel);
        txtTel.setBounds(122, 162, 154, 31);
        jPanel1.add(txtRai);
        txtRai.setBounds(122, 199, 155, 31);
        jPanel1.add(txtNom);
        txtNom.setBounds(122, 51, 156, 32);

        jLabel8.setText("Raison_Sociale:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(10, 134, 100, 14);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 310, 260));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jButton3.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/icons8-new-30.png"))); // NOI18N
        jButton3.setText("nouveau");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/icons8-edit-file-30.png"))); // NOI18N
        jButton7.setText("Modifier");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/icons8-delete-bin-30.png"))); // NOI18N
        jButton2.setText("Supprimer");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/icons8-plus-30.png"))); // NOI18N
        jButton5.setText("Ajouter");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addGap(18, 18, 18))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 200, 230));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        jButton4.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/icons8-sync-30.png"))); // NOI18N
        jButton4.setText("Actualiser");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        jButton6.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/rechercher.png"))); // NOI18N
        jButton6.setText("Rechercher");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Rechercher par  Numero:");

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/icons8-show-property-30.png"))); // NOI18N
        jButton1.setText("voir liste des employés");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/icons8-undo-30.png"))); // NOI18N
        jButton8.setText("Retour");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/icons8-logout-rounded-up-30.png"))); // NOI18N
        jButton9.setText("Quitter");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jButton8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 302, Short.MAX_VALUE)
                                .addComponent(jButton9))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(txtRech, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton6))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(217, 217, 217))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRech, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 580, 230));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/projetJava.jpg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 610, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
  txtNum.setText("");
        txtNom.setText("");
         txtVille.setText("");
          txtAdresse.setText("");
           txtTel.setText("");
             txtRai.setText("");
// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
  try {  int i=table.getSelectedRow();
            deplacer(i);
            //sa si quant on choisir un nom dans le tableau il va afficher sur les fieldtext
        }
        catch (Exception e){System.out.println(e.getMessage());}
        // TODO add your handling code here:
    }//GEN-LAST:event_tableMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         model.setRowCount(0);
         operations metier = new operations();
         ArrayList<societer> list = metier.afficheSoc();
         Object[] columns =new  Object[6];
         columns[0]="Numero";
         columns[1]="nom";
          columns[2]="raison_social";
           columns[3]="ville";
            columns[4]="telephone";
             columns[5]="adresse";
           model.setColumnIdentifiers(columns);
          Object[] rowData=new Object[6];
          for(int i =0;i<list.size();i++)
          {
               rowData[0]=list.get(i).getNumero();
              rowData[1]=list.get(i).getNom();
               rowData[2]=list.get(i).getAdreese();
                rowData[3]=list.get(i).getRaison_sociale();
                 rowData[4]=list.get(i).getTelephone();
                  rowData[5]=list.get(i).getVille();
                model.addRow(rowData);
              
          }
            table.setModel(model);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
 operations metier = new operations();
        try { 
           
            
            if (JOptionPane.showConfirmDialog (null,"confirmer la modification","modification",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION) {
         int num=Integer.parseInt(txtNum.getText());
        String nom=txtNom.getText();
        String adresse=txtAdresse.getText();
        String tel=txtTel.getText();
        String raison=txtRai.getText();
        String ville=txtVille.getText();
         
societer E1 = new societer(num,nom,adresse,tel,raison,ville);
        metier.modifierSocieter(E1,num);
            }
        } catch (Exception e){JOptionPane.showMessageDialog(null,"erreur de modification !!!!!!!");
        System.err.println(e.getMessage());}
        
            
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
try {
             if(JOptionPane.showConfirmDialog(null,"attention voullez_vous vraiment supprimer cette societer?"
                     ,"supprimer societer",JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION)
         
            if(txtNum.getText().length() != 0){
                 operations metier = new operations();
              String rech=txtNum.getText();
              metier.supprimerSocieter(rech);
             }
            else { JOptionPane.showMessageDialog(null,"veuillez remplire le champ num !");}
        
        }catch (Exception e){JOptionPane.showMessageDialog(null,"erreur de supprition \n"+e.getMessage());}   
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
operations metier = new operations();
          
        try {
            model.setRowCount(0);
            ArrayList<societer> list = metier.chercher(txtRech.getText());
         //DefaultTableModel model=new  DefaultTableModel();
           Object[] row=new Object[6];
           for(int i =0;i<list.size();i++){
               row[0]=list.get(i).getNumero();
              row[1]=list.get(i).getNom();
               row[2]=list.get(i).getAdreese();
                row[3]=list.get(i).getRaison_sociale();
                 row[4]=list.get(i).getTelephone();
                  row[5]=list.get(i).getVille();
                model.addRow(row);     
       }
               table.setModel(model);
           if (model.getRowCount () == 0){JOptionPane.showMessageDialog(null,"il y a aucun societe avec ce numero");
       
       }
       }catch (Exception e) { System.err.println(e);
       JOptionPane.showMessageDialog(null,e.getMessage());
       }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

     operations metier = new operations();
             try{
        int Num=Integer.parseInt(txtNum.getText());
        String nom=txtNom.getText();
        String adresse=txtAdresse.getText();
        String Raison=txtRai.getText();
        String telephone=txtTel.getText();
        String ville=txtVille.getText();
         if (txtNum.getText().equals("") || txtNom.getText().equals("") || txtAdresse.getText().equals("")
                || txtVille.getText().equals("") || txtTel.getText().equals("") || txtRai.getText().equals("")
                ){
            JOptionPane.showMessageDialog(this, "SVP entrer les informations complete");
        } else {
           societer S = new societer(Num,nom, adresse, Raison,telephone,ville);
           metier.ajouterSoc(S);
             JOptionPane.showMessageDialog(this,"Bien Ajouter");
               }
               }catch(Exception e){
       JOptionPane.showMessageDialog(null,"veuillez changer le code parce que est déja attribue pour une autre société ");
    }//GEN-LAST:event_jButton5ActionPerformed
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            this.dispose();
            liste l = new liste();
            l.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
this.dispose();
        
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

             Gestion_des_employes E = new Gestion_des_employes();
             E.setVisible(true);
              this.dispose();
    }//GEN-LAST:event_jButton8ActionPerformed
  
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
            java.util.logging.Logger.getLogger(societe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(societe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(societe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(societe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new societe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtAdresse;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtNum;
    private javax.swing.JTextField txtRai;
    private javax.swing.JTextField txtRech;
    private javax.swing.JTextField txtTel;
    private javax.swing.JTextField txtVille;
    // End of variables declaration//GEN-END:variables
}
