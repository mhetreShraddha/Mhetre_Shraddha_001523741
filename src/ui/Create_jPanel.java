/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.io.File;
import java.util.regex.Pattern;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import model.Person_Info;

/**
 *
 * @author mhetr
 */
public class Create_jPanel extends javax.swing.JPanel {

    /**
     * Creates new form Create_jPanel
     */
    Person_Info personInfo;
    
    public Create_jPanel(Person_Info personInfo) {
        initComponents();
        this.personInfo = personInfo;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_Title = new javax.swing.JLabel();
        lbl_Name = new javax.swing.JLabel();
        lbl_GeographicData = new javax.swing.JLabel();
        lbl_Dob = new javax.swing.JLabel();
        lbl_TeleNumber = new javax.swing.JLabel();
        lbl_FaxNumber = new javax.swing.JLabel();
        lbl_EmailAddress = new javax.swing.JLabel();
        lbl_SocialSecurityNumber = new javax.swing.JLabel();
        lbl_MedicalRecordNumber = new javax.swing.JLabel();
        jTextName = new javax.swing.JTextField();
        jTextGeoData = new javax.swing.JTextField();
        jTextDOb = new javax.swing.JTextField();
        jText_TeleNumber = new javax.swing.JTextField();
        jText_FaxNumber = new javax.swing.JTextField();
        jTextEmail = new javax.swing.JTextField();
        jTextSSN = new javax.swing.JTextField();
        jTextMedicalRecordNum = new javax.swing.JTextField();
        btn_Save = new javax.swing.JButton();
        lbl_helthpnumber = new javax.swing.JLabel();
        jText_helthBenNo = new javax.swing.JTextField();
        lbl_accno = new javax.swing.JLabel();
        lbl_licNo = new javax.swing.JLabel();
        lbl_vehIdentifier = new javax.swing.JLabel();
        lbl_deviceIdentifier = new javax.swing.JLabel();
        lbl_linkdn = new javax.swing.JLabel();
        lbl_Ip = new javax.swing.JLabel();
        lbl_bioIdentifier = new javax.swing.JLabel();
        lbl_UniqId = new javax.swing.JLabel();
        jText_bankAcNo = new javax.swing.JTextField();
        jText_licNo = new javax.swing.JTextField();
        jText_vehicleId = new javax.swing.JTextField();
        jText_deviceId = new javax.swing.JTextField();
        jText_ipAdd = new javax.swing.JTextField();
        jText_linkdn = new javax.swing.JTextField();
        jText_bioId = new javax.swing.JTextField();
        jText_uniId = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        lbl_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Title.setText("Create Person Profile");

        lbl_Name.setText("Name: ");

        lbl_GeographicData.setText("Geographic data: ");

        lbl_Dob.setText("Date of birth: ");

        lbl_TeleNumber.setText("Telephone numbers: ");

        lbl_FaxNumber.setText("FAX number: ");

        lbl_EmailAddress.setText("Email addresses: ");

        lbl_SocialSecurityNumber.setText("Social Security number: ");

        lbl_MedicalRecordNumber.setText("Medical record number: ");

        jTextName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNameActionPerformed(evt);
            }
        });

        jTextGeoData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextGeoDataActionPerformed(evt);
            }
        });

        jText_TeleNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_TeleNumberActionPerformed(evt);
            }
        });

        jText_FaxNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_FaxNumberActionPerformed(evt);
            }
        });

        jTextMedicalRecordNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextMedicalRecordNumActionPerformed(evt);
            }
        });

        btn_Save.setText("SAVE");
        btn_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SaveActionPerformed(evt);
            }
        });

        lbl_helthpnumber.setText("Health plan beneficiary number:");

        jText_helthBenNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_helthBenNoActionPerformed(evt);
            }
        });

        lbl_accno.setText("Bank account numbers:");

        lbl_licNo.setText("license number:");

        lbl_vehIdentifier.setText("Vehicle identifier:");

        lbl_deviceIdentifier.setText("Device identifiers:");

        lbl_linkdn.setText("LinkedIn:");

        lbl_Ip.setText("IP addresses:");

        lbl_bioIdentifier.setText("Biometric identifiers:");

        lbl_UniqId.setText("Unique Identifire:");

        jText_bankAcNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_bankAcNoActionPerformed(evt);
            }
        });

        jText_licNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_licNoActionPerformed(evt);
            }
        });

        jText_ipAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_ipAddActionPerformed(evt);
            }
        });

        jButton1.setText("Upload Image");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_SocialSecurityNumber)
                            .addComponent(lbl_TeleNumber)
                            .addComponent(lbl_FaxNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_EmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_MedicalRecordNumber))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextSSN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                            .addComponent(jTextEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jText_TeleNumber, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextDOb, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jText_FaxNumber, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextMedicalRecordNum)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_GeographicData)
                            .addComponent(lbl_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextName, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                            .addComponent(jTextGeoData)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(234, 234, 234)
                                .addComponent(btn_Save, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbl_Dob, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_helthpnumber)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jText_helthBenNo, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_accno)
                            .addComponent(lbl_licNo)
                            .addComponent(lbl_vehIdentifier)
                            .addComponent(lbl_deviceIdentifier)
                            .addComponent(lbl_linkdn)
                            .addComponent(lbl_Ip)
                            .addComponent(lbl_bioIdentifier)
                            .addComponent(lbl_UniqId))
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jText_licNo)
                            .addComponent(jText_vehicleId)
                            .addComponent(jText_deviceId)
                            .addComponent(jText_linkdn)
                            .addComponent(jText_ipAdd)
                            .addComponent(jText_bioId)
                            .addComponent(jText_uniId)
                            .addComponent(jText_bankAcNo))))
                .addGap(191, 191, 191))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_Name)
                            .addComponent(jTextName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_accno)
                            .addComponent(jText_bankAcNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_GeographicData)
                            .addComponent(jTextGeoData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_licNo)
                            .addComponent(jText_licNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextDOb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_vehIdentifier)
                            .addComponent(jText_vehicleId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Dob))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_deviceIdentifier)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jText_TeleNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbl_TeleNumber)))
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jText_deviceId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jText_linkdn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_linkdn)
                        .addComponent(jText_FaxNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_FaxNumber)))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_EmailAddress)
                    .addComponent(jTextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Ip)
                    .addComponent(jText_ipAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_SocialSecurityNumber)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextSSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_bioIdentifier)
                        .addComponent(jText_bioId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextMedicalRecordNum)
                        .addComponent(lbl_UniqId)
                        .addComponent(jText_uniId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbl_MedicalRecordNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_helthpnumber)
                    .addComponent(jText_helthBenNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 244, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(btn_Save, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextGeoDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextGeoDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextGeoDataActionPerformed

    private void jTextNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNameActionPerformed

    private void jTextMedicalRecordNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextMedicalRecordNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextMedicalRecordNumActionPerformed

    private void jText_TeleNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_TeleNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_TeleNumberActionPerformed

    private void jText_FaxNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_FaxNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_FaxNumberActionPerformed

    private void btn_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SaveActionPerformed
        // TODO add your handling code here:
        
 // TODO add your handling code here:
        boolean flag= true;
        String dateRegEx="([0-9]{2})/([0-9]{2})/([0-9]{4})";
        String emailRegEx= "^([\\w-\\.]+){1,64}@([\\w&&[^_]]+){2,255}.[a-z]{2,}$";
        if(jTextName.getText().length() == 0){ // Mandatory Valdation
            JOptionPane.showMessageDialog(this, "Please Enter Name");
            flag= false;
            return;
        }
        if(jTextGeoData.getText().length() == 0){ // Mandatory Valdation
            JOptionPane.showMessageDialog(this, "Please Enter Geographic data");
            flag= false;
            return;
        }
        if(jTextMedicalRecordNum.getText().length() == 0){ // Mandatory Valdation
            JOptionPane.showMessageDialog(this, "Please Enter Medical record number");
            flag= false;
            return;
        }if(jTextSSN.getText().length() == 0){ // Mandatory Valdation
            JOptionPane.showMessageDialog(this, "Please Enter Social Security number");
            flag= false;
            return;
        }if(jText_FaxNumber.getText().length() == 0){ // Mandatory Valdation
            JOptionPane.showMessageDialog(this, "Please Enter FAX number");
            flag= false;
            return;
        }if(jText_bankAcNo.getText().length() == 0){ // Mandatory Valdation
            JOptionPane.showMessageDialog(this, "Please Enter Bank account numbers");
            flag= false;
            return;
        }if(jText_bioId.getText().length() == 0){ // Mandatory Valdation
            JOptionPane.showMessageDialog(this, "Please Enter Biometric identifiers");
            flag= false;
            return;
        }if(jText_helthBenNo.getText().length() == 0){ // Mandatory Valdation
            JOptionPane.showMessageDialog(this, "Please Enter Health plan beneficiary number");
            flag= false;
            return;
        }if(jText_linkdn.getText().length() == 0){ // Mandatory Valdation
            JOptionPane.showMessageDialog(this, "Please Enter LinkedIn");
            flag= false;
            return;
        }if(jText_ipAdd.getText().length() == 0){ // Mandatory Valdation
            JOptionPane.showMessageDialog(this, "Please Enter IP Address");
            flag= false;
            return;
        }if(jText_uniId.getText().length() == 0){ // Mandatory Valdation
            JOptionPane.showMessageDialog(this, "Please Enter Unique Identifire");
            flag= false;
            return;
        }if(jText_vehicleId.getText().length() == 0){ // Mandatory Valdation
            JOptionPane.showMessageDialog(this, "Please Enter vehicle Identifier");
            flag= false;
            return;
        }if(jText_TeleNumber.getText().toString().length() < 10){
            JOptionPane.showMessageDialog(this, "Please Enter Valid Telephone Number");
            flag= false;
            return;
        }
        System.out.println(Pattern.matches(dateRegEx, jTextDOb.getText()));
        if(Pattern.matches(dateRegEx, jTextDOb.getText()) == false){
            JOptionPane.showMessageDialog(this, "Please Enter Valid Date Of Birth!! Enter Date In Following Format(DD/MM/YYYY)");
            flag= false;
            return;
        }   
        if(Pattern.matches(emailRegEx, jTextEmail.getText()) == false){
            JOptionPane.showMessageDialog(this, "Please Enter Valid Email Address!!");
            flag= false;
            return;
        }
        if(flag){
            personInfo.setName(jTextName.getText());
            personInfo.setGeographic_Data(jTextGeoData.getText());
            personInfo.setDob(jTextDOb.getText());
            personInfo.setTelephone_Number(jText_TeleNumber.getText());
            personInfo.setFax_Number(jText_FaxNumber.getText());
            personInfo.setSocial_Security_Number(jTextSSN.getText());
            personInfo.setEmail_Address(jTextEmail.getText());
            personInfo.setMedical_Record_Number(jTextMedicalRecordNum.getText());
            personInfo.setHelth_Plan_Benificiary_Number(jText_helthBenNo.getText());
            personInfo.setBank_acc_no(jText_bankAcNo.getText());
            personInfo.setBiometric_id(jText_bioId.getText());
            personInfo.setDevice_identifiers(jText_deviceId.getText());
            personInfo.setIp_add(jText_ipAdd.getText());
            personInfo.setLicence_no(jText_licNo.getText());
            personInfo.setLinkedIn(jText_linkdn.getText());
            personInfo.setVehicle_identifier(jText_vehicleId.getText());
            personInfo.setUniId(jText_uniId.getText());
            personInfo.setText(jTextField1.getText());

            JOptionPane.showMessageDialog(this, "Person Information Saved");
        }
    }//GEN-LAST:event_btn_SaveActionPerformed

    private void jText_helthBenNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_helthBenNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_helthBenNoActionPerformed

    private void jText_bankAcNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_bankAcNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_bankAcNoActionPerformed

    private void jText_licNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_licNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_licNoActionPerformed

    private void jText_ipAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_ipAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_ipAddActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File fImg = chooser.getSelectedFile();
        String imageFilename = fImg.getAbsolutePath();
        jTextField1.setText(imageFilename);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Save;
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField jTextDOb;
    private javax.swing.JTextField jTextEmail;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextGeoData;
    private javax.swing.JTextField jTextMedicalRecordNum;
    private javax.swing.JTextField jTextName;
    private javax.swing.JTextField jTextSSN;
    private javax.swing.JTextField jText_FaxNumber;
    private javax.swing.JTextField jText_TeleNumber;
    private javax.swing.JTextField jText_bankAcNo;
    private javax.swing.JTextField jText_bioId;
    private javax.swing.JTextField jText_deviceId;
    private javax.swing.JTextField jText_helthBenNo;
    private javax.swing.JTextField jText_ipAdd;
    private javax.swing.JTextField jText_licNo;
    private javax.swing.JTextField jText_linkdn;
    private javax.swing.JTextField jText_uniId;
    private javax.swing.JTextField jText_vehicleId;
    private javax.swing.JLabel lbl_Dob;
    private javax.swing.JLabel lbl_EmailAddress;
    private javax.swing.JLabel lbl_FaxNumber;
    private javax.swing.JLabel lbl_GeographicData;
    private javax.swing.JLabel lbl_Ip;
    private javax.swing.JLabel lbl_MedicalRecordNumber;
    private javax.swing.JLabel lbl_Name;
    private javax.swing.JLabel lbl_SocialSecurityNumber;
    private javax.swing.JLabel lbl_TeleNumber;
    private javax.swing.JLabel lbl_Title;
    private javax.swing.JLabel lbl_UniqId;
    private javax.swing.JLabel lbl_accno;
    private javax.swing.JLabel lbl_bioIdentifier;
    private javax.swing.JLabel lbl_deviceIdentifier;
    private javax.swing.JLabel lbl_helthpnumber;
    private javax.swing.JLabel lbl_licNo;
    private javax.swing.JLabel lbl_linkdn;
    private javax.swing.JLabel lbl_vehIdentifier;
    // End of variables declaration//GEN-END:variables
}