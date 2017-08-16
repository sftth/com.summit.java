package chap1.preface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestRamda {
	public static void main(String[] args){
		List<Apple> inventory = new ArrayList<Apple>();
		Apple a1 = new Apple("one","red",300);
		Apple a2 = new Apple("two","green",50);
		Apple a3 = new Apple("three","blue",320);

		Apple[] a = {a1,a2,a3};
		
		for(int i=0 ; i<3; i++){
			inventory.add(a[i]);
		}
		
		inventory.sort((Apple apple1,Apple apple2)->apple1.getWeight().compareTo(apple2.getWeight()));
		
		for(Apple apple : inventory){
			System.out.println(apple.getName()+" "+apple.getWeight());
		}
	}
}
