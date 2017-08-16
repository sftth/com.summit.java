package chap2;

import java.util.ArrayList;
import java.util.List;

public class Filter {
	/**
	 * Filtering green apples
	 * @param inventory
	 * @return list of green apples
	 */
	public static List<Apple> filterGreenApples(List<Apple> inventory) {
		List<Apple> result = new ArrayList<>();
		for(Apple apple : inventory) {
			if("green".equals(apple.getColor())) {
				result.add(apple);
			}
		}
		
		return result;
	}
	
	/**
	 * Filtering specific color apples
	 * @param inventory
	 * @param color
	 * @return
	 */
	public static List<Apple> filterApplesByColor(List<Apple> inventory, String color) {
		List<Apple> result = new ArrayList<>();
		for(Apple apple : inventory) {
			if(color.equals(apple.getColor())) {
				result.add(apple);
			}
		}
		
		return result;
	}

}
