package demo.asssigment.a;

import org.springframework.stereotype.Component;

import demo.assignment.category.Bird;
import demo.assignment.category.Fly;
import demo.assignment.category.Sing;

@Component
public class Parrot extends Bird implements Sing, Fly {

	@Override
	public String singing() { 
		return "singing";
	}

	public String singing(ParrotCompanion companion) { 
		return companion.getVoice().toString();
	}

	@Override
	public String flying() {
		
		return "flying";
	}
}
