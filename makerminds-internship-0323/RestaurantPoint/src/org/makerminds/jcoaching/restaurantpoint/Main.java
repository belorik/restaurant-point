package org.makerminds.jcoaching.restaurantpoint;

import org.makerminds.jcoaching.restaurantpoint.model.IdAndPasswords;
import org.makerminds.jcoaching.restaurantpoint.view.LoginView;

public class Main {

	public static void main(String[] args) {

		IdAndPasswords idAndPwd = new IdAndPasswords();

		LoginView loginPage = new LoginView(idAndPwd.getLoginInfo());
	}
}