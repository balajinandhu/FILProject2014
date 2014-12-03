package package1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.swing.table.*;
import javax.persistence.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
/**
 *
 * @author rgrover
 */


public class UserRecordModel  extends AbstractTableModel {

	List<UserRecord> userRecordResultList; // stores the model data in a List collection of type CourseList


	private static final String PERSISTENCE_UNIT_NAME = "PersistenceUnit"; // Used in persistence.xml
	private static EntityManagerFactory factory; // JPA 
	private EntityManager manager; // JPA 
	private UserRecord table;// represents the entity courselist
	// This field contains additional information about the results 
	private UserRecordService userRecordService;
	private int numcols, numrows; // number of rows and columns
	UserRecordModel () {
		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		manager = factory.createEntityManager();
		table = new UserRecord();
		userRecordService = new UserRecordService(manager);

		// read all the records from courselist
		userRecordResultList = userRecordService.readAll();

		// update the number of rows and columns in the model
		numrows = userRecordResultList.size();
		numcols = table.getNumberOfColumns();

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
			System.out.println(userRecordResultList.get(row).getColumnData(col) + " " + numcols);
			return  userRecordResultList.get(row).getColumnData(col);

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

	// update the data in the given row and column to aValue
	public void setValueAt(Object aValue, int row, int col) {
		//data[rowIndex][columnIndex] = (String) aValue;
		try {
			UserRecord element = userRecordResultList.get(row);
			element.setColumnData(col, aValue); 
			fireTableCellUpdated(row, col);
		} catch(Exception err) {
			err.toString();
		}
	}
	public List<UserRecord> getList() {
		return userRecordResultList;
	}
	public EntityManager getEntityManager() {
		return manager;
	}
	// create a new table model using the existing data in list
	public UserRecordModel(List<UserRecord> list, EntityManager em) {
		userRecordResultList = list;
		numrows = userRecordResultList.size();
		table = new UserRecord();
		numcols = table.getNumberOfColumns(); 
		manager = em; 
		userRecordService = new UserRecordService(manager);
	}


	public void addRow(Object[] array) {
		//data[rowIndex][columnIndex] = (String) aValue;
		// complete the code
		DateFormat format = new SimpleDateFormat("YYYY/MM/dd");
		EntityTransaction userTransaction = manager.getTransaction(); 
		userTransaction.begin();
		UserRecord newRecord = null;
			newRecord = userRecordService.createRecord((String) array[0],(String) array[1], Integer.parseInt((String) array[2]));
		
		userTransaction.commit();
		// set the current row to rowIndex
		userRecordResultList.add(newRecord);
		int row = userRecordResultList.size(); 
		fireTableRowsInserted(row - 1, row - 1);
		numrows++;
	} 

	public void deleteRow(Object[] array, int index) {
		EntityTransaction userTransaction = manager.getTransaction(); 
		userTransaction.begin();
		userRecordService.deleteRecord((String) array[0]);
		// System.out.println(array[1]);
		userTransaction.commit();
		// set the current row to rowIndex
		userRecordResultList.remove(index);
		fireTableRowsDeleted(index, index);
		numrows--;
	}
	
	@SuppressWarnings("deprecation")
	public void updateRow(Object[] array, int index) {
		DateFormat format = new SimpleDateFormat("YYYY/MM/dd");
		EntityTransaction userTransaction = manager.getTransaction(); 
		userTransaction.begin();
		UserRecord newRecord = null;
			newRecord = userRecordService.updateRecord((String) array[0],(String) array[1], Integer.parseInt((String) array[2]));

		userTransaction.commit();
		// set the current row to rowIndex
		userRecordResultList.set(index, newRecord);
		int col = 0;
		for (Object i : array)
			fireTableCellUpdated(index, col++);

	}
	
/*	public void addProjectRow(ProjectInfo projectInfo) {
		userRecordResultList.add(projectInfo);
		int row = userRecordResultList.size(); 
		fireTableRowsInserted(row - 1, row - 1);
		numrows++;
	} */
}
