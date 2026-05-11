package project.sw;

import javax.swing.JOptionPane;

public class DeletePanel extends javax.swing.JPanel {

    private StudentDAO studentDAO;

    public DeletePanel() {
        initComponents();
        studentDAO = new StudentDAO();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 102, 153));
        setLayout(null);

        lblTitle.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/sw/icons8-delete-24.png"))); // NOI18N
        lblTitle.setText("Delete Student");
        add(lblTitle);
        lblTitle.setBounds(30, 20, 200, 29);

        lblId.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblId.setText("National ID:");
        add(lblId);
        lblId.setBounds(30, 70, 100, 25);

        txtId.setBackground(new java.awt.Color(255, 255, 255));
        txtId.setForeground(new java.awt.Color(0, 0, 0));
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        add(txtId);
        txtId.setBounds(140, 70, 200, 25);

        btnDelete.setBackground(new java.awt.Color(255, 255, 255));
        btnDelete.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(0, 0, 0));
        btnDelete.setText("Delete Student");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete);
        btnDelete.setBounds(160, 130, 160, 35);
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {
        String id = txtId.getText();
        if (id.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a National ID.");
            return;
        }
        
        int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete student with ID: " + id + "?", "Confirm", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            if (studentDAO.deleteStudent(id)) {
                JOptionPane.showMessageDialog(this, "Student Deleted Successfully!");
                txtId.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "Failed to Delete Student. ID might not exist.");
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtId;
    // End of variables declaration//GEN-END:variables

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                javax.swing.JFrame frame = new javax.swing.JFrame("Test DeletePanel");
                frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
                frame.setSize(750, 500);
                frame.getContentPane().add(new DeletePanel());
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }
}
