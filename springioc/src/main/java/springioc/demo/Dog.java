package springioc.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Dog implements Animal {

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("dog is barking");
		
	}

}
