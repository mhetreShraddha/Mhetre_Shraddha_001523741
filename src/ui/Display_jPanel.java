/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.Image;
import javax.swing.ImageIcon;
import model.Person_Info;

/**
 *
 * @author mhetr
 */
public class Display_jPanel extends javax.swing.JPanel {

    /**
     * Creates new form Display_jPanel
     */
    Person_Info personInfo;

    public Display_jPanel(Person_Info personInfo) {
        initComponents();
        this.personInfo = personInfo;
        displayData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_Dob = new javax.swing.JLabel();
        lbl_Ip = new javax.swing.JLabel();
        lbl_TeleNumber = new javax.swing.JLabel();
        lbl_bioIdentifier = new javax.swing.JLabel();
        lbl_FaxNumber = new javax.swing.JLabel();
        lbl_UniqId = new javax.swing.JLabel();
        lbl_EmailAddress = new javax.swing.JLabel();
        jText_bankAcNo = new javax.swing.JTextField();
        lbl_SocialSecurityNumber = new javax.swing.JLabel();
        lbl_MedicalRecordNumber = new javax.swing.JLabel();
        jText_licNo = new javax.swing.JTextField();
        jText_vehicleId = new javax.swing.JTextField();
        jTextName = new javax.swing.JTextField();
        jText_deviceId = new javax.swing.JTextField();
        jTextGeoData = new javax.swing.JTextField();
        jText_ipAdd = new javax.swing.JTextField();
        jTextDOb = new javax.swing.JTextField();
        jText_linkdn = new javax.swing.JTextField();
        jText_TeleNumber = new javax.swing.JTextField();
        jText_bioId = new javax.swing.JTextField();
        jText_FaxNumber = new javax.swing.JTextField();
        jText_uniId = new javax.swing.JTextField();
        jTextEmail = new javax.swing.JTextField();
        jTextSSN = new javax.swing.JTextField();
        jTextMedicalRecordNum = new javax.swing.JTextField();
        lbl_helthpnumber = new javax.swing.JLabel();
        jText_helthBenNo = new javax.swing.JTextField();
        lbl_accno = new javax.swing.JLabel();
        lbl_licNo = new javax.swing.JLabel();
        lbl_Title = new javax.swing.JLabel();
        lbl_vehIdentifier = new javax.swing.JLabel();
        lbl_Name = new javax.swing.JLabel();
        lbl_deviceIdentifier = new javax.swing.JLabel();
        lbl_GeographicData = new javax.swing.JLabel();
        lbl_linkdn = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        imageDisplayLabel = new javax.swing.JLabel();

        lbl_Dob.setText("Date of birth: ");

        lbl_Ip.setText("IP addresses:");

        lbl_TeleNumber.setText("Telephone numbers: ");

        lbl_bioIdentifier.setText("Biometric identifiers:");

        lbl_FaxNumber.setText("FAX number: ");

        lbl_UniqId.setText("Unique Identifire:");

        lbl_EmailAddress.setText("Email addresses: ");

        jText_bankAcNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_bankAcNoActionPerformed(evt);
            }
        });

        lbl_SocialSecurityNumber.setText("Social Security number: ");

        lbl_MedicalRecordNumber.setText("Medical record number: ");

        jText_licNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_licNoActionPerformed(evt);
            }
        });

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

        jText_ipAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_ipAddActionPerformed(evt);
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

        lbl_helthpnumber.setText("Health plan beneficiary number:");

        jText_helthBenNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_helthBenNoActionPerformed(evt);
            }
        });

        lbl_accno.setText("Bank account numbers:");

        lbl_licNo.setText("license number:");

        lbl_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Title.setText("Display Person Profile");

        lbl_vehIdentifier.setText("Vehicle identifier:");

        lbl_Name.setText("Name: ");

        lbl_deviceIdentifier.setText("Device identifiers:");

        lbl_GeographicData.setText("Geographic data: ");

        lbl_linkdn.setText("LinkedIn:");

        jLabel1.setText("Photo Of Person:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                    .addComponent(jTextSSN, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jText_TeleNumber, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextDOb, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jText_FaxNumber, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextMedicalRecordNum, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_GeographicData)
                                    .addComponent(lbl_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextName)
                                    .addComponent(jTextGeoData, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_helthpnumber)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jText_helthBenNo, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_Dob, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(imageDisplayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jText_bioId, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(jText_ipAdd, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jText_linkdn, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jText_deviceId, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jText_vehicleId, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jText_licNo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jText_bankAcNo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jText_uniId))
                        .addGap(49, 49, 49)))
                .addContainerGap())
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
                    .addComponent(lbl_MedicalRecordNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_helthpnumber)
                    .addComponent(jText_helthBenNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(imageDisplayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(217, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jText_bankAcNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_bankAcNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_bankAcNoActionPerformed

    private void jText_licNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_licNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_licNoActionPerformed

    private void jTextNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNameActionPerformed

    private void jTextGeoDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextGeoDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextGeoDataActionPerformed

    private void jText_ipAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_ipAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_ipAddActionPerformed

    private void jText_TeleNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_TeleNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_TeleNumberActionPerformed

    private void jText_FaxNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_FaxNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_FaxNumberActionPerformed

    private void jTextMedicalRecordNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextMedicalRecordNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextMedicalRecordNumActionPerformed

    private void jText_helthBenNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_helthBenNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_helthBenNoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imageDisplayLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextDOb;
    private javax.swing.JTextField jTextEmail;
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

    private void displayData() {
        jTextName.setText(personInfo.getName());
        jTextDOb.setText(personInfo.getDob());
        jTextEmail.setText(personInfo.getEmail_Address());
        jTextGeoData.setText(personInfo.getGeographic_Data());
        jTextMedicalRecordNum.setText(personInfo.getMedical_Record_Number());
        jTextSSN.setText(personInfo.getSocial_Security_Number());
        jText_FaxNumber.setText(personInfo.getFax_Number());
        jText_TeleNumber.setText(personInfo.getTelephone_Number());
        jText_bankAcNo.setText(personInfo.getBank_acc_no());
        jText_bioId.setText(personInfo.getBiometric_id());
        jText_deviceId.setText(personInfo.getDevice_identifiers());
        jText_helthBenNo.setText(personInfo.getHelth_Plan_Benificiary_Number());
        jText_ipAdd.setText(personInfo.getIp_add());
        jText_licNo.setText(personInfo.getLicence_no());
        jText_linkdn.setText(personInfo.getLinkedIn());
        jText_uniId.setText(personInfo.getUniId());
        jText_vehicleId.setText(personInfo.getVehicle_identifier());
        String imageFilename = personInfo.gettext();
        ImageIcon imgIcon = new ImageIcon(imageFilename);
        Image imFit = imgIcon.getImage();
        Image imgFit = imFit.getScaledInstance(289, 233, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgFit);
        imageDisplayLabel.setIcon(scaledIcon);
    }
}
