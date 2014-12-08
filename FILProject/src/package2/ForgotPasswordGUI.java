package package2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Guddu
 */
public class ForgotPasswordGUI extends javax.swing.JFrame {

	/**
	 * Creates new form LoginPage
	 */
	private LoginController lc;
	private int i;

	public ForgotPasswordGUI() {
		initComponents();
		lc = new LoginController();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		jPanel1 = new javax.swing.JPanel();
		lblUsername = new javax.swing.JLabel();
		lblPassword = new javax.swing.JLabel();
		txtusername = new javax.swing.JTextField();
		txtpassword = new javax.swing.JTextField();
		//btnLogin = new javax.swing.JButton();
		//btnSignup = new javax.swing.JButton();
		btnForgetPassword = new javax.swing.JButton();
		jLabel1.setText("jLabel1");

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

		lblUsername.setText("User Name:");

		lblPassword.setText("User Email");

		txtusername.setText("Enter User Name");

		txtpassword.setText("Enter User Email");

		//btnLogin.setText("Login");

		btnForgetPassword.setText("Submit");

		btnForgetPassword.addActionListener(new ForgotPasswordAction());
		//btnLogin.addActionListener(new LoginAction());

		//btnSignup.setText("Sign Up");

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout
		.setHorizontalGroup(jPanel1Layout
				.createParallelGroup(
						javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
								.createSequentialGroup()
								.addGap(67, 67, 67)
								.addGroup(
										jPanel1Layout
										.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(
														lblUsername)
														.addComponent(
																lblPassword)
																.addComponent(btnForgetPassword))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																		148, Short.MAX_VALUE)
																		.addGroup(
																				jPanel1Layout
																				.createParallelGroup(
																						javax.swing.GroupLayout.Alignment.LEADING,
																						false)
																						.addComponent(
																								txtusername)
																								//.addComponent(btnSignup)
																								.addComponent(
																										txtpassword))
																										.addGap(135, 135, 135)));
		jPanel1Layout
		.setVerticalGroup(jPanel1Layout
				.createParallelGroup(
						javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
								.createSequentialGroup()
								.addGap(95, 95, 95)
								.addGroup(
										jPanel1Layout
										.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														lblUsername)
														.addComponent(
																txtusername,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
																.addGap(18, 18, 18)
																.addGroup(
																		jPanel1Layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																				.addComponent(
																						lblPassword)
																						.addComponent(
																								txtpassword,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																								.addGap(35, 35, 35)
																								.addGroup(
																										jPanel1Layout
																										.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.BASELINE)
																												//.addComponent(btnLogin)
																												//.addComponent(btnSignup)
																												.addComponent(btnForgetPassword)
																										)
																										.addContainerGap(105, Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
						layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(jPanel1,
								javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(20, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
						layout.createSequentialGroup()
						.addGap(19, 19, 19)
						.addComponent(jPanel1,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE).addContainerGap()));

		pack();
	}// </editor-fold>
	// method for login button

	/**
	 * private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {
	 * 
	 * String[] array=new String[2]; if(getUserNameTextField()!=null){
	 * array[0]=getUserNameTextField(); } if(getPasswordTextField()!=null){
	 * array[1]=getPasswordTextField(); }}
	 * 
	 * 
	 * public String getUserNameTextField() { return txtusername.getText(); }
	 * public String getPasswordTextField() { return txtpassword.getText(); }
	 * /**
	 * 
	 * @param args
	 *            the command line arguments
	 */

	public void startForgotPassword() {
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
			java.util.logging.Logger.getLogger(ForgotPasswordGUI.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(ForgotPasswordGUI.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(ForgotPasswordGUI.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(ForgotPasswordGUI.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new ForgotPasswordGUI().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify
	//private javax.swing.JButton btnLogin;
	//private javax.swing.JButton btnSignup;
	private javax.swing.JButton btnForgetPassword;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JLabel lblPassword;
	private javax.swing.JLabel lblUsername;
	private javax.swing.JTextField txtpassword;
	private javax.swing.JTextField txtusername;

	// End of variables declaration


	private class ForgotPasswordAction implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {

			JOptionPane.showMessageDialog(null, "Password Confirmation Link Sent to Email");

		}

	}

}
