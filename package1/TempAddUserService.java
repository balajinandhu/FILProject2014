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
		TypedQuery<TempAddUser> query = manager.createQuery("SELECT e FROM user_registration e", TempAddUser.class);
		List<TempAddUser> result = query.getResultList();
		return result; 
	}

	public void createMember(String[] name) {
		/* Create user here. */

		TempAddUser upr = manager.find(TempAddUser.class, name[0]);
		UserRecord user = new UserRecord(upr.getUser_name(), upr.getRole(),
				upr.getFirst_name(), upr.getLast_name(), upr.getEmail_ID(), upr.getPassword(), 
				upr.getPhoneNumber());

		manager.persist(user);
		upr = manager.merge(upr);
		manager.remove(upr);
	}
	
	public void delMember(String[] name) {
		/* Create user here. */

		TempAddUser upr = manager.find(TempAddUser.class, name[0]);
		upr = manager.merge(upr);
		manager.remove(upr);
	}

}
