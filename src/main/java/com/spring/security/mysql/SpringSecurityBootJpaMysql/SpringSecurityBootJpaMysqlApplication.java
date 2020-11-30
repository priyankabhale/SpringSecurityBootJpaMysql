package com.spring.security.mysql.SpringSecurityBootJpaMysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class SpringSecurityBootJpaMysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityBootJpaMysqlApplication.class, args);
	}

}
