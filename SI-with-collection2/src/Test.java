import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
	public static void main(String[] args) {
		ApplicationContext con=new ClassPathXmlApplicationContext("spring.xml");
		Bank b=(Bank)con.getBean("bank");
		System.out.println(b);
	}

}
