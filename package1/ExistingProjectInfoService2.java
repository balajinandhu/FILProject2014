
package package1;

import javax.persistence.*;

import java.util.*;


public class ExistingProjectInfoService2 {
	private EntityManager manager;
	public ExistingProjectInfoService2(EntityManager manager) {
		this.manager = manager;
	}
	
	// method to read all records
	public List<ProjectInfo> readAll() {
		TypedQuery<ProjectInfo> query = manager.createQuery("SELECT e FROM ProjectInfo e", ProjectInfo.class);
		List<ProjectInfo> result = query.getResultList();
		return result; 
	}

}
