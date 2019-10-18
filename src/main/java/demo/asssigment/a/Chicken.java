package demo.asssigment.a;

import org.springframework.stereotype.Component;

import demo.assignment.category.Bird;
import demo.assignment.category.Sing;

@Component
public class Chicken extends Bird implements Sing {

	@Override
	public String singing() { 
		return "Cluck, cluck";
	}

}
