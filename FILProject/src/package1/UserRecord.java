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
	@Column(name = "user_ID")
	private int user_ID;

	@Column
	private String user_name;

	@Column
	private String password;

	@Column
	private String role;

	@Column
	private int team_ID;

	@Column
	private String email_ID;

	@Column
	private int phone_number;

	@ManyToMany(mappedBy="userrecord")
	private Set<ProjectInfo> records;

	public Set<ProjectInfo> getRecords() {
		return records;
	}

	public int getUser_ID() {
		return user_ID;
	}
	public void setUser_ID(int id) {
		this.user_ID = id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String name) {
		this.user_name = name;
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
	public int getTeam_ID() {
		return team_ID;
	}
	public void setTeam_ID(int teamid) {
		this.team_ID = teamid;
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


	/*public Set<ProjectInfo> getRecords() {

return records;

 } */



	// return number of columns in the table
	public int getNumberOfColumns() {
		return 1; // 8
	}

	// return the data in column i
	public Object getColumnData(int i) throws Exception {
		if (i == 1)
			return getUser_ID();
		else if (i == 0)
			return getUser_name();
		else if (i == 2) 
			return getPassword();
		else if (i == 3)
			return getRole();
		else if(i == 4)
			return getTeam_ID();
		else if(i == 5)	 
			return getEmail_ID();
		else if(i == 6)
			return getPhone_number();
		else
			throw new Exception("Error: invalid column index in courselist table"); 
	}

	// return the name of column i
	public String getColumnName(int i) throws Exception {
		String colName = null;
		if (i == 0) 
			colName = "Project_ID";
		else if (i == 1)
			colName = "Team_ID";
		else if (i == 2)
			colName = "Project_name";
		else if (i == 3)
			colName = "Status";
		else if(i == 4)
			colName = "Tags";
		else if(i == 5)
			colName = "start_date";
		else if (i == 6)
			colName = "end_date";
		else if(i == 7)
			colName = "Estimated_budget";
		else
			throw new Exception("Access to invalid column number in courselist table");

		return colName;
	}

	// set data column i to value
	public void setColumnData(int i, Object value) throws Exception {
		if (i == 0) 
			user_ID = (int) value;
		else if (i == 1) 
			user_name = (String) value;
		else if (i == 2) 
			password = (String) value;
		else if (i == 3)
			role = (String) value;
		else if(i == 4)
			team_ID = (int) value;
		else if(i == 5)
			email_ID = (String) value;
		else if (i == 4)
			password = (String) value;
		else
			throw new Exception("Error: invalid column index in courselist table"); 
	}

	@Override
	public String toString() {
		return "UserRecord [User_ID =" + user_ID + ", " + " User_name =" + user_name + "," 
				+ " Password =" + password + ","+"Role =" + role +","+"Team_ID =" + team_ID + ","
				+ " Email_ID =" + email_ID + "," + " Phone_number =" + phone_number +"]";
	}
}

