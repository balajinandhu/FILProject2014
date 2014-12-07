package package1;

import javax.persistence.*;

import java.io.*;
import java.util.Set;
@SuppressWarnings("serial")
@Entity(name = "user_registration")
public class TempAddUser implements Serializable {


	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	@Column(name = "user_name")
	private String user_name;
	
	@Column
	private String first_name;
	
	@Column
	private String last_name;
	
	@Column
	private String email_ID;
	
	@Column
	private String password;

	@Column
	private String role;
	
	@Column
	private int phone_number;


/*	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="project_name", insertable = false, updatable = false)
	private TeamInfo record;
	public void setTeamInfo(TeamInfo record) {
		this.record = record;
	}


	@OneToOne(cascade=CascadeType.ALL)

	@JoinColumn(name="user_name", insertable = false, updatable = false)

	private UserRecord record1; */

	public TempAddUser() {
		user_name = role = email_ID = first_name = last_name = password = "";
		phone_number = 0;
	}
	
	public TempAddUser(String userName, String role, String firstName, String lastName,
			String email_ID, String password, int phoneNumber ) {
		user_name = userName;
		this.role = role;
		first_name = firstName;
		last_name = lastName;
		this.email_ID = email_ID;
		this.password = password;
		phone_number = phoneNumber;
		
	}


	public String getUser_name() {
		return user_name;
	}

	public void setUserName(String uname) {
		this.user_name = uname;
	}

	public String getFirst_name() {
		if (first_name == null)
			return "";
		return first_name;
	}
	
	public void setfirstName(String fname) {
		this.first_name = fname;
	}
	
	public String getLast_name() {
		if (last_name == null)
			return "";
		return last_name;
	}
	
	public void setLastName(String lname) {
		this.last_name = lname;
	}
	public String getRole() {
		if (role == null)
			return "";
		return role;
	}
	public void setrole(String role) {
		this.role = role;
	}

	public String getEmail_ID() {
		if (email_ID == null)
			return "";
		return email_ID;
	}
	public void setEmail_ID(String emailid) {
		this.email_ID = emailid;
	}

	public String getPassword() {
		if (password == null)
			return "";
		return password;
	}
	
	public void setPassword(String pwd) {
		this.password = pwd;
	}
	
	public int getPhoneNumber() {
		return phone_number;
	}
	
	public void setPhoneNummber(int pno) {
		this.phone_number = pno;
	}
	public int getNumberOfColumns() {
		return 4;
	}

	public Object getColumnData(int i) throws Exception {
		if (i == 0)
			return getUser_name();
		else if (i == 1)
			return getRole();
		else if (i == 2)
			return getEmail_ID();
		else if(i == 3)
			return getPhoneNumber();
		else
			throw new Exception("Error: invalid column index in tempadduser table"); 
	}

	// return the name of column i
	public String getColumnName(int i) throws Exception {
		String colName = null;
		if (i == 0) 
			colName = "User Name";
		else if (i == 1)
			colName = "Role";
		else if (i == 2)
			colName = "Email ID";
		else if (i == 3)
			colName = "Phone Number";
		else
			throw new Exception("Access to invalid column number in tempadduser table");

		return colName;
	}

	// set data column i to value
	public void setColumnData(int i, Object value) throws Exception {
		if (i == 0) 
			user_name = (String) value;
		else if (i == 1) 
			role = (String) value;
		else if (i == 2) 
			email_ID = (String) value;
		else if(i == 3) 
			phone_number = (int) value;
			
		else
			throw new Exception("Error: invalid column index in tempadduser table"); 
	}

	@Override
	public String toString() {
		return "Temp"
				+ "TeamInfo [User_name =" + user_name + ", " + " Role =" + role +"]";
	}



}
