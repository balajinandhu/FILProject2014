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


public class ProjectInfoModel  extends AbstractTableModel {

	List<ProjectInfo> projectInfoResultList; // stores the model data in a List collection of type CourseList


	private static final String PERSISTENCE_UNIT_NAME = "PersistenceUnit"; // Used in persistence.xml
	private static EntityManagerFactory factory; // JPA 
	private EntityManager manager; // JPA 
	private ProjectInfo table;// represents the entity courselist
	// This field contains additional information about the results 
	private ProjectInfoService projectInfoService;
	private int numcols, numrows; // number of rows and columns
	ProjectInfoModel () {
		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		manager = factory.createEntityManager();
		table = new ProjectInfo();
		projectInfoService = new ProjectInfoService(manager);

		// read all the records from courselist
		projectInfoResultList = projectInfoService.readAll();

		// update the number of rows and columns in the model
		numrows = projectInfoResultList.size();
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
			return  projectInfoResultList.get(row).getColumnData(col);

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
			ProjectInfo element = projectInfoResultList.get(row);
			element.setColumnData(col, aValue); 
			fireTableCellUpdated(row, col);
		} catch(Exception err) {
			err.toString();
		}
	}
	public List<ProjectInfo> getList() {
		return projectInfoResultList;
	}
	public EntityManager getEntityManager() {
		return manager;
	}
	// create a new table model using the existing data in list
	public ProjectInfoModel(List<ProjectInfo> list, EntityManager em) {
		projectInfoResultList = list;
		numrows = projectInfoResultList.size();
		table = new ProjectInfo();
		numcols = table.getNumberOfColumns(); 
		manager = em; 
		projectInfoService = new ProjectInfoService(manager);
	}


	public void addRow(Object[] array) {
		//data[rowIndex][columnIndex] = (String) aValue;
		// complete the code
		DateFormat format = new SimpleDateFormat("YYYY/MM/dd");
		EntityTransaction userTransaction = manager.getTransaction(); 
		userTransaction.begin();
		ProjectInfo newRecord = null;
		try {
			newRecord = projectInfoService.createProject(Integer.parseInt((String) array[0]), (String) array[1], 
					(String) array[2], (String) array[3], (String) array[4], format.parse((String) array[5]),
					format.parse((String) array[6]), Integer.parseInt((String) array[7]), (String) array[8]);
		} catch (NumberFormatException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		userTransaction.commit();
		// set the current row to rowIndex
		projectInfoResultList.add(newRecord);
		int row = projectInfoResultList.size(); 
		fireTableRowsInserted(row - 1, row - 1);


		numrows++;

	} 

	public void deleteRow(Object[] array, int index) {
		EntityTransaction userTransaction = manager.getTransaction(); 
		userTransaction.begin();
		projectInfoService.deleteProject((String) array[0]);
		// System.out.println(array[1]);
		userTransaction.commit();
		// set the current row to rowIndex
		projectInfoResultList.remove(index);
		fireTableRowsDeleted(index, index);

		numrows--;
	}
	@SuppressWarnings("deprecation")
	public void updateRow(Object[] array, int index) {
		DateFormat format = new SimpleDateFormat("YYYY/MM/dd");
		EntityTransaction userTransaction = manager.getTransaction(); 
		userTransaction.begin();
		ProjectInfo newRecord = null;
		try {
			newRecord = projectInfoService.updateProject(Integer.parseInt((String) array[0]), (String) array[1], 
					(String) array[2], (String) array[3], (String) array[4], format.parse((String) array[5]),
					format.parse((String) array[6]), Integer.parseInt((String) array[7]), (String) array[8]);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

		userTransaction.commit();
		// set the current row to rowIndex
		projectInfoResultList.set(index, newRecord);
		int col = 0;
		for (Object i : array)
			fireTableCellUpdated(index, col++);

	}
	
	public void addProjectRow(ProjectInfo projectInfo) {
		projectInfoResultList.add(projectInfo);
		int row = projectInfoResultList.size(); 
		fireTableRowsInserted(row - 1, row - 1);
		numrows++;
	}
}
