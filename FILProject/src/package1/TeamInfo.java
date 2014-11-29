package package1;


import javax.persistence.*;

import java.io.*;
import java.util.Set;
@SuppressWarnings("serial")
@Entity(name = "TeamInfo")
public class TeamInfo implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	@Column(name = "team_ID")
	private int team_ID;

	@Column
	private String team_name;

	public int getTeam_ID() {
		return team_ID;
	}
	public void setTeam_ID(int teamid) {
		this.team_ID = teamid;
	}
	public String getTeam_name() {
		return team_name;
	}
	public void setTeam_name(String name) {
		this.team_name = name;
	}

	@OneToMany(cascade = CascadeType.ALL, mappedBy="teamid")

	private Set<ProjectInfo> records;

	public Set<ProjectInfo> getRecords() {

		return records;

	} 



	/*   public void setRecords(Set<ProjectInfo> records) {

	  this.records = records;

	   } 

	   public Set<UserRecord> getRecords1() {

			  return records1;

			   } */


	// return number of columns in the table
	public int getNumberOfColumns() {
		return 2;
	}

	// return the data in column i
	public Object getColumnData(int i) throws Exception {
		if (i == 0)
			return getTeam_ID();
		else if (i == 1)
			return getTeam_name();
		else
			throw new Exception("Error: invalid column index in courselist table"); 
	}

	// return the name of column i
	public String getColumnName(int i) throws Exception {
		String colName = null;
		if (i == 0) 
			colName = "Team_ID";
		else if (i == 1)
			colName = "Team_name";
		else
			throw new Exception("Access to invalid column number in courselist table");

		return colName;
	}

	// set data column i to value
	public void setColumnData(int i, Object value) throws Exception {
		if (i == 0) 
			team_ID = (int) value;
		else if (i == 1) 
			team_name = (String) value;
		else
			throw new Exception("Error: invalid column index in courselist table"); 
	}

	@Override
	public String toString() {
		return "TeamInfo [Team_ID =" + team_ID + ", " + " Team_name =" + team_name +"]";
	}
}


