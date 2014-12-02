package package1;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;




class TaskUser {
	private String project_name;
	private String outcome;
	
	public TaskUser(String project_name, String outcome) {
		this.project_name = project_name;
		this.outcome = outcome;
	}
	
	public TaskUser() {
		// TODO Auto-generated constructor stub
		project_name = "";
		outcome = "";
	}

	String getProjectDescription() { return project_name; }
	String getStatus() { return outcome; }

	@Override
	public String toString() {
		return "Project_Name =" + project_name + ", " + " Outcome =" + outcome ;
	}
	
	public String getColumnName(int i) throws Exception {
		String colName = null;
		
		if(i == 0)
			colName = "Project Name";
		else if(i== 1)
			colName = "Outcome";
		else
			throw new Exception("Access to invalid column number in courselist table");

		return colName;
	}
	public Object getColumnData(int i) throws Exception {
			
			if (i == 0) 
				return project_name;
			else if (i ==1)
				return outcome;			
			else
				throw new Exception("Error: invalid column index in courselist table"); 
		}
	
	public int getNumberOfColumns() {
		return 2;
	}
}


@Entity(name = "TaskInfo")
public class TaskInfo implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	@Column(name = "task_ID")
	private int task_ID;

	@Column
	private int project_ID;

	@Column
	private Date start_date;

	@Column
	private Date end_date;
	
	@Column
	private String outcome;
	
	@Column
	private String user_name;
	
	@Column
	private int project_metric_ID;

	@Column
	private int project_metric_value;

	public int getTask_ID() {
		return task_ID;
	}
	public void setTask_ID(int id) {
		this.task_ID = id;
	}
	public int getProject_ID() {
		return project_ID;
	}
	public void setProject_ID(int id) {
		this.project_ID = id;
	}

	public Date getStartDate() {
		return start_date;
	}
	public void setStartDate(Date date) {
		this.start_date = date;
	}

	public Date getEndDate() {
		return end_date;
	}
	public void setEndDate(Date date) {
		this.end_date = date;
	}

	public String getOutcome() {
		return outcome;
	}
	
	public void setOutcome(String outcome) {
		this.outcome = outcome;
	}
	
	public String getUser_name() {
		return user_name;
	}
	
	public void setUser_name(String username) {
		this.user_name = username;
	}
	
	public void setProject_metric_ID(int budget) {
		this.project_metric_ID = budget;
	}
	public int getProject_metric_ID() {
		return project_metric_ID;
	}

	// return number of columns in the table
	public int getNumberOfColumns() {
		return 8;
	}

	// return the data in column i
	public Object getColumnData(int i) throws Exception {
		if (i == 0)
			return getTask_ID();
		else if (i == 1) 
			return getProject_ID();
		else if (i == 2) 
			return getStartDate();
		else if(i == 3)
			return getEndDate();
		else if(i == 4)
			return getOutcome();
		else if(i == 5)
			return getUser_name();
		else if(i == 6)
			return getProject_ID();
		else if(i == 7)
			return getProject_metric_ID();
		else
			throw new Exception("Error: invalid column index in taskinfo table"); 
	}

	// return the name of column i
	public String getColumnName(int i) throws Exception {
		String colName = null;
		if (i == 0) 
			colName = "Task ID";
		else if (i == 1)
			colName = "Project ID";
		else if (i == 2)
			colName = "Start Date";
		else if (i == 3) // 3
			colName = "End Date";
		else if (i == 4) // 4
			colName = "Outcome";
		else if(i == 5)
			colName = "User name";
		else if(i == 6)
			colName = "Project Metric ID";
		else if (i == 7)
			colName = "Project Metric Value";
		else
			throw new Exception("Access to invalid column number in taskinfo table");

		return colName;
	}

	// set data column i to value
	public void setColumnData(int i, Object value) throws Exception {
		if (i == 0) 
			task_ID = (int) value;
		else if (i == 1) 
			project_ID = (int) value;
		else if (i == 2) 
			start_date = (Date) value;
		else if (i == 3)
			end_date = (Date) value;
		else if (i == 4)
			outcome = (String) value;
		else if(i == 5)
			user_name = (String) value;
		else if(i == 6)
			project_metric_ID = (int) value;
		else if (i == 7)
			project_metric_ID = (int) value;
		else
			throw new Exception("Error: invalid column index in courselist table"); 
	}

	@Override
	public String toString() {
		return "TaskInfo [Task_ID =" + task_ID + ", " + " Project_ID =" + project_ID + "," + " Start_date =" + start_date +
				" End_date =" + end_date + ","+"User_name =" + user_name+","+"Outcome =" + outcome + "," + " Project_metric_ID =" 
				+ project_metric_ID + "," + " Project_Metric_Value =" + project_metric_value +"]";
	}
}


