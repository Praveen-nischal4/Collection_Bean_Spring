package com.practise.resultSet;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProductApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(ProConfig.class);
		
		ProductDao pdt = context.getBean(ProductDao.class);
		
		//Product p = new Product(7,"Electric Genrator ",85430.26,"Electric");
		//int y= pdt.saveProduct(p);
	//System.out.println(y+" rows affected");
		
		
		
//		Product p = new Product();
//		p.setPid(7);
//		
//		int z = pdt.deleteProduct(p);
//		System.out.println(z+" rows deleted");
		
		//Product p = new Product(3,"Dell I7",78952.36,"Laptop");
		//int z = pdt.updateProduct(p);
		//System.out.println(z+" rows updated");
		
		List<Product> list = pdt.getAllProducts();
		
		for(Product p:list)
		{
		
			System.out.println(p);
			//System.out.println(p.getPname());
			//System.out.println(p.getPrice());
			//System.out.println(p.getCategory());
		}
	}

}
