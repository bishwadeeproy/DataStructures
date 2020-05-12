// compute degree of V
public static int getDegree(Graph G, Node v){
	int degree = 0;
	for(Node node : G.adj(v)) degree++;
	
	return degree;
}

//compute maximun degree

public static int getMaxDegree(Graph G){
	int max = 0 ;
	for(Node v : G.V()){
		int degree = 0;
		for(Node node : G.adj(v)) degree++;
		if(degree > max) max = degree;
		
	}
	return max;
}


// count self loops

public static int getSlefLoops(Graph G){
	int count  = 0;
	for(Node v:G.V()){
		for(Node w: G.adj(v)){
			if(v==w) count++;
		}
	}
	return count/2; /// each edge counted twice
}		

