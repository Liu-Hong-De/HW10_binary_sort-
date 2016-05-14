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
	
	//if the number is smaller add this number to left
	public void addToLeft(int element, Node temp) {
		if(temp.left == null) {
			temp.left = new Node(element);
			size++;
		}
		
		else if(element < (int)((temp.left).element)){
			addToLeft(element, temp.left);
		}
		
		else{
			addToRight(element, temp.left);
		}
	}

	//if the number is larger add this number to right
	public void addToRight(int element, Node temp) {
		if(temp.right == null) {
			temp.right = new Node(element);
			size++;
		}
		
		else if(element > (int)((temp.right).element)) {
			addToRight(element, temp.right);
		}
		
		else{
			addToLeft(element, temp.right);
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
