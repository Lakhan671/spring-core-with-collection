import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class StudentTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Resource r=new ClassPathResource("Spring.xml");
		BeanFactory f=new XmlBeanFactory(r);
		Student s=(Student)f.getBean("student");
		System.out.println(s);

	}

}
