package springioc.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Cat implements Animal {

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("cat is meow");
		
	}

}
