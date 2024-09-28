package in.pwskills.pritam.config;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.pwskills.pritam.bean.WishMessageGenerator;


@Configuration
public class AppConfig {
	static {
		System.out.println("AppConfig.class file is loading...");
	}
	public AppConfig() {
		System.out.println("AppConfig object is created...");
	}
	@Bean(name="wmg")
	public WishMessageGenerator wmgObj() {
		System.out.println("Appconfig.wmgObj() method invoked...");
		WishMessageGenerator gen = new WishMessageGenerator();
		LocalDateTime ldt = LocalDateTime.now();
		gen.setLdt(ldt);
		return gen;
	}
}
