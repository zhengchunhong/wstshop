package com.webtest.demo;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.webtest.freemarker.WebTestListener;
import com.webtest.core.BaseTest;
import com.webtest.dataprovider.NSDataProvider;

@Listeners(WebTestListener.class)
public class wqExcelTest extends BaseTest {
	@BeforeMethod
//		@Test
	    public void testLogin() throws InterruptedException{
		webtest.open("http://localhost/wstshop/home/users/login.html");
//			webtest.open("http://localhost/wstshop/home/users/login.html");
			Thread.sleep(200);
			webtest.type("id=loginName", "wuqiqi");
			Thread.sleep(200);
			webtest.type("id=loginPwd", "123456");
			Thread.sleep(200);
			webtest.type("id=verifyCode", "aaaa");
			Thread.sleep(200);
			webtest.click("xpath=/html/body/div[6]/div[2]/div[2]/form/table/tbody/tr[9]/td/div/a");
			Thread.sleep(200);
		}
	
	

		@Test(dataProvider = "wq",dataProviderClass = NSDataProvider.class)	
		public void order_test23(String s1) throws InterruptedException {
			webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul[1]/li[4]");
			Thread.sleep(200);
			webtest.type("id=userName", s1);
			Thread.sleep(200);
			webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/div[2]/button");
			Thread.sleep(200);
		}
}
