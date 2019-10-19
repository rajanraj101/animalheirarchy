package demo.assignment.rest.controller;
 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import demo.assignment.rest.model.AnimalCounts;
import demo.assignment.rest.service.AnimalService;

@RestController
public class AnimalController {

	@Autowired
	AnimalService animalService;
	
    //private static final String template = "Flying animals are %s <br> Walking animals are %s <br> Singing animals are %s <br> Swimming animals are %s <br> ";
   
    @RequestMapping("/animalCount")
    public AnimalCounts getAnimalCount() {
    	 
    
    	AnimalCounts cnt =	animalService.countingAnimalByCategory();
    	
    	if(StringUtils.isEmpty(cnt)) {
    		return null;
    	} else {
    		
    		return  cnt;// String.format(template,cnt.getFly() , cnt.getWalk(), cnt.getSing(), cnt.getSwim());
    	}
  
    }
}
