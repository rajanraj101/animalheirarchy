package demo.assignment.category;

import org.springframework.stereotype.Component;

@Component
public abstract class Aquatic extends Animal implements Swim {

	@Override
	public String swimming() {
		 
		return "I am swimming";
	}

}
