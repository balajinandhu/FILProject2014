package package1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class TempAddProjectService {

	private EntityManager manager;
	public TempAddProjectService(EntityManager manager) {
		this.manager = manager;
	}
	public List<TempAddProject> readAllData() {
		TypedQuery<TempAddProject> query = manager.createQuery("SELECT NEW package1.TempAddProject("
				+ "e.project_name, e.participant1, e.participant2, e.participant3,"
				+ " e.participant4) FROM TempAddProject e",
				TempAddProject.class);
		List<TempAddProject> result = query.getResultList();
		return result; 
	}

	public ProjectInfo createProject(TempAddProject team, String[] name) {
		ProjectInfo project = getProjectInfo(name[0]);
		UserRecord user1, user2, user3, user4;

		if (project == null) {
			return null;
		}

		try {
			if (!name[1].equals("")){
				user1 = this.getUserRecord(name[1]);
				user1.setProjectID(project.getProject_ID());
				manager.merge(user1);
			}
			if (!name[2].equals("")){
				user2 = this.getUserRecord(name[2]);
				user2.setProjectID(project.getProject_ID());
				manager.merge(user2);
			}
			if (!name[3].equals("")){
				user3 = this.getUserRecord(name[3]);
				user3.setProjectID(project.getProject_ID());
				manager.merge(user3);
			}
			if (!name[4].equals("")){
				user4 = this.getUserRecord(name[4]);
				user4.setProjectID(project.getProject_ID());
				manager.merge(user4);
			}

			team = manager.merge(team);
			manager.remove(team);
		} catch (Exception e) {
			// Error here. send null to indicate error.
			return null;
		}

		return project;
	}

	public UserRecord getUserRecord(String team_member) {
		UserRecord user = manager.createQuery("SELECT u FROM UserRecord u"
				+ " WHERE u.user_name = ?1", UserRecord.class)
				.setParameter(1, team_member)
				.getSingleResult();
		return user;
	}

	public ProjectInfo getProjectInfo(String projectName) {
		ProjectInfo projectInfo = manager.createQuery("SELECT p FROM ProjectInfo p"
				+ " WHERE u.project_name = ?1", ProjectInfo.class)
				.setParameter(1, projectName)
				.getSingleResult();
		return projectInfo;
	}

}
