package demo.assignment.a.one;

import org.springframework.stereotype.Component;

import demo.assignment.category.Walk;

@Component
class Animals implements Walk	{

	@Override
	public String walking() {		 
		return "walking";
	}
}