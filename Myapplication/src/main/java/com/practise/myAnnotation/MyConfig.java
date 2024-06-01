package com.practise.myAnnotation;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = "com.practise.myAnnotation")
public class MyConfig {

	@Bean
	public DataSource dataSource()
	{
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/practise");
		dataSource.setUsername("root");
		dataSource.setPassword("955455Praveen");
		return dataSource;
	}
	
	@Bean
	public JdbcTemplate jdbacTemplate(DataSource dataSource)
	{
		return new JdbcTemplate(dataSource);
	}
	
	@Bean
    public PenDao penDao(JdbcTemplate jdbcTemplate) {
        return new PenDao(jdbcTemplate);
    }
	
	
}
