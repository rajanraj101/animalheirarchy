package demo.assignment.e;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import demo.assignment.b.Clownfish;
import demo.assignment.b.Dolphins;
import demo.assignment.b.Fish;
import demo.assignment.b.Sharks;
import demo.assignment.category.Animal;
import demo.assignment.category.Bird;
import demo.assignment.category.Fly;
import demo.assignment.category.Sing;
import demo.assignment.category.Swim;
import demo.assignment.category.Walk;
import demo.assignment.d.Butterfly;
import demo.assignment.d.Caterpillar;
import demo.assignment.rest.model.AnimalCounts;
import demo.asssigment.a.Chicken;
import demo.asssigment.a.Duck;
import demo.asssigment.a.Parrot;
import demo.asssigment.a.Rooster;
 
@Component
public class CountingAnimals {

	
	public static void main(String args[] ) {
		CountingAnimals  cntAnimal = new CountingAnimals();
		cntAnimal.getCounts();
	}

	public AnimalCounts getCounts() {
		
		AnimalCounts cnt = new AnimalCounts();
		
		ArrayList<Animal> animals =  new ArrayList<Animal>();
				 
		animals.add(new Bird());
		animals.add(new Duck());
		animals.add(new Chicken());
		animals.add(new Rooster());
		animals.add(new Parrot());
		animals.add(new Fish());
		animals.add(new Sharks());
		animals.add(new Clownfish());
		animals.add(new Dolphins());
		animals.add(new Butterfly());
		animals.add(new Caterpillar());

		long flyCount = animals.stream()
								.filter(ani -> (ani instanceof Fly) )
								.count();
		
		System.out.println(" Fly count is "+ flyCount);
		

		long walkCount = animals.stream()
								.filter(ani -> (ani instanceof Walk) )
								.count();
		
		System.out.println(" Walk count is "+ walkCount);
		

		long singCount = animals.stream()
								.filter(ani -> (ani instanceof Sing) )
								.count();
		
		System.out.println(" Singing count is "+ singCount);
		

		long swimCount = animals.stream()
								.filter(ani -> (ani instanceof Swim) )
								.count();
		
		System.out.println(" swimCount count is "+ swimCount);
		
		cnt.setFly(flyCount);
		cnt.setWalk(walkCount);
		cnt.setSwim(swimCount);
		cnt.setSing(singCount);
		
		return cnt;
		
	}
	
}
