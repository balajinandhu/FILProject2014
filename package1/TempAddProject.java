package package1;



import javax.persistence.*;

import java.io.*;
import java.util.Set;
@SuppressWarnings("serial")
@Entity(name = "TempAddProject")
public class TempAddProject implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	@Column(name = "project_name")
	private String project_name;

	@Column
	private String participant1;

	@Column
	private String participant2;

	@Column
	private String participant3;

	@Column
	private String participant4;


	public TempAddProject() {
		project_name = participant1 = participant2 = participant3 =
				participant4 = "";
	}
	
	public TempAddProject(String project_name, String participant1, String participant2, 
			String participant3, String participant4) {
		this.project_name = project_name;
		this.participant1 = participant1;
		this.participant2 = participant2;
		this.participant3 = participant3;
		this.participant4 = participant4;
		
	}

	/*@OneToMany(cascade = CascadeType.ALL, mappedBy="team")
	private Set<UserRecord> records;
	public void setRecords(Set<UserRecord> rec) {
		this.records = rec;
	}*/

	public String getProject_name() {
		return project_name;
	}

	public String getparticipant1() {
		if(participant1 == null) 
			return "";
		else 
		return participant1;
	}
	
	public String getparticipant2() {
		if(participant2 == null) 
			return "";
		else 
		return participant2;
	}

	public String getparticipant3() {
		if(participant3 == null) 
			return "";
		else 
		return participant3;
	}

	public String getparticipant4() {
		if(participant4 == null) 
			return "";
		else 
		return participant4;
	}

	public int getNumberOfColumns() {
		return 5;
	}

	public Object getColumnData(int i) throws Exception {
		if (i == 0)
			return getProject_name();
		else if (i == 1)
			return getparticipant1();
		else if (i == 2)
			return getparticipant2();
		else if (i == 3)
			return getparticipant3();
		else if (i == 4)
			return getparticipant4();
		else
			throw new Exception("Error: invalid column index in tempaddteam table"); 
	}

	// return the name of column i
	public String getColumnName(int i) throws Exception {
		String colName = null;
		if (i == 0) 
			colName = "Project Name";
		else if (i == 1)
			colName = "Participant1";
		else if (i == 2)
			colName = "Participant2";
		else if (i == 3)
			colName = "Participant3";
		else if (i == 4)
			colName = "Participant4";
		else
			throw new Exception("Access to invalid column number in tempaddteam table");

		return colName;
	}

	// set data column i to value
	public void setColumnData(int i, Object value) throws Exception {
		if (i == 0) 
			project_name = (String) value;
		else if (i == 1) 
			participant1 = (String) value;
		else if (i == 2) 
			participant2 = (String) value;
		else if (i == 3) 
			participant3 = (String) value;
		else if (i == 4) 
			participant4 = (String) value;
		else
			throw new Exception("Error: invalid column index in tempaddteam table"); 
	}

	@Override
	public String toString() {
		return "Temp"
				+ "AddProject [Project_name =" + project_name + ", " + " participant1 =" + participant1 + " participant2 =" + participant2 
				+" Participant3 ="+ participant3 + "Participant4 =" + participant4 +"]";
	}



}
