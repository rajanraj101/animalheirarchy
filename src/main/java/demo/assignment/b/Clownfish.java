package demo.assignment.b;

import org.springframework.stereotype.Component;

import demo.assignment.category.Joke;

@Component
public class Clownfish extends Fish implements Joke {

	@Override
	public String joking() { 
		return "Joking";
	}
 
	public Clownfish() {}
	
	public Clownfish(String size, String color) {
		super(size,color);
	}

}
