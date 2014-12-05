package package2;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 * 
 * @author tvs
 */
public class UserHomeGUI extends javax.swing.JFrame {

	private javax.swing.JPanel jPanel5;
	private javax.swing.JButton btn1Search;
	private javax.swing.JPanel projectSearchPanel;
	private javax.swing.JTextField txtProjectName;
	private ProjectUserController projectUserController;

	/**
	 * Creates new form UserHomeGUI
	 */
	private javax.swing.JTable tblConversations;
	private javax.swing.JTable tblMembers;
	private javax.swing.JTable tblProject;
	private ProjectUserController projectTableController;
	private ProjectInfoController2 projectInfoController;
	private TeamInfoController teamInfoController;
	private TaskInfoController taskInfoController;
	private JTextField txtParticipantName;

	public UserHomeGUI() {

		initComponents();
		projectUserController = new ProjectUserController(this);
		projectInfoController = new ProjectInfoController2(this);
		teamInfoController = new TeamInfoController(this);
		taskInfoController = new TaskInfoController(this);
		addJTable();

		btnViewBudget = new javax.swing.JButton();
		jPanel3 = new javax.swing.JPanel();
		btnSearch = new javax.swing.JButton();
		teamSearchPanel = new javax.swing.JPanel();
		lblParticipantName = new javax.swing.JLabel();
		txtParticipantName = new javax.swing.JTextField();
		// jScrollPane1 = new javax.swing.JScrollPane();
		// jTable1 = new javax.swing.JTable();
		// jScrollPane1.setViewportView(jTable1);
		lblParticipantName.setText("Participant Name");
		javax.swing.GroupLayout teamSearchPanelLayout = new javax.swing.GroupLayout(
				teamSearchPanel);
		teamSearchPanel.setLayout(teamSearchPanelLayout);
		teamSearchPanelLayout.setHorizontalGroup(teamSearchPanelLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 593, Short.MAX_VALUE));
		teamSearchPanelLayout.setVerticalGroup(teamSearchPanelLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 172, Short.MAX_VALUE));

		btnSearch.setText("Search");

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(
				jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout
				.setHorizontalGroup(jPanel3Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel3Layout
										.createSequentialGroup()
										.addGroup(
												jPanel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel3Layout
																		.createSequentialGroup()
																		.addGap(134,
																				134,
																				134)
																		.addComponent(
																				lblParticipantName)
																		.addGap(94,
																				94,
																				94)
																		.addComponent(
																				txtParticipantName,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				114,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(57,
																				57,
																				57)
																		.addComponent(
																				btnSearch))
														.addGroup(
																jPanel3Layout
																		.createSequentialGroup()
																		.addContainerGap()
																		.addComponent(
																				teamSearchPanel,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addContainerGap(237, Short.MAX_VALUE)));
		jPanel3Layout
				.setVerticalGroup(jPanel3Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel3Layout
										.createSequentialGroup()
										.addGap(23, 23, 23)
										.addGroup(
												jPanel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																lblParticipantName)
														.addComponent(
																txtParticipantName,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(btnSearch))
										.addGap(44, 44, 44)
										.addComponent(
												teamSearchPanel,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(123, Short.MAX_VALUE)));

		cardPanel.add(jPanel3, "card1");

		jPanel5 = new javax.swing.JPanel();
		btn1Search = new javax.swing.JButton();
		projectSearchPanel = new javax.swing.JPanel();
		lblProjectName = new javax.swing.JLabel();
		txtProjectName = new javax.swing.JTextField();
		// jScrollPane2 = new javax.swing.JScrollPane();
		// jTable2 = new javax.swing.JTable();
		// jScrollPane2.setViewportView(jTable2);
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

		javax.swing.GroupLayout projectSearchPanelLayout = new javax.swing.GroupLayout(
				projectSearchPanel);
		projectSearchPanel.setLayout(projectSearchPanelLayout);
		projectSearchPanelLayout.setHorizontalGroup(projectSearchPanelLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 598, Short.MAX_VALUE));
		projectSearchPanelLayout.setVerticalGroup(projectSearchPanelLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 148, Short.MAX_VALUE));

		btnViewBudget.setText("View Budget");
		btnViewBudget.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnViewBudgetActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(
				jPanel5);
		jPanel5.setLayout(jPanel5Layout);
		jPanel5Layout.setHorizontalGroup(jPanel5Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						jPanel5Layout
								.createSequentialGroup()
								.addGap(169, 169, 169)
								.addComponent(lblProjectName)
								.addGap(97, 97, 97)
								.addComponent(txtProjectName,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										104,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(56, 56, 56)
								.addComponent(btn1Search)
								.addContainerGap(
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE))
				.addGroup(
						jPanel5Layout
								.createSequentialGroup()
								.addComponent(projectSearchPanel,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(40, 40, 40).addComponent(btnViewBudget)
								.addGap(0, 39, Short.MAX_VALUE)));
		jPanel5Layout
				.setVerticalGroup(jPanel5Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel5Layout
										.createSequentialGroup()
										.addGap(23, 23, 23)
										.addGroup(
												jPanel5Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																lblProjectName)
														.addComponent(
																txtProjectName,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																btn1Search))
										.addGroup(
												jPanel5Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel5Layout
																		.createSequentialGroup()
																		.addGap(18,
																				18,
																				18)
																		.addComponent(
																				projectSearchPanel,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																jPanel5Layout
																		.createSequentialGroup()
																		.addGap(37,
																				37,
																				37)
																		.addComponent(
																				btnViewBudget)))
										.addContainerGap(127, Short.MAX_VALUE)));

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

		buttonGroup1 = new javax.swing.ButtonGroup();
		jPanel1 = new javax.swing.JPanel();
		lblWelcome = new javax.swing.JLabel();
		lblWelcomeRole = new javax.swing.JLabel();
		jLabel1 = new javax.swing.JLabel();
		btnLogOut = new javax.swing.JButton();
		jTabbedPane1 = new javax.swing.JTabbedPane();
		ProjectRbtnSearchPanel = new javax.swing.JPanel();
		cardPanel = new javax.swing.JPanel();
		lblSearch = new javax.swing.JLabel();
		rbtnTeamMember = new javax.swing.JRadioButton();
		rtbnProject = new javax.swing.JRadioButton();
		btnSearch = new javax.swing.JButton();
		pnlProject = new javax.swing.JPanel();
		jButton1 = new javax.swing.JButton();
		pnlBody = new javax.swing.JPanel();
		jScrollPane1 = new javax.swing.JScrollPane();

		pnlControlButtons = new javax.swing.JPanel();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();

		pnlMember = new javax.swing.JPanel();
		btnAdd = new javax.swing.JButton();
		pnlMemberBody = new javax.swing.JPanel();
		jScrollPane2 = new javax.swing.JScrollPane();
		tblMembers = new javax.swing.JTable();
		pnlConversation = new javax.swing.JPanel();
		cmbProjects = new javax.swing.JComboBox();
		cmbSelectProject = new javax.swing.JComboBox();
		pnlConversations = new javax.swing.JPanel();
		jScrollPane3 = new javax.swing.JScrollPane();
		tblConversations = new javax.swing.JTable();
		pnlHead = new javax.swing.JPanel();
		picLabel = new javax.swing.JLabel();
		lblParticpantName = new javax.swing.JLabel();
		lblProjectName = new javax.swing.JLabel();

		buttonGroup1 = new javax.swing.ButtonGroup();
		jPanel1 = new javax.swing.JPanel();
		searchPane = new javax.swing.JPanel();
		jPanel2 = new javax.swing.JPanel();

		cardPanel = new javax.swing.JPanel();
		teamPane = new javax.swing.JPanel();
		lblExistingTeams = new javax.swing.JLabel();
		teamTablePanel = new javax.swing.JPanel();
		btnAdminAddTeam = new javax.swing.JButton();
		memberPane = new javax.swing.JPanel();
		addMemberPanel = new javax.swing.JPanel();
		btnAdminAddMember = new javax.swing.JButton();

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 100,
				Short.MAX_VALUE));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 100,
				Short.MAX_VALUE));

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jPanel1.setBorder(javax.swing.BorderFactory
				.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
		jPanel1.setAlignmentX(CENTER_ALIGNMENT);
		jPanel1.setAlignmentY(CENTER_ALIGNMENT);

		jTabbedPane1.setBorder(javax.swing.BorderFactory
				.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
		jTabbedPane1
				.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
		jTabbedPane1.setAlignmentX(CENTER_ALIGNMENT);
		jTabbedPane1.setAlignmentY(CENTER_ALIGNMENT);

		lblWelcome.setText("Hi, Welcome ");

		btnLogOut.setText("Log Out");

		lblSearch.setText("Search");
		btnSearch.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnSearchActionPerformed(evt);
			}
		});

		lblParticpantName.setText("Participant Name");
		lblProjectName.setText("Project Name");

		searchPane.setLayout(new java.awt.CardLayout());

		buttonGroup1.add(rbtnTeamMember);
		rbtnTeamMember.setText("Search by Team member");
		rbtnTeamMember.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				teamSearchButtonActionPerformed(evt);
			}
		});

		buttonGroup1.add(rtbnProject);
		rtbnProject.setText("Search by Project");
		rtbnProject.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				projectSearchButtonActionPerformed(evt);
			}
		});

		cardPanel.setLayout(new java.awt.CardLayout());

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(
				jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout
				.setHorizontalGroup(jPanel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(cardPanel,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)
						.addGroup(
								jPanel2Layout
										.createSequentialGroup()
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addGap(189,
																				189,
																				189)
																		.addComponent(
																				rbtnTeamMember)
																		.addGap(97,
																				97,
																				97)
																		.addComponent(
																				rtbnProject)))
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)));
		jPanel2Layout
				.setVerticalGroup(jPanel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel2Layout
										.createSequentialGroup()
										.addGap(16, 16, 16)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																rbtnTeamMember)
														.addComponent(
																rtbnProject))
										.addGap(18, 18, 18)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												cardPanel,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												519, Short.MAX_VALUE)));

		searchPane.add(jPanel2, "card2");

		jTabbedPane1.addTab("Search", searchPane);

		jButton1.setText("Add Project");

		jScrollPane1.setViewportView(tblProject);

		jButton2.setText("View Budget");

		jButton3.setText("View Timeline");

		javax.swing.GroupLayout pnlControlButtonsLayout = new javax.swing.GroupLayout(
				pnlControlButtons);
		pnlControlButtons.setLayout(pnlControlButtonsLayout);
		pnlControlButtonsLayout.setHorizontalGroup(pnlControlButtonsLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						pnlControlButtonsLayout
								.createSequentialGroup()
								.addGap(30, 30, 30)
								.addComponent(jButton2)
								.addGap(93, 93, 93)
								.addComponent(jButton3)
								.addContainerGap(
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)));
		pnlControlButtonsLayout
				.setVerticalGroup(pnlControlButtonsLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								pnlControlButtonsLayout
										.createSequentialGroup()
										.addContainerGap(26, Short.MAX_VALUE)
										.addGroup(
												pnlControlButtonsLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jButton2)
														.addComponent(jButton3))
										.addGap(19, 19, 19)));

		javax.swing.GroupLayout pnlBodyLayout = new javax.swing.GroupLayout(
				pnlBody);
		pnlBody.setLayout(pnlBodyLayout);
		pnlBodyLayout
				.setHorizontalGroup(pnlBodyLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								pnlBodyLayout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												pnlBodyLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																pnlBodyLayout
																		.createSequentialGroup()
																		/*
																		 * .
																		 * addComponent
																		 * (
																		 * jScrollPane1
																		 * ,
																		 * javax
																		 * .
																		 * swing
																		 * .
																		 * GroupLayout
																		 * .
																		 * PREFERRED_SIZE
																		 * ,
																		 * 779,
																		 * javax
																		 * .
																		 * swing
																		 * .
																		 * GroupLayout
																		 * .
																		 * PREFERRED_SIZE
																		 * )
																		 */
																		.addContainerGap(
																				13,
																				Short.MAX_VALUE))
														.addComponent(
																pnlControlButtons,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE))));
		pnlBodyLayout.setVerticalGroup(pnlBodyLayout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				pnlBodyLayout
						.createSequentialGroup()
						.addGap(66, 66, 66)
						/*
						 * .addComponent(jScrollPane1,
						 * javax.swing.GroupLayout.PREFERRED_SIZE, 274,
						 * javax.swing.GroupLayout.PREFERRED_SIZE) .addGap(18,
						 * 18, 18)
						 */
						.addComponent(pnlControlButtons,
								javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(31, Short.MAX_VALUE)));

		javax.swing.GroupLayout pnlProjectLayout = new javax.swing.GroupLayout(
				pnlProject);
		pnlProject.setLayout(pnlProjectLayout);
		pnlProjectLayout
				.setHorizontalGroup(pnlProjectLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								pnlProjectLayout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												pnlProjectLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																pnlBody,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGroup(
																pnlProjectLayout
																		.createSequentialGroup()
																		.addGap(14,
																				14,
																				14)
																		.addComponent(
																				jButton1)))
										.addContainerGap(68, Short.MAX_VALUE)));
		pnlProjectLayout.setVerticalGroup(pnlProjectLayout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				pnlProjectLayout
						.createSequentialGroup()
						.addContainerGap()
						.addComponent(jButton1)
						.addGap(18, 18, 18)
						.addComponent(pnlBody,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE).addContainerGap()));

		jTabbedPane1.addTab("Project", pnlProject);

		btnAdd.setLabel("Add Member");
		cmbSelectProject.setModel(new javax.swing.DefaultComboBoxModel(
				new String[] { "Select..", "Item 2", "Item 3", "Item 4" }));

		jScrollPane2.setViewportView(tblMembers);

		javax.swing.GroupLayout pnlMemberBodyLayout = new javax.swing.GroupLayout(
				pnlMemberBody);
		pnlMemberBody.setLayout(pnlMemberBodyLayout);
		pnlMemberBodyLayout
				.setHorizontalGroup(pnlMemberBodyLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								pnlMemberBodyLayout
										.createSequentialGroup()
										.addContainerGap()

										.addComponent(
												jScrollPane2,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												840, Short.MAX_VALUE)
										.addContainerGap()));
		pnlMemberBodyLayout.setVerticalGroup(pnlMemberBodyLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						pnlMemberBodyLayout
								.createSequentialGroup()
								.addContainerGap()

								.addComponent(jScrollPane2,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										399,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(37, Short.MAX_VALUE)));

		javax.swing.GroupLayout pnlMemberLayout = new javax.swing.GroupLayout(
				pnlMember);
		pnlMember.setLayout(pnlMemberLayout);
		pnlMemberLayout
				.setHorizontalGroup(pnlMemberLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								pnlMemberLayout
										.createSequentialGroup()
										.addGap(26, 26, 26)
										.addGroup(
												pnlMemberLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																cmbSelectProject,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																134,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(0, 0,
																Short.MAX_VALUE)
														.addComponent(
																pnlMemberBody,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(btnAdd))
										.addContainerGap(20, Short.MAX_VALUE)));
		pnlMemberLayout.setVerticalGroup(pnlMemberLayout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				pnlMemberLayout
						.createSequentialGroup()
						.addContainerGap()
						.addComponent(btnAdd)
						.addGap(38, 38, 38)
						.addComponent(cmbSelectProject,
								javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(0, 0, Short.MAX_VALUE)
						.addComponent(pnlMemberBody,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE).addContainerGap()));

		jTabbedPane1.addTab("Member", pnlMember);

		cmbProjects.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"Select..", "Item 2", "Item 3", "Item 4" }));

		jScrollPane3.setViewportView(tblConversations);

		javax.swing.GroupLayout pnlConversationsLayout = new javax.swing.GroupLayout(
				pnlConversations);
		pnlConversations.setLayout(pnlConversationsLayout);
		pnlConversationsLayout
				.setHorizontalGroup(pnlConversationsLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								pnlConversationsLayout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(
												jScrollPane3,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												840, Short.MAX_VALUE)
										.addContainerGap()));
		pnlConversationsLayout.setVerticalGroup(pnlConversationsLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						pnlConversationsLayout
								.createSequentialGroup()
								.addContainerGap()
								.addComponent(jScrollPane3,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										399,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)));

		javax.swing.GroupLayout pnlConversationLayout = new javax.swing.GroupLayout(
				pnlConversation);
		pnlConversation.setLayout(pnlConversationLayout);
		pnlConversationLayout
				.setHorizontalGroup(pnlConversationLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								pnlConversationLayout
										.createSequentialGroup()
										.addGroup(
												pnlConversationLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																pnlConversationLayout
																		.createSequentialGroup()
																		.addGap(27,
																				27,
																				27)
																		.addComponent(
																				cmbProjects,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				134,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(0,
																				0,
																				Short.MAX_VALUE))
														.addGroup(
																pnlConversationLayout
																		.createSequentialGroup()
																		.addContainerGap()
																		.addComponent(
																				pnlConversations,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)))
										.addContainerGap()));
		pnlConversationLayout.setVerticalGroup(pnlConversationLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						pnlConversationLayout
								.createSequentialGroup()
								.addContainerGap()
								.addComponent(cmbProjects,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18)
								.addComponent(pnlConversations,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE).addContainerGap()));

		jTabbedPane1.addTab("Conversations", pnlConversation);

		picLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		picLabel.setIcon(new javax.swing.ImageIcon(
				"C:\\Users\\tvs\\Desktop\\ooad proj pics\\fil-3squares-02.jpg")); // NOI18N

		javax.swing.GroupLayout pnlHeadLayout = new javax.swing.GroupLayout(
				pnlHead);
		pnlHead.setLayout(pnlHeadLayout);
		pnlHeadLayout.setHorizontalGroup(pnlHeadLayout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				pnlHeadLayout
						.createSequentialGroup()
						.addGap(62, 62, 62)
						.addComponent(picLabel,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE).addContainerGap()));
		pnlHeadLayout.setVerticalGroup(pnlHeadLayout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				javax.swing.GroupLayout.Alignment.TRAILING,
				pnlHeadLayout
						.createSequentialGroup()
						.addContainerGap(28, Short.MAX_VALUE)
						.addComponent(picLabel,
								javax.swing.GroupLayout.PREFERRED_SIZE, 49,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(23, 23, 23)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addContainerGap(
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING,
												false)
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		pnlHead,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		Short.MAX_VALUE)
																.addContainerGap())
												.addGroup(
														layout.createSequentialGroup()
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addGroup(
																						layout.createSequentialGroup()
																								.addGap(77,
																										77,
																										77)
																								.addComponent(
																										lblWelcomeRole))
																				.addComponent(
																						lblWelcome,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						85,
																						javax.swing.GroupLayout.PREFERRED_SIZE))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		jLabel1,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		0,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		Short.MAX_VALUE)
																.addComponent(
																		btnLogOut))
												.addComponent(jTabbedPane1))));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(pnlHead,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.TRAILING)
												.addGroup(
														layout.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
																.addComponent(
																		lblWelcome)
																.addComponent(
																		lblWelcomeRole)
																.addComponent(
																		btnLogOut))
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		jLabel1,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		0,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addGap(14, 14,
																		14)))
								.addComponent(jTabbedPane1).addContainerGap()));

		pack();
		this.setSize(new Dimension(950, 750));
	}

	private void teamSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		CardLayout cl = (CardLayout) (cardPanel.getLayout());
		cl.show(cardPanel, "card1");
		cardPanel.setVisible(true);
		txtProjectName.setText("");
		projectSearchPanel.revalidate();
		projectSearchPanel.repaint();
	}

	private void projectSearchButtonActionPerformed(
			java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		CardLayout cl = (CardLayout) (cardPanel.getLayout());
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
		projectUserController.readProjectbyUser(projectName);
		jTable2 = new JTable(projectUserController.getTableModel());
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

	public void addJTable() {
		// add the data and column names to a JTable
		// jtable1 = new JTable(courseListTableController.getData(),
		// courseListTableController.getColumnNames());

		// add a ListSelectionListener to the table
		// jtable3.getSelectionModel().addListSelectionListener(projectTableController);
		pnlBody.setPreferredSize(new Dimension(850, 300));
		// add the table to a scrollpane
		tblProject = new JTable(projectInfoController.getTableModel());
		JScrollPane scrollpane = new JScrollPane(tblProject);
		scrollpane.setPreferredSize(new Dimension(800, 300));
		// create a window
		pnlBody.setLayout(new BorderLayout());
		pnlBody.add(scrollpane, BorderLayout.CENTER);

		/*
		 * jTable4 = new JTable(tempAddMemberController.getTableModel());
		 * jScrollPane4 = new JScrollPane(jTable4); // create a window
		 * addMemberPanel.setLayout(new BorderLayout());
		 * addMemberPanel.add(jScrollPane4, BorderLayout.CENTER);
		 */

	}

	// </editor-fold>

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */

		// <editor-fold defaultstate="collapsed"
		// desc=" Look and feel setting code (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the
		 * default look and feel. For details see
		 * http://download.oracle.com/javase
		 * /tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
					.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(UserHomeGUI.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(UserHomeGUI.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(UserHomeGUI.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(UserHomeGUI.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new UserHomeGUI().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify
	private javax.swing.JButton btnAdd;
	private javax.swing.JButton btnLogOut;
	private javax.swing.JComboBox cmbProjects;
	private javax.swing.JComboBox cmbSelectProject;
	private javax.swing.JButton btnSearch;
	private javax.swing.ButtonGroup buttonGroup1;
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JLabel lblSearch;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel lblParticpantName;
	private javax.swing.JLabel lblProjectName;
	private javax.swing.JRadioButton rbtnTeamMember;
	private javax.swing.JRadioButton rtbnProject;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JScrollPane jScrollPane3;
	private javax.swing.JTabbedPane jTabbedPane1;
	private javax.swing.JLabel lblWelcome;
	private javax.swing.JLabel lblWelcomeRole;
	private javax.swing.JLabel picLabel;
	private javax.swing.JPanel pnlBody;
	private javax.swing.JPanel pnlControlButtons;
	private javax.swing.JPanel pnlConversation;
	private javax.swing.JPanel pnlConversations;
	private javax.swing.JPanel pnlHead;
	private javax.swing.JPanel pnlMember;
	private javax.swing.JPanel pnlMemberBody;
	private javax.swing.JPanel pnlProject;
	private javax.swing.JPanel ProjectRbtnSearchPanel;
	private javax.swing.JPanel cardPanel;
	private JButton btnViewBudget;
	private JPanel jPanel3;
	private JPanel teamSearchPanel;
	private JLabel lblParticipantName;
	private javax.swing.JButton btnLogout;
	private javax.swing.JTable jTable1;
	private javax.swing.JTable jTable2;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel memberPane;
	private javax.swing.JTabbedPane jTabbedPane;
	private javax.swing.JLabel lblExistingTeams;
	private javax.swing.JPanel searchPane;
	private javax.swing.JPanel teamPane;
	private javax.swing.JPanel teamTablePanel;
	private javax.swing.JPanel addMemberPanel;
	private javax.swing.JButton btnAdminAddMember;
	private javax.swing.JButton btnAdminAddTeam;

	// End of variables declaration
}
