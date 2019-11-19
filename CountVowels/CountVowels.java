package CountVowels;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class CountVowels {

	public static void main(String[] args) {
		Map<String, AtomicInteger> vowelsCount = new HashMap<>();
		vowelsCount.put("a", new AtomicInteger(0));
		vowelsCount.put("e", new AtomicInteger(0));
		vowelsCount.put("i", new AtomicInteger(0));
		vowelsCount.put("o", new AtomicInteger(0));
		vowelsCount.put("u", new AtomicInteger(0));
		
		String word = "hello how are you";
		
		Stream.of(word.split(""))
			.filter(ch -> "aeiou".contains(ch))
			.forEach(vowel -> vowelsCount.get(vowel).incrementAndGet());
		
		System.out.println(vowelsCount.toString());
	}

}
