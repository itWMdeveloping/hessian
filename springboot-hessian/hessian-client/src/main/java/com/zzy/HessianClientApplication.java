package com.zzy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.remoting.caucho.HessianProxyFactoryBean;

import com.zzy.service.SmsHessianService;

@SpringBootApplication
@ServletComponentScan("com.zzy")
@ComponentScan("com.zzy")
public class HessianClientApplication {
	
	
	@Bean
	public HessianProxyFactoryBean SmsHessianClient() {
		
		HessianProxyFactoryBean factory = new HessianProxyFactoryBean();
		factory.setServiceUrl("http://localhost:8067/sms-server/sendSmsServer");
		factory.setServiceInterface(SmsHessianService.class);
		return factory;
	}
	


	public static void main(String[] args) {
		SpringApplication.run(HessianClientApplication.class, args);
	}
}
