package Com.GL.CustomarService.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Customar_Table")
public class Customar {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Customar_id")
	private int id;
	@Column(name="First_Name")
	private String firstName;
	@Column(name="Last_Name")
	private String lastName;
	@Column(name="Customar_Email")
	private String email;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customar [id=" + id + ", firstName=" + firstName + ", LastName=" + lastName + ", email=" + email + "]";
	}

	public Customar(String firstName, String lastName, String email) {
		super();
        this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public Customar() {
		super();
		// TODO Auto-generated constructor stub
	}

}
