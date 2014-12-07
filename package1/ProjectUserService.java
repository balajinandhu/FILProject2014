
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
		
		List<ProjectUser> result;
		ProjectInfo project;
		Set<UserRecord> userSet;
		
		if (projectName.equals(""))
			return null;
		try {
			project = manager.createQuery("SELECT p from ProjectInfo p WHERE p.project_name = ?1",
					ProjectInfo.class)
					.setParameter(1, projectName)
					.getSingleResult();
		} catch (NoResultException e) {
			// TODO Auto-generated catch block
			return null;
		}
		
		System.out.println(project);
		userSet = project.getUserRecord();
		System.out.println(project + " " + userSet.size());
		result = new ArrayList<ProjectUser>();
		for (UserRecord user : userSet) {
			ProjectUser p1 = new ProjectUser(project.getProject_description(), project.getStatus(),
					user.getUser_name());
			result.add(p1);
		}
		//UserRecord rec = manager.find(UserRecord.class, 29);
		//System.out.print(rec);
	/*	List<ProjectUser> result = manager.createQuery("SELECT NEW package1.ProjectUser("
				+ "p.project_description, p.status, u.user_name)"
				+ " FROM UserRecord u JOIN "
				+ "ProjectInfo p WHERE p.project_name = ?1 AND p.project_ID = u.project_ID",
				ProjectUser.class)
				.setParameter(1, projectName)
				.getResultList();*/
		
		return result;
	} 
		
		

	
/*	public List<TeamInfo> readAll() {
		TypedQuery<TeamInfo> query = manager.createQuery("SELECT e FROM TeamInfo e", TeamInfo.class);
		List<TeamInfo> result = query.getResultList();
		return result; 
	} */

	
}
