package package1;

import javax.persistence.*;

import java.util.*;


public class BudgetService {
	private EntityManager manager;
	public BudgetService(EntityManager manager) {
		this.manager = manager;
	}

	@SuppressWarnings("unchecked")
	public List<Budget> readBudget(String projectName) {
	
		List<Budget> result = manager.createQuery("SELECT NEW package1.Budget("
				+ "b.item_description, b.estimated_cost,b.actual_cost)"
				+ " FROM Budget b JOIN "
				+ "ProjectInfo p WHERE t.project_ID = p.project_ID"
				+ " AND t.project_name = ?1", Budget.class)
				.setParameter(1, projectName)
				.getResultList();
		
		return result; 
	}

}
