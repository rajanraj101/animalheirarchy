package demo.assignment.a.one;

import org.springframework.stereotype.Component;

import demo.assignment.category.Fly;
import demo.assignment.category.Sing;

@Component
class Birds extends Animals implements Fly, Sing {

	@Override
	public String singing() {
		return "singing";
	}

	@Override
	public String flying() {
		return "flying";
	}
 
}
