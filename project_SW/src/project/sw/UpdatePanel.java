package project.sw;

import java.util.List;
import javax.swing.JOptionPane;

public class UpdatePanel extends javax.swing.JPanel {

    private StudentDAO studentDAO;

    public UpdatePanel() {
        initComponents();
        studentDAO = new StudentDAO();
    }

    private void clearFields() {

        txtId.setText("");
        txtFirstName.setText("");
        txtLastName.setText("");
        txtMajor.setText("");
        txtPassword.setText("");
        buttonGroup1.clearSelection();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblTitle = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        lblFirstName = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        lblLastName = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        lblMajor = new javax.swing.JLabel();
        txtMajor = new javax.swing.JTextField();
        lblGender = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        lblPassword = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 102, 153));
        setLayout(null);

        lblTitle.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/sw/icons8-update-30.png"))); // NOI18N
        lblTitle.setText("Update Student");
        add(lblTitle);
        lblTitle.setBounds(30, 20, 200, 40);

        lblId.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblId.setText("National ID:");
        add(lblId);
        lblId.setBounds(30, 70, 100, 25);

        txtId.setBackground(new java.awt.Color(255, 255, 255));
        txtId.setForeground(new java.awt.Color(0, 0, 0));
        add(txtId);
        txtId.setBounds(130, 70, 200, 25);

        btnSearch.setBackground(new java.awt.Color(255, 255, 255));
        btnSearch.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(0, 0, 0));
        btnSearch.setText("Fetch Data");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        add(btnSearch);
        btnSearch.setBounds(340, 70, 140, 25);

        lblFirstName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblFirstName.setText("First Name:");
        add(lblFirstName);
        lblFirstName.setBounds(30, 110, 80, 25);

        txtFirstName.setBackground(new java.awt.Color(255, 255, 255));
        txtFirstName.setForeground(new java.awt.Color(0, 0, 0));
        add(txtFirstName);
        txtFirstName.setBounds(130, 110, 200, 25);

        lblLastName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblLastName.setText("Last Name:");
        add(lblLastName);
        lblLastName.setBounds(30, 150, 80, 25);

        txtLastName.setBackground(new java.awt.Color(255, 255, 255));
        txtLastName.setForeground(new java.awt.Color(0, 0, 0));
        add(txtLastName);
        txtLastName.setBounds(130, 150, 200, 25);

        lblMajor.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblMajor.setText("Major:");
        add(lblMajor);
        lblMajor.setBounds(30, 190, 80, 25);

        txtMajor.setBackground(new java.awt.Color(255, 255, 255));
        txtMajor.setForeground(new java.awt.Color(0, 0, 0));
        add(txtMajor);
        txtMajor.setBounds(130, 190, 200, 25);

        lblGender.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblGender.setText("Gender:");
        add(lblGender);
        lblGender.setBounds(30, 280, 80, 25);

        txtPassword.setBackground(new java.awt.Color(255, 255, 255));
        txtPassword.setForeground(new java.awt.Color(0, 0, 0));
        txtPassword.setToolTipText("");
        add(txtPassword);
        txtPassword.setBounds(130, 230, 200, 25);

        btnUpdate.setBackground(new java.awt.Color(255, 255, 255));
        btnUpdate.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(0, 0, 0));
        btnUpdate.setText("Update Student");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate);
        btnUpdate.setBounds(130, 330, 180, 35);

        buttonGroup1.add(male);
        male.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        male.setText("Male");
        add(male);
        male.setBounds(130, 280, 98, 22);

        buttonGroup1.add(female);
        female.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        female.setText("Female");
        add(female);
        female.setBounds(240, 280, 100, 22);

        lblPassword.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblPassword.setText("Password:");
        add(lblPassword);
        lblPassword.setBounds(30, 230, 80, 25);
    }// </editor-fold>//GEN-END:initComponents

   private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {

    String id = txtId.getText();

    if (id.isEmpty()) {

        JOptionPane.showMessageDialog(this,
                "Please enter National ID.");

        return;
    }

    List<Student> students =
            studentDAO.searchStudents(id);

    Student target = null;

    for (Student s : students) {

        if (s.getNationalId().equals(id)) {

            target = s;
            break;
        }
    }

    if (target != null) {

        txtFirstName.setText(target.getFirstName());

        txtLastName.setText(target.getLastName());

        txtMajor.setText(target.getMajor());

        txtPassword.setText(target.getPassword());

        if (target.getGender().equalsIgnoreCase("Male")) {

            male.setSelected(true);

        } else {

            female.setSelected(true);
        }

    } else {

        JOptionPane.showMessageDialog(this,
                "Student not found.");

        clearFields();
    }
}

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {

    String gender = "";

    if (male.isSelected()) {

        gender = "Male";

    } else if (female.isSelected()) {

        gender = "Female";
    }
     // VALIDATION
    if(txtFirstName.getText().trim().isEmpty() ||
       txtLastName.getText().trim().isEmpty() ||
       txtId.getText().trim().isEmpty() ||
       txtPassword.getText().trim().isEmpty() ||
       txtMajor.getText().trim().isEmpty()){

        JOptionPane.showMessageDialog(this,
                "Please fill all fields");

        return;
    }
    Student s = new Student(

        txtFirstName.getText(),
        txtLastName.getText(),
        txtId.getText(),
        txtPassword.getText(),
        gender,
        txtMajor.getText()

    );

    if (studentDAO.updateStudent(s)) {

        JOptionPane.showMessageDialog(this,
                "Student Updated Successfully!");

        clearFields();

    } else {

        JOptionPane.showMessageDialog(this,
                "Failed To Update Student.");
    }
}       

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton female;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblMajor;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtMajor;
    private javax.swing.JTextField txtPassword;
    // End of variables declaration//GEN-END:variables

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                javax.swing.JFrame frame = new javax.swing.JFrame("Test UpdatePanel");
                frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
                frame.setSize(750, 500);
                frame.getContentPane().add(new UpdatePanel());
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }
}
