package demo.assignment.a.one;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import demo.asssigment.a.Parrot;
import demo.asssigment.a.ParrotCompanion;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ParrotCompanionTest {

	@Autowired
	Parrot parrot;
	
	@Test
	public void test_when_parrot_isWithDog() {		
		Assert.assertEquals("Parrot with Dogs", "Woof, woof", parrot.singing(ParrotCompanion.DOGS));
	}
	@Test
	public void test_when_parrot_isWithCat() {		
		Assert.assertEquals("Parrot with Dogs", "Meow", parrot.singing(ParrotCompanion.CATS));
	}
	
}
