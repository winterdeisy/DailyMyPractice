package loginSystem;

import java.util.HashMap;

public class IDandPasswords {
	HashMap<String, String> logininfo = new HashMap<String, String>();
	IDandPasswords() {
		logininfo.put("bro", "pizza");
		logininfo.put("chzhzh98", "codnjs759");
		logininfo.put("wish759", "vnf3396");
	}
	
	protected HashMap getLoginInfo() {
		return logininfo;
	}

}
