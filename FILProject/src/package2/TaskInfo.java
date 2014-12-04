package package2;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;




class TaskUser {
	private String project_name;
	private String task_name;
	
	public TaskUser(String project_name, String task_name) {
		this.project_name = project_name;
		this.task_name = task_name;
	}
	
	public TaskUser() {
		// TODO Auto-generated constructor stub
		project_name = "";
		task_name = "";
	}

	String getProjectDescription() { return project_name; }
	String getTask_name() { return task_name; }

	@Override
	public String toString() {
		return "Project_Name =" + project_name + ", " + " Task_name =" + task_name ;
	}
	
	public String getColumnName(int i) throws Exception {
		String colName = null;
		
		if(i == 0)
			colName = "Project Name";
		else if(i== 1)
			colName = "Task_name";
		else
			throw new Exception("Access to invalid column number in TaskUser table");

		return colName;
	}
	public Object getColumnData(int i) throws Exception {
			
			if (i == 0) 
				return project_name;
			else if (i ==1)
				return task_name;			
			else
				throw new Exception("Error: invalid column index in TaskUser table"); 
		}
	
	public int getNumberOfColumns() {
		return 2;
	}
}


@Entity(name = "taskinfo")
public class TaskInfo implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	@Column(name = "task_ID")
	private int task_ID;

	@Column
	private int project_ID;
	
	@Column
	private String task_name;

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

	public String getTask_name() {
		return task_name;
	}
	
	public void setOutcome(String taskname) {
		this.task_name = taskname;
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
			return getTask_name();
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
			colName = "Task name";
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
			task_name = (String) value;
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
		return "TaskInfo [Task_ID =" + task_ID + ", " + " Project_ID =" + project_ID + ","
				+ " Start_date =" + start_date + " End_date =" + end_date + ","+ 
				"User_name =" + user_name+","+"Task_name =" + task_name + "," +
				" Project_metric_ID =" + project_metric_ID + "," + " Project_Metric_Value ="
				+ project_metric_value +"]";
	}
	
	
}


