package package1;


import java.awt.List;

import javax.sql.RowSetEvent;
import javax.sql.RowSetListener;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;


public class ProjectUserController implements TableModelListener {

	private ProjectUserModel tableModel1;
	private AdminHomePageGUI gui;
	int firstIndex;
	public ProjectUserController(AdminHomePageGUI gui) {
		this.gui = gui; 
		// create the tableModel using the data in the cachedRowSet
		tableModel1 = new ProjectUserModel();
	}


	// new code
	public TableModel getTableModel() {
		return tableModel1;
	}

	public void tableChanged(TableModelEvent e)	{
		try {
			// get the index of the inserted row
			firstIndex = 0;

			// create a new table model with the new data
			tableModel1 = new ProjectUserModel(tableModel1.getList(), 
					tableModel1.getEntityManager());
			tableModel1.addTableModelListener(this);
			// update the JTable with the data
			//   gui.updateTable();

			/* read the data in each column using getValueAt and display it on corresponding text field */
		} catch(Exception exp) {
			exp.getMessage();
			exp.printStackTrace();
		}
	}
	
	public ProjectUser readProjectbyUser(String projectName) {
		if (tableModel1.readProjectbyUser(projectName) == null) {
			return null;
		} else
			return new ProjectUser();

	}

}
