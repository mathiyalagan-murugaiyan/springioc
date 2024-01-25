package springioc.user;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

@SuppressWarnings("deprecation")
public class UserDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		ClassPathResource resource = new ClassPathResource("user.xml");
//		
//		BeanFactory factory = new XmlBeanFactory(resource);
//		
//		System.out.println(factory.getBean("user"));
//		
//		User u = (User)factory.getBean("user");
//		System.out.println(u);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("user.xml");
		User user = context.getBean(User.class);
		System.out.println(user);
		

	}

}
