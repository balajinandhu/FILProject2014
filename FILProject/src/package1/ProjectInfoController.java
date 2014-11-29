package package1;


import javax.sql.RowSetEvent;
import javax.sql.RowSetListener;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;


public class ProjectInfoController implements TableModelListener {
private ProjectInfoModel tableModel;
//private HomePageGUI gui;
private HomePageGUI gui;
int firstIndex;
public ProjectInfoController(HomePageGUI gui) {
	this.gui = gui; 
	// create the tableModel using the data in the cachedRowSet
	tableModel = new ProjectInfoModel();
	//jtable1.setModel(this.getTableModel());
	//gui.updateTable();

 //tableModel = new HomePageModel(tableModel.getList(), tableModel.getEntityManager());
 //tableModel.addTableModelListener(this);

}


// new code
public TableModel getTableModel() {
	return tableModel;
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
     //   gui.updateTable();
    
        // read the data in each column using getValueAt and display it on corresponding textfield
		
    			
    	
} catch(Exception exp) {
	exp.getMessage();
	exp.printStackTrace();
	}
}
 

}
