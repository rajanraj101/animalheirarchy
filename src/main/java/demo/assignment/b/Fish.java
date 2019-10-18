package demo.assignment.b;

import org.springframework.stereotype.Component;

import demo.assignment.category.Aquatic;
@Component
public class Fish extends Aquatic {
	
	private String size;
	private String color;

	public Fish() {
		super();
	}  
	
	public Fish(String size, String color) {
		super();
		this.size = size;
		this.color = color;
	}
	
	
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	} 
	
	
	 
}
