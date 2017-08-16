package chap1.preface;

public class Apple {
	private String name ;
	private String color;
	private Integer weight;
	
	public Apple(String name, String color, Integer weight){
		this.name = name;
		this.color = color;
		this.weight = weight;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Integer getWeight() {
		return weight;
	}
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	
	
}
