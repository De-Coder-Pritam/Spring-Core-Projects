package in.pwskills.pritam.config;

import java.sql.Driver;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;




@Configuration
@ComponentScan(basePackages="in.pwskills.pritam")
@PropertySource("applica.properties")
public class AppConfig {
	
	@Autowired
	private Environment environment;
	static {
		System.out.println("AppConfig.class file is loading...");
	}
	public AppConfig() {
		System.out.println("AppConfig object is created...");
	}
	@Bean(value="ds")
	public DataSource getDBDetails() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUrl(environment.getProperty("db.mysql.url"));
		dataSource.setUsername(environment.getProperty("db.mysql.username"));
		dataSource.setPassword(environment.getProperty("db.mysql.password"));
		return dataSource;
	}
	
	
}
