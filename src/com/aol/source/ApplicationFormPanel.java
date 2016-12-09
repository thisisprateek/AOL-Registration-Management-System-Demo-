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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Kaushal
 */
public class ApplicationFormPanel extends javax.swing.JPanel {

    /**
     * Creates new form ApplicationFormPanel
     * @param parentFrame
     */
    public ApplicationFormPanel(JFrame parentFrame) {
        initComponents();
        this.parentFrame=parentFrame;
        genderButtonGroup = new ButtonGroup();
        genderButtonGroup.add(MaleRadioButton);
        genderButtonGroup.add(FemaleRadioButton);
        maritalStatusButtonGroup = new ButtonGroup();
        maritalStatusButtonGroup.add(MarriedRadioButton);
        maritalStatusButtonGroup.add(UnmarriedRadioButton);
        this.calendarPanel.setVisible(false);
        this.calendarOkButton.setVisible(false);
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

        jButton1 = new javax.swing.JButton();
        CourseTypeLabel = new javax.swing.JLabel();
        courseTypeComboBox = new javax.swing.JComboBox();
        NameLabel = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        MaleRadioButton = new javax.swing.JRadioButton();
        FemaleRadioButton = new javax.swing.JRadioButton();
        MarriedRadioButton = new javax.swing.JRadioButton();
        UnmarriedRadioButton = new javax.swing.JRadioButton();
        addressLabel = new javax.swing.JLabel();
        ProfessionalLabel = new javax.swing.JLabel();
        professionTextField = new javax.swing.JTextField();
        mobileNoLabel = new javax.swing.JLabel();
        EmailIDLabel = new javax.swing.JLabel();
        emailIDTextField = new javax.swing.JTextField();
        DOBLabel = new javax.swing.JLabel();
        dobTextField = new javax.swing.JTextField();
        FacultyNameLabel = new javax.swing.JLabel();
        facultyNameTextField = new javax.swing.JTextField();
        SubmitButton = new javax.swing.JButton();
        mobileNoFormattedTextField = new javax.swing.JFormattedTextField();
        ACourseIDLabel = new javax.swing.JLabel();
        calendarOkButton = new javax.swing.JButton();
        courseIDComboBox = new javax.swing.JComboBox();
        calendarPanel = new de.wannawork.jcalendar.JCalendarPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        addressTextArea = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        commenceDateTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        venueTextField = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        amtPaidTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        amtToBePaidTextField = new javax.swing.JTextField();

        jButton1.setText("jButton1");

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CourseTypeLabel.setText("Course Type");
        add(CourseTypeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 47, 80, 20));

        courseTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "---Select---","YES+!", "DSN", "Advance Meditation Program", "Sahaj Samadhi Meditation" }));
        courseTypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseTypeComboBoxActionPerformed(evt);
            }
        });
        add(courseTypeComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 240, 30));

        NameLabel.setText("Name");
        add(NameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 61, 20));

        nameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextFieldActionPerformed(evt);
            }
        });
        add(nameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 240, 30));

        MaleRadioButton.setText("Male");
        MaleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaleRadioButtonActionPerformed(evt);
            }
        });
        add(MaleRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 61, -1));

        FemaleRadioButton.setText("Female");
        FemaleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FemaleRadioButtonActionPerformed(evt);
            }
        });
        add(FemaleRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 100, -1));

        MarriedRadioButton.setText("Married");
        MarriedRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarriedRadioButtonActionPerformed(evt);
            }
        });
        add(MarriedRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, -1, -1));

        UnmarriedRadioButton.setText("Unmarried");
        UnmarriedRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UnmarriedRadioButtonActionPerformed(evt);
            }
        });
        add(UnmarriedRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 100, -1));

        addressLabel.setText("Address");
        add(addressLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, 70, -1));

        ProfessionalLabel.setText("Profession");
        add(ProfessionalLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 70, -1));

        professionTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                professionTextFieldActionPerformed(evt);
            }
        });
        add(professionTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 100, 240, 30));

        mobileNoLabel.setText("Mobile No.");
        add(mobileNoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, 70, -1));

        EmailIDLabel.setText("E-mail Id");
        add(EmailIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, 60, -1));
        add(emailIDTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, 240, 30));

        DOBLabel.setText("DOB");
        add(DOBLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 61, 20));

        dobTextField.setEditable(false);
        dobTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dobTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                dobTextFieldFocusLost(evt);
            }
        });
        dobTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dobTextFieldActionPerformed(evt);
            }
        });
        add(dobTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 80, 30));

        FacultyNameLabel.setText("Faculty Name");
        add(FacultyNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 390, 76, -1));

        facultyNameTextField.setEditable(false);
        facultyNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facultyNameTextFieldActionPerformed(evt);
            }
        });
        add(facultyNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 380, 130, 30));

        SubmitButton.setText("Submit");
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });
        add(SubmitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 440, 110, 30));

        mobileNoFormattedTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobileNoFormattedTextFieldActionPerformed(evt);
            }
        });
        add(mobileNoFormattedTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 200, 240, 30));

        ACourseIDLabel.setText("CourseID");
        add(ACourseIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 84, 61, 20));

        calendarOkButton.setText("Ok");
        calendarOkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calendarOkButtonActionPerformed(evt);
            }
        });
        add(calendarOkButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, -1, 20));

        courseIDComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"---Select---"}));
        courseIDComboBox.setEnabled(false);
        courseIDComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseIDComboBoxActionPerformed(evt);
            }
        });
        add(courseIDComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 240, 30));

        calendarPanel.setBackground(new java.awt.Color(51, 255, 255));
        calendarPanel.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                calendarPanelStateChanged(evt);
            }
        });
        add(calendarPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 140, 180));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 0, 310));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 10, 420));

        jLabel1.setText("Marital Status");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 70, 20));

        jLabel2.setText("Gender");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 60, -1));

        addressTextArea.setColumns(20);
        addressTextArea.setRows(5);
        jScrollPane1.setViewportView(addressTextArea);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, 240, 60));

        jLabel3.setText("Course Begins On:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 100, 20));

        commenceDateTextField.setEditable(false);
        add(commenceDateTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 280, 130, 30));

        jLabel4.setText("Venue:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, 60, -1));

        venueTextField.setEditable(false);
        venueTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                venueTextFieldActionPerformed(evt);
            }
        });
        add(venueTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 330, 130, 30));

        jSeparator3.setToolTipText("Course Details");
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 410, -1));

        jLabel5.setText("Amount Paid");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 70, -1));
        add(amtPaidTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 80, 30));

        jLabel6.setText("Amt. to be Paid-");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 80, 30));

        amtToBePaidTextField.setEditable(false);
        add(amtToBePaidTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 80, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void courseTypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseTypeComboBoxActionPerformed
        // TODO add your handling code here:
        this.courseIDComboBox.setEnabled(false);
        this.commenceDateTextField.setText("");
        this.venueTextField.setText("");
        this.facultyNameTextField.setText("");
        this.amtToBePaidTextField.setText("");
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
        this.automatic=false;
    }//GEN-LAST:event_courseTypeComboBoxActionPerformed

    private void nameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextFieldActionPerformed

    private void FemaleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FemaleRadioButtonActionPerformed
        // TODO add your handling code here:
        this.gender="Female";
    }//GEN-LAST:event_FemaleRadioButtonActionPerformed

    private void MaleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaleRadioButtonActionPerformed
        // TODO add your handling code here:
        this.gender="Male";
    }//GEN-LAST:event_MaleRadioButtonActionPerformed

    private void professionTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_professionTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_professionTextFieldActionPerformed

    private void mobileNoFormattedTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobileNoFormattedTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mobileNoFormattedTextFieldActionPerformed

    public boolean checkValidation(){
        if(this.nameTextField.getText().equals("")
                ||this.addressTextArea.getText().equals("")
                ||this.professionTextField.getText().equals("")
                ||this.mobileNoFormattedTextField.getText().equals("")
                ||this.emailIDTextField.getText().equals("")
                ||this.dobTextField.getText().equals("")
                ||this.facultyNameTextField.getText().equals("")
                ||this.gender==null
                ||this.maritalStatus==null
                ||this.amtPaidTextField.getText().equals("")){
            JOptionPane.showMessageDialog(parentFrame, "One or More Field Empty!");
            return false;
        }
        else if (this.courseTypeComboBox.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(parentFrame,"CourseType not selected");
            return false;
        }
        
        else if (this.courseIDComboBox.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(parentFrame, "CourseID not selected");
            return false;
        }
        
        else if(Integer.parseInt(this.amtPaidTextField.getText())>Integer.parseInt(this.amtToBePaid)){
            JOptionPane.showMessageDialog(parentFrame, "You Entered extra amount!");
            return false;
        }
        
        else{
            try {
                String date=this.dobTextField.getText();
                SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd-MM-YYYY");
                Date dob=(Date)simpleDateFormat.parse(date);
                System.out.println(dob);
                Calendar calendar=Calendar.getInstance();
                calendar.setTime(dob);
                calendar.add(Calendar.YEAR, 18);
                Date dateof16=calendar.getTime();
                Date today=new Date();
                if(today.compareTo(dateof16)<0){
                    JOptionPane.showMessageDialog(parentFrame, "Minimum require age is 18");
                    return false;
                }
                
            } catch (ParseException ex) {
                Logger.getLogger(ApplicationFormPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            Pattern pattern=Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
			    	    + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
            Matcher matcher=pattern.matcher(this.emailIDTextField.getText());
            if(matcher.matches()==false){
                JOptionPane.showMessageDialog(parentFrame, "Please Enter a Valid Email ID");
                return false;
            }

            pattern=Pattern.compile("\\d{10}");
            matcher=pattern.matcher(this.mobileNoFormattedTextField.getText());
            if(matcher.matches()==false){
                JOptionPane.showMessageDialog(parentFrame, "Please Enter a Valid Mobile Number!");
                return false;
            }
        }
        return true;
    }
    
    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed
        // TODO add your handling code here:
        if(checkValidation()){
            try(MongoClient mongoClient=new MongoClient("localhost",27017)){
                DB db=mongoClient.getDB("AOLReg");
                DBCollection dBCollection=db.getCollection(this.courseIDComboBox.getSelectedItem().toString());
                BasicDBObject basicDBObject=new BasicDBObject("Name",this.nameTextField.getText())
                        .append("Mobile No", this.mobileNoFormattedTextField.getText());
                try(DBCursor bCursor=dBCollection.find(basicDBObject)){
                    if(bCursor.hasNext()){
                        JOptionPane.showMessageDialog(this, "Record with same Name & Mobile number exists!");
                        return;
                    }                        
                }              
                String paymentStatus;
                if(Integer.parseInt(this.amtPaidTextField.getText())<Integer.parseInt(this.amtToBePaid))
                    paymentStatus="Part";
                else
                    paymentStatus="Full";
                basicDBObject.clear();
                 basicDBObject.append("Name",this.nameTextField.getText())
                        .append("Gender", this.gender)
                        .append("Marital Status", this.maritalStatus)
                        .append("DOB", this.dobTextField.getText())
                        .append("Address", this.addressTextArea.getText())
                        .append("Profession", this.professionTextField.getText())
                        .append("Email", this.emailIDTextField.getText())
                        .append("Mobile No", this.mobileNoFormattedTextField.getText())
                        .append("Amount Paid", this.amtPaidTextField.getText())
                        .append("Payment Status", paymentStatus);
                dBCollection.insert(basicDBObject);
                JOptionPane.showMessageDialog(parentFrame, "Registered Successfully!");
                this.resetAll();
            }catch(Exception e){
                JOptionPane.showMessageDialog(parentFrame, e);
            }
        }
    }//GEN-LAST:event_SubmitButtonActionPerformed

    public void resetAll(){
        this.courseTypeComboBox.setSelectedIndex(0);
        this.courseIDComboBox.setSelectedIndex(0);
        this.nameTextField.setText("");
        this.genderButtonGroup.clearSelection();
        this.gender=null;
        this.maritalStatusButtonGroup.clearSelection();
        this.maritalStatus=null;
        this.dobTextField.setText("");
        this.amtPaidTextField.setText("");
        this.addressTextArea.setText("");
        this.professionTextField.setText("");
        this.emailIDTextField.setText("");
        this.mobileNoFormattedTextField.setText("");
        this.commenceDateTextField.setText("");
        this.venueTextField.setText("");
        this.facultyNameTextField.setText("");
        this.amtToBePaidTextField.setText("");
    }
    
    private void calendarOkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calendarOkButtonActionPerformed
        Date date = this.calendarPanel.getDate();
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-YYYY");
        String format = df.format(date);
        dobTextField.setText(format);
        this.calendarPanel.setVisible(false);
        this.calendarOkButton.setVisible(false);
        this.amtPaidTextField.setVisible(true);
        this.amtToBePaidTextField.setVisible(true);
    }//GEN-LAST:event_calendarOkButtonActionPerformed

    private void facultyNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facultyNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_facultyNameTextFieldActionPerformed

    private void dobTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dobTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dobTextFieldActionPerformed

    private void dobTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dobTextFieldFocusGained
        // TODO add your handling code here:
        this.calendarPanel.setVisible(true);
        this.calendarOkButton.setVisible(true);
        this.amtPaidTextField.setVisible(false);
        this.amtToBePaidTextField.setVisible(false);
    }//GEN-LAST:event_dobTextFieldFocusGained

    private void dobTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dobTextFieldFocusLost
        // TODO add your handling code here:
        this.calendarPanel.setVisible(false);
        this.calendarOkButton.setVisible(false);
        this.amtPaidTextField.setVisible(true);
        this.amtToBePaidTextField.setVisible(true);        
    }//GEN-LAST:event_dobTextFieldFocusLost

    private void calendarPanelStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_calendarPanelStateChanged
        Date date = this.calendarPanel.getDate();
        SimpleDateFormat df = new SimpleDateFormat("dd/mm/yyyy");
        String format = df.format(date);
        dobTextField.setText(format);
    }//GEN-LAST:event_calendarPanelStateChanged

    private void courseIDComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseIDComboBoxActionPerformed
        // TODO add your handling code here:
        if(this.automatic==false)
            this.setCourseRelatedData();
    };//GEN-LAST:event_courseIDComboBoxActionPerformed

    private void setCourseRelatedData(){
        try{
            Iterator <DBObject> itr=this.dBObjects.iterator();
            while(itr.hasNext()){
                DBObject dBObject=itr.next();
                if(dBObject.get("CourseID").equals(this.courseIDComboBox.getSelectedItem())){
                    this.commenceDateTextField.setText(dBObject.get("Date").toString());
                    this.venueTextField.setText(dBObject.get("Venue").toString());
                    this.facultyNameTextField.setText(dBObject.get("Faculty Name").toString());
                    this.amtToBePaid=dBObject.get("Amount").toString();
                    this.amtToBePaidTextField.setText(amtToBePaid);   
                    break;
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(parentFrame, e);
        }
    }
    
    private void venueTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_venueTextFieldActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_venueTextFieldActionPerformed

    private void MarriedRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MarriedRadioButtonActionPerformed
        // TODO add your handling code here:
        this.maritalStatus="Married";
    }//GEN-LAST:event_MarriedRadioButtonActionPerformed

    private void UnmarriedRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UnmarriedRadioButtonActionPerformed
        // TODO add your handling code here:
        this.maritalStatus="Unmarried";
    }//GEN-LAST:event_UnmarriedRadioButtonActionPerformed
    
    private boolean automatic=false;    
    private ArrayList<DBObject> dBObjects;  
    private String amtToBePaid=null,gender=null,maritalStatus=null;
    private JFrame parentFrame;
    private ButtonGroup genderButtonGroup;
    private ButtonGroup maritalStatusButtonGroup;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ACourseIDLabel;
    private javax.swing.JLabel CourseTypeLabel;
    private javax.swing.JLabel DOBLabel;
    private javax.swing.JLabel EmailIDLabel;
    private javax.swing.JLabel FacultyNameLabel;
    private javax.swing.JRadioButton FemaleRadioButton;
    private javax.swing.JRadioButton MaleRadioButton;
    private javax.swing.JRadioButton MarriedRadioButton;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JLabel ProfessionalLabel;
    private javax.swing.JButton SubmitButton;
    private javax.swing.JRadioButton UnmarriedRadioButton;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextArea addressTextArea;
    private javax.swing.JTextField amtPaidTextField;
    private javax.swing.JTextField amtToBePaidTextField;
    private javax.swing.JButton calendarOkButton;
    private de.wannawork.jcalendar.JCalendarPanel calendarPanel;
    private javax.swing.JTextField commenceDateTextField;
    private javax.swing.JComboBox courseIDComboBox;
    private javax.swing.JComboBox courseTypeComboBox;
    private javax.swing.JTextField dobTextField;
    private javax.swing.JTextField emailIDTextField;
    private javax.swing.JTextField facultyNameTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JFormattedTextField mobileNoFormattedTextField;
    private javax.swing.JLabel mobileNoLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTextField professionTextField;
    private javax.swing.JTextField venueTextField;
    // End of variables declaration//GEN-END:variables
}