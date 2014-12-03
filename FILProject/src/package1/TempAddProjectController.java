package package1;


import javax.sql.RowSetEvent;
import javax.sql.RowSetListener;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;


public class TempAddProjectController implements ListSelectionListener { //,TableModelListener{
	private TempAddProjectModel TempAddTeamModel;
	private AdminHomePageGUI gui;
	int firstIndex;
	public TempAddProjectController(AdminHomePageGUI gui) {
		// TODO Auto-generated constructor stub
		this.gui = gui; 
		// create the tableModel using the data in the cachedRowSet
		TempAddTeamModel = new TempAddProjectModel(); 
	}


	public void valueChanged(ListSelectionEvent e) {
		ListSelectionModel selectModel = (ListSelectionModel) e.getSource();
		int firstIndex = selectModel.getMinSelectionIndex();
		// read the data in each column using getValueAt and display it on corresponding textfield
		TempAddTeamModel.getValueAt(firstIndex, 0);
		TempAddTeamModel.getValueAt(firstIndex, 1);
		TempAddTeamModel.getValueAt(firstIndex, 2);
		TempAddTeamModel.getValueAt(firstIndex, 3);
		TempAddTeamModel.getValueAt(firstIndex, 4);

	}

	// new code
	public TableModel getTableModel() {
		return TempAddTeamModel;
	}

	public ProjectInfo addTeamRow(int rowIndex, String[] name) {
		return TempAddTeamModel.addTeamRow(rowIndex, name);
	}

}