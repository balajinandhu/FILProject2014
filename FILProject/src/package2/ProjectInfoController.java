package package2;


import javax.sql.RowSetEvent;
import javax.sql.RowSetListener;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;


public class ProjectInfoController implements ListSelectionListener,TableModelListener{
	private ProjectInfoModel tableModel;
	private ProjectInfoGUI gui;
	
	int firstIndex;
	public ProjectInfoController(ProjectInfoGUI projectInfoGUI) {
		this.gui = projectInfoGUI; 
		// create the tableModel using the data in the cachedRowSet
		tableModel = new ProjectInfoModel(); 
	}
	
	

	// new code
	public TableModel getTableModel() {
		return tableModel;
	}

	public void valueChanged(ListSelectionEvent e) {
		ListSelectionModel selectModel = (ListSelectionModel) e.getSource();
		int firstIndex = selectModel.getMinSelectionIndex();
		// read the data in each column using getValueAt and display it on corresponding textfield
		gui.setProject_IDTextField(
				tableModel.getValueAt(firstIndex, 0).toString());
		gui.setProject_nameTextField( (String) 
				tableModel.getValueAt(firstIndex, 1));
		gui.setProject_descriptionTextField( (String) 
				tableModel.getValueAt(firstIndex, 2));
		gui.setStatusTextField( (String) 
				tableModel.getValueAt(firstIndex, 3));
		gui.setTagTextField((String) 
				tableModel.getValueAt(firstIndex, 4));
		gui.setStartDateTextField((String) 
				tableModel.getValueAt(firstIndex, 5));
		gui.setEndDateTextField( (String) 
				tableModel.getValueAt(firstIndex, 6));
		gui.setEstimated_budgetTextField( 
				tableModel.getValueAt(firstIndex, 7).toString());
		gui.setOutcomeTextField( (String) 
				tableModel.getValueAt(firstIndex, 8).toString()); 
	}

	public void tableChanged(TableModelEvent e)
	{
		try {
			// get the index of the inserted row
			//tableModel.getRowSet().moveToCurrentRow();
			firstIndex = 0;

			// create a new table model with the new data
			tableModel = new ProjectInfoModel(tableModel.getList(), tableModel.getEntityManager());
			tableModel.addTableModelListener(this);
			// update the JTable with the data
			gui.updateTable();

			// read the data in each column using getValueAt and display it on corresponding textfield

			gui.setProject_IDTextField( (String) 
					tableModel.getValueAt(firstIndex, 0));
			gui.setProject_nameTextField( (String) 
					tableModel.getValueAt(firstIndex, 1));
			gui.setProject_descriptionTextField( (String) 
					tableModel.getValueAt(firstIndex, 2));
			gui.setStatusTextField( (String) 
					tableModel.getValueAt(firstIndex, 3));
			gui.setTagTextField((String) 
					tableModel.getValueAt(firstIndex, 4));
			gui.setStartDateTextField((String) 
					tableModel.getValueAt(firstIndex, 5));
			gui.setEndDateTextField( (String) 
					tableModel.getValueAt(firstIndex, 6));
			gui.setEstimated_budgetTextField( (String) 
					tableModel.getValueAt(firstIndex, 7));
			gui.setOutcomeTextField( (String) 
					tableModel.getValueAt(firstIndex, 8)); 

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