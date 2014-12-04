package package2;


import javax.sql.RowSetEvent;
import javax.sql.RowSetListener;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;


public class UserRecordController implements ListSelectionListener,TableModelListener{
	private UserRecordModel tableModel;
	private UserRecordGUI gui;
	int firstIndex;
	public UserRecordController(UserRecordGUI userRecordGUI) {
		this.gui = userRecordGUI; 
		// create the tableModel using the data in the cachedRowSet
		tableModel = new UserRecordModel(); 
	}


	// new code
	public TableModel getTableModel() {
		return tableModel;
	}

	public void valueChanged(ListSelectionEvent e) {
		ListSelectionModel selectModel = (ListSelectionModel) e.getSource();
		int firstIndex = selectModel.getMinSelectionIndex();
		// read the data in each column using getValueAt and display it on corresponding text field
		gui.setUser_nameTextField((String)
				tableModel.getValueAt(firstIndex, 0));
		gui.setEmail_IDTextField( (String) 
				tableModel.getValueAt(firstIndex, 1));
		gui.setPhone_numberTextField(
				tableModel.getValueAt(firstIndex, 2).toString());
	}

	public void tableChanged(TableModelEvent e)
	{
		try {
			// get the index of the inserted row
			//tableModel.getRowSet().moveToCurrentRow();
			firstIndex = 0;

			// create a new table model with the new data
			tableModel = new UserRecordModel(tableModel.getList(), tableModel.getEntityManager());
			tableModel.addTableModelListener(this);
			// update the JTable with the data
			gui.updateTable();

			// read the data in each column using getValueAt and display it on corresponding textfield

			gui.setUser_nameTextField( (String) 
					tableModel.getValueAt(firstIndex, 0));
			gui.setEmail_IDTextField( (String) 
					tableModel.getValueAt(firstIndex, 1));
			gui.setPhone_numberTextField((String)
					tableModel.getValueAt(firstIndex, 2));

		} catch(Exception exp) {
			exp.getMessage();
			exp.printStackTrace();
		}
	}


	public void addRow(String[] array) {
		tableModel.addRow(array);
	}
	public void deleteRow(String[] array, int index) {
		tableModel.deleteRow(array, index);
	}
	public void updateRow(String[] array, int index) {
		tableModel.updateRow(array, index );
	}
}