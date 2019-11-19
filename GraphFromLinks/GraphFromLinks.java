package GraphFromLinks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GraphFromLinks {

	public static void main(String[] args) {
		List<List<String>> links = Arrays.asList(
				Arrays.asList("Bob", "Rob"),
				Arrays.asList("Alice", "Maria"),
				Arrays.asList("Rob", "Mark"),
				Arrays.asList("Alice", "Bob"),
				Arrays.asList("Maria", "Rob"),
				Arrays.asList("Mark", "Alice")
				);
		
		Map<String, List<String>> graph = graphFromLinks(links);
		
		System.out.println(graph);
	}

	private static <E> Map<E, List<E>> graphFromLinks(List<List<E>> links) {
		// Adjacency List
		Map<E, List<E>> graph = new HashMap<>();
		
		for (List<E> link : links) {
			if (!graph.containsKey(link.get(0))) graph.put(link.get(0), new ArrayList<E>());
			if (!graph.containsKey(link.get(1))) graph.put(link.get(1), new ArrayList<E>());
			graph.get(link.get(0)).add(link.get(1));
			graph.get(link.get(1)).add(link.get(0));
		}
		
		return graph;
	}

}
