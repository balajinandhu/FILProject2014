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

public class TaskUserModel  extends AbstractTableModel {
	List<TaskUser> taskUserResultList; // stores the model data in a List collection of type CourseList
	private static final String PERSISTENCE_UNIT_NAME = "PersistenceUnit"; // Used in persistence.xml
	private static EntityManagerFactory factory; // JPA 
	private EntityManager manager; // JPA 
	private TaskUser table;// represents the entity courselist
	// This field contains additional information about the results 
	private TaskInfoService taskInfoService;
	private int numcols = 2, numrows; // number of rows and columns
	public TaskUserModel() {
		// TODO Auto-generated constructor stub
		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		manager = factory.createEntityManager();
		table = new TaskUser();
		taskInfoService = new TaskInfoService(manager);
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
			return (taskUserResultList.get(row)).getColumnData(col);

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
			TaskUser element = taskUserResultList.get(row);
	//		element.setColumnData(col, aValue); 
			fireTableCellUpdated(row, col);
		} catch(Exception err) {
			err.toString();
		}
	}
	public List<TaskUser> getList() {
		return taskUserResultList;
	}
	public EntityManager getEntityManager() {
		return manager;
	}
	// create a new table model using the existing data in list
	public TaskUserModel(List<TaskUser> list, EntityManager em) {
		taskUserResultList = list;
		numrows = taskUserResultList.size();
		table = new TaskUser();
		numcols = table.getNumberOfColumns(); 
		manager = em; 
		taskInfoService = new TaskInfoService(manager);
	}

	public List<TaskUser> readTaskbyUser(String userName) {
		taskUserResultList = taskInfoService.readTaskbyUser(userName);
		if (taskUserResultList != null) {
			numrows = taskUserResultList.size();
			numcols = table.getNumberOfColumns();
			fireTableDataChanged();
			if (numrows == 0) {
				return null;
			}
		} else {
			numrows = 0;
			fireTableDataChanged();
		}
		
		return taskUserResultList;
	}

}
