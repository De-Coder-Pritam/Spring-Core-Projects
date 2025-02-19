package in.pwskills.pritam.bean;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="wmg")
public class WishMessageGenerator {
	
	@Autowired
	private LocalDateTime date;
	static {
		System.out.println("WishMessageGenerator.class file is loading...");
	}
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator object is created...");
	}
	public String wishMessage(String user) {
		int hour = date.getHour();
		String msg = "";
		if(hour < 12) {
			msg +="Good Morning :: "+user;
		}else if(hour <16) {
			msg +="Good Afternoon :: "+user;
		}else if(hour < 20) {
			msg +="Good Evening :: "+user;
		}else {
			msg +="Good Night :: "+user;
		}
		return msg;
	}
	public LocalDateTime getLdt() {
		return date;
	}
	public void setLdt(LocalDateTime ldt) {
		this.date = ldt;
	}
}
