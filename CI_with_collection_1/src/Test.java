import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Resource r=new ClassPathResource("Spring.xml");
		BeanFactory f=new XmlBeanFactory(r);
		Question q=(Question)f.getBean("question");
		System.out.println(q);
	}

}
