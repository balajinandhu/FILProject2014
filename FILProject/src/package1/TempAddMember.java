package package1;

import javax.persistence.*;

import java.io.*;
import java.util.Set;
@SuppressWarnings("serial")
@Entity(name = "TempAddMember")
public class TempAddMember implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	@Column(name = "user_name")
	private String user_name;

	@Column
	private String role;
	
	@Column
	private String team_name;

	public String getUser_name() {
		return user_name;
	}
	
	public String getTeam_name() {
		return team_name;
	}
	public String getRole() {
		return role;
	}

	public int getNumberOfColumns() {
		return 3;
	}
	
	public Object getColumnData(int i) throws Exception {
		if (i == 0)
			return getUser_name();
		else if (i == 1)
			return getTeam_name();
		else if (i == 2)
			return getRole();
		else
			throw new Exception("Error: invalid column index in courselist table"); 
	}

	// return the name of column i
	public String getColumnName(int i) throws Exception {
		String colName = null;
		if (i == 0) 
			colName = "User_name";
		else if (i == 1)
			colName = "Team_name";
		else if (i == 2)
			colName = "Role";
		else
			throw new Exception("Access to invalid column number in courselist table");

		return colName;
	}

	// set data column i to value
	public void setColumnData(int i, Object value) throws Exception {
		if (i == 0) 
			user_name = (String) value;
		else if (i == 1) 
			team_name = (String) value;
		else if (i == 2) 
			role = (String) value;
		else
			throw new Exception("Error: invalid column index in courselist table"); 
	}

	@Override
	public String toString() {
		return "TeamInfo [User_name =" + user_name + ", " + " Team_name =" + team_name + " Role =" + role +"]";
	}



}
