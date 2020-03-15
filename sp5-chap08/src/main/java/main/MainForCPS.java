package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.DbConfig;
import spring.ChangePasswordService;

public class MainForCPS {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(DbConfig.class);
		
		ChangePasswordService cps = 
				ctx.getBean("changePWdSvc",ChangePasswordService.class);
		
		try {
			cps.changePassword("", "", newPwd);
		}
	}

}
