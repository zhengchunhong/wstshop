package com.webtest.demo;

import static org.testng.Assert.assertTrue;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.webtest.core.BaseTest;
import com.webtest.dataprovider.NSDataProvider;

public class hzxExcelDemo extends BaseTest {

	// 打开页面
	@BeforeMethod
	public void open_URL() {
		webtest.open("http://localhost/wstshop/home/users/login.html");
	}
	// 1.验证正常登录流程（用户名为英文）
	@Test(dataProvider = "hzx", dataProviderClass = NSDataProvider.class)
	public void test_usernameisEnglish_regist(String s1, String s2, String s3) throws InterruptedException {
		webtest.typeAndClear("id=loginName", s1);
		Thread.sleep(200);
		webtest.typeAndClear("id=loginPwd", s2);
		Thread.sleep(200);
		webtest.typeAndClear("id=verifyCode", s3);
		Thread.sleep(200);
		webtest.click("class=wst-login-but");
		Thread.sleep(1000);
		assertTrue(webtest.isTextPresent("退出"));
		webtest.click("xpath=//*[text()='退出']");
	}
}
