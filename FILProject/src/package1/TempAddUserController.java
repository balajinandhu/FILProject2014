package package1;


import javax.sql.RowSetEvent;
import javax.sql.RowSetListener;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;


public class TempAddUserController implements ListSelectionListener { //,TableModelListener{
	private TempAddUserModel TempAddMemberModel;
	private AdminHomePageGUI gui;
	int firstIndex;
	public TempAddUserController(AdminHomePageGUI gui) {
		// TODO Auto-generated constructor stub
		this.gui = gui; 
		// create the tableModel using the data in the cachedRowSet
		TempAddMemberModel = new TempAddUserModel(); 
	}

	
	public void valueChanged(ListSelectionEvent e) {
		ListSelectionModel selectModel = (ListSelectionModel) e.getSource();
		int firstIndex = selectModel.getMinSelectionIndex();
		// read the data in each column using getValueAt and display it on corresponding textfield
		TempAddMemberModel.getValueAt(firstIndex, 0);
		TempAddMemberModel.getValueAt(firstIndex, 1);
		TempAddMemberModel.getValueAt(firstIndex, 2);
		 
		}

	// new code
	public TableModel getTableModel() {
		return TempAddMemberModel;
	}
	
	public void addMemberRow(String[] name, int selectedRow) {
		TempAddMemberModel.addMemberRow(name, selectedRow);
	}

}