package proj631_projet2;
import java.util.*;

public class System { // a system is a graph in project.
	
	private HashMap<Integer, Node> mapNodes ; // nodes of the graph, the key is the ID of the node.
	
	public System(HashMap<Integer, Node> mapNodes) {
		this.mapNodes = mapNodes;
	}
	
	public HashMap<Integer, Node> getMapNodes(){
		return this.mapNodes;
	}
	
	
	public void addNode(Node node) {
		mapNodes.put(node.getId(), node);
	}
	

	public int shortestPathLength(int startNodeId, int endNodeId) {
	    // Initialize distance of all nodes as infinity except the start node
	    HashMap<Integer, Integer> distances = new HashMap<>();
	    for (Node node : mapNodes.values()) {
	        distances.put(node.getId(), Integer.MAX_VALUE);
	    }
	    distances.put(startNodeId, 0);

	    // Create a priority queue of nodes based on their distance from the start node
	    PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(distances::get));
	    pq.add(mapNodes.get(startNodeId));

	    // Keep track of visited nodes
	    HashSet<Integer> visited = new HashSet<>();

	    while (!pq.isEmpty()) {
	        // Get the node with minimum distance from the priority queue
	        Node current = pq.poll();
	        visited.add(current.getId());

	        // Update distances of neighbors of current node
	        for (Pair<Node, Integer> neighbor : current.getNeighbours().values()) {
	            Node neighborNode = neighbor.getFirst();
	            int distanceToNeighbor = neighbor.getSecond();
	            int newDistance = distances.get(current.getId()) + distanceToNeighbor;
	            if (!visited.contains(neighborNode.getId()) && newDistance < distances.get(neighborNode.getId())) {
	                distances.put(neighborNode.getId(), newDistance);
	                pq.add(neighborNode);
	            }
	        }
	    }

	    // Return the distance to the end node
	    return distances.get(endNodeId);
	}
	
}
