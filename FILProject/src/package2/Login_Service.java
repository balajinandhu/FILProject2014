package package2;

import java.util.List;

import package1.UserRecord;
import package2.LoginUserInfo;

import javax.persistence.EntityManager;
import javax.persistence.Query;

public class Login_Service {
	private EntityManager em;

	public Login_Service(EntityManager manager) {
		this.em = manager;
	}

	public LoginUserInfo validate(String un, String p) {

		LoginUserInfo userInfo = new LoginUserInfo();
		userInfo.user = this.em.find(UserRecord.class, un);

		if (userInfo.user != null) {
			userInfo.validate = userInfo.user.getPassword().equals(p);
		}
		return userInfo;

	}

}
