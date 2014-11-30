package package1;


import javax.sql.RowSetEvent;
import javax.sql.RowSetListener;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;


public class TempAddMemberController {// implements ListSelectionListener,TableModelListener{
	private TempAddMemberModel TempAddMemberModel;
	private AdminHomePageGUI gui;
	int firstIndex;
	public TempAddMemberController(AdminHomePageGUI gui) {
		// TODO Auto-generated constructor stub
		this.gui = gui; 
		// create the tableModel using the data in the cachedRowSet
		TempAddMemberModel = new TempAddMemberModel(); 
	}


	// new code
	public TableModel getTableModel() {
		return TempAddMemberModel;
	}


}