package package1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
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
		//	UserProjectRecords userProject1, userProject2, userProject3, userProject4;

		/*	UserRecord readCourse(String username) {
			UserRecord course = manager.find(UserRecord.class, username);
			return user1; 
		}
		 */
		if (project == null) {
			System.out.println("project info null for " + name[0]);
			return null;
		}

		Set<UserRecord> userSet = new HashSet<UserRecord>();
		Set<ProjectInfo> projectSet = new HashSet<ProjectInfo>();


		try {
			if (!name[1].equals("")){
				user1 = this.getUserRecord(name[1]);
				//user1.setProjectID(project.getProject_ID());
				//manager.merge(user1);
				userSet.add(user1);
				projectSet = user1.getRecords();
				projectSet.add(project);
				manager.merge(user1);
				/*userProject1 = new  UserProjectRecords(project.getProject_name(), user1.getUser_name(),
						user1.getRole());
				manager.persist(userProject1);*/
			}
			if (!name[2].equals("")){
				user2 = this.getUserRecord(name[2]);
				//user2.setProjectID(project.getProject_ID());
				//manager.merge(user2);
				userSet.add(user2);
				projectSet = user2.getRecords();
				projectSet.add(project);
				manager.merge(user2);
				/*userProject2 = new  UserProjectRecords(project.getProject_name(), user2.getUser_name(),
						user2.getRole());
				manager.persist(userProject2);*/
			}
			if (!name[3].equals("")){
				user3 = this.getUserRecord(name[3]);
				if (user3 != null) {

					userSet.add(user3);
					projectSet = user3.getRecords();
					projectSet.add(project);
					manager.merge(user3);
				}
				//user3.setProjectID(project.getProject_ID());
				//manager.merge(user3);
				/*userProject3 = new  UserProjectRecords(project.getProject_name(), user3.getUser_name(),
						user3.getRole());
				manager.persist(userProject3);*/
			}
			if (!name[4].equals("")){
				user4 = this.getUserRecord(name[4]);
				if (user4 != null) {
					userSet.add(user4);
					projectSet = user4.getRecords();
					projectSet.add(project);
					manager.merge(user4);
				}
				//user4.setProjectID(project.getProject_ID());
				//manager.merge(user4);
				/*userProject4 = new  UserProjectRecords(project.getProject_name(), user4.getUser_name(),
						user4.getRole());
				manager.persist(userProject4);*/

			}

			project.setUserRecord(userSet);
			manager.merge(project);
			team = manager.merge(team);
			manager.remove(team);
		} catch (Exception e) {
			// Error here. send null to indicate error.
			e.printStackTrace();
			return null;
		}


		return project;
	}

	public TempAddProject delProject(TempAddProject team, String[] name) {
		team = manager.merge(team);
		manager.remove(team);
		return team;
	}
	
	public UserRecord getUserRecord(String team_member) {
		UserRecord user;
		try {
			user = manager.createQuery("SELECT u FROM UserRecord u"
					+ " WHERE u.user_name = ?1", UserRecord.class)
					.setParameter(1, team_member)
					.getSingleResult();
		} catch (NoResultException e) {
			// TODO Auto-generated catch block
			return null;
		}
		return user;
	}

	public ProjectInfo getProjectInfo(String projectName) {
		ProjectInfo projectInfo;
		try {
			projectInfo = manager.createQuery("SELECT p FROM ProjectInfo p"
					+ " WHERE p.project_name = ?1", ProjectInfo.class)
					.setParameter(1, projectName)
					.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
		return projectInfo;
	}

}
