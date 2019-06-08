

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmp {
	public static void main(String[] arg){
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
         Employee e=(Employee)context.getBean("employee");
         
		
		System.out.println(e);
	}

}
