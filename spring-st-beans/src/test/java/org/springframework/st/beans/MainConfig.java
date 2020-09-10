package org.springframework.st.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan
public class MainConfig {

	@Bean
	public Person person(){
		return new Person("zcf",30);
	}
}
