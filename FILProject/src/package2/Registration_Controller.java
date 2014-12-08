/**
 * 
 */
package package2;

//import Registration_info.Registration_Model;

import package1.TempAddUser;


/**
 * @author User
 *
 */
public class Registration_Controller {
	private RegistrationGUI rv;//object of gui class
	private Registration_Model rm;//object of model class
	public Registration_Controller(RegistrationGUI rv) {
		// TODO Auto-generated constructor stub
		this.rv=rv;
		rm=new Registration_Model();//refernce to model class
	}

/*	public void signup(String[] array) {
		// TODO Auto-generated method stub
		rm.addto(array);//adding to database
	} */

	public TempAddUser addRow(String[] array) {	
		return rm.addRow(array);
	}
	
}


