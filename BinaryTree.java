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
	
	public void add(int element) {
		
		if(size == 0){
			root = new Node(element);
			size++;
		}
		
		//if the next number is big than previous,then let these number change their site
		else{
			if(element < (int)root.element) {
				addToLeft(element,root);
			}
			
			else{
				addToRight(element,root);
			}
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
