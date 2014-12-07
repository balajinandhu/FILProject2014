package package1;


import javax.persistence.*;

import java.io.*;
import java.util.Set;
@SuppressWarnings("serial")
@Entity(name = "TeamInfo")
public class TeamInfo implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	@Column(name = "team_name")
	private String team_name;

	@Column
	private int team_strength;

	public String getTeam_name() {
		return team_name;
	}
	public void setTeam_name(String name) {
		this.team_name = name;
	}

	public int getTeam_strength() {
		return team_strength;
	}
	public void setTeam_strength(int strength) {
		this.team_strength = strength;
	}


	public TeamInfo() {

		team_name = "";
		team_strength = 0;
	}

	public TeamInfo(String team_name, int team_strength) {
		this.team_name = team_name;
		this.team_strength = team_strength;
	}

	// return number of columns in the table
	public int getNumberOfColumns() {
		return 2;
	}

	// return the data in column i
	public Object getColumnData(int i) throws Exception {

		if (i == 0)
			return getTeam_name();
		else if (i == 1)
			return getTeam_strength();
		else
			throw new Exception("Error: invalid column index in teaminfo table"); 
	}

	// return the name of column i
	public String getColumnName(int i) throws Exception {
		String colName = null;
		if (i == 0)
			colName = "Project Name";
		else if (i == 1) 
			colName = "Project Strength";
		else
			throw new Exception("Access to invalid column number in teaminfo table");

		return colName;
	}

	// set data column i to value
	public void setColumnData(int i, Object value) throws Exception {
		if (i == 0) 
			team_name = (String) value;
		else if (i == 1) 
			team_strength = (int) value;
		else
			throw new Exception("Error: invalid column index in teaminfo table"); 
	}

	@Override
	public String toString() {
		return "TeamInfo [ Team_name =" + team_name  + ", " + " Team_strength =" + team_strength+"]";
	}
}


