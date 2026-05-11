package project.sw;

import java.util.List;
import javax.swing.table.DefaultTableModel;

public class SearchPanel extends javax.swing.JPanel {

    private StudentDAO studentDAO;

    public SearchPanel() {
        initComponents();
        tableStudents.getTableHeader().setBackground(new java.awt.Color(0, 102, 204)); 
    tableStudents.getTableHeader().setForeground(new java.awt.Color(0, 0, 0));
        studentDAO = new StudentDAO();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableStudents = new javax.swing.JTable();

        setBackground(new java.awt.Color(0, 102, 153));
        setLayout(null);

        lblTitle.setBackground(new java.awt.Color(255, 255, 255));
        lblTitle.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 0, 0));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/sw/icons8-search.gif"))); // NOI18N
        lblTitle.setText("Search Students");
        lblTitle.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblTitle.setOpaque(true);
        add(lblTitle);
        lblTitle.setBounds(20, 20, 260, 30);

        txtSearch.setBackground(new java.awt.Color(255, 255, 255));
        add(txtSearch);
        txtSearch.setBounds(20, 60, 250, 25);

        btnSearch.setBackground(new java.awt.Color(255, 255, 255));
        btnSearch.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(0, 0, 0));
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        add(btnSearch);
        btnSearch.setBounds(290, 60, 100, 25);

        tableStudents.setBackground(new java.awt.Color(255, 255, 255));
        tableStudents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "National ID", "First Name", "Last Name", "Major", "Gender"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableStudents);

        add(jScrollPane1);
        jScrollPane1.setBounds(20, 100, 520, 250);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {
        String keyword = txtSearch.getText();
        List<Student> students = studentDAO.searchStudents(keyword);
        DefaultTableModel model = (DefaultTableModel) tableStudents.getModel();
        model.setRowCount(0);
        for (Student s : students) {

    model.addRow(new Object[]{

        s.getNationalId(),
        s.getFirstName(),
        s.getLastName(),
        s.getMajor(),
        s.getGender()

    });
}
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tableStudents;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                javax.swing.JFrame frame = new javax.swing.JFrame("Test SearchPanel");
                frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
                frame.setSize(750, 500);
                frame.getContentPane().add(new SearchPanel());
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }
}
