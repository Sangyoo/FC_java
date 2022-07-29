package ch07;

import java.util.Arrays;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

class CompareString implements BinaryOperator<String> {

	@Override
	public String apply(String s1, String s2) {
		if( s1.getBytes().length >= s2.getBytes().length) return s1;
		else return s2;
	}
	
}

public class ReduceTest {

	public static void main(String[] args) {
		
		String greetings[] = {"æ»≥Á«œººø‰~~`", "hello", "good moring", "π›∞©Ω¿¥œ¥Ÿ%$"};
		
		/*Stream<String> str = Arrays.stream(greetings);
		str.filter(s->s.length()> 5).forEach(s->System.out.println(s));
		*/
		
		System.out.println(Arrays.stream(greetings).reduce("hgi", (s1,s2) -> 
				{if( s1.getBytes().length >= s2.getBytes().length) return s1;
				else return s2;}
				));
		
		String sst = Arrays.stream(greetings).reduce(new CompareString()).get();
		System.out.println(sst);
	}

}
