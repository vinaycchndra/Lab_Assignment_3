package com.greatlearning.pair_with_given_sum;

import java.util.HashSet;
import java.util.Set;

public class pairSumBst {

	// Pairs if their sum match to target
	int firstPair;
	int secondPair;

	// This method return True if pairs are found it uses a hash_set to keep track
	// of the traversed nodes and checks at every node if the K-root.val is present
	// in hash_set or not
	public boolean search(Set<Integer> mySet, TreeNode root, int k) {
		if (root == null) {
			return false;
		}
		if (mySet.contains(k - root.val)) {
			firstPair = root.val;
			secondPair = k - root.val;
			return true;
		}

		mySet.add(root.val);

		if (search(mySet, root.left, k) || search(mySet, root.right, k)) {
			return true;
		}

		return false;
	}

	// This method calls the above search method and inputs the hash_set after
	// declaration and initialization
	public boolean findTarget(TreeNode root, int k) {
		Set<Integer> mySet = new HashSet<Integer>();

		return search(mySet, root, k);
	}
}
