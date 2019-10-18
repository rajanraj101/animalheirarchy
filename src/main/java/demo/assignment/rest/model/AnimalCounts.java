package demo.assignment.rest.model;

import org.springframework.stereotype.Component;

@Component
public class AnimalCounts {

    private  long fly;
    private  long walk;
    private  long swim;
    private  long sing;
    
	public long getFly() {
		return fly;
	}
	public void setFly(long fly) {
		this.fly = fly;
	}
	public long getWalk() {
		return walk;
	}
	public void setWalk(long walk) {
		this.walk = walk;
	}
	public long getSwim() {
		return swim;
	}
	public void setSwim(long swim) {
		this.swim = swim;
	}
	public long getSing() {
		return sing;
	}
	public void setSing(long sing) {
		this.sing = sing;
	}
	
}
