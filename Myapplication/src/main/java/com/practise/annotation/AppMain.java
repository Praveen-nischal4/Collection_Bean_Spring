package com.practise.annotation;



import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		//get TeacherDao Bean
		
        TeacherDao td = context.getBean(TeacherDao.class);
		
       //int y = td.saveTeacher(new Teacher(1,"Samreen Fatima","PHD","samreenfatima2@gmail.com"));
     //  System.out.println(y);
       
       //or other way first create object of Teacher and then call method
       
       Teacher t = new Teacher(3,"Pratima Kesherwani","B.Sc","prtima7@gmail.com");
       
       int z = td.saveTeacher(t);
       System.out.println(z+"row affected");
       
        
       // Teacher t = new Teacher(1,"Safia Siddqui","PGDCA","safiasiddqui2@gmail.com");
        
     // int s =  td.updateTeacher(t);
     // System.out.println(s+"rows affected");
        
     // Teacher t = new Teacher();
      //t.setTid(2);
    //int z =  td.deleteTeacher(t);
   // System.out.println(z+"rows affected");
      
	}

}
