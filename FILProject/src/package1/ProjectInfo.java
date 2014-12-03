package package1;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.persistence.*;

import org.eclipse.persistence.sessions.Record;

import java.io.*;


class ProjectUser {
	private String project_description;
	private String status;
	private String user_name;

	public ProjectUser() {
		this.project_description ="";
		this.status = "";
		this.user_name = "";
	}

	public ProjectUser(String project_description, String status, String user_name) {
		this.project_description = project_description;
		this.status = status;
		this.user_name = user_name;
	}

	String getProjectDescription() { return project_description; }
	String getStatus() { return status; }
	String getUserName() { return user_name; }
	@Override
	public String toString() {
		return "Project_desc =" + project_description + ", " + " status =" + status + "," +
				" user_name =" + user_name;
	}

	public int getNumberOfColumns() {
		return 3;
	}

	public String getColumnName(int i) throws Exception {
		String colName = null;

		if(i == 0)
			colName = "Project Description";
		else if(i== 1)
			colName = "Status";
		else if(i ==2)
			colName = "User Name";
		else
			throw new Exception("Access to invalid column number in projectuser table");

		return colName;
	}
	public Object getColumnData(int i) throws Exception {

		if (i == 0) 
			return project_description;
		else if (i ==1)
			return status;
		else if (i == 2) {
			/*Iterator itr = getUserRecord().iterator();
		        while(itr.hasNext())
		        {
		            System.out.println(itr.next());
		        }*/
			return user_name;
		}

		else
			throw new Exception("Error: invalid column index in projectuser table"); 
	}
}

@SuppressWarnings("serial")
@Entity(name = "ProjectInfo")
public class ProjectInfo implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	@Column(name = "project_ID")
	private int project_ID;

	@Column
	private String project_name;

	@Column
	private String project_description;

	@Column
	private String status;

	@Column
	private String tag;

	@Column
	@Temporal(TemporalType.DATE)
	private Date start_date;

	@Column
	@Temporal(TemporalType.DATE)
	private Date end_date;

	@Column
	private int estimated_budget;

	@Column
	private String outcome;


	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="ProjectUser_map", joinColumns={
			@JoinColumn(name="project_ID", nullable=false, updatable=false)},
			inverseJoinColumns={ @JoinColumn(name="user_name", nullable=false, updatable=false)})
	private Set<UserRecord> userrecord;
	public Set<UserRecord> getUserRecord() {
		return userrecord;
	}
	public int getProject_ID() {
		return project_ID;
	}
	public void setProject_ID(int id) {
		this.project_ID = id;
	}
	
	public String getProject_name() {
		return project_name;
	}
	public void setProject_name(String name) {
		this.project_name = name;
	}

	public String getProject_description() {
		return project_description;
	}
	public void setProject_description(String description) {
		this.project_description = description;
	}

	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getTags() {
		return tag;
	}
	public void setTags(String tags) {
		this.tag = tags;
	}

	public Date getStartDate() {
		return start_date;
	}
	public void setStartDate(Date startDate) {
		this.start_date = startDate;
	}

	public Date getEndDate() {
		return end_date;
	}
	public void setEndDate(Date date) {
		this.end_date = date;
	}

	public void setEstimated_budget(int budget) {
		this.estimated_budget = budget;
	}
	public int getEstimated_budget() {
		return estimated_budget;
	}

	public String getOutcome() {
		return outcome;
	}
	public void setOutcome(String outcome) {
		this.outcome = outcome;
	}

	
	// return number of columns in the table
	public int getNumberOfColumns() {
		return 9;
	}

	public int getNumberOfColumns1() {
		return 2;
	}

	// return the data in column i
	public Object getColumnData(int i) throws Exception {
		DateFormat format = new SimpleDateFormat("YYYY/MM/dd");
		if (i == 0)
			return getProject_ID();
		else if (i == 1) 
			return getProject_name();
		else if (i == 2)
			return getProject_description();
		else if (i == 3) 
			return getStatus();
		else if(i == 4)
			return getTags();
		else if(i == 5)	 {
			Date date = getStartDate();
			String dateStr = format.format(date);
			return dateStr;
		} else if(i == 6) {
			Date date = getEndDate();
			String dateStr = format.format(date);
			return dateStr;
		} else if(i == 7)
			return getEstimated_budget();	
		else if(i == 8)
			return getOutcome();
		else
			throw new Exception("Error: invalid column index in courselist table"); 
	}

	// return the name of column i
	public String getColumnName(int i) throws Exception {
		String colName = null;
		if (i == 0) 
			colName = "Project ID";
		else if (i == 1)
			colName = "Project Name";
		else if (i == 2) 
			colName = "Project Description";
		else if (i == 3) 
			colName = "Status";
		else if(i == 4)
			colName = "Tags";
		else if(i == 5)
			colName = "Start Date";
		else if (i == 6)
			colName = "End Date";
		else if(i == 7)
			colName = "Estimated Budget"; 
		else if(i == 8)
			colName = "Outcome";
		else
			throw new Exception("Access to invalid column number in courselist table");

		return colName;
	}

	// set data column i to value
	public void setColumnData(int i, Object value) throws Exception {
		if (i == 0) 
			project_ID = (int) value;
		else if (i == 1) 
			project_name = (String) value;
		else if (i == 2)
			project_description = (String) value;
		else if (i == 3)
			status = (String) value;
		else if(i == 4)
			tag = (String) value;
		else if(i == 5)
			start_date = (Date) value;
		else if (i == 6)
			end_date = (Date) value;
		else if(i == 7) 
			estimated_budget = (int) value;
		else if(i == 8)
			outcome = (String) value;
		else
			throw new Exception("Error: invalid column index in courselist table"); 
	}

	@Override
	public String toString() {
		return "ProjectInfo [Project_ID =" + project_ID + ", "
				+ "," + " Project_name =" + project_name + " Project_description =" + 
				project_description + ","+"Status =" + status +","+"Tags =" + tag + "," +
				" Start Date =" + start_date + "," + " End Date =" + end_date + "," 
				+ "Estimated Budget =" + estimated_budget + " Outcome =" + outcome +"]";
	}
}

