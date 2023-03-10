package org.makerminds.jcoaching.restaurantpoint.model;

import java.util.HashMap;

public class IdAndPasswords {

	// create HashMap to store login data
	HashMap<String, String> loginInfo = new HashMap<String, String>();

	// constructor
	public IdAndPasswords() {
		loginInfo.put("Lorik", "123456");
		loginInfo.put("User1", "11112222");
		loginInfo.put("User2", "12345678");
		loginInfo.put("User3", "123123123");
	}

	// getter for loginInfo
	public HashMap<String, String> getLoginInfo() {
		return loginInfo;
	}
}