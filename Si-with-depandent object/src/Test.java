import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
	System.out.println(context.getDisplayName());
	System.out.println(context.getId());
	
	    Employee employee=(Employee)context.getBean("employee");
	    
		System.out.println(employee);
		
	}

}
