/*package package2;

import javax.persistence.*;

import java.io.*;

@Entity(name = "user_registration")
public class Registration_Info implements Serializable {
	public String getUName() {
		return u1;
	}

	public void setUName(String u1) {
		this.u1 = u1;
	}

	public String getFName() {
		return f1;
	}

	public void setFName(String f1) {
		this.f1 = f1;
	}

	public String getLName() {
		return l1;

	}

	public void setLName(String l1) {
		this.l1 = l1;
	}

	public String getEmail() {
		return e1;

	}

	public void setEmail(String e1) {
		this.e1 = e1;
	}

	public String getPass() {
		return p1;

	}

	public void setPass(String p1) {
		this.p1 = p1;
	}

	public String getCPass() {
		return c1;

	}

	public void setCPass(String c1) {
		this.c1 = c1;
	}
	public String getPnumb(String pn1) {
		return pn1;
	}

	public void setPnumb(String pn1) {
		this.pn1 = pn1;
	}

	public String getRole() {
		return r1;

	}

	public void setRole(String r1) {
		this.r1 = r1;
	}

	@Id
	@Column(name = "user_name")
	// column names as defines in database
	private String u1;

	@Column(name = "first_name")
	private String f1;

	@Column(name = "last_name")
	private String l1;

	@Column(name = "email_id")
    private String e1;
	
	@Column(name = "password")
	private String p1;

	@Column(name = "confirm_password")
	private String c1;
	
	@Column(name = "phone_number")
	private String pn1;

	@Column(name = "role")
	private String r1;

}
*/