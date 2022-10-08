package problems;

import basics.Node;

// Node Sum along a Path
public class PathSum {
  public static boolean hasPathSum(Node<Integer> root, int currentSum) {
    if (root == null) {
      return false;
    }

    if (root.getLeftChild() == null && root.getRightChild() == null) {
      return currentSum == root.getData();
    }

    boolean hasPathSumLeft = hasPathSum(root.getLeftChild(), currentSum - root.getData());
    boolean hasPathSumRight = hasPathSum(root.getRightChild(), currentSum - root.getData());

    boolean hasPathSum = hasPathSumLeft || hasPathSumRight;

    System.out.printf("%s { left: %s, right: %s} hasPathSum: %s\n", root, hasPathSumLeft,
        hasPathSumRight, hasPathSum);

    return hasPathSum;
  }

  public static void main(String[] args) {
    Node<Integer> one = new Node<>(1);
    Node<Integer> two = new Node<>(2);
    Node<Integer> three = new Node<>(3);
    Node<Integer> four = new Node<>(4);
    Node<Integer> five = new Node<>(5);
    Node<Integer> six = new Node<>(6);
    Node<Integer> seven = new Node<>(7);
    Node<Integer> eight = new Node<>(8);

    one.setLeftChild(two);
    one.setRightChild(three);

    three.setLeftChild(seven);
    three.setRightChild(six);

    seven.setLeftChild(eight);

    six.setLeftChild(five);
    six.setRightChild(four);

    System.out.println("Answer: " + hasPathSum(one, 15));
  }
}
