package in.pwskills.pritam.bean;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee implements Serializable{
	
	static {
		System.out.println("Employee.class is loading");
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Employee(int eid, float salary, List<String> friends, Set<String> phoneNumbers,
			Map<String, String> accountNumbers) {
		super();
		this.eid = eid;
		this.salary = salary;
		this.friends = friends;
		this.phoneNumbers = phoneNumbers;
		this.accountNumbers = accountNumbers;
	}
	private int eid;
	private float salary;
	
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", salary=" + salary + ", friends=" + friends + ", phoneNumbers=" + phoneNumbers
				+ ", accountNumbers=" + accountNumbers + "]";
	}
	private List<String> friends;
	private Set<String> phoneNumbers;
	private Map<String,String> accountNumbers;
	
}
