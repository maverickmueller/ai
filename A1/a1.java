import java.util.*;

public class a1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner("_1_0_1_1\n___2____\n____101_\n2_2_1___\n__010___\n20_0____\n_3____10\n____01__");
		
		while(scanner.hasNext()) {
			String currLine = scanner.nextLine();
			for(int i=0; i < currLine.length(); i++)
			{
				System.out.print(currLine.charAt(i));
			}
			System.out.println();
		}
	}
	
	public class Node {
		int row, column;
		List<Node> connectedNodes;
		
		public Node(int row, int column) {
			this.row = row;
			this.column = column;
		}
	}
}