import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(Emp.class)
public class NewEmpEntity {
 
	@Id
	private String branchName;
 
	@Id
	private int idEmployee;
	private String firstName;
	private String lastName;
	private int salary;
 
	public String getBranchName() {
		return branchName;
	}
 
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
 
	public int getIdEmployee() {
		return idEmployee;
	}
 
	public void setIdEmployee(int idEmployee) {
		this.idEmployee = idEmployee;
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
 
	public int getSalary() {
		return salary;
	}
 
	public void setSalary(int salary) {
		this.salary = salary;
	}
 
}