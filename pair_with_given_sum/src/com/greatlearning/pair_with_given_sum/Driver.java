package com.greatlearning.pair_with_given_sum;

import java.util.Scanner;

//Driver Class to take inputs and create Binary Search Tree and check for the target satisfying pairs
public class Driver {

	// Method to insert nodes into the tree
	public static TreeNode insertIntoBst(TreeNode root, int key) {
		TreeNode node = new TreeNode();
		node.val = key;
		if (root == null) {
			return node;
		}
		TreeNode temp = root;
		while (temp != null) {
			if (temp.val == key) {
				break;
			} else if (temp.val < key) {
				if (temp.right != null) {
					temp = temp.right;
				} else {
					temp.right = node;
					break;
				}
			} else {
				if (temp.left != null) {
					temp = temp.left;
				} else {
					temp.left = node;
					break;
				}
			}
		}
		return root;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"Input with positive numbers as long as you want to create a BST in an level traversal fashion: ");
		int num = 0;

		// root of the BST
		TreeNode root = null;

		// This loop runs as long as positive numbers are given as input and only
		// inserts positive integers
		while (num >= 0) {
			num = sc.nextInt();
			if (num >= 0) {
				root = insertIntoBst(root, num);
			}
		}

		// Target variable
		int target;
		System.out.println("Ok, now insert the value of target");
		target = sc.nextInt();
		sc.close();

		// Object of the class which has findTarget method to check if the target exists
		pairSumBst obj = new pairSumBst();
		if (obj.findTarget(root, target)) {
			System.out.println(
					"The two such pairs exist in the tree which are: (" + obj.firstPair + "," + obj.secondPair + ")");
		} else {
			System.out.println("Nodes are not found");
		}
	}

}

/* 
 * Input with positive numbers as long as you want to create a BST in an level traversal fashion: 
40
20
60
10
30
50
70
-1
Ok, now insert the value of target
130
The two such pairs exist in the tree which are: (70,60)
*/
 