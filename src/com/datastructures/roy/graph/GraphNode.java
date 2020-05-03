package com.datastructures.roy.graph;

import java.util.LinkedList;
import java.util.List;

public class GraphNode {
	private int value;
	private List<GraphNode> neighbors;

	public GraphNode(int v) {
		this.value = v;
		this.neighbors = new LinkedList<>();
	}

	public void connect(GraphNode node) {
		this.neighbors.add(node);
		node.neighbors.add(this);
	}

	public int getValue() {
		return value;
	}

	public List<GraphNode> getNeighbors() {
		return neighbors;
	}
	

}
