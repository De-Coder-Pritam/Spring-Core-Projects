package in.pwskills.pritam;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.ApplicationContext;

import in.pwskills.pritam.bean.WishMessageGenerator;
import in.pwskills.pritam.config.AppConfig;

public class TestApp {
	public static void main(String...strings) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		WishMessageGenerator wmg = context.getBean("wmg",WishMessageGenerator.class);
		String msg = wmg.wishMessage("pritam");
		System.out.println(msg);
		((AbstractApplicationContext) context).close();
	}
}
