//U10416012 劉宏德

public class BinaryTree {
	private int size = 0;
	private Node root;

	//create a no argument constructor
	public BinaryTree(){}

	//create a constructor
	public BinaryTree(int[] num) {
		
		//add number into this array
		for(int i = 0; i < num.length; i++) {
			add(num[i]);
		}
	}
	
	private static class Node<E> {
		E element;
		Node<E> left;
		Node<E> right;

		public Node(){}

		public Node(E element){
			this.element = element;
		}
	}
}
