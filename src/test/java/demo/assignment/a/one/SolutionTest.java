package demo.assignment.a.one;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SolutionTest {

	@Autowired
	Animals animals;

	@Autowired
	Birds birds;
	
	@Test
	public void test_animal_when_walk_then_true() {		
		Assert.assertEquals("Animals walking", "walking", animals.walking());		
	}
	
	@Test
	public void test_birds_when_walk_then_true() {		
		Assert.assertEquals("Birds walking", "walking", birds.walking());		
	}
	
	@Test
	public void test_birds_when_fly_then_true() {		
		Assert.assertEquals("Birds flying", "flying", birds.flying());		
	}
	
	@Test
	public void test_birds_when_sing_then_true() {		
		Assert.assertEquals("Birds singing", "singing", birds.singing());		
	}
}
