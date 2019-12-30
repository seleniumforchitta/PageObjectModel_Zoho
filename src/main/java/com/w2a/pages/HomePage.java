package com.w2a.pages;

import com.w2a.pages.LoginPage;
import com.w2a.base.Page;

public class HomePage extends Page {
	

	public void goToSignUp() {
		
		click("SignUp_xpath");
	}
	
	public LoginPage goToLogin() throws InterruptedException {
		
		System.out.println("Inside Login !!!");
		Thread.sleep(1000);
		click("Login_xpath");
		System.out.println("outside Login !!!");
		
		return new LoginPage();
	}
	
	public void goToSupport() {
		
		click("Support_xpath");
	}
	
	public void goToZohoEdu() {
		
	}
	
	public void goToLearnMore() {
		
	}
	
	public void ValidateFooterLinks() {
		
	}
	
	
	
}
