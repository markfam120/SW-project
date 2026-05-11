package project.sw;

import javax.swing.JOptionPane;

public class AddPanel extends javax.swing.JPanel {

    private StudentDAO studentDAO;

    public AddPanel() {
        initComponents();
        studentDAO = new StudentDAO();
    }

    private void clearFields() {

    txtFirstName.setText("");
    txtLastName.setText("");
    txtId.setText("");
    txtGpa1.setText("");
    userpassword_txt.setText("");
    buttonGroup1.clearSelection();
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblTitle = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        lblFirstName = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        lblLastName = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        lblMajor = new javax.swing.JLabel();
        lblGpa = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        txtGpa1 = new javax.swing.JTextField();
        lblGpa1 = new javax.swing.JLabel();
        userpassword_txt = new javax.swing.JPasswordField();
        male = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(0, 102, 153));
        setLayout(null);

        lblTitle.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/sw/icons8-add-24.png"))); // NOI18N
        lblTitle.setText("Add New Student");
        add(lblTitle);
        lblTitle.setBounds(30, 20, 200, 24);

        lblId.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblId.setText("National ID:");
        add(lblId);
        lblId.setBounds(30, 150, 80, 25);

        txtId.setBackground(new java.awt.Color(255, 255, 255));
        txtId.setForeground(new java.awt.Color(0, 0, 0));
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        add(txtId);
        txtId.setBounds(130, 150, 200, 25);

        lblFirstName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblFirstName.setText("First Name:");
        add(lblFirstName);
        lblFirstName.setBounds(30, 70, 80, 25);

        txtFirstName.setBackground(new java.awt.Color(255, 255, 255));
        txtFirstName.setForeground(new java.awt.Color(0, 0, 0));
        add(txtFirstName);
        txtFirstName.setBounds(130, 70, 200, 25);

        lblLastName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblLastName.setText("Last Name:");
        add(lblLastName);
        lblLastName.setBounds(30, 110, 80, 25);

        txtLastName.setBackground(new java.awt.Color(255, 255, 255));
        txtLastName.setForeground(new java.awt.Color(0, 0, 0));
        add(txtLastName);
        txtLastName.setBounds(130, 110, 200, 25);

        lblMajor.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblMajor.setText("Password:");
        add(lblMajor);
        lblMajor.setBounds(30, 190, 80, 25);

        lblGpa.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblGpa.setText("Gender:");
        add(lblGpa);
        lblGpa.setBounds(30, 270, 80, 25);

        btnAdd.setBackground(new java.awt.Color(255, 255, 255));
        btnAdd.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(0, 0, 0));
        btnAdd.setText("Add Student");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        add(btnAdd);
        btnAdd.setBounds(150, 310, 140, 35);

        txtGpa1.setBackground(new java.awt.Color(255, 255, 255));
        txtGpa1.setForeground(new java.awt.Color(0, 0, 0));
        txtGpa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGpa1ActionPerformed(evt);
            }
        });
        add(txtGpa1);
        txtGpa1.setBounds(130, 230, 200, 25);

        lblGpa1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblGpa1.setText("Major:");
        add(lblGpa1);
        lblGpa1.setBounds(30, 230, 80, 25);

        userpassword_txt.setBackground(new java.awt.Color(255, 255, 255));
        userpassword_txt.setForeground(new java.awt.Color(0, 0, 0));
        userpassword_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userpassword_txtActionPerformed(evt);
            }
        });
        add(userpassword_txt);
        userpassword_txt.setBounds(130, 190, 200, 25);

        buttonGroup1.add(male);
        male.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        male.setText("male");
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });
        add(male);
        male.setBounds(130, 270, 60, 22);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jRadioButton2.setText("female");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        add(jRadioButton2);
        jRadioButton2.setBounds(250, 270, 70, 22);
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void userpassword_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userpassword_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userpassword_txtActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maleActionPerformed

    private void txtGpa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGpa1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGpa1ActionPerformed

   private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {
    String gender = "";
    if (male.isSelected()) {
        gender = "Male";
    } else if (jRadioButton2.isSelected()) {
        gender = "Female";
    }
    String password = new String(userpassword_txt.getPassword());
    try {
        Student s = new Student(

    txtFirstName.getText(),
    txtLastName.getText(),
    txtId.getText(),
    password,
    gender,
    txtGpa1.getText()

);
        if (studentDAO.addStudent(s)) {

            JOptionPane.showMessageDialog(this,
                    "Student Added Successfully!");

            clearFields();
        } else {
            JOptionPane.showMessageDialog(this,
                    "Failed to Add Student.");
        }

    } catch (Exception e) {

        JOptionPane.showMessageDialog(this,
                "Error : " + e.getMessage());

    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblGpa;
    private javax.swing.JLabel lblGpa1;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblMajor;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtGpa1;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JPasswordField userpassword_txt;
    // End of variables declaration//GEN-END:variables

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                javax.swing.JFrame frame = new javax.swing.JFrame("Test AddPanel");
                frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
                frame.setSize(750, 500);
                frame.getContentPane().add(new AddPanel());
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }
}
