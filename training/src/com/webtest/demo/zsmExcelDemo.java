package com.webtest.demo;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.webtest.freemarker.WebTestListener;
import com.webtest.core.BaseTest;
import com.webtest.dataprovider.NSDataProvider;

@Listeners(WebTestListener.class)
public class zsmExcelDemo extends BaseTest{
	@BeforeMethod
	public void testLogin() throws InterruptedException {
		// ��½�ɹ��ǲ���ǰ��
		webtest.open("http://localhost/wstshop/admin/index/login.html");
		webtest.type("id=loginPwd", "123456");
		webtest.type("id=verifyCode", "11");
		webtest.click("xpath=//input[@type='button']");
	}
	
	@Test(dataProvider = "zsm",dataProviderClass = NSDataProvider.class)
	public void test43(String s) throws InterruptedException {
		//��Ʒ����-������Ʒ������Ʒ��������Ʒ���ơ�˽����/�޹����������в�ѯ
		webtest.click("xpath=//*[text()='��Ʒ����']");
		webtest.click("xpath=//*[text()='������Ʒ']");
		webtest.enterFrame("wst-lframe-22");
		webtest.type("id=goodsName",s);
		webtest.click("xpath=//*[text()='��ѯ']");
	}
	
}
