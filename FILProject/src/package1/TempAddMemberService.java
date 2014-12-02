package package1;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

public class TempAddMemberService {

	private EntityManager manager;
	public TempAddMemberService(EntityManager manager) {
		this.manager = manager;
	}
	public List<TempAddMember> readAllData() {
		TypedQuery<TempAddMember> query = manager.createQuery("SELECT NEW package1.TempAddMember("
				+ "e.user_name, e.role, e.team_name) FROM TempAddMember e", TempAddMember.class);
		List<TempAddMember> result = query.getResultList();
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
