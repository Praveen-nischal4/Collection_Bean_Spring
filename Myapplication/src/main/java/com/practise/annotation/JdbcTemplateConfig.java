package com.practise.annotation;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class JdbcTemplateConfig {

     @Autowired
     private DataSource dataSource;
     
     @Bean
     public JdbcTemplate jdbcTemplate()
     {
    	 
		return new JdbcTemplate(dataSource);
    	 
     }
}
