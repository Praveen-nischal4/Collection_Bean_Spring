package com.practise.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class TeacherDao {

	private final JdbcTemplate jdbcTemplate;
	
	@Autowired
	public TeacherDao(JdbcTemplate jdbcTemplate)             //we use constructor injection to get JdbcTemplate bean with bean name 'jdbcTemplate'
	{
		this.jdbcTemplate= jdbcTemplate;
	}
	
	
	public int saveTeacher(Teacher t)
	{
		//using string based sql syntax
		//such syntax could be a way of SQL injection so to overcome use prepared statements syntax
		String query="insert into teacher values('"+t.getTid()+"','"+t.getTname()+"','"+t.getQualification()+"' ,'"+t.getEmail()+"' )";
		return  jdbcTemplate.update(query);
	}
	
	public int updateTeacher(Teacher t)
	{
		String query="update teacher set tname ='"+t.getTname()+"', qualification='"+t.getQualification()+"', email='"+t.getEmail()+"' where tid='"+t.getTid()+"' ";
		return jdbcTemplate.update(query);
	}
	
	public int deleteTeacher(Teacher t)
	{
		String query="delete from teacher where tid='"+t.getTid()+"'";
		return jdbcTemplate.update(query);
	}
	
	
}
