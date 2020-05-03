package com.datastructures.roy.graph;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class DFS {
	Set<GraphNode> visited = new HashSet<>();
	
	public GraphNode search(int value, GraphNode start) {
		Stack<GraphNode> stack = new Stack<>();
		stack.push(start);
		
		while(!stack.isEmpty()) {
			GraphNode currentNode = stack.pop();
			
			System.out.println("Visited node with value: "+ currentNode.getValue());
			
			if(currentNode.getValue() == value) {
				return currentNode;
			} else {
				visited.add(currentNode);
				stack.addAll(currentNode.getNeighbors());
				stack.removeAll(visited);
			}
			
		}
		
		return null;
	}

}
