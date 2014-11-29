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
class ListInfo {
	List<ProjectInfo> projectTableResultList;
	List<UserRecord> usetInfoResultList;
}

public class ProjectInfoModel  extends AbstractTableModel {
	ListInfo ListResult;
	 List<Object> projectTableResultList; // stores the model data in a List collection of type CourseList
	private static final String PERSISTENCE_UNIT_NAME = "PersistenceUnit"; // Used in persistence.xml
	private static EntityManagerFactory factory; // JPA 
	private EntityManager manager; // JPA 
	private ProjectInfo table;// represents the entity courselist
	// This field contains additional information about the results 
	private ProjectInfoService projectTableService;
	private int numcols, numrows; // number of rows and columns
	ProjectInfoModel () {
		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		manager = factory.createEntityManager();
		table = new ProjectInfo();
		projectTableService = new ProjectInfoService(manager);

		// read all the records from courselist
		 projectTableResultList = projectTableService.readAll();
		
		// update the number of rows and columns in the model
		numrows = projectTableResultList.size();
		numcols = table.getNumberOfColumns();
	//	System.out.println("num rows " + numrows + " cols " + numcols + " size " + ListResult.projectTableResultList.size() +
			//	"Size1 " + ListResult.usetInfoResultList.size());
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
				return ((ProjectInfo) projectTableResultList.get(row)).getColumnData(col);
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
			ProjectInfo element = ListResult.projectTableResultList.get(row);
			element.setColumnData(col, aValue); 
			fireTableCellUpdated(row, col);
		} catch(Exception err) {
			err.toString();
		}
	}
	public List<ProjectInfo> getList() {
		return ListResult.projectTableResultList;
	}
	public EntityManager getEntityManager() {
		return manager;
	}
	// create a new table model using the existing data in list
	public ProjectInfoModel(List<ProjectInfo> list, EntityManager em) {
		ListResult.projectTableResultList = list;
		numrows = ListResult.projectTableResultList.size();
		table = new ProjectInfo();
		numcols = table.getNumberOfColumns(); 
		manager = em; 
		projectTableService = new ProjectInfoService(manager);
	}


}
