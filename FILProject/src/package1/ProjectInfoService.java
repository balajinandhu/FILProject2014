package package1;

import javax.persistence.*;

import java.util.*;


public class ProjectInfoService {
	private EntityManager manager;
	public ProjectInfoService(EntityManager manager) {
		this.manager = manager;
	}

	@SuppressWarnings("unchecked")
	public List<Object> readAll() {
		//UserRecord rec = manager.find(UserRecord.class, 29);
		//System.out.print(rec);
		/*TypedQuery<ProjectInfo>*/ Query query = manager.createQuery("SELECT p.project_description, u.user_name FROM UserRecord u JOIN "
				+ "ProjectInfo p WHERE u.team_ID = p.team_ID");
		
		List<Object> result = query.getResultList();
		System.out.print(query.getResultList().toString());
		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));
		}
	 
		return result; 
	}

}
