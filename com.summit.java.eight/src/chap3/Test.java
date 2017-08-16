package chap3;

import java.util.function.Function;

public class Test {


	public static void main(String[] args) {
		//Function<String, Integer> f = (String s) -> s.length();
		Function<String, Integer> f = new FunctionImpl2 ();
		System.out.println(f.apply("test"));
	}
}

class FunctionImpl2 implements Function<String, Integer> {
	
	@Override
	public Integer apply(String t) {
		return t.length();
	}
	
}

