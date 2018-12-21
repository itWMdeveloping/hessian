package com.zzy.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zzy.service.SmsHessianService;

@RestController
public class SmsHessianController {

    
    @Autowired
    private SmsHessianService smsHessianService;
    
    
    @RequestMapping("/smsTest")
    public String smsTest(String appKey, String appSecret, String phoneNums, String templateCode,
			String templateParams) {
    	
    	String json = smsHessianService.sendSms(appKey, appSecret, phoneNums, templateCode, templateParams);
    	
    	return json;
    	
    }
    


}