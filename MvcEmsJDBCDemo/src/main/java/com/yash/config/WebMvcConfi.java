package com.yash.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.yash.dao.Employeedeo;
import com.yash.daoimpl.Employeedaoimpl;

@Configuration
@EnableWebMvc
@ComponentScan("com.yash.controller")
public class WebMvcConfi {
	@Bean
	InternalResourceViewResolver viewResolver() {

		InternalResourceViewResolver vr = new InternalResourceViewResolver();

		vr.setPrefix("/");
		vr.setSuffix(".jsp");
		return vr;
	}

	@Bean
	DriverManagerDataSource getDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbctemp");
		ds.setUsername("root");
		ds.setPassword("root");

		return ds;
	}

	@Bean
	public Employeedeo getUserDao() {
		return new Employeedaoimpl(getDataSource());
	}

}
