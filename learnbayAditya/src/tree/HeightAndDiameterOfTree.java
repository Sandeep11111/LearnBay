package tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class HeightAndDiameterOfTree {

	public static void main(String arg[]) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line = reader.readLine();
		List<Integer> list = new ArrayList<>(Integer.parseInt(line));
		line =reader.readLine();
		String str[] = line.split(" ");
		for(String ch: str) {
			list.add(Integer.parseInt(ch));
		}
		Node root=null;
		HeightAndDiameterOfTree diameter = new HeightAndDiameterOfTree();
		//root = diameter.createTree(list,root,0);
	}
}
