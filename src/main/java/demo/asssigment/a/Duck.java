package demo.asssigment.a;

import org.springframework.stereotype.Component;

import demo.assignment.category.Bird;
import demo.assignment.category.Sing;
import demo.assignment.category.Swim;
@Component
public class Duck extends Bird implements Sing, Swim {

	@Override
	public String swimming() {		 
		return "I am swimming" ;
	}

	@Override
	public String singing() {
		return "Quack, quack";
	}
	
}
