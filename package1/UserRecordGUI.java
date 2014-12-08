
package package1;

import java.awt.BorderLayout;
import java.awt.Dimension;

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
 * @author karnati_sruti
 */
public class UserRecordGUI extends javax.swing.JFrame {

	/**
	 * Creates new form UserRecordGUI
	 */
	private JTable jtable1; // the table displayed on the GUI
	private UserRecordController userRecordController;

	public UserRecordGUI() {
		initComponents();

		userRecordController = new UserRecordController(this);
		addJTable();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */

	public void addJTable() {
		// add the data and column names to a JTable
		//jtable1  = new JTable(courseListTableController.getData(), courseListTableController.getColumnNames());

		jtable1 = new JTable(userRecordController.getTableModel());
		// add a ListSelectionListener to the table
		jtable1.getSelectionModel().addListSelectionListener(userRecordController);

		// add the table to a scroll pane
		JScrollPane scrollpane = new JScrollPane(jtable1);
		scrollpane.setPreferredSize(new Dimension(600, 200));
		// create a window
		jPanel2.setLayout(new BorderLayout());
		jPanel2.add(scrollpane, BorderLayout.CENTER);


	}

	public void updateTable() {
		jtable1.setModel(userRecordController.getTableModel());
	}

	public void setUser_nameTextField(String value) {
		txtUserName.setText(value);
	}

	public void setEmail_IDTextField(String value) {
		txtEmailID.setText(value);
	}
	public void setPhone_numberTextField(String value) {
		txtPhoneNumber.setText(value);
	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		lblUserName = new javax.swing.JLabel();
		txtUserName = new javax.swing.JTextField();
		lblEmailID = new javax.swing.JLabel();
		txtEmailID = new javax.swing.JTextField();
		lblPhoneNumber = new javax.swing.JLabel();
		txtPhoneNumber = new javax.swing.JTextField();
		btnUpdate = new javax.swing.JButton();
		btnDelete = new javax.swing.JButton();
		btnClear = new javax.swing.JButton();
		jPanel2 = new javax.swing.JPanel();
		btnUserGUIClose = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

		lblUserName.setText("User Name");

		lblEmailID.setText("Email ID");

		lblPhoneNumber.setText("Phone Number");

		btnUpdate.setText("UPDATE");
		btnUpdate.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnUpdateActionPerformed(evt);
			}
		});

		btnDelete.setText("DELETE");
		btnDelete.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnDeleteActionPerformed(evt);
			}
		});

		btnClear.setText("CLEAR");
		btnClear.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnClearActionPerformed(evt);
			}
		});

		jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("User Details"));

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(
				jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 488, Short.MAX_VALUE)
				);
		jPanel2Layout.setVerticalGroup(
				jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 190, Short.MAX_VALUE)
				);

		btnUserGUIClose.setText("Close");
		btnUserGUIClose.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnUserGUICloseActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(
				jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel1Layout.createSequentialGroup()
										.addGap(43, 43, 43)
										.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(101, 101, 101)
										.addComponent(btnUserGUIClose))
										.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
												.addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
														.addGap(161, 161, 161)
														.addComponent(btnUpdate)
														.addGap(57, 57, 57)
														.addComponent(btnDelete)
														.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(btnClear))
														.addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
																.addGap(192, 192, 192)
																.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
																		.addComponent(lblUserName)
																		.addComponent(lblEmailID)
																		.addComponent(lblPhoneNumber))
																		.addGap(85, 85, 85)
																		.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
																				.addComponent(txtPhoneNumber, javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(txtEmailID, javax.swing.GroupLayout.Alignment.LEADING)))))
																				.addContainerGap(229, Short.MAX_VALUE))
				);
		jPanel1Layout.setVerticalGroup(
				jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addGap(48, 48, 48)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(btnUserGUIClose)
								.addGroup(jPanel1Layout.createSequentialGroup()
										.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
												.addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(lblUserName))
												.addGap(23, 23, 23)
												.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(lblEmailID)
														.addComponent(txtEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGap(25, 25, 25)
														.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
																.addComponent(lblPhoneNumber)
																.addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
																.addGap(44, 44, 44)
																.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
																		.addComponent(btnUpdate)
																		.addComponent(btnDelete)
																		.addComponent(btnClear))
																		.addGap(37, 37, 37)
																		.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
																		.addContainerGap(19, Short.MAX_VALUE))
				);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addContainerGap())
				);
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addContainerGap())
				);

		pack();
	}// </editor-fold>              

	private void btnAddUserActionPerformed(java.awt.event.ActionEvent evt) {                                           
		// TODO add your handling code here:

		String[] array = new String[jtable1.getColumnCount()];
		array[0] = txtUserName.getText();
		array[1] = txtEmailID.getText();
		array[2] = txtPhoneNumber.getText();

		userRecordController.addRow( array);
	}                                          

	private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {                                          
		// TODO add your handling code here:

		String[] array = new String[jtable1.getColumnCount()];
		array[0] = txtUserName.getText();
		array[1] = txtEmailID.getText();
		array[2] = txtPhoneNumber.getText();

		userRecordController.updateRow(array, jtable1.getSelectedRow());
	}                                         

	private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {                                          
		// TODO add your handling code here:
		int selectedrow = jtable1.getSelectedRow();
		TableModel tm= jtable1.getModel();

		String[] array = new String[jtable1.getColumnCount()];
		array[0] = txtUserName.getText();
		array[1] = txtEmailID.getText();
		array[2] = txtPhoneNumber.getText();


		userRecordController.deleteRow(array, selectedrow);
	}                                         

	private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {                                         
		// TODO add your handling code here:
		setUser_nameTextField("");
		setEmail_IDTextField("");
		setPhone_numberTextField("");
	}                                        

	private void btnUserGUICloseActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		dispose();
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
			java.util.logging.Logger.getLogger(UserRecordGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(UserRecordGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(UserRecordGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(UserRecordGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new UserRecordGUI().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify                     
	private javax.swing.JButton btnAddUser;
	private javax.swing.JButton btnClear;
	private javax.swing.JButton btnDelete;
	private javax.swing.JButton btnUpdate;
	private javax.swing.JButton btnUserGUIClose;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JLabel lblEmailID;
	private javax.swing.JLabel lblPhoneNumber;
	private javax.swing.JLabel lblUserName;
	private javax.swing.JTextField txtEmailID;
	private javax.swing.JTextField txtPhoneNumber;
	private javax.swing.JTextField txtUserName;
	// End of variables declaration                   
}