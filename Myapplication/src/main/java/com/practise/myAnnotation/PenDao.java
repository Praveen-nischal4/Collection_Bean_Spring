package com.practise.myAnnotation;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.practise.resultSet.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class PenDao {

	private final JdbcTemplate jbdcTemplate;
	
	@Autowired
	public PenDao(JdbcTemplate jdbcTemplate)
	{
		this.jbdcTemplate= jdbcTemplate;
	}
	
	public int savePen(Pen p)                                          //query with prepared statements syntax
	{		
		String query ="insert into pen values(?,?,?)";
		return jbdcTemplate.update(query,p.getType(),p.getColor(),p.getPrice());		
	}
	
	public int updatePen(Pen p)                                          //query with prepared statements syntax
	{		
		String query ="update pen set color=?,price=? where type=? ";
		return jbdcTemplate.update(query,p.getColor(),p.getPrice(),p.getType());		
	}
	
	public int deletePen(Pen p)                                          //query with prepared statements syntax
	{		
		String query ="delete from pen where type=? ";
		return jbdcTemplate.update(query,p.getType());		
	}
	

	//result set using lambda expression
	
	/*public List<Pen> getAllPens() {                  
	    return  jbdcTemplate.query("select * from pen", rs -> {
	        List<Pen> list = new ArrayList<>();
	        while (rs.next()) {
	            Pen pen = new Pen();
	            pen.setType(rs.getString(1));
	            pen.setColor(rs.getString(2));
	            pen.setPrice(rs.getDouble(3));	  
	            list.add(pen);
	        }
	        return list;
	    });
	}*/
	
	
	public List<Pen> getAllPens() {
	    return jbdcTemplate.query("select * from pen", new RowMapper<Pen>() {
	        @Override
	        public Pen mapRow(ResultSet rs, int rowNum) throws SQLException {
	            Pen p = new Pen();
	            p.setType(rs.getString("type")); // Assuming "type" is the column name in the database
	            p.setColor(rs.getString("color")); // Assuming "color" is the column name
	            p.setPrice(rs.getDouble("price")); // Assuming "price" is the column name
	            return p;
	        }
	    });
	}

	
	
}
