package com.w2a.pages;

import com.w2a.base.Page;

public class LoginPage  extends Page{

	
	
	public ZohoAppPage doLogin(String username,String password){
		
		type("Login_id_xpath", username);
		click("Nextbtn_xpath");
		type("Password_xpath", password);
		click("SigninBtn_xpath");
		
		return new ZohoAppPage();
	}
	
	
	public void gotoSalesandMarketing(){
		
		
	}
	
	public void gotoFinance(){
		
		
	}
	
}
