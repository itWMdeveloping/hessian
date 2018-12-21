/**
 * 
 */
package com.zzy.service;


import org.springframework.stereotype.Service;


/**
 * @author zhuhuidong
 *
 */
@Service
public interface SmsHessianService {

	public String sendSms(String appKey, String appSecret, String phoneNums, String templateCode,
			String templateParams);

	public String sendSmsQueue(String appKey, String appSecret, String phoneNums, String templateCode,
			String templateParams);

}
