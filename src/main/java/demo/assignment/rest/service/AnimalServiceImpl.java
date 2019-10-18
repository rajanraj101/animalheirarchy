package demo.assignment.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import demo.assignment.e.CountingAnimals;
import demo.assignment.rest.model.AnimalCounts;

@Component
public class AnimalServiceImpl implements AnimalService {

	@Autowired
	CountingAnimals countingAnimals;
	
	@Override
	public AnimalCounts countingAnimalByCategory() {
		
		AnimalCounts animalCnt =  null;
				
		if(countingAnimals != null ) {
			
			animalCnt = countingAnimals.getCounts();
			
		}
		
		return animalCnt;
	}

}
