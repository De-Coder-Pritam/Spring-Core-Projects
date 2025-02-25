package in.pwskills.pritam.config;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
		System.out.println("Appconfig.wmgObj() method invoked...");
		List<String> friends = List.of("Saurav","Pritam","Ankesh");
		Set<String> numbers = Set.of("12121212","21212121","23232323");
		Map<String,String> accountNumbers = Map.of("Canara","12321","SBI","45654");
		
		Employee emp = new Employee(10,23465.5f,friends,numbers,accountNumbers);
		return emp;
	}
}
