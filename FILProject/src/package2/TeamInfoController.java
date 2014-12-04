package package2;


import javax.sql.RowSetEvent;
import javax.sql.RowSetListener;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;


public class TeamInfoController {// implements ListSelectionListener,TableModelListener{
	private TeamInfoModel TeamtableModel;
	private UserHomeGUI gui;
	int firstIndex;
	public TeamInfoController(UserHomeGUI gui) {
		this.gui = gui; 
		// create the tableModel using the data in the cachedRowSet
		TeamtableModel = new TeamInfoModel(); 
	}


	// new code
	public TableModel getTableModel() {
		return TeamtableModel;
	}


}