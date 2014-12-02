package package1;

import javax.persistence.*;

import java.util.*;


public class ProjectInfoService {
	private EntityManager manager;
	public ProjectInfoService(EntityManager manager) {
		this.manager = manager;
	}

	@SuppressWarnings("unchecked")
	public List<ProjectUser> readProjectbyUser(String projectName) {
		//UserRecord rec = manager.find(UserRecord.class, 29);
		//System.out.print(rec);
		List<ProjectUser> result = manager.createQuery("SELECT NEW package1.ProjectUser("
				+ "p.project_description, p.status, u.user_name)"
				+ " FROM UserRecord u JOIN "
				+ "ProjectInfo p WHERE u.team_name = p.team_name"
				+ " AND u.team_name=(SELECT e.team_name from ProjectInfo e"
				+ " WHERE e.project_name = ?1)", ProjectUser.class)
				.setParameter(1, projectName)
				.getResultList();
		
		return result; 
	}

	
	public List<TeamInfo> readAll() {
		TypedQuery<TeamInfo> query = manager.createQuery("SELECT e FROM TeamInfo e", TeamInfo.class);
		List<TeamInfo> result = query.getResultList();
		return result; 
	}

	
}
