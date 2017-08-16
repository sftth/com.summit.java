package part2.chap4;

import java.util.*;

public class StreamExe {
	public static void main(String[] args) {
		List<Dish> menu = new ArrayList<Dish> ();
		Random r = new Random();

		for(int i=0; i< 100 ; i++) {
			menu.add(new Dish(r.nextInt(50)*i,"D"+i));			
		}
		
		List<Dish> lowCaloricDishes = new ArrayList<> ();
		
		for(Dish d : menu) {
			if(d.getCalories() < 400) {
				lowCaloricDishes.add(d);
			}
		}
		
		Collections.sort(lowCaloricDishes, new Comparator<Dish>() {

			@Override
			public int compare(Dish d1, Dish d2) {
				return Integer.compare(d1.getCalories(), d2.getCalories());
			}
			
		});
		
		List<String> lowCaloricDishesName = new ArrayList();
		for(Dish d : lowCaloricDishes) {
			lowCaloricDishesName.add(d.getName());
		}
		/*
		for(String n: lowCaloricDishesName) {			
			System.out.println(n);
		}
		*/
		
		for(Dish d : lowCaloricDishes) {
			System.out.println(d.getName() + " : " + d.getCalories());
		}
	}

}

class Dish {
	int calories = 0;
	String name = "";
	Dish(int c, String n) {
		this.calories = c;
		this.name = n;
	}
	
	int getCalories() {
		return this.calories;
	}
	
	String getName() {
		return this.name;
	}
}
