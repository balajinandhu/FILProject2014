package package2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import package1.ProjectInfo;
import package1.TempAddUser;

public class Registration_Model {
	
	List<TempAddUser> projectInfoResultList;
	
	private static final String PERSISTENCE_UNIT_NAME="PersistenceUnit";
	private static EntityManagerFactory factory;
	private EntityManager manager;//entity class reference
	private Registration_Service rs;//object of service class
	private TempAddUser table;
	
	Registration_Model (){
		   factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		   manager=factory.createEntityManager();
		   table = new TempAddUser();
		   rs= new Registration_Service(manager); 
	}
/*	public void addtoDatabase(String[] array) {
		
	EntityTransaction userTransaction = manager.getTransaction();
	userTransaction.begin();//data begins to go to the database in form of array
	rs.addTo(array[0],array[1],array[2],array[3],array[4],array[5],Integer.parseInt((String) array[6]),array[7]);
	userTransaction.commit();
	System.out.println("done");

	}
	 */
	
	public TempAddUser addRow(Object[] array) {
		//data[rowIndex][columnIndex] = (String) aValue;
		// complete the code
	//	DateFormat format = new SimpleDateFormat("YYYY/MM/dd");
		EntityTransaction userTransaction = manager.getTransaction(); 
		userTransaction.begin();
		TempAddUser newRecord = null;
		
						
			newRecord = rs.addTo((String) array[0], (String) array[1], 
					(String) array[2], (String) array[3], (String) array[4],
					 Integer.parseInt((String) array[6]), (String) array[7]);
		 
		userTransaction.commit();
                return newRecord;
		// set the current row to rowIndex
	//	projectInfoResultList.add(newRecord);
	//	int row = projectInfoResultList.size(); 
	//	fireTableRowsInserted(row - 1, row - 1);


	//	numrows++;

	} 
	
	
}
