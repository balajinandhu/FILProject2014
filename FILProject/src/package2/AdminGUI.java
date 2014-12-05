package package2;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;

import package1.ImagePanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vkarnati
 */
public class AdminGUI extends javax.swing.JFrame {

    private javax.swing.JPanel teamSearchPanel;
    private javax.swing.JPanel projectSearchPanel;
    private javax.swing.JTextField txtParticipantName;
    private javax.swing.JLabel lblParticipantName;
    private javax.swing.JTextField txtProjectName;
    private javax.swing.JLabel lblProjectName;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btn1Search;
    private javax.swing.JButton btnViewBudget;
    private javax.swing.JPanel ProjectRequestPanel;
    private javax.swing.JPanel titlePanel;
   
    
    /**
     * Creates new form AdminHomeGUI
     */
   
    
    public AdminGUI() {
        initComponents();
 
        
       
        btnViewBudget = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnSearch = new javax.swing.JButton();
        teamSearchPanel = new javax.swing.JPanel();
        lblParticipantName = new javax.swing.JLabel();
      
        txtParticipantName = new javax.swing.JTextField();
       
        lblParticipantName.setText("Participant Name");
        javax.swing.GroupLayout teamSearchPanelLayout = new javax.swing.GroupLayout(teamSearchPanel);
        teamSearchPanel.setLayout(teamSearchPanelLayout);
        teamSearchPanelLayout.setHorizontalGroup(
            teamSearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 593, Short.MAX_VALUE)
        );
        teamSearchPanelLayout.setVerticalGroup(
            teamSearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 172, Short.MAX_VALUE)
        );

        btnSearch.setText("Search");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(lblParticipantName)
                        .addGap(94, 94, 94)
                        .addComponent(txtParticipantName, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(btnSearch))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(teamSearchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(237, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblParticipantName)
                    .addComponent(txtParticipantName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addGap(44, 44, 44)
                .addComponent(teamSearchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(123, Short.MAX_VALUE))
        );

        cardPanel.add(jPanel3, "card1");

       
        jPanel5 = new javax.swing.JPanel();
        btn1Search = new javax.swing.JButton();
        projectSearchPanel = new javax.swing.JPanel();
        lblProjectName = new javax.swing.JLabel();
        txtProjectName = new javax.swing.JTextField();
        lblProjectName.setText("Project Name");
        
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        
        btn1Search.setText("Search");
        btn1Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1SearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout projectSearchPanelLayout = new javax.swing.GroupLayout(projectSearchPanel);
        projectSearchPanel.setLayout(projectSearchPanelLayout);
        projectSearchPanelLayout.setHorizontalGroup(
            projectSearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 598, Short.MAX_VALUE)
        );
        projectSearchPanelLayout.setVerticalGroup(
            projectSearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 148, Short.MAX_VALUE)
        );

        btnViewBudget.setText("View Budget");
        btnViewBudget.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewBudgetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(lblProjectName)
                .addGap(97, 97, 97)
                .addComponent(txtProjectName, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(btn1Search)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(projectSearchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnViewBudget)
                .addGap(0, 39, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProjectName)
                    .addComponent(txtProjectName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn1Search))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(projectSearchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(btnViewBudget)))
                .addContainerGap(127, Short.MAX_VALUE))
        );

        cardPanel.add(jPanel5, "card2");
            
        cardPanel.setVisible(false);
    }

    
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

    	 ProjectRequestPanel = new javax.swing.JPanel();
    	 ProjectTablePanel = new javax.swing.JPanel();
    	 UserRequestPanel = new javax.swing.JPanel();
    	 UserTablePanel = new javax.swing.JPanel();
    	 
    	 
        buttonGroup1 = new javax.swing.ButtonGroup();
        teamSearchButton = new javax.swing.JRadioButton();
        projectSearchButton = new javax.swing.JRadioButton();
        btnLogout = new javax.swing.JButton();
        btnAcceptRequest = new javax.swing.JButton();
        btnManageProjects = new javax.swing.JButton();
        btnManageUsers = new javax.swing.JButton();
        btnUserAcceptRequest = new javax.swing.JButton();
        
        
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        titlePanel = new JPanel();
        
        cardPanel = new javax.swing.JPanel();
        jTabbedPane = new javax.swing.JTabbedPane();
        searchPane = new javax.swing.JPanel();
        ProjectPane = new javax.swing.JPanel();
        UserProfilesPane = new javax.swing.JPanel();
        
       
        lblExistingUsers = new javax.swing.JLabel();
        lblExistingProjects = new javax.swing.JLabel(); 
        lblWelcome = new javax.swing.JLabel();
       
        
       
        
        
        
        ImagePanel panel = new ImagePanel(new ImageIcon("FIL.jpg").getImage());
        
        titlePanel.add(panel);
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTabbedPane.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTabbedPane.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPaneMouseClicked(evt);
            }
        });

        searchPane.setLayout(new java.awt.CardLayout());

        buttonGroup1.add(teamSearchButton);
        teamSearchButton.setText("Search by Team member");
        teamSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teamSearchButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(projectSearchButton);
        projectSearchButton.setText("Search by Project");
        projectSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                projectSearchButtonActionPerformed(evt);
            }
        });


        cardPanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(teamSearchButton)
                        .addGap(97, 97, 97)
                        .addComponent(projectSearchButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teamSearchButton)
                    .addComponent(projectSearchButton))
                .addGap(18, 18, 18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE))
        );

        searchPane.add(jPanel2, "card2");

        jTabbedPane.addTab("Search", searchPane);

        javax.swing.GroupLayout ProjectTablePanelLayout = new javax.swing.GroupLayout(ProjectTablePanel);
        ProjectTablePanel.setLayout(ProjectTablePanelLayout);
        ProjectTablePanelLayout.setHorizontalGroup(
            ProjectTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 438, Short.MAX_VALUE)
        );
        ProjectTablePanelLayout.setVerticalGroup(
            ProjectTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 159, Short.MAX_VALUE)
        );

        ProjectRequestPanel.setMaximumSize(new java.awt.Dimension(600, 250));

        javax.swing.GroupLayout ProjectRequestPanelLayout = new javax.swing.GroupLayout(ProjectRequestPanel);
        ProjectRequestPanel.setLayout(ProjectRequestPanelLayout);
        ProjectRequestPanelLayout.setHorizontalGroup(
            ProjectRequestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 605, Short.MAX_VALUE)
        );
        ProjectRequestPanelLayout.setVerticalGroup(
            ProjectRequestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 143, Short.MAX_VALUE)
        );

        btnAcceptRequest.setText("Accept Request");
        btnAcceptRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptRequestActionPerformed(evt);
            }
        });

        btnManageProjects.setText("Manage Projects");
        btnManageProjects.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageProjectsActionPerformed(evt);
            }
        });

        lblExistingProjects.setText("Existing Projects");

        javax.swing.GroupLayout ProjectPaneLayout = new javax.swing.GroupLayout(ProjectPane);
        ProjectPane.setLayout(ProjectPaneLayout);
        ProjectPaneLayout.setHorizontalGroup(
            ProjectPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProjectPaneLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(ProjectRequestPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProjectPaneLayout.createSequentialGroup()
                .addGroup(ProjectPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ProjectPaneLayout.createSequentialGroup()
                        .addContainerGap(75, Short.MAX_VALUE)
                        .addComponent(ProjectTablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(btnManageProjects))
                    .addGroup(ProjectPaneLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(lblExistingProjects)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAcceptRequest)))
                .addGap(445, 445, 445))
        );
        ProjectPaneLayout.setVerticalGroup(
            ProjectPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProjectPaneLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(ProjectRequestPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(ProjectPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ProjectPaneLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(ProjectPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblExistingProjects)
                            .addComponent(btnAcceptRequest))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(ProjectTablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))
                    .addGroup(ProjectPaneLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnManageProjects)
                        .addGap(59, 59, 59))))
        );

        jTabbedPane.addTab("Project Dashboard", ProjectPane);
        
        javax.swing.GroupLayout UserRequestPanelLayout = new javax.swing.GroupLayout(UserRequestPanel);
        UserRequestPanel.setLayout(UserRequestPanelLayout);
        UserRequestPanelLayout.setHorizontalGroup(
            UserRequestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 582, Short.MAX_VALUE)
        );
        UserRequestPanelLayout.setVerticalGroup(
            UserRequestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 147, Short.MAX_VALUE)
        );

        btnUserAcceptRequest.setText("Accept Request");
        btnUserAcceptRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserAcceptRequestActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout UserTablePanelLayout = new javax.swing.GroupLayout(UserTablePanel);
        UserTablePanel.setLayout(UserTablePanelLayout);
        UserTablePanelLayout.setHorizontalGroup(
            UserTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 395, Short.MAX_VALUE)
        );
        UserTablePanelLayout.setVerticalGroup(
            UserTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 177, Short.MAX_VALUE)
        );

        btnManageUsers.setText("Manage Users");
        btnManageUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageUsersActionPerformed(evt);
            }
        });

        lblExistingUsers.setText("Existing Users");

        javax.swing.GroupLayout UserProfilesPaneLayout = new javax.swing.GroupLayout(UserProfilesPane);
        UserProfilesPane.setLayout(UserProfilesPaneLayout);
        UserProfilesPaneLayout.setHorizontalGroup(
            UserProfilesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UserProfilesPaneLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(UserRequestPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(UserProfilesPaneLayout.createSequentialGroup()
                .addGroup(UserProfilesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(UserProfilesPaneLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(UserTablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(UserProfilesPaneLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(lblExistingUsers)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                .addGroup(UserProfilesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnUserAcceptRequest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnManageUsers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(446, 446, 446))
        );
        UserProfilesPaneLayout.setVerticalGroup(
            UserProfilesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UserProfilesPaneLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(UserRequestPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(UserProfilesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblExistingUsers)
                    .addComponent(btnUserAcceptRequest))
                .addGap(15, 15, 15)
                .addGroup(UserProfilesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(UserTablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnManageUsers))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        jTabbedPane.addTab("User Profiles", UserProfilesPane);

        lblWelcome.setText("Hi,Welcome");

        btnLogout.setText("Log Out");

        javax.swing.GroupLayout titlePanelLayout = new javax.swing.GroupLayout(titlePanel);
        titlePanel.setLayout(titlePanelLayout);
        titlePanelLayout.setHorizontalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        titlePanelLayout.setVerticalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblWelcome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogout)
                .addGap(47, 47, 47))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(titlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWelcome)
                    .addComponent(btnLogout))
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);


        pack();
    }// </editor-fold>                        

    private void teamSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
    	CardLayout cl = (CardLayout)(cardPanel.getLayout());
        cl.show(cardPanel, "card1");
        cardPanel.setVisible(true);
        txtProjectName.setText("");
        projectSearchPanel.revalidate();
    	projectSearchPanel.repaint();
    }                                                

    private void projectSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        // TODO add your handling code here:
    	 CardLayout cl = (CardLayout)(cardPanel.getLayout());
         cl.show(cardPanel, "card2");
         cardPanel.setVisible(true);
    }                                          

    private void jTabbedPaneMouseClicked(java.awt.event.MouseEvent evt) {                                         
        // TODO add your handling code here:
        System.out.print("HI I am clicked here");
        cardPanel.setVisible(false);
        buttonGroup1.clearSelection();
    }   
    
    private void btn1SearchActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    	String projectName = txtProjectName.getText();
		 if (projectName.equals("")) {
			 JOptionPane.showMessageDialog(null, "Please enter the project name.");
			 return;
		 }
		
		 jTable2 = new JTable(/* add ur contoller*/);
		 jScrollPane2 = new JScrollPane(jTable2);
		 jScrollPane2.setPreferredSize(new Dimension(600, 200));
		 jScrollPane2.setViewportView(jTable2);
		 projectSearchPanel.setLayout(new BorderLayout());
		 projectSearchPanel.add(jScrollPane2, BorderLayout.CENTER);
		 txtProjectName.setText("");
		 projectSearchPanel.revalidate();
		 projectSearchPanel.repaint();
    } 

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    	String userName = txtParticipantName.getText();
    	 if (userName.equals("")) {
			 JOptionPane.showMessageDialog(null, "Please enter the user name.");
			 return;
		 }
		 
		
		 jTable1 = new JTable(/* add ur controller */);
		 jScrollPane1 = new JScrollPane(jTable1);
		 jScrollPane1.setPreferredSize(new Dimension(600, 200));
		 jScrollPane1.setViewportView(jTable1);
		 teamSearchPanel.setLayout(new BorderLayout());
		 teamSearchPanel.add(jScrollPane1, BorderLayout.CENTER);
		 txtParticipantName.setText("");
		 teamSearchPanel.revalidate();
		 teamSearchPanel.repaint();
    	
    } 
    
    private void btnViewBudgetActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }  
    
    
    private void btnUserAcceptRequestActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
    	 int selectedrow = jTable4.getSelectedRow();
		 if (selectedrow == -1) {
			 /* None selected. Do nothing. */
			 JOptionPane.showMessageDialog(null, "No row selected");
			 return;
		 }
		 
    	
    }                                                 

    private void btnAcceptRequestActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    	ProjectInfo projectInfo;
		 int selectedrow = jTable5.getSelectedRow();
		 if (selectedrow == -1) {
			 /* None selected. Do nothing. */
			 JOptionPane.showMessageDialog(null, "No row selected");
			 return;
		 }
		 

		 
    }   
    
    private void btnManageProjectsActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    	new ProjectInfoGUI().setVisible(true);
    } 
    
    
    private void btnManageUsersActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    } 
 
    
    
    
    
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
            java.util.logging.Logger.getLogger(AdminGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnLogout;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton projectSearchButton;
    private javax.swing.JRadioButton teamSearchButton;
    private javax.swing.JPanel cardPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel UserProfilesPane;
    private javax.swing.JTabbedPane jTabbedPane;
    private javax.swing.JLabel lblExistingProjects;
    private javax.swing.JLabel lblExistingUsers;
    private javax.swing.JLabel lblWelcome;
   
    private javax.swing.JPanel searchPane;
    private javax.swing.JPanel ProjectPane;
   
    private javax.swing.JPanel ProjectTablePanel;
    private javax.swing.JPanel UserRequestPanel;
    private javax.swing.JPanel UserTablePanel;
    private javax.swing.JButton btnUserAcceptRequest;
    private javax.swing.JButton btnAcceptRequest;
    private javax.swing.JButton btnManageProjects;
    private javax.swing.JButton btnManageUsers;
    
    
    
    // End of variables declaration                   
}
