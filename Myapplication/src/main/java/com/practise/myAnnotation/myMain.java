package com.practise.myAnnotation;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class myMain {

	public static void main(String[] args) {

      ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
      
      PenDao pd = context.getBean(PenDao.class);            //Get the 'PenDao' class
      
     // Pen p = new Pen("Glitter","Purple",486.23);
    // int y = pd.savePen(p);
      //System.out.println(y+" rows affected");
      
      
     // Pen p = new Pen("Gel","Red",623.25);
     // int z = pd.updatePen(p);
     // System.out.println(z);
      
     // Pen p = new Pen();
      //p.setType("Gel");
      
      //int f = pd.deletePen(p);
     // System.out.println(f+"rows affected");
      
      List<Pen> pn = pd.getAllPens();
      
      for(Pen k :pn)
      {
    	  System.out.println(k);
      }
      
	}

}
