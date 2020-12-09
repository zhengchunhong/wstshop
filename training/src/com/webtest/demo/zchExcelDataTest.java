package com.webtest.demo;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.webtest.freemarker.WebTestListener;
import com.webtest.core.BaseTest;
import com.webtest.dataprovider.NSDataProvider;

@Listeners(WebTestListener.class)
public class zchExcelDataTest extends BaseTest {

	// µ«¬º
	@BeforeMethod
	public void testLoginSuccess() throws InterruptedException {
		webtest.open("http://localhost/wstshop/admin/index/login.html");
//		webtest.type("id=loginName", "admin");
		webtest.type("id=loginPwd", "123456");
		webtest.type("id=verifyCode", "1");
		webtest.click("xpath=//input[@type='button']");
		Thread.sleep(200);
		assertTrue(webtest.isTextPresent("µ«¬º"));
		Thread.sleep(200);
	}

	// –ﬁ∏ƒµÍ∆Ã≈‰÷√
	@Test(dataProvider = "zch", dataProviderClass = NSDataProvider.class)
	public void test01(String s1) throws InterruptedException{
		webtest.click("xpath=//*[text()='µÍ∆Ã≈‰÷√']");
		Thread.sleep(200);
		webtest.enterFrame("wst-lframe-1");
		Thread.sleep(200);
		webtest.typeAndClear("id=hotWordsSearch", s1);
		Thread.sleep(1000);
		webtest.click("xpath=//input[@value='±£¥Ê']");
		Thread.sleep(800);
	}

}
