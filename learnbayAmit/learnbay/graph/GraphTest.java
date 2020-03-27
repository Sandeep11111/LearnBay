/**
 * 
 */
package graph;

/**
 * @author sandeepkumarsingh
 *
 */
public class GraphTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Graph gp = new Graph(4);
        Vertex A = new Vertex('A');
        Vertex B = new Vertex('B');
        Vertex C = new Vertex('C');
        Vertex D = new Vertex('D');
        
        gp.addVertex(A);
        gp.addVertex(B);
        gp.addVertex(C);
        gp.addVertex(D);
        
        gp.addEdge(0, 1); //AB
        gp.addEdge(0, 2); //AC
        gp.addEdge(1, 0); //BA
        gp.addEdge(1, 3); //BD
        gp.addEdge(2, 3); //CD
        gp.addEdge(2, 0); //CA
        gp.addEdge(3, 1); //DB
        gp.addEdge(3, 2); //DC
        
        System.out.println(gp.maxSize+"*"+gp.size);
        
            gp.DFS();
      		//gp.BFS();
      		System.out.println(gp.findPathExist('D'));

	}

}
