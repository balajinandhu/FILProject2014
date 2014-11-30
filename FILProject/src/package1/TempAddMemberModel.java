package package1;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.table.AbstractTableModel;

public class TempAddMemberModel extends AbstractTableModel {

	List<TempAddMember> TempAddMemberResultList; // stores the model data in a List collection of type CourseList
	 private static final String PERSISTENCE_UNIT_NAME = "PersistenceUnit"; // Used in persistence.xml
	 private static EntityManagerFactory factory; // JPA 
	 private EntityManager manager; // JPA 
	 private TempAddMember tableAddMember;// represents the entity courselist
	 // This field contains additional information about the results 
	 private TempAddMemberService tempAddMemberService;
	 private int numcols, numrows; // number of rows and columns
	 public TempAddMemberModel() {
		// TODO Auto-generated constructor stub
	 factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
	 manager = factory.createEntityManager();
	 tableAddMember = new TempAddMember();
	 tempAddMemberService = new TempAddMemberService(manager);
	 
	 // read all the records from courselist
	 TempAddMemberResultList = tempAddMemberService.readAllData();
	 
	 // update the number of rows and columns in the model
	 numrows = TempAddMemberResultList.size();
	 numcols = tableAddMember.getNumberOfColumns();
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
	 return TempAddMemberResultList.get(row).getColumnData(col);
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
	return tableAddMember.getColumnName(col);
	} catch (Exception err) {
	 return err.toString();
	 } 
	}
	// update the data in the given row and column to aValue
	public void setValueAt(Object aValue, int row, int col) {
	//data[rowIndex][columnIndex] = (String) aValue;
	try {
	 TempAddMember element = TempAddMemberResultList.get(row);
	 element.setColumnData(col, aValue); 
	 fireTableCellUpdated(row, col);
	} catch(Exception err) {
	err.toString();
	}
	}
	public List<TempAddMember> getList() {
	return TempAddMemberResultList;
	}
	public EntityManager getEntityManager() {
	 return manager;
	}
	// create a new table model using the existing data in list
	public TempAddMemberModel(List<TempAddMember> list, EntityManager em) {
	 TempAddMemberResultList = list;
	 numrows = TempAddMemberResultList.size();
	 tableAddMember = new TempAddMember();
	 numcols = tableAddMember.getNumberOfColumns(); 
	 manager = em; 
	 tempAddMemberService = new TempAddMemberService(manager);
	}
}
