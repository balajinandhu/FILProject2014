package package1;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
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
@SuppressWarnings("serial")
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
	private javax.swing.JPanel ProjectRequestPanel;
	private javax.swing.JPanel titlePanel;


	/**
	 * Creates new form AdminHomeGUI
	 */
	private UserRecord user;
	private JTable jTable3; // the table displayed on the GUI
	private ProjectUserController projectUserController;
	private TaskInfoController taskInfoController;
	private TempAddUserController tempAddMemberController;
	private ExistingProjectInfoController2 projectInfoController2;
	private TempAddProjectController tempAddProjectController;

	public AdminHomePageGUI() {
	}
	
	public AdminHomePageGUI(UserRecord user) {
		this.user = user;
		initComponents();
		projectUserController = new ProjectUserController(this);
		taskInfoController = new TaskInfoController(this);
		tempAddMemberController = new TempAddUserController(this);
		tempAddProjectController = new TempAddProjectController(this);
		projectInfoController2 = new ExistingProjectInfoController2(this);

		btnViewBudget = new javax.swing.JButton();
		jPanel3 = new javax.swing.JPanel();
		btnSearch = new javax.swing.JButton();
		teamSearchPanel = new javax.swing.JPanel();
		lblParticipantName = new javax.swing.JLabel();

		txtParticipantName = new javax.swing.JTextField();
		lblParticipantName.setText("Participant Name");

		teamSearchPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

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

		projectSearchPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

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
						.addGap(52, 52, 52)
						.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(btnViewBudget)
								.addComponent(projectSearchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGroup(jPanel5Layout.createSequentialGroup()
										.addComponent(lblProjectName)
										.addGap(97, 97, 97)
										.addComponent(txtProjectName, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(56, 56, 56)
										.addComponent(btn1Search)))
										.addContainerGap(526, Short.MAX_VALUE))
				);
		jPanel5Layout.setVerticalGroup(
				jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel5Layout.createSequentialGroup()
						.addGap(23, 23, 23)
						.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lblProjectName)
								.addComponent(txtProjectName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(btn1Search))
								.addGap(18, 18, 18)
								.addComponent(projectSearchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18)
								.addComponent(btnViewBudget)
								.addContainerGap(74, Short.MAX_VALUE))
				);
		cardPanel.add(jPanel5, "card2");

		cardPanel.setVisible(false);

		addJTable();
	}


	public void addJTable() {
		// add the data and column names to a JTable     


		// add a ListSelectionListener to the table


		// add the table to a scrollpane
		jTable3 = new JTable(projectInfoController2.getTableModel());
		JScrollPane scrollpane = new JScrollPane(jTable3);
		scrollpane.setPreferredSize(new Dimension(600, 200));
		// create a window
		ProjectTablePanel.setLayout(new BorderLayout());
		ProjectTablePanel.add(scrollpane, BorderLayout.CENTER);


		jTable4 = new JTable(tempAddMemberController.getTableModel());
		// add a ListSelectionListener to the table
		jTable4.getSelectionModel().addListSelectionListener(tempAddMemberController);
		jScrollPane4 = new JScrollPane(jTable4);
		jScrollPane4.setPreferredSize(new Dimension(600, 200));
		// create a window
		UserRequestPanel.setLayout(new BorderLayout());
		UserRequestPanel.add(jScrollPane4, BorderLayout.CENTER);

		jTable5 = new JTable(tempAddProjectController.getTableModel());
		// add a ListSelectionListener to the table
		jTable5.getSelectionModel().addListSelectionListener(tempAddProjectController);
		jScrollPane5 = new JScrollPane(jTable5);
		jScrollPane5.setPreferredSize(new Dimension(600, 200));
		// create a window
		ProjectRequestPanel.setLayout(new BorderLayout());
		ProjectRequestPanel.add(jScrollPane5, BorderLayout.CENTER);


		jTable2 = new JTable(projectUserController.getTableModel());
		jScrollPane2 = new JScrollPane(jTable2);
		jScrollPane2.setPreferredSize(new Dimension(600, 200));
		jScrollPane2.setViewportView(jTable2);
		projectSearchPanel.setLayout(new BorderLayout());
		projectSearchPanel.add(jScrollPane2, BorderLayout.CENTER);
		
		jTable1 = new JTable(taskInfoController.getTableModel());
		jScrollPane1 = new JScrollPane(jTable1);
		jScrollPane1.setPreferredSize(new Dimension(600, 200));
		jScrollPane1.setViewportView(jTable1);
		teamSearchPanel.setLayout(new BorderLayout());
		teamSearchPanel.add(jScrollPane1, BorderLayout.CENTER);
		
		projectSearchPanel.setVisible(false);
		teamSearchPanel.setVisible(false);


	}


	public void updateTable() {
		jTable3.setModel(projectInfoController2.getTableModel());
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
		btnaddUser = new javax.swing.JButton();
		btnUserDecline = new javax.swing.JButton();
		btnParticipantDecline = new javax.swing.JButton();

		jPanel1 = new javax.swing.JPanel();
		jPanel2 = new javax.swing.JPanel();
		//    jPanel3 = new javax.swing.JPanel();
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
		ProjectTablePanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Existing Projects"));

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

		ProjectRequestPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Participant Requests "));
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

		btnParticipantDecline.setText("Decline Request");
		btnParticipantDecline.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnParticipantDeclineActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout ProjectPaneLayout = new javax.swing.GroupLayout(ProjectPane);
		ProjectPane.setLayout(ProjectPaneLayout);
		ProjectPaneLayout.setHorizontalGroup(
				ProjectPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(ProjectPaneLayout.createSequentialGroup()
						.addGap(53, 53, 53)
						.addGroup(ProjectPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(ProjectRequestPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(ProjectTablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(ProjectPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(btnManageProjects)
										.addGroup(ProjectPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
												.addComponent(btnParticipantDecline, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(btnAcceptRequest, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
												.addContainerGap(292, Short.MAX_VALUE))
				);
		ProjectPaneLayout.setVerticalGroup(
				ProjectPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(ProjectPaneLayout.createSequentialGroup()
						.addGroup(ProjectPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(ProjectPaneLayout.createSequentialGroup()
										.addGap(26, 26, 26)
										.addComponent(ProjectRequestPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(ProjectPaneLayout.createSequentialGroup()
												.addGap(46, 46, 46)
												.addComponent(btnAcceptRequest)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(btnParticipantDecline)))
												.addGroup(ProjectPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(ProjectPaneLayout.createSequentialGroup()
																.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
																.addComponent(ProjectTablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
																.addGap(58, 58, 58))
																.addGroup(ProjectPaneLayout.createSequentialGroup()
																		.addGap(54, 54, 54)
																		.addComponent(btnManageProjects)
																		.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
				);

		jTabbedPane.addTab("Project Dashboard", ProjectPane);

		UserRequestPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("User Requests"));

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

		btnManageUsers.setText("Manage Users");
		btnManageUsers.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnManageUsersActionPerformed(evt);
			}
		});

		btnaddUser.setText("Add User");

		btnUserDecline.setText("Decline Request");
		btnUserDecline.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnUserDeclineActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout UserProfilesPaneLayout = new javax.swing.GroupLayout(UserProfilesPane);
		UserProfilesPane.setLayout(UserProfilesPaneLayout);
		UserProfilesPaneLayout.setHorizontalGroup(
				UserProfilesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(UserProfilesPaneLayout.createSequentialGroup()
						.addGap(70, 70, 70)
						.addComponent(UserRequestPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(UserProfilesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(btnUserAcceptRequest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnManageUsers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnUserDecline, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnaddUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addGap(0, 302, Short.MAX_VALUE))
				);
		UserProfilesPaneLayout.setVerticalGroup(
				UserProfilesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(UserProfilesPaneLayout.createSequentialGroup()
						.addGroup(UserProfilesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(UserProfilesPaneLayout.createSequentialGroup()
										.addGap(59, 59, 59)
										.addComponent(UserRequestPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(UserProfilesPaneLayout.createSequentialGroup()
												.addGap(74, 74, 74)
												.addComponent(btnUserAcceptRequest)
												.addGap(18, 18, 18)
												.addComponent(btnUserDecline)
												.addGap(19, 19, 19)
												.addComponent(btnManageUsers)
												.addGap(18, 18, 18)
												.addComponent(btnaddUser)))
												.addContainerGap(242, Short.MAX_VALUE))
				);

		jTabbedPane.addTab("User Profiles", UserProfilesPane);

		lblWelcome.setText("Welcome " + user.getUser_name() + "!");

		btnLogout.setText("Log Out");
		btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

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
		teamSearchPanel.setVisible(true);
		cardPanel.setVisible(true);
		txtProjectName.setText("");
		txtParticipantName.setText("");
	}                                                

	private void projectSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                    
		// TODO add your handling code here:
		CardLayout cl = (CardLayout)(cardPanel.getLayout());
		cl.show(cardPanel, "card2");
		projectSearchPanel.setVisible(true);
		cardPanel.setVisible(true);
		txtProjectName.setText("");
		txtParticipantName.setText("");
	}                                          

	private void jTabbedPaneMouseClicked(java.awt.event.MouseEvent evt) {                                         
		// TODO add your handling code here:
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
		if (projectUserController.readProjectbyUser(projectName) == null) {
			// projectSearchPanel.revalidate();
			// projectSearchPanel.repaint();
			JOptionPane.showMessageDialog(null, "Project does not exist.");
			return;
		}
		
		jTable2 = new JTable(projectUserController.getTableModel());
		jScrollPane2 = new JScrollPane(jTable2);
		jScrollPane2.setPreferredSize(new Dimension(600, 200));
		jScrollPane2.setViewportView(jTable2);
		projectSearchPanel.setLayout(new BorderLayout());
		projectSearchPanel.add(jScrollPane2, BorderLayout.CENTER);
		
		//txtProjectName.setText("");
		projectSearchPanel.setVisible(true);
		projectSearchPanel.revalidate();
		projectSearchPanel.repaint();
	} 

	private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {                                              
		// TODO add your handling code here:
		String userName = txtParticipantName.getText();
		if (userName.equals("")) {
			JOptionPane.showMessageDialog(null, "Please enter the User Name.");
			return;
		}

		if (taskInfoController.readTaskbyUser(userName) == null) {
			JOptionPane.showMessageDialog(null, "User \"" + userName + "\" or Task does not exist.");
			return;
		}
		jTable1 = new JTable(taskInfoController.getTableModel());
		jScrollPane1 = new JScrollPane(jTable1);
		jScrollPane1.setPreferredSize(new Dimension(600, 200));
		jScrollPane1.setViewportView(jTable1);
		teamSearchPanel.setLayout(new BorderLayout());
		teamSearchPanel.add(jScrollPane1, BorderLayout.CENTER);
		txtParticipantName.setText("");
		teamSearchPanel.setVisible(true);
		teamSearchPanel.revalidate();
		teamSearchPanel.repaint();

	} 

	private void btnViewBudgetActionPerformed(java.awt.event.ActionEvent evt) {                                              
		// TODO add your handling code here:

		String projectName = txtProjectName.getText();
		if (projectName.equals("")) {
			JOptionPane.showMessageDialog(null, "Please enter the Project Name.");
			return;
		}
		new BudgetGUI(projectName).setVisible(true);
	}  


	private void btnUserAcceptRequestActionPerformed(java.awt.event.ActionEvent evt) {                                                  
		// TODO add your handling code here:
		int selectedrow = jTable4.getSelectedRow();
		if (selectedrow == -1) {
			/* None selected. Do nothing. */
			JOptionPane.showMessageDialog(null, "No row selected");
			return;
		}
		TableModel tm= jTable4.getModel();
		String[] name = new String[jTable4.getColumnCount()];
		name[0] = (String) tm.getValueAt(selectedrow, 0);
		name[1] = (String) tm.getValueAt(selectedrow, 1);
		name[2] = (String) tm.getValueAt(selectedrow, 2);

		tempAddMemberController.addMemberRow(name, selectedrow);

	}                                                 

	private void btnAcceptRequestActionPerformed(java.awt.event.ActionEvent evt) {                                                
		// TODO add your handling code here:
		int selectedrow = jTable5.getSelectedRow();
		if (selectedrow == -1) {
			/* None selected. Do nothing. */
			JOptionPane.showMessageDialog(null, "No row selected");
			return;
		}
		TableModel tm= jTable5.getModel();
		String[] name = new String[jTable5.getColumnCount()];
		name[0] = (String) tm.getValueAt(selectedrow, 0);
		name[1] = (String) tm.getValueAt(selectedrow, 1);
		name[2] = (String) tm.getValueAt(selectedrow, 2);
		name[3] = (String) tm.getValueAt(selectedrow, 3);
		name[4] = (String) tm.getValueAt(selectedrow, 4);

		if (tempAddProjectController.addTeamRow(selectedrow, name) == null) {
			/* Alert message saying not able to add. */
			JOptionPane.showMessageDialog(null, "Team add failed.");
		}

		/* Update the Existing team with the record. */
		//projectInfoController2.addProjectRow(projectInfo);
	}   

	private void btnManageProjectsActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		new ProjectInfoGUI().setVisible(true);
		projectInfoController2.updateProjectTable();
		//ProjectTablePanel.revalidate();
		//ProjectRequestPanel.revalidate();
	} 


	private void btnManageUsersActionPerformed(java.awt.event.ActionEvent evt) {                                               
		// TODO add your handling code here:
		new UserRecordGUI().setVisible(true);
	} 


	private void btnParticipantDeclineActionPerformed(java.awt.event.ActionEvent evt) {                                                      
		// TODO add your handling code here:
		int selectedrow = jTable5.getSelectedRow();
		if (selectedrow == -1) {
			/* None selected. Do nothing. */
			JOptionPane.showMessageDialog(null, "No row selected");
			return;
		}
		TableModel tm= jTable5.getModel();
		String[] name = new String[jTable5.getColumnCount()];
		name[0] = (String) tm.getValueAt(selectedrow, 0);
		name[1] = (String) tm.getValueAt(selectedrow, 1);
		name[2] = (String) tm.getValueAt(selectedrow, 2);
		name[3] = (String) tm.getValueAt(selectedrow, 3);
		name[4] = (String) tm.getValueAt(selectedrow, 4);

		if (tempAddProjectController.delTeamRow(selectedrow, name) == null) {
			/* Alert message saying not able to add. */
			JOptionPane.showMessageDialog(null, "Team decline failed.");
		}
	}                                                     

	private void btnUserDeclineActionPerformed(java.awt.event.ActionEvent evt) {                                               
		// TODO add your handling code here:
		int selectedrow = jTable4.getSelectedRow();
		if (selectedrow == -1) {
			/* None selected. Do nothing. */
			JOptionPane.showMessageDialog(null, "No row selected");
			return;
		}
		TableModel tm= jTable4.getModel();
		String[] name = new String[jTable4.getColumnCount()];
		name[0] = (String) tm.getValueAt(selectedrow, 0);
		name[1] = (String) tm.getValueAt(selectedrow, 1);
		name[2] = (String) tm.getValueAt(selectedrow, 2);

		tempAddMemberController.delMemberRow(name, selectedrow);
	}
	
	private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
		new package2.LoginGUI().setVisible(true);
		dispose();
    }


	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
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
	private javax.swing.JButton btnaddUser;
	private javax.swing.JButton btnParticipantDecline;
	private javax.swing.JButton btnUserDecline;


	// End of variables declaration                   
}
