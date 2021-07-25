package org.springframework.examples.applicationcontext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("org.springframework.examples")
public class AnnotationConfigApplicationContextTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AnnotationConfigApplicationContextTest.class);
		System.out.println("启动了");
		annotationConfigApplicationContext.close();
	}
}
