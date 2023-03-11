package _06_How_Many_Are_Smaller_Than_Me;

import _03_Intro_to_Binary_Trees.Node;
import _05_Intro_to_AVL_Trees.AVLNode;
import _05_Intro_to_AVL_Trees.AVLTree;

public class HowManyAreSmallerThanMe {

	/*
	 * Given an AVLTree filled with the random numbers from 1 to 20, and a single
	 * number within the AVL Tree, figure out how many numbers in the AVLTree are
	 * smaller than the provided number and return the result.
	 * 
	 * You may want to create a helper method to search through the AVLTree and
	 * count iteratively or recursively.
	 */

	public int howManyAreSmallerThanMe(AVLTree<Integer> avlTree, int me) {
		avlTree.printVertical();
		System.out.println(me);

		Node<Integer> current = avlTree.getRoot();
		int amount = 0;

		int left = count(current.getLeft(), me);
		int right = count(current.getRight(), me);
		if (me > current.getValue()) {
			return left+right+1;
		}
		else {
			return left+right+0;
		}
		

	}

	int count(Node<Integer> current, int me) {
		
		return null;
	}

}
