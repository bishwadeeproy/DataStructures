package com.datastructures.roy.graph;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

public class BFS {
	//Space: O(V) Time: O(V + E)
	private Set<GraphNode> visited = new HashSet<>();
	
	public GraphNode  search(int value,  GraphNode start){
		Queue<GraphNode> queue = new ArrayDeque<GraphNode>();
		queue.add(start);
		
		while(!queue.isEmpty()) {
			GraphNode currentNode = queue.remove();
			
			System.out.println("Visited node with value: "+ currentNode.getValue());
			
			if(currentNode.getValue() == value) {
				return currentNode;
			} else {
				visited.add(currentNode);
				queue.addAll(currentNode.getNeighbors());
				queue.removeAll(visited);
			}
			
		}
		
		return null;
	}
	
}
