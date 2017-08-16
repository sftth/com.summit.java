package chap2;

import java.util.ArrayList;
import java.util.List;

public class Xecutor {
	private List<Apple> inventory = new ArrayList<Apple>();
	private String[] names = {"John","Peter"};
	private String[] color = {"green","red"};
	
	public Xecutor() {
		for(int i=0; i< 10 ; i++) {
			int j = i%2;
			inventory.add(new Apple(names[j],color[j],i*5));			
		}
	}
	
	public List<Apple> getInventory() {
		return this.inventory;
	}
	
	public static void main(String[] args) {
		Xecutor xecutor = new Xecutor();
		
		List<Apple> filterColor = Filter.filterApplesByColor(xecutor.getInventory(), "red"); 
		
		for(int i=0 ; i<filterColor.size(); i++) {
			System.out.println("i: " + i);
			System.out.println("Name:"+ filterColor.get(i).getName());	
			System.out.println("Color:"+ filterColor.get(i).getColor());
			System.out.println("Weight:"+ filterColor.get(i).getWeight());
		}
	}

}
