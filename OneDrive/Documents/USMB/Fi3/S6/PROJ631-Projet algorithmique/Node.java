package proj631_projet2;
import java.util.*;


public class Node {
	
	private int id;
	private HashMap<Integer, Pair<Node, Integer>> neighbours = new HashMap<>(); // The key is the ID of the neighbor and the pair<node, integer> contains the neighbour node and the distance between the current node and this neighbor.
	
	public Node(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public HashMap<Integer, Pair<Node, Integer>> getNeighbours() {
		return neighbours;
	}
	
	public void setNeighbours(HashMap<Integer, Pair<Node, Integer>> neighbours) {
		this.neighbours = neighbours;
	}

	public void sortNeighborsByDistance() {
	    List<Map.Entry<Integer, Pair<Node, Integer>>> entries = new ArrayList<>(neighbours.entrySet());

	    Collections.sort(entries, new Comparator<Map.Entry<Integer, Pair<Node, Integer>>>() {
	        @Override
	        public int compare(Map.Entry<Integer, Pair<Node, Integer>> entry1, Map.Entry<Integer, Pair<Node, Integer>> entry2) {
	            Integer dist1 = entry1.getValue().getSecond();
	            Integer dist2 = entry2.getValue().getSecond();
	            return dist1.compareTo(dist2);
	        }
	    });

	    neighbours.clear();

	    for (Map.Entry<Integer, Pair<Node, Integer>> entry : entries) {
	        neighbours.put(entry.getKey(), entry.getValue());
	    }
	}
	
}
