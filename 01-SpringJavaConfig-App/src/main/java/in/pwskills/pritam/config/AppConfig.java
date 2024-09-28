package in.pwskills.pritam.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.pwskills.pritam.bean.Employee;

@Configuration
public class AppConfig {
	static {
		System.out.println("AppConfig.class file is loading...");
	}
	public AppConfig() {
		System.out.println("AppConfig object is created...");
	}
	@Bean(name="emp")
	public Employee empObj() {
		System.out.println("AppConfig.empObj():: Creating the object...");
		Employee employee = new Employee();
		employee.setEid(10);
		employee.setEname("Sachin");
		employee.setEage(52);
		employee.setEaddress("MI");
		return employee;
	}
}
