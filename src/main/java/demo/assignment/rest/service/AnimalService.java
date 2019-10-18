package demo.assignment.rest.service;

import org.springframework.stereotype.Service;

import demo.assignment.rest.model.AnimalCounts;

@Service
public interface AnimalService {

	public AnimalCounts countingAnimalByCategory();
}
