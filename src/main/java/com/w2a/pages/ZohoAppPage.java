package com.w2a.pages;

import com.w2a.base.Page;
import com.w2a.pages.crm.CRMHomePage;

public class ZohoAppPage  extends Page{
	
	
	
	public void gotoChat(){
		
		click("chatlink_xpath");
		
	}
	
	public CRMHomePage gotoCRM(){
		
		click("crmlink_xpath");
		
		return new CRMHomePage();
	}
	
	
	public void gotoBooks(){
		
		click("booklink_xpath");
		
	}

}
