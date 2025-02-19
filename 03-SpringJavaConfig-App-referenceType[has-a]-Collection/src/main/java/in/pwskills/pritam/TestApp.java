package in.pwskills.pritam;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.ApplicationContext;

import in.pwskills.pritam.bean.Employee;
import in.pwskills.pritam.config.AppConfig;

public class TestApp {
	public static void main(String...strings) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Employee emp = context.getBean("emp",Employee.class);
		System.out.println(emp);
		((AbstractApplicationContext) context).close();
	}
}
