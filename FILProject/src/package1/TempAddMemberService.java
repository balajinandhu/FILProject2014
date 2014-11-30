package package1;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class TempAddMemberService {
	
	private EntityManager manager;
	public TempAddMemberService(EntityManager manager) {
		this.manager = manager;
	}
	public List<TempAddMember> readAllData() {
		TypedQuery<TempAddMember> query = manager.createQuery("SELECT e FROM TempAddMember e", TempAddMember.class);
		List<TempAddMember> result = query.getResultList();
		return result; 
	}
	
}
