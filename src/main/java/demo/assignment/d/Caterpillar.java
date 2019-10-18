package demo.assignment.d;

import org.springframework.stereotype.Component;

import demo.assignment.category.Insects;
import demo.assignment.category.Walk;
@Component
public class Caterpillar extends Insects implements Walk {

	@Override
	public String walking() {
		return "Walking";
	}

}
