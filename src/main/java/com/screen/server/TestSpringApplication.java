package com.screen.server;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootApplication
public class TestSpringApplication {

	public static void main(String[] args) throws InterruptedException {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Config.class);

		while (true) {
			annotationConfigApplicationContext.getBean(ColorFrame.class).showOnRandomPlace();
			Thread.sleep(100);
		}
	}

}
