package loginSystem;
import java.util.HashMap;

public class IDandPasswords {
	
	HashMap<String, String> logininfo = new HashMap<String, String>();
	
	IDandPasswords() {
		logininfo.put("Bro", "pizza");
		logininfo.put("Bromethoesu", "PASSWO123");
		logininfo.put("BroCode", "abc123");
	}
	
	protected HashMap getLoginInfo() {
		return logininfo;
	}

}
