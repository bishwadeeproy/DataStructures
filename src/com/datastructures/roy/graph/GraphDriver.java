package com.datastructures.roy.graph;

public class GraphDriver {
	public static void main(String [] aargs) {
		GraphNode start = new GraphNode(10);
		GraphNode firstNeighbor = new GraphNode(2);
		start.connect(firstNeighbor);
		 
		GraphNode firstNeighborNeighbor = new GraphNode(3);
		firstNeighbor.connect(firstNeighborNeighbor);
		firstNeighborNeighbor.connect(start);
		 
		GraphNode secondNeighbor = new GraphNode(4);
		start.connect(secondNeighbor);
		
		BFS bfs = new BFS();
		
		//GraphNode res_bfs = bfs.search(4, firstNeighborNeighbor);
		//GraphNode res = bfs.search(2, start);
		
		//System.out.println(res_bfs!=null ? res_bfs.getValue() : "No value present!");
		
		DFS dfs = new DFS();
		
		GraphNode res_dfs = dfs.search(4, firstNeighborNeighbor);
		
		System.out.println(res_dfs!=null ? res_dfs.getValue() : "No value present!");
	}
}
