package in.pwskills.pritam;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.ApplicationContext;

import in.pwskills.pritam.bean.Flipkart;
import in.pwskills.pritam.config.AppConfig;

public class TestApp {
	public static void main(String...strings) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		String[] def = context.getBeanDefinitionNames();
		for(String name : def) {
			System.out.println(name);
		}
		Flipkart flipkart = context.getBean("flipkart",Flipkart.class);
		System.out.println(flipkart);
		((AbstractApplicationContext) context).close();
	}
}
