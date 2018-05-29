import java.io.Serializable;

public class Emp implements Serializable {
 
	private int idEmployee;
	private String branchName;
 
	public Emp() {
 
	}
 
	public Emp(String branchName, int idEmployee) {
		this.branchName = branchName;
		this.idEmployee = idEmployee;
	}
 
	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return super.equals(arg0);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	public int getIdEmployee() {
		return idEmployee;
	}
 
	public String getBranchName() {
		return branchName;
	}
 
}