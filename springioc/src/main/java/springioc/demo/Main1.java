package springioc.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main1 {
	public static void main(String args[]) {
	
	ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
	
	Cage cage = context.getBean(Cage.class);

	cage.cageAnimal();
	
	
	
	}	

}
