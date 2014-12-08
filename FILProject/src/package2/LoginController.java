package package2;

import package1.UserRecord;
import package2.LoginUserInfo;

public class LoginController {
	public LoginUserInfo validateInfo(String username, String password) {
		Login_Model lm = new Login_Model();
		return lm.validateInfo(username, password);
	}

}
