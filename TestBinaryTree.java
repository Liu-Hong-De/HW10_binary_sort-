//U10416012 劉宏德

import java.security.SecureRandom;

public class TestBinaryTree {
	public static void main(String[] args) {

		//create a array to store 20 number which the user want to do the binary tree
		int[] number = new int[20];

		SecureRandom random = new SecureRandom();

		//add the random number in the array
		for(int i = 0; i < 20; i++) {
			number[i] = random.nextInt(100);
			
			for(int j = 0; j < i - 1; j++) {
				if(number[i] == number[j]) {
					i--;
				}
			}
		}

		BinaryTree b = new BinaryTree(number);

		b.printOut();
	}

}
