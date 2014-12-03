package package1;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

public class TempAddUserService {

	private EntityManager manager;
	public TempAddUserService(EntityManager manager) {
		this.manager = manager;
	}
	public List<TempAddUser> readAllData() {
		TypedQuery<TempAddUser> query = manager.createQuery("SELECT NEW package1.TempAddUser("
				+ "e.user_name, e.role, e.project_name) FROM TempAddUser e", TempAddUser.class);
		List<TempAddUser> result = query.getResultList();
		return result; 
	}

	public void createMember(String[] name) {
		//manager.persist(team);
		// return team;
		TeamInfo team = null;
		if (name[name.length - 1] != "") {
			try {
				team = manager.createQuery("SELECT t "
						+ " FROM TeamInfo t WHERE t.team_name=?1", TeamInfo.class)
						.setParameter(1, name[name.length - 1])
						.getSingleResult();
			} catch(NoResultException e) {
				team = null;
			}
		}

		/* Create user here. */
		UserRecord user = new UserRecord();
		user.setUser_name(name[0]);
		user.setRole(name[1]);
		if (team != null) {
			user.setTeam_name(name[name.length - 1]);
			int count = team.getTeam_strength();
			count++;
			team.setTeam_strength(count);
			manager.merge(team);
		}
		manager.persist(user);


	}

}
