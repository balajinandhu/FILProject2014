
package package2;

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
	

	public UserRecord createRecord( String username, String emailid, int phoneno) {
		UserRecord record = new UserRecord();
		record.setUser_name(username);
		record.setEmail_ID(emailid);
		record.setPhone_number(phoneno);
		manager.persist(record);
		return record;
	}
	public UserRecord readRecord(String username) {
		UserRecord record = manager.find(UserRecord.class, username);
		return record; 
	}

	public UserRecord updateRecord(String username, String emailid, int phoneno) {
		UserRecord record = manager.find(UserRecord.class, username);
		if (record != null) {
			//ProjectInfo project = new ProjectInfo();
			record.setUser_name(username);
			record.setEmail_ID(emailid);
			record.setPhone_number(phoneno);
			manager.persist(record);

		}
		return record;
}
	
	
	public void deleteRecord(String username) {
		UserRecord record = manager.find(UserRecord.class, username);
		if (record != null) {
			manager.remove(record);
		}
	}
}
