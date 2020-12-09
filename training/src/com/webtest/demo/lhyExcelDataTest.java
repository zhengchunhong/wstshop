package com.webtest.demo;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.dataprovider.NSDataProvider;

public class lhyExcelDataTest extends BaseTest {

	// 登录是测试前提
		@BeforeMethod
		public void testLogin() throws InterruptedException {
			webtest.open("http://localhost/wstshop/home/users/login.html");
			Thread.sleep(200);
			webtest.type("id=loginName", "li_haoyu");
			Thread.sleep(200);
			webtest.type("id=loginPwd", "123456");
			Thread.sleep(200);
			webtest.type("id=verifyCode", "aaaa");
			Thread.sleep(200);
			webtest.click("xpath=/html/body/div[6]/div[2]/div[2]/form/table/tbody/tr[9]/td/div/a");
			Thread.sleep(200);
	}

//		38新增收货地址为默认地址
	@Test(dataProvider = "lhy", dataProviderClass = NSDataProvider.class)
	public void cart_test38(String s1) throws InterruptedException {
		webtest.open("http://localhost/wstshop/home/index/index.html");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[4]/div/div[3]/a");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[5]/div[1]/div[1]/input");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[5]/div[1]/div[1]/input");
		Thread.sleep(200);
		webtest.click("xpath=//*[@id=\"gchk_1\"]");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[5]/div[4]/a[2]");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[5]/div[1]/a");
		Thread.sleep(200);
		webtest.type("id=userName", s1);
		Thread.sleep(200);
		webtest.click("xpath=//*[@id=\"area_0\"]");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[5]/div[4]/div[2]/div/form/div[2]/div[2]/select/option[2]");
		Thread.sleep(200);
		webtest.click("xpath=//*[@id=\"area_0_110000\"]");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[5]/div[4]/div[2]/div/form/div[2]/div[2]/select[2]/option[2]");
		Thread.sleep(200);
		webtest.click("xpath=//*[@id=\"area_0_110000_110100\"]");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[5]/div[4]/div[2]/div/form/div[2]/div[2]/select[3]/option[2]");
		Thread.sleep(200);
		webtest.type("id=userAddress", "World");
		Thread.sleep(200);
		webtest.type("id=userPhone", "12345678910");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[5]/div[4]/div[2]/div/form/div[4]/div[2]/label[1]/label");
		Thread.sleep(200);
		webtest.click("xpath=//*[@id=\"saveAddressBtn\"]");
		Thread.sleep(200);
	}

}
