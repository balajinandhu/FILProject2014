package package1;

import javax.persistence.*;

import java.util.*;


public class TaskInfoService {
	private EntityManager manager;
	public TaskInfoService(EntityManager manager) {
		this.manager = manager;
	}

	@SuppressWarnings("unchecked")
	public List<TaskUser> readTaskbyUser(String userName) {
		//UserRecord rec = manager.find(UserRecord.class, 29);
		//System.out.print(rec);
		List<TaskUser> result = manager.createQuery("SELECT NEW package1.TaskUser("
				+ "p.project_name, t.outcome)"
				+ " FROM TaskInfo t JOIN "
				+ "ProjectInfo p WHERE t.project_ID = p.project_ID"
				+ " AND t.user_ID = (SELECT e.user_ID from UserRecord e"
				+ " WHERE e.user_name = ?1)", TaskUser.class)
				.setParameter(1, userName)
				.getResultList();
		
		for(TaskUser t : result) {
			System.out.println(t.toString());
		}
		return result; 
	}

}
