package package1;

import javax.persistence.*;

import java.io.*;
import java.util.Set;
@SuppressWarnings("serial")
@Entity(name = "TempAddUser")
public class TempAddUser implements Serializable {


	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	@Column(name = "user_name")
	private String user_name;

	@Column
	private String role;

	@Column
	private String project_name;



	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="project_name", insertable = false, updatable = false)
	private TeamInfo record;
	public void setTeamInfo(TeamInfo record) {
		this.record = record;
	}


	@OneToOne(cascade=CascadeType.ALL)

	@JoinColumn(name="user_name", insertable = false, updatable = false)

	private UserRecord record1;

	public TempAddUser() {
		user_name = role = project_name = "";
	}
	
	public TempAddUser(String userName, String role, String projectName) {
		user_name = userName;
		this.role = role;
		project_name = projectName;
	}
	
	public void setUserRecord(UserRecord rec) {

		record1 = rec;
	}

	public String getUser_name() {
		return user_name;
	}

	public String getProject_name() {
		return project_name;
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
		else if (i == 2)
			return getProject_name();
		else if (i == 1)
			return getRole();
		else
			throw new Exception("Error: invalid column index in tempadduser table"); 
	}

	// return the name of column i
	public String getColumnName(int i) throws Exception {
		String colName = null;
		if (i == 0) 
			colName = "User_name";
		else if (i == 2)
			colName = "Project_name";
		else if (i == 1)
			colName = "Role";
		else
			throw new Exception("Access to invalid column number in tempadduser table");

		return colName;
	}

	// set data column i to value
	public void setColumnData(int i, Object value) throws Exception {
		if (i == 0) 
			user_name = (String) value;
		else if (i == 2) 
			project_name = (String) value;
		else if (i == 1) 
			role = (String) value;
		else
			throw new Exception("Error: invalid column index in tempadduser table"); 
	}

	@Override
	public String toString() {
		return "Temp"
				+ "TeamInfo [User_name =" + user_name + ", " + " Project_name =" + project_name + " Role =" + role +"]";
	}



}
