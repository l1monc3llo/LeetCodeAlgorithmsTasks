package com.gmx;

import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        postorderTraversalUtil(ans, root);
        return ans;
    }

    public void postorderTraversalUtil(List<Integer> arr, TreeNode node) {
        if (node == null) return;
        postorderTraversalUtil(arr, node.left);
        postorderTraversalUtil(arr, node.right);
        arr.add(node.val);
    }

    public TreeNode buildTreeFromArray(Integer[] arr) {
        if (arr == null || arr.length == 0) return null;

        TreeNode root = new TreeNode(arr[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;

        while (!queue.isEmpty() && i < arr.length) {
            TreeNode current = queue.poll();

            if (arr[i] != null) {
                current.left = new TreeNode(arr[i]);
                queue.add(current.left);
            }
            i++;

            if (i < arr.length && arr[i] != null) {
                current.right = new TreeNode(arr[i]);
                queue.add(current.right);
            }
            i++;
        }

        return root;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        ArrayList<Integer> inputList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Tree Nodes, finish the input with -1:");

        while (true) {
            String input = sc.next();
            if (input.equals("-1")) {
                break;
            }
            if (input.equalsIgnoreCase("null")) {
                inputList.add(null);
            } else {
                try {
                    inputList.add(Integer.parseInt(input));
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter an integer or 'null'.");
                }
            }
        }

        Integer[] arr = inputList.toArray(new Integer[0]);
        TreeNode root = sol.buildTreeFromArray(arr);
        List<Integer> result = sol.postorderTraversal(root);
        System.out.println("Postorder Traversal: " + result);
    }
}
