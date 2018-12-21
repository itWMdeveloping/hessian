package com.zzy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.remoting.caucho.HessianServiceExporter;

import com.zzy.service.HelloWorldService;

@SpringBootApplication
@ServletComponentScan("com.zzy")
@ComponentScan("com.zzy")
public class HessianServerApplication {

	@Autowired
	private HelloWorldService helloWorldService;

	public static void main(String[] args) {
		SpringApplication.run(HessianServerApplication.class, args);
	}

	// 发布服务
	@Bean(name = "/HelloWorldService")
	public HessianServiceExporter accountService() {
		HessianServiceExporter exporter = new HessianServiceExporter();
		exporter.setService(helloWorldService);
		exporter.setServiceInterface(HelloWorldService.class);
		return exporter;
	}

}
