package project.sw;

import java.awt.BorderLayout;

public class MainDashboard extends javax.swing.JFrame {

    private HomePanel homePanel;
    private AddPanel addPanel;
    private UpdatePanel updatePanel;
    private DeletePanel deletePanel;
    private SearchPanel searchPanel;

    public MainDashboard() {
        initComponents();
        
        
       
        
        homePanel = new HomePanel();
        addPanel = new AddPanel();
        updatePanel = new UpdatePanel();
        deletePanel = new DeletePanel();
        searchPanel = new SearchPanel();
        
        tabHome.add(homePanel, BorderLayout.CENTER);
        tabAdd.add(addPanel, BorderLayout.CENTER);
        tabUpdate.add(updatePanel, BorderLayout.CENTER);
        tabDelete.add(deletePanel, BorderLayout.CENTER);
        tabSearch.add(searchPanel, BorderLayout.CENTER);
        
        // Add a listener to refresh home table when switching back to Home tab
        tabbedPane.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                if (tabbedPane.getSelectedIndex() == 0) {
                    homePanel.loadData();
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabbedPane = new javax.swing.JTabbedPane();
        tabHome = new javax.swing.JPanel();
        tabAdd = new javax.swing.JPanel();
        tabUpdate = new javax.swing.JPanel();
        tabDelete = new javax.swing.JPanel();
        tabSearch = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("College Admission - Main Dashboard");
        setBackground(new java.awt.Color(0, 102, 204));
        setMinimumSize(new java.awt.Dimension(750, 500));
        getContentPane().setLayout(null);

        tabbedPane.setBackground(new java.awt.Color(0, 102, 204));

        tabHome.setBackground(new java.awt.Color(0, 102, 153));
        tabHome.setLayout(new java.awt.BorderLayout());
        tabbedPane.addTab("Home", tabHome);

        tabAdd.setBackground(new java.awt.Color(0, 102, 153));
        tabAdd.setLayout(new java.awt.BorderLayout());
        tabbedPane.addTab("Add", tabAdd);

        tabUpdate.setBackground(new java.awt.Color(0, 102, 153));
        tabUpdate.setLayout(new java.awt.BorderLayout());
        tabbedPane.addTab("Update", tabUpdate);

        tabDelete.setBackground(new java.awt.Color(0, 102, 153));
        tabDelete.setLayout(new java.awt.BorderLayout());
        tabbedPane.addTab("Delete", tabDelete);

        tabSearch.setBackground(new java.awt.Color(0, 102, 153));
        tabSearch.setLayout(new java.awt.BorderLayout());
        tabbedPane.addTab("Search", tabSearch);

        getContentPane().add(tabbedPane);
        tabbedPane.setBounds(0, 0, 630, 510);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel tabAdd;
    private javax.swing.JPanel tabDelete;
    private javax.swing.JPanel tabHome;
    private javax.swing.JPanel tabSearch;
    private javax.swing.JPanel tabUpdate;
    private javax.swing.JTabbedPane tabbedPane;
    // End of variables declaration//GEN-END:variables
}
