package package1;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.swing.table.AbstractTableModel;

public class TempAddTeamModel extends AbstractTableModel {

	List<TempAddTeam> TempAddTeamResultList; // stores the model data in a List collection of type CourseList
	private static final String PERSISTENCE_UNIT_NAME = "PersistenceUnit"; // Used in persistence.xml
	private static EntityManagerFactory factory; // JPA 
	private EntityManager manager; // JPA 
	private TempAddTeam tableAddTeam;// represents the entity courselist
	// This field contains additional information about the results 
	private TempAddTeamService tempAddTeamService;
	private int numcols, numrows; // number of rows and columns
	public TempAddTeamModel() {
		// TODO Auto-generated constructor stub
		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		manager = factory.createEntityManager();
		tableAddTeam = new TempAddTeam();
		tempAddTeamService = new TempAddTeamService(manager);

		// read all the records from courselist
		TempAddTeamResultList = tempAddTeamService.readAllData();

		// update the number of rows and columns in the model
		numrows = TempAddTeamResultList.size();
		numcols = tableAddTeam.getNumberOfColumns();
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
			return TempAddTeamResultList.get(row).getColumnData(col);
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
			return tableAddTeam.getColumnName(col);
		} catch (Exception err) {
			return err.toString();
		} 
	}
	// update the data in the given row and column to aValue
	public void setValueAt(Object aValue, int row, int col) {
		//data[rowIndex][columnIndex] = (String) aValue;
		try {
			TempAddTeam element = TempAddTeamResultList.get(row);
			element.setColumnData(col, aValue); 
			fireTableCellUpdated(row, col);
		} catch(Exception err) {
			err.toString();
		}
	}
	public List<TempAddTeam> getList() {
		return TempAddTeamResultList;
	}
	public EntityManager getEntityManager() {
		return manager;
	}
	// create a new table model using the existing data in list
	public TempAddTeamModel(List<TempAddTeam> list, EntityManager em) {
		TempAddTeamResultList = list;
		numrows = TempAddTeamResultList.size();
		tableAddTeam = new TempAddTeam();
		numcols = tableAddTeam.getNumberOfColumns(); 
		manager = em; 
		tempAddTeamService = new TempAddTeamService(manager);
	}


	public void addTeamRow(int rowIndex, String[] name) {
		//data[rowIndex][columnIndex] = (String) aValue;
		// complete the code
		EntityTransaction userTransaction = manager.getTransaction(); 
		userTransaction.begin();
		tempAddTeamService.createTeam(TempAddTeamResultList.get(rowIndex), name);
		userTransaction.commit();
		// set the current row to rowIndex
		TempAddTeamResultList.remove(rowIndex);
		fireTableRowsDeleted(rowIndex, rowIndex);
		numrows--;

	}
}
