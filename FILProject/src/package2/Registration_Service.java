package package2;
import java.util.Date;
import java.util.List;

import package1.ProjectInfo;
import package1.TempAddUser;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.swing.JOptionPane;

//import Registration_Info.Registration_Info;

public class Registration_Service {

	private EntityManager em;
	public Registration_Service(EntityManager manager) {
		this.em=manager;//entity class object
	}
        
        public boolean checkUserNameExistence(String un)
        {
            TypedQuery<TempAddUser> qur = em.createQuery("Select distinct u from user_registration u where u.user_name ='"+un+"' ",TempAddUser.class);
            List<TempAddUser> rlst = qur.getResultList();
            if(rlst.size()!=0)
            {
                return false;
            }
            return true;
        }
        
        public boolean checkUserEmailExistence(String email)
        {
            TypedQuery<TempAddUser> qur = em.createQuery("Select distinct u from user_registration u where u.email_ID ='"+email+"' ",TempAddUser.class);
            List<TempAddUser> rlst = qur.getResultList();
             if(rlst.size()!=0)
            {
                return false;
            }
            return true;
        }
	public TempAddUser addTo(String un, String fn, String ln, String email, String p, int pn, String role) {
		TempAddUser ri = new TempAddUser();
		ri.setUserName(un);
		ri.setfirstName(fn);
		ri.setLastName(ln);
		ri.setEmail_ID(email);
		ri.setPassword(p);
		ri.setPhoneNummber(pn);
		ri.setrole(role);
                
                if(checkUserNameExistence(un))
                {
                    if(checkUserEmailExistence(email))
                    {
                        em.persist(ri);
                        System.out.println("success");
                        return ri;
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Email Already Exist");
                         return null;
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Username Already Exist");
                     return null;
                }
		
	}

	
	
}


