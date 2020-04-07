/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package student_management_system;

/**
 *
 * @author RISING STAR MAYANK
 */

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.text.ParseException;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
public class ManageStudent extends javax.swing.JFrame {

    /** Creates new form ManageStudent */
   
   Student stu = new Student();
   DefaultTableModel model;
    public ManageStudent() {
        initComponents();
      // Student stu = new Student();
       stu.fillStudentJtable(jTable1,"");
       ButtonGroup bg = new ButtonGroup();
       bg.add(jRadioButton1_Female);
       bg.add(jRadioButton2_Male);
       bg.add(jRadioButton3_Other);
       model = (DefaultTableModel)jTable1.getModel();
       jTable1.setRowHeight(40);
       jTable1.setShowGrid(true);
       jTable1.setGridColor(Color.yellow);
       jTable1.setSelectionBackground(Color.lightGray);
       
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1_stu_id = new javax.swing.JTextField();
        jTextField2_Last_Name = new javax.swing.JTextField();
        jRadioButton1_Female = new javax.swing.JRadioButton();
        jRadioButton2_Male = new javax.swing.JRadioButton();
        jRadioButton3_Other = new javax.swing.JRadioButton();
        jDateChooser1_bdate = new com.toedter.calendar.JDateChooser();
        jTextField3_phone = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1_Address = new javax.swing.JTextArea();
        jButton1_Add_edit_ = new javax.swing.JButton();
        jButton2_remove = new javax.swing.JButton();
        jButton2_cancel = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTextField1_First_Name1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jTextField1_Search = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Manage  Student");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Sex");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("BirthDate");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("First Name");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Last Name");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Address");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Phone");

        jTextField1_stu_id.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField2_Last_Name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jRadioButton1_Female.setText("Female");

        jRadioButton2_Male.setText("Male");

        jRadioButton3_Other.setText("Other");

        jTextField3_phone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextArea1_Address.setColumns(20);
        jTextArea1_Address.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextArea1_Address.setRows(5);
        jScrollPane1.setViewportView(jTextArea1_Address);

        jButton1_Add_edit_.setBackground(new java.awt.Color(255, 204, 102));
        jButton1_Add_edit_.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1_Add_edit_.setText("EDIT");
        jButton1_Add_edit_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_Add_edit_ActionPerformed(evt);
            }
        });

        jButton2_remove.setBackground(new java.awt.Color(0, 153, 153));
        jButton2_remove.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2_remove.setText("REMOVE");
        jButton2_remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_removeActionPerformed(evt);
            }
        });

        jButton2_cancel.setBackground(new java.awt.Color(0, 153, 153));
        jButton2_cancel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2_cancel.setText("ADD");
        jButton2_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_cancelActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Enter Value To Search");

        jTextField1_First_Name1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "First Name", "Last Nmae", "Sex", "BirthDatell", "Phonel", "Addess"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable1KeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("ID");

        jTextField1_Search.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField1_Search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1_SearchKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2_remove, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jButton1_Add_edit_, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addComponent(jButton2_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(202, 202, 202)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField1_First_Name1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser1_bdate, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1_stu_id, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField2_Last_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jRadioButton1_Female)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton2_Male)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton3_Other)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 11, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(55, 55, 55)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(1170, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(jTextField1_stu_id, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField1_First_Name1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jTextField2_Last_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton1_Female)
                                    .addComponent(jRadioButton2_Male)
                                    .addComponent(jRadioButton3_Other))
                                .addGap(45, 45, 45)
                                .addComponent(jDateChooser1_bdate, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(jTextField3_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2_remove, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1_Add_edit_, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(101, 101, 101)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(607, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
       public boolean isValidornot(){
    if( jTextField1_First_Name1.getText().equals("") || jTextField2_Last_Name.getText().equals("") || jTextField3_phone.getText().equals("") || jTextArea1_Address.getText().equals("") || jTextField1_stu_id.getText().equals("")){
     JOptionPane.showMessageDialog(null, "Any Entry Can Not be Null");
    return false;
    }
    else if( jDateChooser1_bdate.getDate()==null){
         JOptionPane.showMessageDialog(null, "Any Entry Can Not be Null");
    return false;
    
    }
    else if(jDateChooser1_bdate.getDate().compareTo(new Date()) >0){
         JOptionPane.showMessageDialog(null, "Please Enter Valid Date");
    
            return false;
    }
    else{
            
         return true;   
            
    }}
    private void jButton1_Add_edit_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_Add_edit_ActionPerformed
      
       String fname = jTextField1_First_Name1.getText();
       String lname = jTextField2_Last_Name.getText();
       String phone = jTextField3_phone.getText();
       String address = jTextArea1_Address.getText();
       int id = Integer.valueOf(jTextField1_stu_id.getText());
       String sex = "other";
       if(jRadioButton1_Female.isSelected()){
           sex="Female";
      }
       else if(jRadioButton2_Male.isSelected()){
           sex = "Male";
       }
    SimpleDateFormat dateformate = new SimpleDateFormat("yyyy-MM-dd");
    String bdate = dateformate.format(jDateChooser1_bdate.getDate());
    
        try {
            if(isValidornot()){
             
         
            stu.insertUpdateDeletStudent('u',id, fname, lname, sex, bdate, phone, address);
            jTable1.setModel(new DefaultTableModel(null,new Object[]{"ID","First Name","Last Name","Sex","Birth Date","Phone","Address"}));
            stu.fillStudentJtable( ManageStudent.jTable1,"");
         //   Main_Form.jLabel_stu_total.setText(Integer.toString(MyTotalFunction.countData("student")));
          // jTable1.setModel(new DefaultTableModel(null,new Object[]{"ID","First Name","Last Name","Sex","Birth Date","Phone","Address"}));
         //  stu.fillStudentJtable(jTable1, ManageStudent.jTextField1_Search.getText());
          // Main_Form.jLabel_stu_total.setText(Integer.toString(MyTotalFunction.countData("student")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddStudentForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1_Add_edit_ActionPerformed

    private void jButton2_removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_removeActionPerformed
     
        if(jTextField1_stu_id.getText().equals("")){
             JOptionPane.showMessageDialog(null, "No Student is selected");
        
        }else{
            int id = Integer.valueOf(jTextField1_stu_id.getText());
           
        
          try{
              stu.insertUpdateDeletStudent('d',id, null, null, null, null, null, null);
             stu.fillStudentJtable(jTable1,"");
            jTable1.setModel(new DefaultTableModel(null,new Object[]{"ID","First Name","Last Name","Sex","Birth Date","Phone","Address"}));
            stu.fillStudentJtable(jTable1, jTextField1_Search.getText());
            
            /* after deletion so that entry of form became empty*/
                jTextField1_stu_id.setText("");
                jTextField1_First_Name1.setText("");
                jTextField2_Last_Name.setText("");

                jTextField3_phone.setText("");
                jTextArea1_Address.setText("");
                jRadioButton1_Female.setSelected(false);
                jRadioButton2_Male.setSelected(false);
                jRadioButton3_Other.setSelected(false);
                  jDateChooser1_bdate.setDate(null);

              
          } catch (SQLException ex) {
            Logger.getLogger(AddStudentForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_jButton2_removeActionPerformed

    private void jButton2_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_cancelActionPerformed
        AddStudentForm asf = new AddStudentForm();
        asf.setVisible(true);
        asf.pack();
        asf.setLocationRelativeTo(null);
        asf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }//GEN-LAST:event_jButton2_cancelActionPerformed
    int rowIndex;
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
      
        model = (DefaultTableModel)jTable1.getModel();
        
        rowIndex = jTable1.getSelectedRow();
        jRadioButton2_Male.setSelected(false);
        jRadioButton3_Other.setSelected(false);
       jRadioButton1_Female.setSelected(false);
       
     //  DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
      if(model.getValueAt(rowIndex,3).toString().equals("Male")){
            jRadioButton2_Male.setSelected(true);
    
       }
       else if(model.getValueAt(rowIndex,3).toString().equals("Female")){

       jRadioButton1_Female.setSelected(true);
       
       }
       else{
      
        jRadioButton3_Other.setSelected(true);
   
       
        }
       jTextField1_stu_id.setText(model.getValueAt( rowIndex,0).toString());
       jTextField1_First_Name1.setText(model.getValueAt( rowIndex,1).toString());
       jTextField2_Last_Name.setText(model.getValueAt(rowIndex,2).toString());
     //  jDateChooser1_bdate.setDateFormatString(model.getValueAt(rowIndex,4).toString());
       jTextField3_phone.setText(model.getValueAt( rowIndex,5).toString());
       jTextArea1_Address.setText(model.getValueAt( rowIndex,6).toString());
       Date bdate;
         try {
             bdate = new SimpleDateFormat("yyyy-MM-dd").parse(model.getValueAt(rowIndex,4).toString());
               jDateChooser1_bdate.setDate(bdate);
         } catch (ParseException ex) {
             Logger.getLogger(ManageStudent.class.getName()).log(Level.SEVERE, null, ex);
         }
       
       
        
       
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTextField1_SearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1_SearchKeyTyped
        jTable1.setModel(new DefaultTableModel(null,new Object[]{"ID","First Name","Last Name","Sex","Birth Date","Phone","Address"}));
        stu.fillStudentJtable(jTable1, jTextField1_Search.getText());
    }//GEN-LAST:event_jTextField1_SearchKeyTyped

    private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyReleased
       if(evt.getKeyCode()==KeyEvent.VK_UP || evt.getKeyCode()==KeyEvent.VK_DOWN){
       
      rowIndex = jTable1.getSelectedRow();
       
     //  DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
      if(model.getValueAt(rowIndex,3).toString().equals("Male")){
            jRadioButton2_Male.setSelected(true);
        jRadioButton3_Other.setSelected(false);
       jRadioButton1_Female.setSelected(false);
       }
       else if(model.getValueAt(rowIndex,3).toString().equals("Female")){
        jRadioButton2_Male.setSelected(false);
        jRadioButton3_Other.setSelected(false);
       jRadioButton1_Female.setSelected(true);
       
       }
       else{
             jRadioButton2_Male.setSelected(false);
        jRadioButton3_Other.setSelected(true);
       jRadioButton1_Female.setSelected(false);
       
        }
       jTextField1_stu_id.setText(model.getValueAt( rowIndex,0).toString());
       jTextField1_First_Name1.setText(model.getValueAt( rowIndex,1).toString());
       jTextField2_Last_Name.setText(model.getValueAt(rowIndex,2).toString());
     //  jDateChooser1_bdate.setDateFormatString(model.getValueAt(rowIndex,4).toString());
       jTextField3_phone.setText(model.getValueAt( rowIndex,5).toString());
       jTextArea1_Address.setText(model.getValueAt( rowIndex,6).toString());
       Date bdate;
         try {
             bdate = new SimpleDateFormat("yyyy-MM-dd").parse(model.getValueAt(rowIndex,4).toString());
               jDateChooser1_bdate.setDate(bdate);
         } catch (ParseException ex) {
             Logger.getLogger(ManageStudent.class.getName()).log(Level.SEVERE, null, ex);
         }
       
  }
    }//GEN-LAST:event_jTable1KeyReleased
     
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(ManageStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_Add_edit_;
    private javax.swing.JButton jButton2_cancel;
    private javax.swing.JButton jButton2_remove;
    private com.toedter.calendar.JDateChooser jDateChooser1_bdate;
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
    private javax.swing.JRadioButton jRadioButton1_Female;
    private javax.swing.JRadioButton jRadioButton2_Male;
    private javax.swing.JRadioButton jRadioButton3_Other;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1_Address;
    private javax.swing.JTextField jTextField1_First_Name1;
    public static javax.swing.JTextField jTextField1_Search;
    private javax.swing.JTextField jTextField1_stu_id;
    private javax.swing.JTextField jTextField2_Last_Name;
    private javax.swing.JTextField jTextField3_phone;
    // End of variables declaration//GEN-END:variables

}