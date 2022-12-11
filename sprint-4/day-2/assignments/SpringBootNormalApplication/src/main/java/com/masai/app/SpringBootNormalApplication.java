package com.masai.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootNormalApplication {

	public static void main(String[] args) {
	ApplicationContext ctx=	 SpringApplication.run(SpringBootNormalApplication.class, args);
	 MyService obj=ctx.getBean("myService",MyService.class);
	 String name ="Rohit";
	obj.sayHello(name);
	}

}
