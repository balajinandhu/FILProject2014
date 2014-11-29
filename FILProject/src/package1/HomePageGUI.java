package package1;

import java.awt.BorderLayout;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author karnati_sruti
 */
@SuppressWarnings("serial")
public class HomePageGUI extends javax.swing.JFrame {

	/**
	 * Creates new form Admin
	 */

	private JTable jtable1; // the table displayed on the GUI
	private ProjectInfoController projectTableController;

	public HomePageGUI() {
		initComponents();
		projectTableController = new ProjectInfoController(this);
		addJTable();
	}

	public void addJTable() {
		// add the data and column names to a JTable
		//jtable1  = new JTable(courseListTableController.getData(), courseListTableController.getColumnNames());

		jtable1 = new JTable(projectTableController.getTableModel());

		// add a ListSelectionListener to the table
		//jtable1.getSelectionModel().addListSelectionListener(projectTableController);
		// add the table to a scrollpane
		JScrollPane scrollpane = new JScrollPane(jtable1);
		// create a window
		jPanel3.setLayout(new BorderLayout());
		jPanel3.add(scrollpane, BorderLayout.CENTER);


	}

	public void updateTable() {
		jtable1.setModel(projectTableController.getTableModel());
	}
	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */

	// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jPanel2 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		btnLogout = new javax.swing.JButton();
		jTabbedPane2 = new javax.swing.JTabbedPane();
		SearchPanel = new javax.swing.JPanel();
		lblSearch = new javax.swing.JLabel();
		rbtnTeamMember = new javax.swing.JRadioButton();
		rtbnProject = new javax.swing.JRadioButton();
		btnSearch = new javax.swing.JButton();
		jPanel3 = new javax.swing.JPanel();
		TeamPanel = new javax.swing.JPanel();
		MemberPanel = new javax.swing.JPanel();
		ForumPanel = new javax.swing.JPanel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(
				jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 190, Short.MAX_VALUE)
				);
		jPanel2Layout.setVerticalGroup(
				jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 76, Short.MAX_VALUE)
				);

		jLabel1.setText("Hi, welcome Admin");

		btnLogout.setText("Logout");

		jTabbedPane2.setBorder(javax.swing.BorderFactory.createCompoundBorder());
		jTabbedPane2.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);

		SearchPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

		lblSearch.setText("Search");

		rbtnTeamMember.setText("By Team Member");

		rtbnProject.setText("By Project");

		btnSearch.setText("Search");

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(
				jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 201, Short.MAX_VALUE)
				);
		jPanel3Layout.setVerticalGroup(
				jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 120, Short.MAX_VALUE)
				);

		javax.swing.GroupLayout SearchPanelLayout = new javax.swing.GroupLayout(SearchPanel);
		SearchPanel.setLayout(SearchPanelLayout);
		SearchPanelLayout.setHorizontalGroup(
				SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(SearchPanelLayout.createSequentialGroup()
						.addGroup(SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(SearchPanelLayout.createSequentialGroup()
										.addContainerGap()
										.addComponent(lblSearch))
										.addGroup(SearchPanelLayout.createSequentialGroup()
												.addGap(76, 76, 76)
												.addComponent(rbtnTeamMember)
												.addGap(62, 62, 62)
												.addComponent(rtbnProject)
												.addGap(112, 112, 112)
												.addComponent(btnSearch))
												.addGroup(SearchPanelLayout.createSequentialGroup()
														.addGap(40, 40, 40)
														.addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
														.addContainerGap(301, Short.MAX_VALUE))
				);
		SearchPanelLayout.setVerticalGroup(
				SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(SearchPanelLayout.createSequentialGroup()
						.addGap(21, 21, 21)
						.addComponent(lblSearch)
						.addGap(18, 18, 18)
						.addGroup(SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(rbtnTeamMember)
								.addGroup(SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(rtbnProject)
										.addComponent(btnSearch)))
										.addGap(34, 34, 34)
										.addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(73, Short.MAX_VALUE))
				);

		jTabbedPane2.addTab("Search", SearchPanel);

		javax.swing.GroupLayout TeamPanelLayout = new javax.swing.GroupLayout(TeamPanel);
		TeamPanel.setLayout(TeamPanelLayout);
		TeamPanelLayout.setHorizontalGroup(
				TeamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 802, Short.MAX_VALUE)
				);
		TeamPanelLayout.setVerticalGroup(
				TeamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 413, Short.MAX_VALUE)
				);

		jTabbedPane2.addTab("Team", TeamPanel);

		javax.swing.GroupLayout MemberPanelLayout = new javax.swing.GroupLayout(MemberPanel);
		MemberPanel.setLayout(MemberPanelLayout);
		MemberPanelLayout.setHorizontalGroup(
				MemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 802, Short.MAX_VALUE)
				);
		MemberPanelLayout.setVerticalGroup(
				MemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 413, Short.MAX_VALUE)
				);

		jTabbedPane2.addTab("Member", MemberPanel);

		javax.swing.GroupLayout ForumPanelLayout = new javax.swing.GroupLayout(ForumPanel);
		ForumPanel.setLayout(ForumPanelLayout);
		ForumPanelLayout.setHorizontalGroup(
				ForumPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 802, Short.MAX_VALUE)
				);
		ForumPanelLayout.setVerticalGroup(
				ForumPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 413, Short.MAX_VALUE)
				);

		jTabbedPane2.addTab("Forum", ForumPanel);

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(
				jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addContainerGap()
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel1Layout.createSequentialGroup()
										.addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 807, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(0, 59, Short.MAX_VALUE))
										.addGroup(jPanel1Layout.createSequentialGroup()
												.addComponent(jLabel1)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(btnLogout)
												.addGap(46, 46, 46))
												.addGroup(jPanel1Layout.createSequentialGroup()
														.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
				);
		jPanel1Layout.setVerticalGroup(
				jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(19, 19, 19)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel1)
								.addComponent(btnLogout))
								.addGap(18, 18, 18)
								.addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(38, Short.MAX_VALUE))
				);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(0, 23, Short.MAX_VALUE))
				);
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addContainerGap())
				);

		pack();
	}// </editor-fold>                        

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
			java.util.logging.Logger.getLogger(HomePageGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(HomePageGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(HomePageGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(HomePageGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new HomePageGUI().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify                     
	private javax.swing.JPanel ForumPanel;
	private javax.swing.JPanel MemberPanel;
	private javax.swing.JPanel SearchPanel;
	private javax.swing.JPanel TeamPanel;
	private javax.swing.JButton btnLogout;
	private javax.swing.JButton btnSearch;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JTabbedPane jTabbedPane2;
	private javax.swing.JLabel lblSearch;
	private javax.swing.JRadioButton rbtnTeamMember;
	private javax.swing.JRadioButton rtbnProject;
	// End of variables declaration                   
}
