package package1;


import javax.sql.RowSetEvent;
import javax.sql.RowSetListener;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;


public class ExistingProjectInfoController2  implements TableModelListener{
	private ExistingProjectInfoModel2 tableModel;
	private AdminHomePageGUI gui;
	int firstIndex;
	public ExistingProjectInfoController2(AdminHomePageGUI gui) {
		this.gui = gui; 
		// create the tableModel using the data in the cachedRowSet
		tableModel = new ExistingProjectInfoModel2(); 
	}


	// new code
	public TableModel getTableModel() {
		return tableModel;
	}
	
	public void addProjectRow(ProjectInfo team) {
		tableModel.addProjectRow(team);
	}


	@Override
	public void tableChanged(TableModelEvent e) {
		// TODO Auto-generated method stub
		
			// get the index of the inserted row
			//tableModel.getRowSet().moveToCurrentRow();
			firstIndex = 0;

			// create a new table model with the new data
			tableModel = new ExistingProjectInfoModel2(tableModel.getList(), tableModel.getEntityManager());
			tableModel.addTableModelListener(this);
			// update the JTable with the data
			gui.updateTable();

	}
	
	public void updateProjectTable() {
		tableModel.updateProjectTable();
	}
}