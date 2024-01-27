package springioc.user;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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
		
//		ApplicationContext context = new ClassPathXmlApplicationContext("user.xml");
//		User user = context.getBean(User.class);
//		System.out.println(user);
		
//		ApplicationContext context = new ClassPathXmlApplicationContext("user.xml");
//		System.out.println(context.getBean(Adhar.class));
		

//	ApplicationContext context = new AnnotationConfigApplicationContext(Config.class );
//		
//		System.out.println(context.getBean(Adhar.class));
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		Demo d1 = context.getBean(Demo.class);
		Demo d2 = context.getBean(Demo.class);
		Demo d3 = context.getBean(Demo.class);
		Demo d4 = context.getBean(Demo.class);
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		
	}

}
