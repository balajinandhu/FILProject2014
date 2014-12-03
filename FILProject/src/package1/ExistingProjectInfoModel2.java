package package1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.swing.table.*;
import javax.persistence.*;

import java.util.*;
/**
 *
 * @author rgrover
 */
public class ExistingProjectInfoModel2  extends AbstractTableModel {
	List<ProjectInfo> projectTableResultList; // stores the model data in a List collection of type CourseList
	private static final String PERSISTENCE_UNIT_NAME = "PersistenceUnit"; // Used in persistence.xml
	private static EntityManagerFactory factory; // JPA 
	private EntityManager manager; // JPA 
	private ProjectInfo tableTeam;// represents the entity courselist
	// This field contains additional information about the results 
	private ExistingProjectInfoService2 teamTableService;
	private int numcols, numrows; // number of rows and columns
	public ExistingProjectInfoModel2() {
		// TODO Auto-generated constructor stub
		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		manager = factory.createEntityManager();
		tableTeam = new ProjectInfo();
		teamTableService = new ExistingProjectInfoService2(manager);

		// read all the records from courselist
		projectTableResultList = teamTableService.readAll();

		// update the number of rows and columns in the model
		numrows = projectTableResultList.size();
		numcols = tableTeam.getNumberOfColumns1();
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
			return projectTableResultList.get(row).getColumnData(col);
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
			return tableTeam.getColumnName(col);
		} catch (Exception err) {
			return err.toString();
		} 
	}
	// update the data in the given row and column to aValue
	public void setValueAt(Object aValue, int row, int col) {
		//data[rowIndex][columnIndex] = (String) aValue;
		try {
			ProjectInfo element = projectTableResultList.get(row);
			element.setColumnData(col, aValue); 
			fireTableCellUpdated(row, col);
		} catch(Exception err) {
			err.toString();
		}
	}
	public List<ProjectInfo> getList() {
		return projectTableResultList;
	}
	public EntityManager getEntityManager() {
		return manager;
	}
	// create a new table model using the existing data in list
	public ExistingProjectInfoModel2(List<ProjectInfo> list, EntityManager em) {
		projectTableResultList = list;
		numrows = projectTableResultList.size();
		tableTeam = new ProjectInfo();
		numcols = tableTeam.getNumberOfColumns1(); 
		manager = em; 
		teamTableService = new ExistingProjectInfoService2(manager);
	}
	// In this method, a newly inserted row in the GUI is added to the table model as well as the database table
	// The argument to this method is an array containing the data in the textfields of the new row.
	public void addRow(Object[] array) {
		//data[rowIndex][columnIndex] = (String) aValue;
		// complete the code
		EntityTransaction userTransaction = manager.getTransaction(); 
		userTransaction.begin();
		/*	ProjectInfo newRecord = 
				teamTableService.createCourse(Integer.parseInt((String) array[0]), (String) array[1]);  */
		userTransaction.commit();
		// set the current row to rowIndex
		//		projectTableResultList.add(newRecord);
		int row = projectTableResultList.size(); 
		fireTableRowsInserted(row - 1, row - 1);


		numrows++;

	}

	public void addProjectRow(ProjectInfo team) {
		projectTableResultList.add(team);
		int row = projectTableResultList.size(); 
		fireTableRowsInserted(row - 1, row - 1);
		numrows++;
	}
}


