import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "phone")
public class Phone {

	@Id
	@Column(name = "number")
	private String number;

	@ManyToOne
	@JoinColumns({ 
					@JoinColumn(name = "emp_company_id", referencedColumnName = "company_id"),
					@JoinColumn(name = "emp_employee_number", referencedColumnName = "employee_number") 
				})
	private Employee employee;

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
}
