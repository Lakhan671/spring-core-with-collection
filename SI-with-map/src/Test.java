import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ApplicationContext co=new ClassPathXmlApplicationContext("Spring.xml");
     employee e=(employee)co.getBean("Employee");
     System.out.println(e);
	}

}
