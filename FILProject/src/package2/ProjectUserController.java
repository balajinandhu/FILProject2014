package package2;


import java.awt.List;

import javax.sql.RowSetEvent;
import javax.sql.RowSetListener;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;


public class ProjectUserController {//implements TableModelListener {

	private ProjectUserModel tableModel1;
	private UserHomeGUI gui;
	int firstIndex;
	public ProjectUserController(UserHomeGUI gui) {
		this.gui = gui; 
		// create the tableModel using the data in the cachedRowSet
		tableModel1 = new ProjectUserModel();
	}


	// new code
	public TableModel getTableModel() {
		return tableModel1;
	}

/*	public void tableChanged(TableModelEvent e)	{
		try {
			// get the index of the inserted row
			firstIndex = 0;

			// create a new table model with the new data
			tableModel = new ProjectInfoModel(tableModel.getList(), 
					tableModel.getEntityManager());
			tableModel.addTableModelListener(this);
			// update the JTable with the data
			//   gui.updateTable();

			/* read the data in each column using getValueAt and display it on corresponding text field 
		} catch(Exception exp) {
			exp.getMessage();
			exp.printStackTrace();
		}
	} */
	public void readProjectbyUser(String projectName) {
		tableModel1.readProjectbyUser(projectName);

	}

}
