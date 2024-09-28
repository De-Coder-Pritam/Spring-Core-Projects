package in.pwskills.pritam.bean;

import java.time.LocalDateTime;

public class WishMessageGenerator {
	private LocalDateTime ldt;
	static {
		System.out.println("WishMessageGenerator.class file is loading...");
	}
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator object is created...");
	}
	public String wishMessage(String user) {
		int hour = ldt.getHour();
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
		return ldt;
	}
	public void setLdt(LocalDateTime ldt) {
		this.ldt = ldt;
	}
}
