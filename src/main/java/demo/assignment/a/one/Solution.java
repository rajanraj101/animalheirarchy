package demo.assignment.a.one;

import org.springframework.stereotype.Component;

@Component
public class Solution {
	
	public static void main(String[] args) {
		
		Birds bird = new Birds();
		
		System.out.println(bird.walking());
		System.out.println(bird.flying());
		System.out.println(bird.singing());
	}
}

