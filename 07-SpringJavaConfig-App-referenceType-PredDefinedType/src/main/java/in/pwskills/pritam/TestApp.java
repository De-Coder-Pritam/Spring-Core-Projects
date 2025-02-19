package in.pwskills.pritam;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.ApplicationContext;

import in.pwskills.pritam.config.AppConfig;
import in.pwskills.pritam.dao.EmployeeMysqlDaoImpl;

public class TestApp {
	public static void main(String...strings) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		EmployeeMysqlDaoImpl daoImpl = context.getBean("mysqlDao",EmployeeMysqlDaoImpl.class);
		daoImpl.getConnection();
		((AbstractApplicationContext) context).close();
	}
}
