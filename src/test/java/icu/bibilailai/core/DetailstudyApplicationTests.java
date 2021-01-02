package icu.bibilailai.core;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DetailstudyApplicationTests {

	@Test
	void contextLoads() {
		/**
		 * 在JUnit测试中使用SpringApplication时，通常需要调用setWebApplicationType(WebApplicationType.NONE)。
		 */
		SpringApplication springApplication = new SpringApplication();
		springApplication.setWebApplicationType(WebApplicationType.NONE);
		System.out.println("hello world");
	}

}
