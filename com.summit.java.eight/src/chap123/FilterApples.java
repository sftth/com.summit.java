package chap123;

import java.util.*;
import java.util.function.Predicate;

public class FilterApples {
	public List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> p) {
		
		List<Apple> result = new ArrayList<>();
		for(Apple apple: inventory){
			if(p.test(apple)){
				result.add(apple);
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		List<Apple> inventory = new ArrayList<>();
		
		Apple apple1 = new Apple("park","red",80);
		Apple apple2 = new Apple("lee","yellow",160);
		Apple apple3 = new Apple("kim","green",180);
		
		inventory.add(apple1);
		inventory.add(apple2);
		inventory.add(apple3);
		
		FilterApples filterApples = new FilterApples();
		
		List<Apple> result = filterApples.filterApples(inventory, (Apple a) -> "green".equals(a.getColor()));
		List<Apple> result2 = filterApples.filterApples(inventory, (Apple a) -> a.getWeight() > 150);
		
		for(Apple apple : result){
			System.out.println("Result:" + apple.getName());
		}
		
		for(Apple apple : result2) {
			System.out.println("Result2:" + apple.getName());
		}
		
	}
}
