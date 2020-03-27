/**
 * 
 */
package graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author sandeepkumarsingh
 *
 */
public class Graph {

	Vertex[] vertex;
	int[][] adjMatrix;
	LinkedList<Vertex>[] adjList;
    Stack stack;
	Queue queue;
	int size;
	int maxSize;
	
	public Graph(int size) {
		this.vertex = new Vertex[size];
		this.maxSize = size;
		this.size = 0;
		this.adjMatrix = new int[size][size];
		stack = new Stack<>();
		queue = new LinkedList<Integer>();
		for(int i=0; i<maxSize;i++) {
			for(int j=0; j<maxSize;j++) {
				adjMatrix[i][j] = 0;
			}
		}
	}
	
	public void addVertex(Vertex v) {
		vertex[size++] = v;
	}
	
	public void addEdge(int i, int j) {
		adjMatrix[i][j] = 1;
	}
	
	public int getAdjacentVertex(int i) {
		for(int j=0; j<maxSize; j++) {
			if(adjMatrix[i][j] == 1 && vertex[j].wasVisited == false) {
				return j;
			}
		}
		return -1;
	}
	
	public void DFS(){
		vertex[0].wasVisited= true;
		displayVertx(0); //print
		stack.push(0);
		while(!stack.isEmpty()){
			int v = getAdjacentVertex((int)stack.peek());
			if(v == -1){
				stack.pop();
			}else{
				vertex[v].wasVisited=true;
				displayVertx(v);
				stack.push(v);
			}
		}
		// resetting for next iteration
		for (int j = 0; j < size; j++) {
			vertex[j].wasVisited = false;
		}
	}
	
	
	public void BFS(){
		vertex[0].wasVisited = true;
		displayVertx(0);
		queue.add(0);
		while(!queue.isEmpty()){
			int v1=(int) queue.remove();
			int v2=getAdjacentVertex(v1);
			while ((v2 = getAdjacentVertex(v1)) != -1) {
				vertex[v2].wasVisited = true;
				displayVertx(v2);
				queue.add(v2);

			}
			
		}
		for (int j = 0; j < size; j++) {
			vertex[j].wasVisited = false;
		}
	}
	
	public boolean findPathExist(char data){
		vertex[0].wasVisited = true;
		displayVertx(0);
		queue.add(0);
		while(!queue.isEmpty()){
			int v1=(int) queue.remove();
			int v2=0;
			while ((v2 = getAdjacentVertex(v1)) != -1) {
				if(data == vertex[v2].data){
					return true;
				}
				vertex[v2].wasVisited = true;
				displayVertx(v2);
				queue.add(v2);

			}
		}
		return false;	
}
	
	public void displayVertx(int v){
		System.out.println(vertex[v].data);
	}
}
