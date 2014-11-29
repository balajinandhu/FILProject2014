package package1;


import javax.sql.RowSetEvent;
import javax.sql.RowSetListener;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;


public class TeamInfoController {// implements ListSelectionListener,TableModelListener{
private TeamInfoModel TeamtableModel;
private AdminHomePageGUI gui;
int firstIndex;
public TeamInfoController(AdminHomePageGUI gui) {
this.gui = gui; 
 // create the tableModel using the data in the cachedRowSet
 TeamtableModel = new TeamInfoModel(); 
}


// new code
public TableModel getTableModel() {
return TeamtableModel;
   }


}