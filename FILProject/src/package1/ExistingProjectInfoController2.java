package package1;


import javax.sql.RowSetEvent;
import javax.sql.RowSetListener;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;


public class ExistingProjectInfoController2 {// implements ListSelectionListener,TableModelListener{
	private ExistingProjectInfoModel2 TeamtableModel;
	private AdminHomePageGUI gui;
	int firstIndex;
	public ExistingProjectInfoController2(AdminHomePageGUI gui) {
		this.gui = gui; 
		// create the tableModel using the data in the cachedRowSet
		TeamtableModel = new ExistingProjectInfoModel2(); 
	}


	// new code
	public TableModel getTableModel() {
		return TeamtableModel;
	}
	
	public void addProjectRow(ProjectInfo team) {
		TeamtableModel.addProjectRow(team);
	}
}