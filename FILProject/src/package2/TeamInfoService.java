
package package2;

import javax.persistence.*;

import java.util.*;


public class TeamInfoService {
	private EntityManager manager;
	public TeamInfoService(EntityManager manager) {
		this.manager = manager;
	}
	// method to create a new record
	public TeamInfo createCourse(int teamid, String teamname) {
		TeamInfo team = new TeamInfo();
		
		team.setTeam_strength(teamid);
		team.setTeam_name(teamname);
		manager.persist(team);
		return team;
	}

	// method to read a record
	public TeamInfo readCourse(int teamid) {
		TeamInfo course = manager.find(TeamInfo.class, teamid);
		return course; 
	}
	// method to read all records
	public List<TeamInfo> readAll() {
		TypedQuery<TeamInfo> query = manager.createQuery("SELECT e FROM TeamInfo e", TeamInfo.class);
		List<TeamInfo> result = query.getResultList();
		return result; 
	}

	// method to update a record
	public TeamInfo updateCourse(int teamid, String teamname) {
		TeamInfo team = manager.find(TeamInfo.class, teamid);
		if (team != null) {
			
			team.setTeam_strength(teamid);
			team.setTeam_name(teamname);
			
		}
		return team;
	}

	// method to delete a record
	public void deleteCourse(int teamid) {
		TeamInfo team = manager.find(TeamInfo.class, teamid);
		System.out.println(team);
		if (team != null) {
			manager.remove(team);
		}
	}
}
