
package package1;

import javax.persistence.*;

import java.util.*;


public class UserRecordService {
	private EntityManager manager;
	public UserRecordService(EntityManager manager) {
		this.manager = manager;
	}
	
	// method to read all records
	public List<UserRecord> readAll() {
		TypedQuery<UserRecord> query = manager.createQuery("SELECT e FROM UserRecord e", UserRecord.class);
		List<UserRecord> result = query.getResultList();
		return result; 
	}

}
