package chap1.preface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
	public static void main(String[] args){
		List<Apple> inventory = new ArrayList<Apple>();
		Apple a1 = new Apple("one","red",300);
		Apple a2 = new Apple("two","green",50);
		Apple a3 = new Apple("three","blue",320);

		Apple[] a = {a1,a2,a3};
		
		for(int i=0 ; i<3; i++){
			inventory.add(a[i]);
		}
		
		Collections.sort(inventory, new Comparator<Apple>(){
			public int compare(Apple a1, Apple a2) {
				return a1.getWeight().compareTo(a2.getWeight());
			}
		});
		
		for(Apple apple : inventory){
			System.out.println(apple.getName()+" "+apple.getWeight());
		}
	}
}
