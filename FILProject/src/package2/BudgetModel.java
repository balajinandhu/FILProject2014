package package2;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.table.AbstractTableModel;

public class BudgetModel extends AbstractTableModel{
	
	List<Budget> budgetResultList; // stores the model data in a List collection of type CourseList
	private static final String PERSISTENCE_UNIT_NAME = "PersistenceUnit"; // Used in persistence.xml
	private static EntityManagerFactory factory; // JPA 
	private EntityManager manager; // JPA 
	private Budget table;// represents the entity courselist
	// This field contains additional information about the results 
	private BudgetService budgetService;
	private int numcols, numrows; // number of rows and columns
	public BudgetModel() {
		// TODO Auto-generated constructor stub
		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		manager = factory.createEntityManager();
		table = new Budget();
		budgetService = new BudgetService(manager);
	}

	// returns a count of the number of rows16
	public int getRowCount() {
		return numrows;
	}
	// returns a count of the number of columns
	public int getColumnCount() {
		return numcols;
	}
	// returns the data at the given row and column number
	public Object getValueAt(int row, int col) {
		try {
			//if (col < 2) 
			return (budgetResultList.get(row)).getColumnData(col);

			//else
			//	return ListResult.usetInfoResultList.get(row).getColumnData(col);
		} catch (Exception e) {
			e.getMessage();
			return null;
		}
	}
	// table cells are not editable
	public boolean isCellEditable(int rowIndex, int colIndex) {
		return false;
	}
	
	public Class<?> getColumnClass(int col) {
		return getValueAt(0, col).getClass();
	}
	// returns the name of the column
	public String getColumnName(int col) {
		try {
			return table.getColumnName(col);
		} catch (Exception err) {
			return err.toString();
		}  
	} 
	public List<Budget> getList() {
		return budgetResultList;
	}
	public EntityManager getEntityManager() {
		return manager;
	}
	
	public List<Budget> readBudget(String projectName) {
		budgetResultList = budgetService.readBudget(projectName);
		numrows = budgetResultList.size();
		numcols = table.getNumberOfColumns();
		return budgetResultList;
	}
	
	

}
