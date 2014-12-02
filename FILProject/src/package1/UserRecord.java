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
	private String password;

	@Column
	private String role;

	@Column
	private String team_name;

	@Column
	private String email_ID;

	@Column
	private int phone_number;

	@ManyToMany(mappedBy="userrecord")
	private Set<ProjectInfo> records;
	public Set<ProjectInfo> getRecords() {
		return records;
	}


	@ManyToOne(cascade=CascadeType.ALL)
	@PrimaryKeyJoinColumn(name="team_name")
	private TeamInfo teaminfo;	
	public void setTeamInfo(TeamInfo teamInfo) {
		teaminfo = teamInfo;
	}
	public TeamInfo getTeamInfo() {
		return teaminfo;
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
	public String getTeam_name() {
		return team_name;
	}
	public void setTeam_name(String teamname) {
		this.team_name = teamname;
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
		return 6; 
	}

	// return the data in column i
	public Object getColumnData(int i) throws Exception {
		if (i == 0)
			return getUser_name();
		else if (i == 1) 
			return getPassword();
		else if (i == 2)
			return getRole();
		else if(i == 3)
			return getTeam_name();
		else if(i == 4)	 
			return getEmail_ID();
		else if(i == 5)
			return getPhone_number();
		else
			throw new Exception("Error: invalid column index in userrecord table"); 
	}

	// return the name of column i
	public String getColumnName(int i) throws Exception {
		String colName = null;
		if (i == 0) 
			colName = "User_name";
		else if (i == 1)
			colName = "Password";
		else if (i == 2)
			colName = "Role";
		else if (i == 3)
			colName = "Team_name";
		else if(i == 4)
			colName = "Email_ID";
		else if(i == 5)
			colName = "Phone_number";
		else
			throw new Exception("Access to invalid column number in userrecord table");

		return colName;
	}

	// set data column i to value
	public void setColumnData(int i, Object value) throws Exception {
		if (i == 0) 
			user_name = (String) value;
		else if (i == 1) 
			password = (String) value;
		else if (i == 2)
			role = (String) value;
		else if(i == 3)
			team_name = (String) value;
		else if(i == 4)
			email_ID = (String) value;
		else if (i == 5)
			password = (String) value;
		else
			throw new Exception("Error: invalid column index in userrecord table"); 
	}

	@Override
	public String toString() {
		return "UserRecord [ User_name =" + user_name + "," + " Password =" + password +
				","+"Role =" + role +","+"Team_name =" + team_name + ","+
				" Email_ID =" + email_ID + "," + " Phone_number =" + phone_number +"]";
	}
}

