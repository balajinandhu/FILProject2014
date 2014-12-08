


package package1;


import javax.persistence.*;

import java.io.*;
import java.util.HashSet;
import java.util.Set;
@SuppressWarnings("serial")
@Entity(name = "UserRecord")
public class UserRecord implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	@Column(name = "user_name")
	private String user_name;
	
	@Column
	private String first_name;

	@Column
	private String last_name;

	@Column
	private String password;
	
	@Column
	private String role;


	@Column
	private String email_ID;

	@Column
	private int phone_number;
	
	@ManyToMany(mappedBy="userrecord")
	private Set<ProjectInfo> records;
	public Set<ProjectInfo> getRecords() {
		return records;
	}
	public void setRecords(Set<ProjectInfo> records) {
		this.records = records;
	}

	public UserRecord() {
		user_name = role = email_ID = first_name = last_name = password = "";
		 phone_number = 0;
	}
	
	public UserRecord(String userName, String role, String firstName, String lastName,
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
	public void setUser_name(String name) {
		this.user_name = name;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	
	public String getLast_name() {
		return last_name;
	}
	public void setlast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	public String getEmail_ID() {
		return email_ID;
	}
	public void setEmail_ID(String email) {
		this.email_ID = email;
	}

	public int getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(int num) {
		this.phone_number = num;
	}

	// return number of columns in the table
	public int getNumberOfColumns() {
		return 3; 
	}

	// return the data in column i
	public Object getColumnData(int i) throws Exception {
		if (i == 0)
			return getUser_name();
		else if(i == 1)	 
			return getEmail_ID();
		else if (i == 2)
			return getPhone_number();
		else if (i == 3)
			return getRole();
		else if (i == 4) 
			return getPassword();
		else if(i == 5) 
			return getFirst_name();
		else if(i==6)
			return getLast_name();
		else
			throw new Exception("Error: invalid column index in userrecord table"); 
	}

	// return the name of column i
	public String getColumnName(int i) throws Exception {
		String colName = null;
		if (i == 0) 
			colName = "User_name";
		else if (i == 1)
			colName =  "Email_ID";
		else if (i == 2)
			colName = "Phone_number";
		else if(i == 3)
			colName ="Role";
		else if(i == 4)
			colName = "Password";
		else if(i == 5)
			colName = "first name";
		else if(i == 6)
			colName = "last name";
		else
			throw new Exception("Access to invalid column number in userrecord table");

		return colName;
	}

	// set data column i to value
	public void setColumnData(int i, Object value) throws Exception {
		if (i == 0) 
			user_name = (String) value;
		else if (i == 1) 
			email_ID = (String) value;
		else if (i == 2)
			phone_number = (int) value;
		else if(i == 3)
			role = (String) value;
		else if (i == 4)
			password = (String) value;
		else if( i == 5)
			first_name = (String) value;
		else if(i == 6)
			last_name = (String) value;
		else
			throw new Exception("Error: invalid column index in userrecord table"); 
	}

	@Override
	public String toString() {
		return "UserRecord [ User_name =" + user_name + "," + " Password =" + password +
				","+"Role =" + role +","+
				" Email_ID =" + email_ID + "," + " Phone_number =" + phone_number + " ]";
	}
}

