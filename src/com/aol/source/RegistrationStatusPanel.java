/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aol.source;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Neha
 */
public class RegistrationStatusPanel extends javax.swing.JPanel {

    /**
     * Creates new form RegistrationStatusPanel
     * @param parentFrame
     */
    public RegistrationStatusPanel(JFrame parentFrame ) {
        initComponents();
        registrationStatusButtonGroup = new ButtonGroup();
        registrationStatusButtonGroup.add(partPaidRadioButton);
        registrationStatusButtonGroup.add(fullPaidRadioButton);
        this.parentFrame=parentFrame;
        this.dBObjects=new ArrayList<>();
        try(MongoClient mongoClient=new MongoClient("localhost",27017)){
            DB db=mongoClient.getDB("AOLReg");
            DBCollection dBCollection=db.getCollection("CurrentCourses");
            try(DBCursor dBCursor=dBCollection.find()){
                while(dBCursor.hasNext()){
                    this.dBObjects.add(dBCursor.next());
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(parentFrame, e);
                e.printStackTrace();
            }
        }       
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RCourseIDLabel = new javax.swing.JLabel();
        partPaidRadioButton = new javax.swing.JRadioButton();
        fullPaidRadioButton = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        multiPTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        courseTypeComboBox = new javax.swing.JComboBox();
        courseIDComboBox = new javax.swing.JComboBox();
        makeFullPayment = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        modifyDetailsButtton = new javax.swing.JButton();

        setLayout(null);

        RCourseIDLabel.setText("CourseID");
        add(RCourseIDLabel);
        RCourseIDLabel.setBounds(40, 130, 70, 20);

        partPaidRadioButton.setText("Part Paid");
        partPaidRadioButton.setEnabled(false);
        partPaidRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                partPaidRadioButtonActionPerformed(evt);
            }
        });
        add(partPaidRadioButton);
        partPaidRadioButton.setBounds(80, 170, 140, 23);

        fullPaidRadioButton.setText("Full Paid");
        fullPaidRadioButton.setEnabled(false);
        fullPaidRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullPaidRadioButtonActionPerformed(evt);
            }
        });
        add(fullPaidRadioButton);
        fullPaidRadioButton.setBounds(80, 200, 140, 20);

        multiPTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        multiPTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                multiPTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(multiPTable);

        add(jScrollPane1);
        jScrollPane1.setBounds(300, 90, 482, 381);

        jLabel1.setText("Course Type");
        add(jLabel1);
        jLabel1.setBounds(40, 100, 70, 14);

        courseTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "---Select---","YES+!", "DSN", "Advance Meditation Program", "Sahaj Samadhi Meditation" }));
        courseTypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseTypeComboBoxActionPerformed(evt);
            }
        });
        add(courseTypeComboBox);
        courseTypeComboBox.setBounds(120, 100, 160, 20);

        courseIDComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"---Select---"  }));
        courseIDComboBox.setEnabled(false);
        courseIDComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseIDComboBoxActionPerformed(evt);
            }
        });
        add(courseIDComboBox);
        courseIDComboBox.setBounds(120, 130, 120, 20);

        makeFullPayment.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        makeFullPayment.setForeground(new java.awt.Color(51, 153, 255));
        makeFullPayment.setText("Make Full Paid");
        makeFullPayment.setEnabled(false);
        makeFullPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                makeFullPaymentActionPerformed(evt);
            }
        });
        add(makeFullPayment);
        makeFullPayment.setBounds(300, 30, 130, 50);

        deleteButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(255, 0, 0));
        deleteButton.setText("Delete");
        deleteButton.setEnabled(false);
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        add(deleteButton);
        deleteButton.setBounds(660, 30, 120, 50);

        modifyDetailsButtton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        modifyDetailsButtton.setForeground(new java.awt.Color(255, 153, 0));
        modifyDetailsButtton.setText("View/Modify Details");
        modifyDetailsButtton.setEnabled(false);
        modifyDetailsButtton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyDetailsButttonActionPerformed(evt);
            }
        });
        add(modifyDetailsButtton);
        modifyDetailsButtton.setBounds(450, 30, 190, 50);
    }// </editor-fold>//GEN-END:initComponents

    private void fullPaidRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullPaidRadioButtonActionPerformed
        // TODO add your handling code here:
        boolean hasData=false;
        String column[]={"Name","Mobile no.","Amt. Paid"}; 
        DefaultTableModel defaultTableModel=new DefaultTableModel(column, 0);
        try{        
            Iterator <DBObject> itr=this.participantsDBObjects.iterator();
            while(itr.hasNext()){
                DBObject dBObject=itr.next();
                if(dBObject.get("Payment Status").equals("Full")){
                    String name=dBObject.get("Name").toString();
                    String mobileNo=dBObject.get("Mobile No").toString();
                    String amountPaid=dBObject.get("Amount Paid").toString();
                    defaultTableModel.addRow(new Object[]{name,mobileNo,amountPaid});
                    hasData=true;
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(parentFrame, e);
            e.printStackTrace();
        }
        if(hasData){
            this.makeFullPayment.setEnabled(false);
            this.modifyDetailsButtton.setEnabled(true);
            this.deleteButton.setEnabled(true);
        }
        else{
            this.makeFullPayment.setEnabled(false);
            this.modifyDetailsButtton.setEnabled(false);
            this.deleteButton.setEnabled(false);
        }
        this.multiPTable.setModel(defaultTableModel);  
    }//GEN-LAST:event_fullPaidRadioButtonActionPerformed

    private void partPaidRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_partPaidRadioButtonActionPerformed
       // TODO add your handling code here:
        boolean hasData=false;
        String column[]={"Name","Mobile no.","Amt. Paid"}; 
        DefaultTableModel defaultTableModel=new DefaultTableModel(column, 0);
        try{        
            Iterator <DBObject> itr=this.participantsDBObjects.iterator();
            while(itr.hasNext()){
                DBObject dBObject=itr.next();
                if(dBObject.get("Payment Status").equals("Part")){
                    String name=dBObject.get("Name").toString();
                    String mobileNo=dBObject.get("Mobile No").toString();
                    String amountPaid=dBObject.get("Amount Paid").toString();
                    defaultTableModel.addRow(new Object[]{name,mobileNo,amountPaid});
                    hasData=true;
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(parentFrame, e);
        }
        if(hasData){
            this.makeFullPayment.setEnabled(true);
            this.modifyDetailsButtton.setEnabled(true);
            this.deleteButton.setEnabled(true);
        }
        else{
            this.makeFullPayment.setEnabled(false);
            this.modifyDetailsButtton.setEnabled(false);
            this.deleteButton.setEnabled(false);
        }
        this.multiPTable.setModel(defaultTableModel);         
    }//GEN-LAST:event_partPaidRadioButtonActionPerformed

    private void courseTypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseTypeComboBoxActionPerformed
    // TODO add your handling code here:
        this.populateCourseTypeComboBox();
    }//GEN-LAST:event_courseTypeComboBoxActionPerformed
    
    private void populateCourseTypeComboBox(){
        this.courseIDComboBox.setEnabled(false);
        this.makeFullPayment.setEnabled(false);
        this.modifyDetailsButtton.setEnabled(false);
        this.deleteButton.setEnabled(false);
        if(this.courseIDComboBox.getComponentCount()!=0){
            this.automatic=true;
            this.courseIDComboBox.removeAllItems();
            this.courseIDComboBox.addItem("---Select---");
        }
        boolean flag=false;
        Iterator <DBObject> itr=this.dBObjects.iterator();
        while(itr.hasNext()){
            DBObject dBObject=itr.next();
            String courseType=dBObject.get("CourseType").toString();
            if(courseType.equals(this.courseTypeComboBox.getSelectedItem().toString())){
                this.courseIDComboBox.addItem(dBObject.get("CourseID").toString());                        
                flag=true;
            }
        }
        if(flag)            
            this.courseIDComboBox.setEnabled(true);
        this.registrationStatusButtonGroup.clearSelection();
        this.partPaidRadioButton.setEnabled(false);
        this.fullPaidRadioButton.setEnabled(false);
        this.automatic=false;
    }
    
    private void courseIDComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseIDComboBoxActionPerformed
        // TODO add your handling code here:
        this.makeFullPayment.setEnabled(false);
        this.modifyDetailsButtton.setEnabled(false);
        this.deleteButton.setEnabled(false);
        this.partPaidRadioButton.setEnabled(true);
        this.fullPaidRadioButton.setEnabled(true);
        if(this.automatic==false)
            this.populateParticipantsDBobject();        
    }//GEN-LAST:event_courseIDComboBoxActionPerformed

    private void populateParticipantsDBobject(){
        this.participantsDBObjects=new ArrayList<>();
        try(MongoClient mongoClient=new MongoClient("localhost",27017)){
            DB db=mongoClient.getDB("AOLReg");
            DBCollection dbCollection=db.getCollection(this.courseIDComboBox.getSelectedItem().toString());
            try(DBCursor dBCursor=dbCollection.find()){
                while(dBCursor.hasNext()){
                    DBObject dBObject=dBCursor.next();
                    this.participantsDBObjects.add(dBObject);
                }
            }
            dbCollection=db.getCollection("CurrentCourses");
            BasicDBObject basicDBObject=new BasicDBObject("CourseID",this.courseIDComboBox.getSelectedItem());
            try(DBCursor dBCursor=dbCollection.find(basicDBObject)){            
                if(dBCursor.hasNext()){
                    DBObject dBObject=dBCursor.next();
                    this.requiredAmount=Integer.valueOf(dBObject.get("Amount").toString());
                }
            }
        }
    }
    
    private void multiPTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_multiPTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_multiPTableMouseClicked

    private void makeFullPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_makeFullPaymentActionPerformed
        // TODO add your handling code here:
        int i=this.multiPTable.getSelectedRow();
        if(i>-1){
            Integer amtPaid=Integer.valueOf(this.multiPTable.getValueAt(i,2).toString());
            Integer amtToBePaid=requiredAmount-amtPaid;
            int choice=JOptionPane.showConfirmDialog(this, "Add Rs "+amtToBePaid+" to Amout Paid?");
            if(choice==JOptionPane.OK_OPTION){
                String name=this.multiPTable.getValueAt(i, 0).toString();
                String number=this.multiPTable.getValueAt(i,1).toString();
                try(MongoClient mongoClient=new MongoClient("localhost",27017)){
                    DB db=mongoClient.getDB("AOLReg");
                    DBCollection dBCollection=db.getCollection(this.courseIDComboBox.getSelectedItem().toString());
                    BasicDBObject basicDBObject=new BasicDBObject("Name",name)
                            .append("Mobile No", number);
                    BasicDBObject bObject=new BasicDBObject("$set",new BasicDBObject("Amount Paid",this.requiredAmount)
                                                    .append("Payment Status", "Full"));
                    dBCollection.update(basicDBObject, bObject);
                    ((DefaultTableModel)this.multiPTable.getModel()).removeRow(i);
                    
                    JOptionPane.showMessageDialog(parentFrame, "Payment Converted to Full for "+name+", Mobile Number "+number+" !");
                    this.populateCourseTypeComboBox();
                }catch(Exception e){
                    JOptionPane.showMessageDialog(parentFrame, e);
                    e.printStackTrace();
                }
            }
        }
        else 
            JOptionPane.showMessageDialog(this, "Select a Record First!");
    }//GEN-LAST:event_makeFullPaymentActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        int i=this.multiPTable.getSelectedRow();
        if(i>-1){
            int choice=JOptionPane.showConfirmDialog(this, "Are You Sure?");
            if(choice==JOptionPane.OK_OPTION){
                String name=this.multiPTable.getValueAt(i, 0).toString();
                String number=this.multiPTable.getValueAt(i, 1).toString();
                try(MongoClient client=new MongoClient("localhost",27017)){
                    DB db=client.getDB("AOLReg");
                    DBCollection dBCollection=db.getCollection(this.courseIDComboBox.getSelectedItem().toString());
                    BasicDBObject basicDBObject=new BasicDBObject("Name",name)
                            .append("Mobile No", number);
                    dBCollection.remove(basicDBObject);
                    ((DefaultTableModel)this.multiPTable.getModel()).removeRow(i);
                    JOptionPane.showMessageDialog(this, "Record Deleted Successfully!");
                }catch(Exception e){
                    JOptionPane.showMessageDialog(parentFrame, e);
                }
            }
            
        }
        else 
            JOptionPane.showMessageDialog(this, "Select a Record First!"); 
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void reset(){
        this.courseTypeComboBox.removeAllItems();
        this.courseIDComboBox.removeAllItems();
    }
    private void modifyDetailsButttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyDetailsButttonActionPerformed
        // TODO add your handling code here:
        int i=this.multiPTable.getSelectedRow();
        if(i>-1){
            String name=this.multiPTable.getValueAt(i, 0).toString();
            String number=this.multiPTable.getValueAt(i, 1).toString();
            this.setVisible(false);
            ModifyFrame frame=new ModifyFrame(name, number, this.courseIDComboBox.getSelectedItem().toString(),this);
            frame.setVisible(true);
        }
        else 
            JOptionPane.showMessageDialog(parentFrame, "Select a Record First!"); 
    }//GEN-LAST:event_modifyDetailsButttonActionPerformed
    
    private JFrame parentFrame;
    private boolean automatic=false;
    private ArrayList<DBObject> dBObjects,participantsDBObjects;
    private Integer requiredAmount=null;
    private ButtonGroup registrationStatusButtonGroup;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel RCourseIDLabel;
    private javax.swing.JComboBox courseIDComboBox;
    private javax.swing.JComboBox courseTypeComboBox;
    private javax.swing.JButton deleteButton;
    private javax.swing.JRadioButton fullPaidRadioButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton makeFullPayment;
    private javax.swing.JButton modifyDetailsButtton;
    private javax.swing.JTable multiPTable;
    private javax.swing.JRadioButton partPaidRadioButton;
    // End of variables declaration//GEN-END:variables
}