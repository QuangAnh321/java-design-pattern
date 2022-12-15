package principles.singleResponsibility;

import java.util.Date;

public class Employee {

	private String employeeId;
	private String name;
	private String address;
	private Date dateOfJoining;
	
	/**
	 *Two below method violate Single Responsibility Principle if they are here
	 */
//	public boolean isPromotionDueThisYear() {
//		
//	}
//	
//	public double calcIncomeTaxForCurrentYear() {
//		
//	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	
	
}
