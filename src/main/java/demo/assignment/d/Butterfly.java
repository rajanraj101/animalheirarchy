package demo.assignment.d;

import org.springframework.stereotype.Component;

import demo.assignment.category.Fly;
import demo.assignment.category.Insects;
@Component
public class Butterfly extends Insects implements Fly {

	@Override
	public String flying() {
		return "flying";
	}

	
}
