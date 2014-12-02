package package1;
import java.sql.Date;
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
			throw new Exception("Access to invalid column number in courselist table");

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
				throw new Exception("Error: invalid column index in courselist table"); 
		}
}

@SuppressWarnings("serial")
@Entity(name = "ProjectInfo")
public class ProjectInfo implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	@Column(name = "project_ID")
	private int project_ID;

	@JoinColumn(name="team_name")
	@Column
	private String team_name;

	@Column
	private String project_name;

	@Column
	private String project_description;

	@Column
	private String status;

	@Column
	private String tag;

	@Column
	private Date start_date;

	@Column
	private Date end_date;

	@Column
	private int estimated_budget;
	
	@Column
	private String outcome;


	@ManyToOne(cascade=CascadeType.ALL)

	@PrimaryKeyJoinColumn(name="team_name")

	private TeamInfo teaminfo; 

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
	public String getTeam_name() {
		return team_name;
	}
	public void setTeam_name(String name) {
		this.team_name = name;
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
	public void setStartDate(Date date) {
		this.start_date = date;
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
		return status;
	}
	public void setOutcome(String outcome) {
		this.outcome = outcome;
	}

	public String getTeamInfo() {
		return teaminfo.getTeam_name();
	} 


	// return number of columns in the table
	public int getNumberOfColumns() {
		return 10;
	}

	// return the data in column i
	public Object getColumnData(int i) throws Exception {
		if (i == 0)
			return getProject_ID();
		else if (i == 1) 
			return getTeam_name();
		else if (i == 2) {
			return getProject_name();
		}
		//return getTeamInfo();
		//return getProject_name(); 
		else if (i == 3)
				return getProject_description();
		else if (i == 4) 
			return getStatus();
		else if(i == 5)
			return getTags();
		else if(i == 6)	 
			return getStartDate();
		else if(i == 7)
			return getEndDate();
		else if(i == 8)
			return getEstimated_budget();	
		else if(i == 9)
			return getOutcome();
		else
			throw new Exception("Error: invalid column index in courselist table"); 
	}

	// return the name of column i
	public String getColumnName(int i) throws Exception {
		String colName = null;
		if (i == 0) 
			colName = "Project_ID";
		else if (i == 1) 
			colName = "Team_name";
		else if (i == 2)
			colName = "Project_name";
		else if (i == 3) 
			colName = "Project_description";
		else if (i == 4) 
			colName = "Status";
		else if(i == 5)
			colName = "Tags";
		else if(i == 6)
			colName = "start_date";
		else if (i == 7)
			colName = "end_date";
		else if(i == 8)
			colName = "Estimated_budget"; 
		else if(i == 9)
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
			team_name = (String) value;
		else if (i == 2) 
			project_name = (String) value;
		else if (i == 3)
			project_description = (String) value;
		else if (i == 4)
			status = (String) value;
		else if(i == 5)
			tag = (String) value;
		else if(i == 6)
			start_date = (Date) value;
		else if (i == 7)
			end_date = (Date) value;
		else if(i == 8) 
			estimated_budget = (int) value;
		else if(i == 9)
			outcome = (String) value;
		else
			throw new Exception("Error: invalid column index in courselist table"); 
	}

	@Override
	public String toString() {
		return "ProjectInfo [Project_ID =" + project_ID + ", " + " Team_ID =" + team_name + ""
				+ "," + " Project_name =" + project_name + " Project_description =" + 
				project_description + ","+"Status =" + status +","+"Tags =" + tag + "," +
				" Start Date =" + start_date + "," + " End Date =" + end_date + "," 
				+ "Estimated Budget =" + estimated_budget + " Outcome =" + outcome +"]";
	}
}

