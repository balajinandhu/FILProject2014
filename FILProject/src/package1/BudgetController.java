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


public class BudgetController {
	private BudgetModel tableModel;
	//private HomePageGUI gui;
	private BudgetGUI gui;
	int firstIndex;
	public BudgetController(BudgetGUI gui) {
		this.gui = gui; 
		// create the tableModel using the data in the cachedRowSet
		tableModel = new BudgetModel();

	}


	// new code
	public TableModel getTableModel() {
		return tableModel;
	}
	public void readBudget(String projectName) {
		tableModel.readBudget(projectName);

	}
}