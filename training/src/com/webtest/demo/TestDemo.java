package com.webtest.demo;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class TestDemo extends BaseTest {

	@BeforeMethod
	public void testLoginSuccess() throws InterruptedException {
		webtest.open("http://localhost/wstshop/admin/index/login.html");
//		webtest.type("id=loginName", "admin");
		webtest.type("id=loginPwd", "123456");
		webtest.type("id=verifyCode", "1111");
		webtest.click("xpath=//input[@type='button']");
		Thread.sleep(200);
		assertTrue(webtest.isTextPresent("��¼"));
		Thread.sleep(200);
//		webtest.click("xpath=//*[text()='�˳�']");
	}

	// �޸ĵ�������
	@Test
	public void test01() throws InterruptedException {
		webtest.click("xpath=//*[text()='��������']");
		Thread.sleep(200);
		webtest.enterFrame("wst-lframe-1");
		Thread.sleep(200);
		webtest.type("id=hotWordsSearch", ",82������");
		Thread.sleep(1000);
		webtest.click("xpath=//input[@value='����']");
		Thread.sleep(500);
	}

	// �޸ĵ�������
	@Test
	public void test02() throws InterruptedException {
		webtest.click("xpath=//*[text()='��������']");
		Thread.sleep(200);
		webtest.enterFrame("wst-lframe-1");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[2]/div[4]/div/div/div[4]/div[2]/div/table/tbody/tr[1]/td[7]/div/a[1]");
		Thread.sleep(200);
		webtest.selectByValue("id=navType", "1");
		Thread.sleep(200);
		webtest.click("xpath=//input[@value='�ύ']");
		Thread.sleep(500);
	}

	// ��������
	@Test
	public void test03() throws InterruptedException {
		webtest.click("xpath=//*[text()='��������']");
		Thread.sleep(200);
		webtest.enterFrame("wst-lframe-1");
		Thread.sleep(200);
		webtest.click("xpath=//*[text()='����']");
		Thread.sleep(200);
		webtest.type("id=navTitle", "���Ե���");
		Thread.sleep(200);
		webtest.type("id=navUrl", "http://www.baidu.com");
		Thread.sleep(200);
		webtest.type("id=navSort", "20");
		Thread.sleep(200);
		webtest.click("xpath=//input[@value='�ύ']");
		Thread.sleep(500);
	}

	// ɾ������
	@Test
	public void test04() throws InterruptedException {
		webtest.click("xpath=//*[text()='��������']");
		Thread.sleep(200);
		webtest.enterFrame("wst-lframe-1");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[2]/div[4]/div/div/div[4]/div[2]/div/table/tbody/tr[1]/td[7]/div/a[2]");
		Thread.sleep(200);
		webtest.click("xpath=//*[text()='ȷ��']");
		Thread.sleep(500);
	}

	// �޸Ĺ��
	@Test
	public void test05() throws InterruptedException {
		webtest.click("xpath=//*[text()='������']");
		Thread.sleep(200);
		webtest.enterFrame("wst-lframe-1");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[2]/div[4]/div/div/div[4]/div[2]/div/table/tbody/tr[1]/td[9]/div/a[1]");
		Thread.sleep(200);
		webtest.typeAndClear("id=adName", "2");
		Thread.sleep(300);
		webtest.click("xpath=//input[@value='�ύ']");
		Thread.sleep(500);
	}

	// �������
	@Test
	public void test06() throws InterruptedException {
		webtest.click("xpath=//*[text()='������']");
		Thread.sleep(200);
		webtest.enterFrame("wst-lframe-1");
		Thread.sleep(200);
		webtest.click("xpath=//*[text()='����']");
		Thread.sleep(200);
		webtest.selectByValue("id=positionType", "1");
		Thread.sleep(200);
		webtest.selectByValue("id=adPositionId", "5");
		Thread.sleep(200);
		webtest.type("id=adName", "����");
		Thread.sleep(200);
		webtest.type("xpath=//input[@type='file']", "D:\\az\\testfile\\hh.jpg");
		Thread.sleep(200);
		webtest.type("id=adStartDate", "2020-11-25");
		Thread.sleep(200);
		webtest.type("id=adEndDate", "2020-11-26");
		Thread.sleep(200);
		webtest.type("id=adSort", "1");
		Thread.sleep(200);
		webtest.click("xpath=//input[@value='�ύ']");
		Thread.sleep(500);
	}

	// ɾ�����
	@Test
	public void test07() throws InterruptedException {
		webtest.click("xpath=//*[text()='������']");
		Thread.sleep(200);
		webtest.enterFrame("wst-lframe-1");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[2]/div[4]/div/div/div[4]/div[2]/div/table/tbody/tr[22]/td[9]/div/a[2]");
		Thread.sleep(200);
		webtest.click("xpath=//*[text()='ȷ��']");
		Thread.sleep(500);
	}

	// �޸Ĺ��λ��
	@Test
	public void test08() throws InterruptedException {
		webtest.click("xpath=//*[text()='���λ��']");
		Thread.sleep(200);
		webtest.enterFrame("wst-lframe-1");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[2]/div[4]/div/div/div[4]/div[2]/div/table/tbody/tr[1]/td[7]/div/a[1]");
		Thread.sleep(200);
		webtest.typeAndClear("id=apSort", "1");
		Thread.sleep(200);
		webtest.click("xpath=//input[@value='�ύ']");
		Thread.sleep(500);
	}

	// �������λ��
	@Test
	public void test09() throws InterruptedException {
		webtest.click("xpath=//*[text()='���λ��']");
		Thread.sleep(200);
		webtest.enterFrame("wst-lframe-1");
		Thread.sleep(200);
		webtest.click("xpath=//*[text()='����']");
		Thread.sleep(200);
		webtest.selectByValue("id=positionType", "1");
		Thread.sleep(200);
		webtest.type("id=positionName", "����λ��");
		Thread.sleep(200);
		webtest.type("id=positionCode", "����01");
		Thread.sleep(200);
		webtest.type("id=positionWidth", "100");
		Thread.sleep(200);
		webtest.type("id=positionHeight", "100");
		Thread.sleep(200);
		webtest.typeAndClear("id=apSort", "1");
		Thread.sleep(200);
		webtest.click("xpath=//input[@value='�ύ']");
		Thread.sleep(500);
	}

	// ɾ�����λ��
	@Test
	public void test10() throws InterruptedException {
		webtest.click("xpath=//*[text()='���λ��']");
		Thread.sleep(200);
		webtest.enterFrame("wst-lframe-1");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[2]/div[4]/div/div/div[4]/div[2]/div/table/tbody/tr[23]/td[7]/div/a[2]");
		Thread.sleep(200);
		webtest.click("xpath=//*[text()='ȷ��']");
		Thread.sleep(500);
	}

	// �޸�����
	@Test
	public void test11() throws InterruptedException {
		webtest.click("xpath=//*[text()='���й���']");
		Thread.sleep(200);
		webtest.enterFrame("wst-lframe-1");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[2]/div[4]/div/div/div[4]/div[2]/div/table/tbody/tr[1]/td[2]/div/a[1]");
		Thread.sleep(200);
		webtest.type("id=bankName", "1");
		Thread.sleep(200);
		webtest.click("xpath=//*[text()='ȷ��']");
		Thread.sleep(500);
	}

	// ��������
	@Test
	public void test12() throws InterruptedException {
		webtest.click("xpath=//*[text()='���й���']");
		Thread.sleep(200);
		webtest.enterFrame("wst-lframe-1");
		Thread.sleep(200);
		webtest.click("xpath=//*[text()='����']");
		Thread.sleep(200);
		webtest.type("id=bankName", "��������");
		Thread.sleep(200);
		webtest.click("xpath=//*[text()='ȷ��']");
		Thread.sleep(500);
	}

	// ɾ������
	@Test
	public void test13() throws InterruptedException {
		webtest.click("xpath=//*[text()='���й���']");
		Thread.sleep(200);
		webtest.enterFrame("wst-lframe-1");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[2]/div[4]/div/div/div[4]/div[2]/div/table/tbody/tr[1]/td[2]/div/a[2]");
		Thread.sleep(200);
		webtest.click("xpath=//*[text()='ȷ��']");
		Thread.sleep(500);
	}

	// �޸ĵ�����Ϣ
	@Test
	public void test14() throws InterruptedException {
		webtest.click("xpath=//*[text()='��������']");
		Thread.sleep(200);
		webtest.enterFrame("wst-lframe-1");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[2]/div[4]/div/div/div[4]/div[2]/div/table/tbody/tr[1]/td[5]/div/a[2]");
		Thread.sleep(200);
		webtest.type("id=areaKey", "1");
		Thread.sleep(200);
		webtest.click("xpath=//*[text()='ȷ��']");
		Thread.sleep(500);
	}

	// ��������
	@Test
	public void test15() throws InterruptedException {
		webtest.click("xpath=//*[text()='��������']");
		Thread.sleep(200);
		webtest.enterFrame("wst-lframe-1");
		Thread.sleep(200);
		webtest.click("xpath=//*[text()='����']");
		Thread.sleep(200);
		webtest.type("id=areaName", "��ɽ");
		Thread.sleep(200);
		webtest.type("id=areaKey", "1");
		Thread.sleep(200);
		webtest.click("xpath=//*[text()='ȷ��']");
		Thread.sleep(500);
	}

	// ɾ������
	@Test
	public void test16() throws InterruptedException {
		webtest.click("xpath=//*[text()='��������']");
		Thread.sleep(200);
		webtest.enterFrame("wst-lframe-1");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[2]/div[4]/div/div/div[4]/div[2]/div/table/tbody/tr[1]/td[5]/div/a[3]");
		Thread.sleep(200);
		webtest.click("xpath=//*[text()='ȷ��']");
		Thread.sleep(500);
	}

	// �޸���������
	@Test
	public void test17() throws InterruptedException {
		webtest.click("xpath=//*[text()='��������']");
		Thread.sleep(200);
		webtest.enterFrame("wst-lframe-1");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[2]/div[4]/div/div/div[4]/div[2]/div/table/tbody/tr[1]/td[4]/div/a[1]");
		Thread.sleep(200);
		webtest.type("id=friendlinkSort", "1");
		Thread.sleep(200);
		webtest.click("xpath=//*[text()='ȷ��']");
		Thread.sleep(500);
	}

	// ������������
	@Test
	public void test18() throws InterruptedException {
		webtest.click("xpath=//*[text()='��������']");
		Thread.sleep(200);
		webtest.enterFrame("wst-lframe-1");
		Thread.sleep(200);
		webtest.click("xpath=//*[text()='����']");
		Thread.sleep(200);
		webtest.type("id=friendlinkName", "����");
		Thread.sleep(200);
		webtest.type("id=friendlinkUrl", "http://www.baidu.com");
		Thread.sleep(200);
		webtest.click("xpath=//*[text()='ȷ��']");
		Thread.sleep(500);
	}

	// ɾ����������
	@Test
	public void test19() throws InterruptedException {
		webtest.click("xpath=//*[text()='��������']");
		Thread.sleep(200);
		webtest.enterFrame("wst-lframe-1");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[2]/div[4]/div/div/div[4]/div[2]/div/table/tbody/tr[1]/td[4]/div/a[2]");
		Thread.sleep(200);
		webtest.click("xpath=//*[text()='ȷ��']");
		Thread.sleep(500);
	}

	// �޸Ŀ��
	@Test
	public void test20() {
		webtest.click("xpath=//*[text()='��ݹ���']");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("xpath=/html/body/div[2]/div[4]/div/div/div[4]/div[2]/div/table/tbody/tr[1]/td[2]/div/a[1]");
		webtest.typeAndClear("id=expressName", "����������");
		webtest.click("xpath=//*[text()='ȷ��']");
	}

	// �������
	@Test
	public void test21() {
		webtest.click("xpath=//*[text()='��ݹ���']");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("xpath=//*[text()='����']");
		webtest.typeAndClear("id=expressName", "��ë�ȿ��");
		webtest.click("xpath=//*[text()='ȷ��']");
	}

	// ɾ�����
	@Test
	public void test22() {
		webtest.click("xpath=//*[text()='��ݹ���']");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("xpath=/html/body/div[2]/div[4]/div/div/div[4]/div[2]/div/table/tbody/tr[1]/td[2]/div/a[2]");
		webtest.click("xpath=//*[text()='ȷ��']");
	}

	// �޸�Ĭ���˷�
	@Test
	public void test23() {
		webtest.click("xpath=//*[text()='�˷ѹ���']");
		webtest.enterFrame("wst-lframe-1");
		webtest.typeAndClear("id=key", "8");
		webtest.click("xpath=/html/body/div[2]/table/tr[1]/td[2]");
	}

//	//�޸ĵ����˷�
//	@Test
//	public void test24() throws InterruptedException {
//		webtest.click("xpath=/html/body/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[2]/a[10]");
//		webtest.enterFrame("wst-lframe-1");
//		webtest.type("xpath=/html/body/div[2]/table/tr[1]/td[3]/div/span", "10");
//		// webtest.doubleClick("xpath=/html/body/div[2]/table/tr[1]/td[3]/div/span");
//		Thread.sleep(2000);
//		// driver.findElement(By.xpath("xpath=/html/body/div[2]/table/tr[1]/td[3]/div/span")).sendKeys("10");
//		// webtest.type("xpath=/html/body/div[2]/table/tr[1]/td[3]/div/span", "10");
//		webtest.click("xpath=/html/body/div[2]/table/tr[1]/td[2]");
//	}

	// ������ɫ����
	@Test
	public void test24() throws InterruptedException {
		webtest.click("xpath=//*[text()='ϵͳ����']");
		Thread.sleep(100);
		webtest.click("xpath=//*[text()='��ɫ����']");
		Thread.sleep(100);
		webtest.enterFrame("wst-lframe-1");
		Thread.sleep(100);
		webtest.click("xpath=//*[text()='����']");
		Thread.sleep(100);
		webtest.type("id=roleName", "��������Ա");
		webtest.type("id=roleDesc", "����");
		Thread.sleep(100);
		webtest.click("xpath=//input[@value='����']");
		Thread.sleep(500);

	}

	// �޸Ļ�Ա�ȼ�
	@Test
	public void test25() {
		webtest.click("xpath=/html/body/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[3]/div[2]");
		webtest.click("xpath=/html/body/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[4]/a[1]");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("xpath=/html/body/div[2]/div[4]/div/div/div[4]/div[2]/div/table/tbody/tr[1]/td[6]/div/a[1]");
		webtest.typeAndClear("id=startScore", "3002");
		webtest.click("xpath=/html/body/form/table/tbody/tr[7]/td/input[2]");
	}

	// ������Ա�ȼ�
	@Test
	public void test26() throws InterruptedException {
		webtest.click("xpath=/html/body/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[3]/div[2]");
		webtest.click("xpath=/html/body/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[4]/a[1]");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("xpath=/html/body/div[1]/button");
		webtest.type("xpath=/html/body/form/table/tbody/tr[2]/td/div/div[2]/input", "E:\\360downloads\\2030137.jpg");
		webtest.type("id=rankName", "�����Ա");
		webtest.type("id=startScore", "10000");
		webtest.type("id=endScore", "5000");
		webtest.type("id=rebate", "80%");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/form/table/tbody/tr[7]/td/input[2]");
	}

	// ɾ����Ա�ȼ�
	@Test
	public void test27() {
		webtest.click("xpath=/html/body/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[3]/div[2]");
		webtest.click("xpath=/html/body/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[4]/a[1]");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("xpath=/html/body/div[2]/div[4]/div/div/div[4]/div[2]/div/table/tbody/tr[1]/td[6]/div/a[2]");
		webtest.click("xpath=/html/body/div[4]/div[3]/a[1]");
	}

	// �޸Ļ�Ա��Ϣ
	@Test
	public void test28() {
		webtest.click("xpath=/html/body/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[3]/div[2]");
		webtest.click("xpath=/html/body/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[4]/a[2]");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("xpath=/html/body/div[2]/div[4]/div/div/div[4]/div[2]/div/table/tbody/tr[1]/td[9]/div/a[1]");
		webtest.typeAndClear("id=userPhone", "19886476582");
		webtest.typeAndClear("id=userEmail", "2596869264@qq.com");
		webtest.click("xpath=/html/body/form/table/tbody/tr[9]/td/input[2]");
	}

	// ������Ա
	@Test
	public void test29() {
		webtest.click("xpath=/html/body/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[3]/div[2]");
		webtest.click("xpath=/html/body/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[4]/a[2]");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("xpath=/html/body/div[1]/button");
		webtest.type("id=loginName", "ahhhhhhhh");
		webtest.type("id=userName", "ahhhhhhhh");
		webtest.type("id=userPhone", "18697549325");
		webtest.type("id=userEmail", "9686957423@qq.com");
		webtest.type("id=userScore", "1");
		webtest.type("id=userTotalScore", "1");
		webtest.type("id=userQQ", "8754693215");
		webtest.click("xpath=/html/body/form/table/tbody/tr[11]/td/input[2]");
	}

	// ɾ����Ա
	@Test
	public void test30() {
		webtest.click("xpath=/html/body/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[3]/div[2]");
		webtest.click("xpath=/html/body/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[4]/a[2]");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("xpath=/html/body/div[2]/div[4]/div/div/div[4]/div[2]/div/table/tbody/tr[4]/td[9]/div/a[2]");
		webtest.click("xpath=/html/body/div[4]/div[3]/a[1]");
	}

	// ��ѯ��Ա��Ϣ
	@Test
	public void test31() {
		webtest.click("xpath=/html/body/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[3]/div[2]");
		webtest.click("xpath=/html/body/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[4]/a[2]");
		webtest.enterFrame("wst-lframe-1");
		webtest.type("id=loginName1", "zhou");
		webtest.click("xpath=/html/body/div[1]/div[1]/input[4]");
	}

	// �޸��˺���Ϣ
	@Test
	public void test32() {
		webtest.click("xpath=/html/body/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[3]/div[2]");
		webtest.click("xpath=/html/body/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[4]/a[3]");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("xpath=/html/body/div[2]/div[4]/div/div/div[4]/div[2]/div/table/tbody/tr[5]/td[7]/div/a[1]");
		webtest.typeAndClear("id=loginName", "testvv");
		webtest.click("xpath=/html/body/div[3]/div[3]/a[1]");
	}

	// ��ѯ�˺���Ϣ
	@Test
	public void test33() {
		webtest.click("xpath=/html/body/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[3]/div[2]");
		webtest.click("xpath=/html/body/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[4]/a[3]");
		webtest.enterFrame("wst-lframe-1");
		webtest.type("id=loginName1", "zheng");
		webtest.click("xpath=/html/body/div[1]/div[1]/input[2]");
	}

	// ����֧������
	@Test
	public void test34() {
		webtest.click("xpath=/html/body/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[3]/div[2]");
		webtest.click("xpath=/html/body/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[4]/a[3]");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("xpath=/html/body/div[2]/div[4]/div/div/div[4]/div[2]/div/table/tbody/tr[5]/td[7]/div/a[2]");
		webtest.click("xpath=/html/body/div[5]/div[3]/a[1]");
	}

	// �޸�����
	@Test
	public void test35() {
		webtest.click("xpath=/html/body/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[5]/div[2]");
		webtest.click("xpath=/html/body/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[6]/a[1]");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("xpath=/html/body/div[2]/div[4]/div/div/div[4]/div[2]/div/table/tbody/tr[1]/td[8]/div/a[1]");
		webtest.typeAndClear("id=articleKey", "�޸ĺ�test");
		webtest.click("xpath=/html/body/form/table/tbody/tr[6]/td/button[1]");
	}

	// ��������
	@Test
	public void test36() {
		webtest.click("xpath=/html/body/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[5]/div[2]");
		webtest.click("xpath=/html/body/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[6]/a[1]");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("xpath=/html/body/div[1]/button[3]");
		webtest.type("id=articleTitle", "test11");
		webtest.click("id=catIds");
		webtest.click("xpath=/html/body/div/div[1]/ul/li[2]/ul/li[1]/div/span");
		webtest.type("id=articleKey", "test11");
		webtest.click("xpath=/html/body/form/table/tbody/tr[5]/td/div/div[1]/span[47]/span");
		webtest.click("xpath=/html/body/div[2]/div/table/tbody/tr[1]/td[1]/span");
		webtest.click("xpath=/html/body/form/table/tbody/tr[6]/td/button[1]");
	}

	// ɾ������
	@Test
	public void test37() {
		webtest.click("xpath=/html/body/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[5]/div[2]");
		webtest.click("xpath=/html/body/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[6]/a[1]");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("xpath=/html/body/div[2]/div[4]/div/div/div[4]/div[2]/div/table/tbody/tr[1]/td[8]/div/a[2]");
		webtest.click("xpath=/html/body/div[4]/div[3]/a[1]");
	}

	// ��ѯ����
	@Test
	public void test38() {
		webtest.click("xpath=/html/body/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[5]/div[2]");
		webtest.click("xpath=/html/body/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[6]/a[1]");
		webtest.enterFrame("wst-lframe-1");
		webtest.type("id=key", "test");
		webtest.click("xpath=/html/body/div[1]/button[1]");
	}

	// ����ɾ������
	@Test
	public void test39() {
		webtest.click("xpath=/html/body/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[5]/div[2]");
		webtest.click("xpath=/html/body/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[6]/a[1]");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("xpath=/html/body/div[2]/div[4]/div/div/div[4]/div[2]/div/table/tbody/tr[1]/td[1]/div/input");
		webtest.click("xpath=/html/body/div[2]/div[4]/div/div/div[4]/div[2]/div/table/tbody/tr[2]/td[1]/div/input");
		webtest.click("xpath=/html/body/div[1]/button[2]");
		webtest.click("xpath=/html/body/div[4]/div[3]/a[1]");
	}

	// �޸����·���
	@Test
	public void test40() {
		webtest.click("xpath=/html/body/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[5]/div[2]");
		webtest.click("xpath=/html/body/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[6]/a[2]");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("xpath=/html/body/div[2]/table/tr[1]/td[6]/a[2]");
		webtest.typeAndClear("id=catSort", "3");
		webtest.click("xpath=/html/body/div[3]/div[3]/a[1]");
	}

	// �������·���
	@Test
	public void test41() {
		webtest.click("xpath=/html/body/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[5]/div[2]");
		webtest.click("xpath=/html/body/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[6]/a[2]");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("xpath=/html/body/div[1]/button");
		webtest.type("id=catName", "test11");
		webtest.type("id=catSort", "0");
		webtest.click("xpath=/html/body/div[3]/div[3]/a[1]");
	}

	// ɾ�����·���
	@Test
	public void test42() {
		webtest.click("xpath=/html/body/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[5]/div[2]");
		webtest.click("xpath=/html/body/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[6]/a[2]");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("xpath=/html/body/div[2]/table/tr[1]/td[6]/a[3]");
		webtest.click("xpath=/html/body/div[5]/div[3]/a[1]");
	}

	// ���������ӷ���
	@Test
	public void test43() {
		webtest.click("xpath=/html/body/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[5]/div[2]");
		webtest.click("xpath=/html/body/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[6]/a[2]");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("xpath=/html/body/div[2]/table/tr[1]/td[6]/a[1]");
		webtest.type("id=catName", "testhh");
		webtest.typeAndClear("id=catSort", "1");
		webtest.click("xpath=/html/body/div[3]/div[3]/a[1]");
	}

	// ������ҳ�˵�Ȩ��
	@Test
	public void test44() throws InterruptedException {
		webtest.click("xpath=/html/body/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[7]/div[2]");
		webtest.click("xpath=/html/body/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[8]/a[1]");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("id=menuTree_2_span");
		webtest.click("xpath=/html/body/div[1]/div[2]/div[2]/div[1]/button");
		webtest.type("id=privilegeName", "ahhhh");
		webtest.type("id=privilegeCode", "123");
		webtest.type("id=privilegeUrl", "$$");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[3]/div[3]/a[1]");
		Thread.sleep(2000);
	}

	// ɾ����ҳ�˵�Ȩ��
	@Test
	public void test45() {
		webtest.click("xpath=/html/body/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[7]/div[2]");
		webtest.click("xpath=/html/body/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[8]/a[1]");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("id=menuTree_2_span");
		webtest.click(
				"xpath=/html/body/div[1]/div[2]/div[2]/div[2]/div[4]/div/div/div[4]/div[2]/div/table/tbody/tr[2]/td[6]/div/a[2]");
		webtest.click("xpath=/html/body/div[5]/div[3]/a[1]");
	}

	// �޸���ҳ�˵�Ȩ��
	@Test
	public void test46() throws InterruptedException {
		webtest.click("xpath=/html/body/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[7]/div[2]");
		webtest.click("xpath=/html/body/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[8]/a[1]");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("id=menuTree_2_span");
		webtest.click(
				"xpath=/html/body/div[1]/div[2]/div[2]/div[2]/div[4]/div/div/div[4]/div[2]/div/table/tbody/tr[2]/td[6]/div/a[1]");
		webtest.typeAndClear("id=privilegeCode", "�޸ĺ�");
		webtest.typeAndClear("id=privilegeUrl", "@2");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[3]/div[3]/a[1]");
	}

	// �޸�ǰ̨�˵�
	@Test
	public void test47() throws InterruptedException {
		webtest.click("xpath=/html/body/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[7]/div[2]");
		webtest.click("xpath=/html/body/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[8]/a[2]");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("xpath=/html/body/div[2]/table/tr[3]/td[6]/a[2]");
		webtest.typeAndClear("id=menuUrl", "�޸�");
		webtest.typeAndClear("id=menuSort", "20");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[3]/div[3]/a[1]");
	}

	// ����ǰ̨�˵�
	@Test
	public void test48() throws InterruptedException {
		webtest.click("xpath=/html/body/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[7]/div[2]");
		webtest.click("xpath=/html/body/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[8]/a[2]");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("xpath=/html/body/div[1]/button");
		webtest.type("id=menuName", "test11");
		webtest.type("id=menuUrl", "localhost/test11");
		webtest.type("id=menuSort", "0");
		webtest.click("id=isShow");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[3]/div[3]/a[1]");
	}

	// ɾ��ǰ̨�˵�
	@Test
	public void test49() {
		webtest.click("xpath=/html/body/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[7]/div[2]");
		webtest.click("xpath=/html/body/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[8]/a[2]");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("xpath=/html/body/div[2]/table/tr[3]/td[6]/a[3]");
		webtest.click("xpath=/html/body/div[5]/div[3]/a[1]");
	}

	// �����Ӳ˵�
	@Test
	public void test50() throws InterruptedException {
		webtest.click("xpath=/html/body/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[7]/div[2]");
		webtest.click("xpath=/html/body/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[8]/a[2]");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("xpath=/html/body/div[2]/table/tr[3]/td[6]/a[1]");
		webtest.type("id=menuName", "test11");
		webtest.type("id=menuUrl", "localhost/test11");
		webtest.type("id=menuSort", "0");
		webtest.click("id=isShow");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[3]/div[3]/a[1]");
	}

}
