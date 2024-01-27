package springioc.user;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Demo {
	
	public static void main(String args[]) {
		
		System.out.println("hello world");
		
	}

}
