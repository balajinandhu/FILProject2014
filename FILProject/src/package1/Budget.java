package package1;


import javax.persistence.*;

import java.io.*;
import java.util.Set;
@SuppressWarnings("serial")
@Entity(name = "Budget")
public class Budget implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	@Column(name = "item_ID")
	private int item_ID;

	@Column
	private int project_ID;
	
	@Column
	private String item_description;
	
	@Column
	private String estimated_cost;
	
	@Column
	private String actual_cost;

	public int getItem_ID() {
		return item_ID;
	}
	public void setItem_ID(int itemid) {
		this.item_ID = itemid;
	}

	public int getProject_ID() {
		return project_ID;
	}
	public void setProject_ID(int projectid) {
		this.project_ID = projectid;
	}

	public String getItem_description() {
		return item_description;
	}
	
	public void setItem_descritpion(String item_desc) {
		this.item_description = item_desc;
	}
	
	public String getEstimated_cost() {
		return estimated_cost;
	}
	
	public void setEstimated_cost(String est_cost) {
		this.estimated_cost = est_cost;
	}
	
	public String getActual_cost() {
		return estimated_cost;
	}
	
	public void setActual_cost(String act_cost) {
		this.actual_cost = act_cost;
	}
	
	// return number of columns in the table
	public int getNumberOfColumns() {
		return 4;
	}

	// return the data in column i
	public Object getColumnData(int i) throws Exception {

		if (i == 0)
			return getItem_ID();
		else if (i == 1)
			return getItem_description();
		else if (i == 2)
			return getEstimated_cost();
		else if (i == 3)
			return getActual_cost();
		else if (i == 4)
			return getProject_ID();
		else
			throw new Exception("Error: invalid column index in teaminfo table"); 
	}

	// return the name of column i
	public String getColumnName(int i) throws Exception {
		String colName = null;
		 if (i == 0) 
			colName = "Item ID";
		else if (i == 1) 
			colName = "Item Description";
		else if (i == 2) 
			colName = "Estimated Cost";
		else if (i == 3) 
			colName = "Actual Cost";
		else if (i == 4)
			colName = "Project ID";
		else
			throw new Exception("Access to invalid column number in teaminfo table");

		return colName;
	}

	// set data column i to value
	public void setColumnData(int i, Object value) throws Exception {
		if (i == 0) 
			item_ID = (int) value;
		else if (i == 1) 
			item_description = (String) value;
		else if (i == 2) 
			estimated_cost = (String) value;
		else if (i == 3) 
			actual_cost = (String) value;
		else if (i == 4) 
			project_ID = (int) value;
		else
			throw new Exception("Error: invalid column index in teaminfo table"); 
	}

	@Override
	public String toString() {
		return "Budget [ Project_ID =" + project_ID  + ", " + " Item_Description =" + item_description +" Estimated_cost =" 
				+ estimated_cost +" Actual_cost =" + actual_cost + " Item_ID =" +item_ID +"]";
	}
}


