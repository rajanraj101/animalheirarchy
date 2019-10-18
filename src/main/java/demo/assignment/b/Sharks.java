package demo.assignment.b;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
@Component
public class Sharks extends Fish {

	public Sharks() {
		
	}
	public Sharks(String size, String color) {
		super(size,color);
	}
	
	public String eats(Fish fish) {
		return StringUtils.isEmpty(fish) ? null : "I ate fish"; 
	}
}
