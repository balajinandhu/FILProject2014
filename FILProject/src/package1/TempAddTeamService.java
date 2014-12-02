package package1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class TempAddTeamService {

	private EntityManager manager;
	public TempAddTeamService(EntityManager manager) {
		this.manager = manager;
	}
	public List<TempAddTeam> readAllData() {
		TypedQuery<TempAddTeam> query = manager.createQuery("SELECT NEW package1.TempAddTeam("
				+ "e.team_name, e.team_member1, e.team_member2, e.team_member3,"
				+ " e.team_member4) FROM TempAddTeam e",
				TempAddTeam.class);
		List<TempAddTeam> result = query.getResultList();
		for (TempAddTeam t : result) {
			System.out.println(t);
		}
		return result; 
	}

	public void createTeam(TempAddTeam team, String[] name) {
		//TempAddTeam team = new TempAddTeam();
		//team.setTeamInfo(name[0]);
		TeamInfo teamInfo = new TeamInfo();
		teamInfo = new TeamInfo(name[0], name.length - 1);
		Set <UserRecord> set = new HashSet<UserRecord>();

		UserRecord user1 = this.getUserRecord(name[1]);
		UserRecord user2 = this.getUserRecord(name[2]);
		UserRecord user3 = this.getUserRecord(name[3]);
		set.add(user1);
		set.add(user2);
		set.add(user3);

		teamInfo.setUserRecord(set);
		manager.persist(teamInfo);

		user1.setTeamInfo(teamInfo);
		user2.setTeamInfo(teamInfo);
		user3.setTeamInfo(teamInfo);
		user1.setTeam_name(teamInfo.getTeam_name());
		user2.setTeam_name(teamInfo.getTeam_name());
		user3.setTeam_name(teamInfo.getTeam_name());

		//manager.persist(teamInfo);
		manager.merge(user1);
		manager.merge(user2);
		manager.merge(user3);

		//team.setRecords(set);
		team = manager.merge(team);
		manager.remove(team);
	}

	public UserRecord getUserRecord(String team_member) {
		UserRecord user = manager.createQuery("SELECT u FROM UserRecord u"
				+ " WHERE u.user_name = ?1", UserRecord.class)
				.setParameter(1, team_member)
				.getSingleResult();
		return user;
	}

}
