package org.springframework.st.beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac  = new AnnotationConfigApplicationContext(MainConfig.class);
		System.out.println(ac.getBean(Person.class));
	}
}
