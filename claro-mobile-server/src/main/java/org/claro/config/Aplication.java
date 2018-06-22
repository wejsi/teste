package org.claro.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jmx.JmxAutoConfiguration;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableAutoConfiguration(exclude = { JmxAutoConfiguration.class })
@ComponentScan(basePackages = { "org.claro" })
@EnableJpaRepositories(basePackages = { "org.claro.repository" })
@EntityScan(basePackages = { "org.claro.db" })
@Import(DBServerConfiguration.class)
public class Aplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(Aplication.class, args);
	}

}