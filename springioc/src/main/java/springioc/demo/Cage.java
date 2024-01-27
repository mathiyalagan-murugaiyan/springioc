package springioc.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Cage {
	@Autowired
	@Qualifier(value = "cat")
	Animal animal;

	public void cageAnimal() {
	
		animal.sound();
	}
	
	

}
