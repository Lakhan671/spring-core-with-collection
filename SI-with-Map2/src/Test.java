import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
	public static void main(String[] args) {
		ApplicationContext c=new ClassPathXmlApplicationContext("Spring.xml");
		Company co=(Company)c.getBean("company");
		System.out.println(co);
	}

}
