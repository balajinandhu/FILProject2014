package package1;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vkarnati
 */
public class AdminHomePageGUI extends javax.swing.JFrame {

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
    private javax.swing.JPanel AdminTeamPanel;
    private javax.swing.JPanel titlePanel;
   
    
    /**
     * Creates new form AdminHomeGUI
     */
    private JTable jtable3; // the table displayed on the GUI
    private ProjectInfoController projectTableController;
    private TeamInfoController teamInfoController;
    private TaskInfoController taskInfoController;
    private TempAddMemberController tempAddMemberController;
    private TempAddTeamController tempAddTeamController;
    
    public AdminHomePageGUI() {
        initComponents();
        projectTableController = new ProjectInfoController(this);
        teamInfoController = new TeamInfoController(this);
        taskInfoController = new TaskInfoController(this);
        tempAddMemberController = new TempAddMemberController(this);
        tempAddTeamController = new TempAddTeamController(this);
        addJTable();
        
       
        btnViewBudget = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnSearch = new javax.swing.JButton();
        teamSearchPanel = new javax.swing.JPanel();
        lblParticipantName = new javax.swing.JLabel();
        txtParticipantName = new javax.swing.JTextField();
       // jScrollPane1 = new javax.swing.JScrollPane();
    //    jTable1 = new javax.swing.JTable();
     //   jScrollPane1.setViewportView(jTable1);
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
    //    jScrollPane2 = new javax.swing.JScrollPane();
     //   jTable2 = new javax.swing.JTable();
        //jScrollPane2.setViewportView(jTable2);
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

    
    public void addJTable() {
    	// add the data and column names to a JTable
    	//jtable1  = new JTable(courseListTableController.getData(), courseListTableController.getColumnNames());
       
        
               
    	// add a ListSelectionListener to the table
    //	jtable3.getSelectionModel().addListSelectionListener(projectTableController);
    	
    	// add the table to a scrollpane
    	jtable3 = new JTable(teamInfoController.getTableModel());
        JScrollPane scrollpane = new JScrollPane(jtable3);
        scrollpane.setPreferredSize(new Dimension(600, 200));
    	// create a window
    	teamTablePanel.setLayout(new BorderLayout());
    	teamTablePanel.add(scrollpane, BorderLayout.CENTER);
    	
    	
    	jTable4 = new JTable(tempAddMemberController.getTableModel());
    	// add a ListSelectionListener to the table
    	jTable4.getSelectionModel().addListSelectionListener(tempAddMemberController);
        jScrollPane4 = new JScrollPane(jTable4);
        jScrollPane4.setPreferredSize(new Dimension(600, 200));
    	// create a window
    	addMemberPanel.setLayout(new BorderLayout());
    	addMemberPanel.add(jScrollPane4, BorderLayout.CENTER);
    	
    	jTable5 = new JTable(tempAddTeamController.getTableModel());
    	// add a ListSelectionListener to the table
    	jTable5.getSelectionModel().addListSelectionListener(tempAddTeamController);
        jScrollPane5 = new JScrollPane(jTable5);
        jScrollPane5.setPreferredSize(new Dimension(600, 200));
    	// create a window
    	AdminTeamPanel.setLayout(new BorderLayout());
    	AdminTeamPanel.add(jScrollPane5, BorderLayout.CENTER);
    	

    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

    	 AdminTeamPanel = new javax.swing.JPanel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane = new javax.swing.JTabbedPane();
        searchPane = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        teamSearchButton = new javax.swing.JRadioButton();
        projectSearchButton = new javax.swing.JRadioButton();
        cardPanel = new javax.swing.JPanel();
        teamPane = new javax.swing.JPanel();
        lblExistingTeams = new javax.swing.JLabel();
        teamTablePanel = new javax.swing.JPanel();
        lblWelcome = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        btnAdminAddTeam = new javax.swing.JButton();
        memberPane = new javax.swing.JPanel();
        addMemberPanel = new javax.swing.JPanel();
        btnAdminAddMember = new javax.swing.JButton();
        titlePanel = new JPanel();
        
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

        lblExistingTeams.setText("Existing Teams");

        javax.swing.GroupLayout teamTablePanelLayout = new javax.swing.GroupLayout(teamTablePanel);
        teamTablePanel.setLayout(teamTablePanelLayout);
        teamTablePanelLayout.setHorizontalGroup(
            teamTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 353, Short.MAX_VALUE)
        );
        teamTablePanelLayout.setVerticalGroup(
            teamTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 159, Short.MAX_VALUE)
        );

        AdminTeamPanel.setMaximumSize(new java.awt.Dimension(600, 250));

        javax.swing.GroupLayout AdminTeamPanelLayout = new javax.swing.GroupLayout(AdminTeamPanel);
        AdminTeamPanel.setLayout(AdminTeamPanelLayout);
        AdminTeamPanelLayout.setHorizontalGroup(
            AdminTeamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 599, Short.MAX_VALUE)
        );
        AdminTeamPanelLayout.setVerticalGroup(
            AdminTeamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 118, Short.MAX_VALUE)
        );

        btnAdminAddTeam.setText("Add Team");
        btnAdminAddTeam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminAddTeamActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout teamPaneLayout = new javax.swing.GroupLayout(teamPane);
        teamPane.setLayout(teamPaneLayout);
        teamPaneLayout.setHorizontalGroup(
            teamPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(teamPaneLayout.createSequentialGroup()
                .addGroup(teamPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(teamPaneLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(AdminTeamPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAdminAddTeam))
                    .addGroup(teamPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblExistingTeams))
                    .addGroup(teamPaneLayout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(teamTablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        teamPaneLayout.setVerticalGroup(
            teamPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(teamPaneLayout.createSequentialGroup()
                .addGroup(teamPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(teamPaneLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(btnAdminAddTeam))
                    .addGroup(teamPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(AdminTeamPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(lblExistingTeams)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(teamTablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(140, Short.MAX_VALUE))
        );

        jTabbedPane.addTab("Team", teamPane);

        javax.swing.GroupLayout addMemberPanelLayout = new javax.swing.GroupLayout(addMemberPanel);
        addMemberPanel.setLayout(addMemberPanelLayout);
        addMemberPanelLayout.setHorizontalGroup(
            addMemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 615, Short.MAX_VALUE)
        );
        addMemberPanelLayout.setVerticalGroup(
            addMemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 183, Short.MAX_VALUE)
        );

        btnAdminAddMember.setText("Add Member");
        btnAdminAddMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminAddMemberActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout memberPaneLayout = new javax.swing.GroupLayout(memberPane);
        memberPane.setLayout(memberPaneLayout);
        memberPaneLayout.setHorizontalGroup(
            memberPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(memberPaneLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(addMemberPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(160, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, memberPaneLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAdminAddMember)
                .addGap(130, 130, 130))
        );
        memberPaneLayout.setVerticalGroup(
            memberPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(memberPaneLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnAdminAddMember)
                .addGap(26, 26, 26)
                .addComponent(addMemberPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(219, Short.MAX_VALUE))
        );

        jTabbedPane.addTab("Member", memberPane);

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
    	projectTableController.readProjectbyUser(projectName);
    	jTable2 = new JTable(projectTableController.getTableModel());
     	jScrollPane2 = new JScrollPane(jTable2);
     	jScrollPane2.setPreferredSize(new Dimension(600, 200));
        jScrollPane2.setViewportView(jTable2);
    	System.out.println("Search action performed");
    	projectSearchPanel.setLayout(new BorderLayout());
    	projectSearchPanel.add(jScrollPane2, BorderLayout.CENTER);
    	txtProjectName.setText("");
    	projectSearchPanel.revalidate();
    	projectSearchPanel.repaint();
    } 

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    	String userName = txtParticipantName.getText();
    	taskInfoController.readTaskbyUser(userName);
    	jTable1 = new JTable(taskInfoController.getTableModel());
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
    
    
    private void btnAdminAddMemberActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
    	int selectedrow = jTable4.getSelectedRow();
    	
    	TableModel tm= jTable4.getModel();
    	String[] name = new String[jTable4.getColumnCount()];
    	name[0] = (String) tm.getValueAt(selectedrow, 0);
    	name[1] = (String) tm.getValueAt(selectedrow, 1);
    	name[2] = (String) tm.getValueAt(selectedrow, 2);
    	
    	 tempAddMemberController.addMemberRow(name, selectedrow);
    	
    }                                                 

    private void btnAdminAddTeamActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    	int selectedrow = jTable5.getSelectedRow();
    	
    	TableModel tm= jTable5.getModel();
    	String[] name = new String[jTable5.getColumnCount()];
    	int rowIndex = jTable5.getSelectedRow();
    	name[0] = (String) tm.getValueAt(selectedrow, 0);
    	name[1] = (String) tm.getValueAt(selectedrow, 1);
    	name[2] = (String) tm.getValueAt(selectedrow, 2);
    	name[3] = (String) tm.getValueAt(selectedrow, 3);
    	name[4] = (String) tm.getValueAt(selectedrow, 4);
    	
    	 tempAddTeamController.addTeamRow(rowIndex, name);
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
            java.util.logging.Logger.getLogger(AdminHomePageGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminHomePageGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminHomePageGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminHomePageGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminHomePageGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnLogout;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel cardPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel memberPane;
    private javax.swing.JTabbedPane jTabbedPane;
    private javax.swing.JLabel lblExistingTeams;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JRadioButton projectSearchButton;
    private javax.swing.JPanel searchPane;
    private javax.swing.JPanel teamPane;
    private javax.swing.JRadioButton teamSearchButton;
    private javax.swing.JPanel teamTablePanel;
    private javax.swing.JPanel addMemberPanel;
    private javax.swing.JButton btnAdminAddMember;
    private javax.swing.JButton btnAdminAddTeam;
    
    
    
    // End of variables declaration                   
}
