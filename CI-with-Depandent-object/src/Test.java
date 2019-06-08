import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class Test {
	public static void main(String[]as){
		Resource r=new ClassPathResource("spring.xml");
		BeanFactory b=new XmlBeanFactory(r);
		Employee e=(Employee)b.getBean("employee");
		System.out.println(e);
		
	}

}
