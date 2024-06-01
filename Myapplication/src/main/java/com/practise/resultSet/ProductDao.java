package com.practise.resultSet;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDao {

	private final JdbcTemplate jdbcTemplate;
	
	@Autowired
	public ProductDao(JdbcTemplate jdbcTemplate)
	{
		this.jdbcTemplate =jdbcTemplate;
	}
	
	public int saveProduct(Product p)
	{
		//String query ="insert into product values('"+p.getPid()+"','"+p.getPname()+"','"+p.getPrice()+"','"+p.getCategory()+"' )";
		
		String query ="insert into product values(?,?,?,?)";
		return jdbcTemplate.update(query,p.getPid(),p.getPname(),p.getPrice(),p.getCategory());
	}
	
	public int deleteProduct(Product p)
	{		
		String query ="delete from product where pid =? ";
		return jdbcTemplate.update(query,p.getPid());
	}
	
	public int updateProduct(Product p)
	{
		
		String query ="update product set pname = ?,price =?, category =? where pid =? ";
		return jdbcTemplate.update(query,p.getPname(),p.getPrice(),p.getCategory(),p.getPid());
	}
	
	
//	public List<Product> getAllEmployees(){  
//		 return jdbcTemplate.query("select * from product",new ResultSetExtractor<List<Product>>(){  
//			 
//			public List<Product> extractData(ResultSet rs) throws SQLException,DataAccessException {  
//		      
//		        List<Product> list=new ArrayList<Product>();  
//		        while(rs.next())
//		         {  
//		        Product e=new Product();  
//		        e.setPid(rs.getInt(1));  
//		        e.setPname(rs.getString(2));  
//		        e.setPrice(rs.getDouble(3));  
//                e.setCategory(rs.getString(4));
//                list.add(e);  
//		          }  
//		        return list;  
//		        }  
//		    });  
//		  }  
//	
	//result set use of lambda expression
	
	public List<Product> getAllProducts() {
	    return jdbcTemplate.query("select * from product", rs -> {
	        List<Product> list = new ArrayList<>();
	        while (rs.next()) {
	            Product product = new Product();
	            product.setPid(rs.getInt(1));
	            product.setPname(rs.getString(2));
	            product.setPrice(rs.getDouble(3));
	            product.setCategory(rs.getString(4));
	            list.add(product);
	        }
	        return list;
	    });
	}
	
}
