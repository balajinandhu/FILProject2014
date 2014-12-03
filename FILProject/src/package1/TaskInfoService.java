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
	
		List<TaskUser> result = manager.createQuery("SELECT NEW package1.TaskUser("
				+ "p.project_name, t.task_name)"
				+ " FROM TaskInfo t JOIN "
				+ "ProjectInfo p WHERE t.project_ID = p.project_ID"
				+ " AND t.user_name = ?1", TaskUser.class)
				.setParameter(1, userName)
				.getResultList();
		
		return result; 
	}

}
