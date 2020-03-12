import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class Main {

	
	public List<String> findItinerary(List<List<String>> tickets) {
	        
		Map<String, PriorityQueue<String>> map = new HashMap<>();
		for(List<String> ticket: tickets){
			Iterator<String> iterator = ticket.iterator();
			String src = iterator.next();
			String desc = iterator.next();
			
			
			PriorityQueue<String> list = map.get(src);
			if(list == null){
				list = new PriorityQueue<>();
				map.put(src, list);
			}
			list.add(desc);
			
		}
		
		LinkedList<String> path = new LinkedList<>();
		dfs(map, path, "JFK");
		return path;
	}
	
	private void dfs(Map<String, PriorityQueue<String>> map, LinkedList<String> path, String cur){
		PriorityQueue<String> queue = map.get(cur);
		while(queue != null && queue.size() != 0){
			String nextDesc = queue.poll();
			dfs(map, path, nextDesc);
		}
		path.addFirst(cur);
	}
	
    
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main main = new Main();
		List<List<String>> list = new LinkedList<>();

//		list.add(Arrays.asList("JFK", "SFO"));
//		list.add(Arrays.asList("JFK", "ATL"));
//		list.add(Arrays.asList("SFO", "ATL"));
//		list.add(Arrays.asList("ATL", "JFK"));
//		list.add(Arrays.asList("ATL", "SFO"));
		
		list.add(Arrays.asList("JFK", "KUL"));
		list.add(Arrays.asList("JFK", "ART"));
		list.add(Arrays.asList("ART", "JFK"));
		//[JFK, KUL]

		
		System.out.println(main.findItinerary(list));
	}

}
