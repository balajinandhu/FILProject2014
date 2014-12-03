package package1;

import javax.persistence.*;

import java.util.*;


public class ProjectUserService {
	private EntityManager manager;
	public ProjectUserService(EntityManager manager) {
		this.manager = manager;
	}

	@SuppressWarnings("unchecked")
	public List<ProjectUser> readProjectbyUser(String projectName) {
		//UserRecord rec = manager.find(UserRecord.class, 29);
		//System.out.print(rec);
		List<ProjectUser> result = manager.createQuery("SELECT NEW package1.ProjectUser("
				+ "p.project_description, p.status, u.user_name)"
				+ " FROM UserRecord u JOIN "
				+ "ProjectInfo p WHERE u.project_ID = p.project_ID"
				+ " AND u.project_ID=(SELECT e.project_ID from ProjectInfo e"
				+ " WHERE e.project_name = ?1)", ProjectUser.class)
				.setParameter(1, projectName)
				.getResultList();
		
		return result; 
	}

	
/*	public List<TeamInfo> readAll() {
		TypedQuery<TeamInfo> query = manager.createQuery("SELECT e FROM TeamInfo e", TeamInfo.class);
		List<TeamInfo> result = query.getResultList();
		return result; 
	} */

	
}
