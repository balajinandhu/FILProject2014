package package2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import package1.UserRecord;
import package2.LoginUserInfo;

public class Login_Model {
	private static final String PERSISTENCE_UNIT_NAME = "PersistenceUnit";
	private static EntityManagerFactory factory;
	private EntityManager manager;
	private Login_Service ls;

	Login_Model() {
		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		manager = factory.createEntityManager();
		ls = new Login_Service(manager);
	}

	public LoginUserInfo validateInfo(String username, String password) {
		return ls.validate(username, password);
	}

}
