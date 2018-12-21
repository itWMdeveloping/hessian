/**
 * 
 */
package com.zzy.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.zzy.HessianClientApplication;
import com.zzy.service.SmsHessianService;

/**
 * @author zhuhuidong
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = HessianClientApplication.class)
@WebAppConfiguration
public class SmsHessianTest {

	@Autowired
	private SmsHessianService smsHessianService;

	@Test
	public void sendSms() {
		
		String string = smsHessianService.sendSms("appKey", "appSecret", "phoneNums", "templateCode", "{\"code\", \"123456\"}");
		System.out.println(string);
		
	}

}
