package demo.assignment.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import demo.asssigment.a.Rooster;
import demo.asssigment.a.RoosterLanguage;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RoosterLanguageTest {

	@Autowired
	Rooster rooster;
	
	@Test
	public void rooster_when_speakDutch() {
		
		Assert.assertEquals("kukeleku", rooster.singing(RoosterLanguage.DUTCH));
	}
	
	@Test
	public void rooster_when_speakJapanese() {
		
		Assert.assertEquals("ko-ke-kok-ko-o", rooster.singing(RoosterLanguage.JAPANESE));
	}
}
