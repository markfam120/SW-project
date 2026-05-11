package project.sw;

import java.util.List;
import javax.swing.table.DefaultTableModel;

public class HomePanel extends javax.swing.JPanel {

    private StudentDAO studentDAO;

    public HomePanel() {
        initComponents();
          tableStudents.getTableHeader().setBackground(new java.awt.Color(0, 102, 204));
            tableStudents.getTableHeader().setForeground(new java.awt.Color(0, 0, 0));
        studentDAO = new StudentDAO();
        loadData();
    }

    public void loadData() {

    DefaultTableModel model =
            (DefaultTableModel) tableStudents.getModel();

    model.setRowCount(0);

    List<Student> list = studentDAO.getAllStudents();

    for (Student s : list) {

        model.addRow(new Object[]{

            s.getNationalId(),
            s.getFirstName(),
            s.getLastName(),
            s.getMajor(),
            s.getGender()

        });
    }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRefresh = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableStudents = new javax.swing.JTable();

        setBackground(new java.awt.Color(0, 102, 153));
        setLayout(null);

        btnRefresh.setBackground(new java.awt.Color(102, 204, 255));
        btnRefresh.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRefresh.setForeground(new java.awt.Color(0, 0, 0));
        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/sw/icons8-refresh-24.png"))); // NOI18N
        btnRefresh.setText("Refresh Table");
        btnRefresh.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        add(btnRefresh);
        btnRefresh.setBounds(20, 20, 130, 30);

        tableStudents.setAutoCreateRowSorter(true);
        tableStudents.setForeground(new java.awt.Color(0, 0, 0));
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
        jScrollPane1.setBounds(20, 60, 500, 310);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {
        loadData();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRefresh;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableStudents;
    // End of variables declaration//GEN-END:variables

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                javax.swing.JFrame frame = new javax.swing.JFrame("Test HomePanel");
                frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
                frame.setSize(750, 500);
                frame.getContentPane().add(new HomePanel());
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
       
        
} 
        
        
    }

