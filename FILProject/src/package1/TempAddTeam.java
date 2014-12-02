package package1;



import javax.persistence.*;

import java.io.*;
import java.util.Set;
@SuppressWarnings("serial")
@Entity(name = "TempAddTeam")
public class TempAddTeam implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	@Column(name = "team_name")
	private String team_name;

	@Column
	private String team_member1;

	@Column
	private String team_member2;

	@Column
	private String team_member3;

	@Column
	private String team_member4;


	public TempAddTeam() {
		team_name = team_member1 = team_member2 = team_member3 =
				team_member4 = "";
	}
	
	public TempAddTeam(String team_name, String team_member1, String team_member2, 
			String team_member3, String team_member4) {
		this.team_name = team_name;
		this.team_member1 = team_member1;
		this.team_member2 = team_member2;
		this.team_member3 = team_member3;
		this.team_member4 = team_member4;
		
	}

	/*@OneToMany(cascade = CascadeType.ALL, mappedBy="team")
	private Set<UserRecord> records;
	public void setRecords(Set<UserRecord> rec) {
		this.records = rec;
	}*/

	public String getTeam_name() {
		return team_name;
	}

	public String getTeam_member1() {
		return team_member1;
	}
	
	public String getTeam_member2() {
		return team_member2;
	}

	public String getTeam_member3() {
		return team_member3;
	}

	public String getTeam_member4() {
		return team_member4;
	}

	public int getNumberOfColumns() {
		return 5;
	}

	public Object getColumnData(int i) throws Exception {
		if (i == 0)
			return getTeam_name();
		else if (i == 1)
			return getTeam_member1();
		else if (i == 2)
			return getTeam_member2();
		else if (i == 3)
			return getTeam_member3();
		else if (i == 4)
			return getTeam_member4();
		else
			throw new Exception("Error: invalid column index in tempaddteam table"); 
	}

	// return the name of column i
	public String getColumnName(int i) throws Exception {
		String colName = null;
		if (i == 0) 
			colName = "team_name";
		else if (i == 1)
			colName = "Team_member1";
		else if (i == 2)
			colName = "Team_member2";
		else if (i == 3)
			colName = "Team_member3";
		else if (i == 4)
			colName = "Team_member4";
		else
			throw new Exception("Access to invalid column number in tempaddteam table");

		return colName;
	}

	// set data column i to value
	public void setColumnData(int i, Object value) throws Exception {
		if (i == 0) 
			team_name = (String) value;
		else if (i == 1) 
			team_member1 = (String) value;
		else if (i == 2) 
			team_member2 = (String) value;
		else if (i == 3) 
			team_member3 = (String) value;
		else if (i == 4) 
			team_member4 = (String) value;
		else
			throw new Exception("Error: invalid column index in tempaddteam table"); 
	}

	@Override
	public String toString() {
		return "Temp"
				+ "AddTeam [Team_name =" + team_name + ", " + " Team_member1 =" + team_member1 + " Team_member2 =" + team_member2 +" Team_member3 ="
				+ team_member3 + "Team_member4 =" + team_member4 +"]";
	}



}
