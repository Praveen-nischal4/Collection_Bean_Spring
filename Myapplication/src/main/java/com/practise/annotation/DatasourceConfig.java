package com.practise.annotation;

import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class DatasourceConfig {

	@Bean
	public DataSource dataSource()                  //bean for datasource
	{
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/practise");
		dataSource.setUsername("root");
		dataSource.setPassword("955455Praveen");
		return dataSource;
		
	}
}
