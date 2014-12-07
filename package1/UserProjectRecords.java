/*package package1;



import javax.persistence.*;

import java.io.*;
import java.util.Set;
@SuppressWarnings("serial")
@Entity (name = "userprojectrecords")
@IdClass(compositeKey.class)
public class UserProjectRecords implements Serializable {

	@Id
	private String project_name;
	@Id
	private String user_name;
	@Column
	private String role;


	public UserProjectRecords() {
		project_name = user_name = role = "";
	}
	
	public UserProjectRecords(String project_name, String user_name, String role) {
		this.project_name = project_name;
		this.user_name = user_name;
		this.role = role;		
	}

	public String getProject_name() {
		return project_name;
	}

	public void setProject_name(String projectName) {
		project_name = projectName;
	}
	
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String userName) {
		user_name = userName;
	}
	
	public String getRole() {
		if(role == null) 
			return "";
		else 
		return role;
	}
	
	public void setRole(String role) {
		this.role = role;
	}

	

	public int getNumberOfColumns() {
		return 3;
	}

	public Object getColumnData(int i) throws Exception {
		if (i == 0)
			return getProject_name();
		else if (i == 1)
			return getUser_name();
		else if (i == 2)
			return getRole();
		else
			throw new Exception("Error: invalid column index in userProjectRecords table"); 
	}

	// return the name of column i
	public String getColumnName(int i) throws Exception {
		String colName = null;
		if (i == 0) 
			colName = "Project Name";
		else if (i == 1)
			colName = "User Name";
		else if (i == 2)
			colName = "Role";
		else
			throw new Exception("Access to invalid column number in userProjectRecords table");

		return colName;
	}

	// set data column i to value
	public void setColumnData(int i, Object value) throws Exception {
		if (i == 0) 
			project_name = (String) value;
		else if (i == 1) 
			user_name = (String) value;
		else if (i == 2) 
			role = (String) value;
		else
			throw new Exception("Error: invalid column index in userProjectRecords table"); 
	}

	@Override
	public String toString() {
		return "Temp"
				+ "AddProject [Project_name =" + project_name + ", " + " user name =" + user_name + " role =" + role +"]";
	}

}

class compositeKey {
	private String project_name;
	private String user_name;
}
*/