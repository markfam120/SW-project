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

        setLayout(null);

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitle.setText("Update Student");
        add(lblTitle);
        lblTitle.setBounds(30, 20, 200, 22);

        lblId.setText("National ID:");
        add(lblId);
        lblId.setBounds(30, 70, 80, 25);
        add(txtId);
        txtId.setBounds(130, 70, 200, 25);

        btnSearch.setText("Fetch Data");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        add(btnSearch);
        btnSearch.setBounds(350, 70, 100, 25);

        lblFirstName.setText("First Name:");
        add(lblFirstName);
        lblFirstName.setBounds(30, 110, 80, 25);
        add(txtFirstName);
        txtFirstName.setBounds(130, 110, 200, 25);

        lblLastName.setText("Last Name:");
        add(lblLastName);
        lblLastName.setBounds(30, 150, 80, 25);
        add(txtLastName);
        txtLastName.setBounds(130, 150, 200, 25);

        lblMajor.setText("Major:");
        add(lblMajor);
        lblMajor.setBounds(30, 190, 80, 25);
        add(txtMajor);
        txtMajor.setBounds(130, 190, 200, 25);

        lblGender.setText("Gender:");
        add(lblGender);
        lblGender.setBounds(30, 280, 80, 25);

        txtPassword.setToolTipText("");
        add(txtPassword);
        txtPassword.setBounds(130, 230, 200, 25);

        btnUpdate.setText("Update Student");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate);
        btnUpdate.setBounds(130, 330, 120, 35);

        buttonGroup1.add(male);
        male.setText("Male");
        add(male);
        male.setBounds(130, 280, 98, 21);

        buttonGroup1.add(female);
        female.setText("Female");
        add(female);
        female.setBounds(240, 280, 100, 21);

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
