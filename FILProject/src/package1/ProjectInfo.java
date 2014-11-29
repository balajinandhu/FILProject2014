package package1;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import org.eclipse.persistence.sessions.Record;

import java.io.*;
@SuppressWarnings("serial")
@Entity(name = "ProjectInfo")
public class ProjectInfo implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	@Column(name = "project_ID")
	private int project_ID;

	@JoinColumn(name="team_ID")
	@Column
	private int team_ID;

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

	@ManyToOne(cascade=CascadeType.ALL)

	@PrimaryKeyJoinColumn(name="team_ID")

	private TeamInfo teamid; 

	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="ProjectUser_map", joinColumns={
			@JoinColumn(name="project_ID", referencedColumnName="team_ID", nullable=false, updatable=false)},
			inverseJoinColumns={ @JoinColumn(name="user_ID", referencedColumnName="team_ID", nullable=false, updatable=false)})
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
	public int getTeam_ID() {
		return team_ID;
	}
	public void setTeam_ID(int id) {
		this.team_ID = id;
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


	public String getTeamInfo() {
		return teamid.getTeam_name();
	} 


	// return number of columns in the table
	public int getNumberOfColumns() {
		return 3;
	}

	// return the data in column i
	public Object getColumnData(int i) throws Exception {
		if (i == 0)
			return getProject_ID();
		else if (i == 1) // 1
			return getTeam_ID();
		else if (i == 2) {
			System.out.print(getUserRecord());
			return getUserRecord();
		}
		//return getTeamInfo();
		//return getProject_name(); 
		/*	else if (i == 4) //3
		 */

		//return getProject_description();
		/*	else if (i == 4) // 4
			return getStatus();
		else if(i == 5)
			return getTags();
		else if(i == 6)	 
			return getStartDate();
		else if(i == 7)
			return getEndDate();
		else if(i == 8)
			return getEstimated_budget();*/
		else
			throw new Exception("Error: invalid column index in courselist table"); 
	}

	// return the name of column i
	public String getColumnName(int i) throws Exception {
		String colName = null;
		if (i == 0) // 0 
			colName = "Project_ID";
		else if (i == 1) // 1
			colName = "Team_ID";
		else if (i == 2)
			colName = "Project_name";
		else if (i == 3) // 3
			colName = "Project_description";
		else if (i == 4) // 4
			colName = "Status";
		else if(i == 5)
			colName = "Tags";
		else if(i == 6)
			colName = "start_date";
		else if (i == 7)
			colName = "end_date";
		else if(i == 8)
			colName = "Estimated_budget";
		else
			throw new Exception("Access to invalid column number in courselist table");

		return colName;
	}

	// set data column i to value
	public void setColumnData(int i, Object value) throws Exception {
		if (i == 0) 
			project_ID = (int) value;
		else if (i == 1) 
			team_ID = (int) value;
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
		else
			throw new Exception("Error: invalid column index in courselist table"); 
	}

	@Override
	public String toString() {
		return "ProjectInfo [Project_ID =" + project_ID + ", " + " Team_ID =" + team_ID + "," + " Project_name =" + project_name +
				" Project_description =" + project_description + ","+"Status =" + status +","+"Tags =" + tag + "," + " Start Date =" 
				+ start_date + "," + " End Date =" + end_date + "," + "Estimated Budget =" + estimated_budget +"]";
	}
}
