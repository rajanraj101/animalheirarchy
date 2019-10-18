package demo.asssigment.a;

import org.springframework.stereotype.Component;

@Component
public class Rooster extends Chicken {

	@Override
	public String singing() { 
		return "Cock-a-doodle-doo";
	}
	
	public String singing(RoosterLanguage lang) { 
		return  lang.getText().toString();
	}
	
}
