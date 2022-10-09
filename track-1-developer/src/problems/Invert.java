package problems;

import basics.Bfs;
import basics.Node;

public class Invert {
  public static <T> void invert(Node<T> root) {
    if (root == null) {
      return;
    }

    Node<T> temp = root.getLeftChild();

    root.setLeftChild(root.getRightChild());
    root.setRightChild(temp);

    invert(root.getLeftChild());
    invert(root.getRightChild());
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

    System.out.println("Original: ");
    Bfs.breadthFirstWithLevel(one);
    System.out.println("\n");

    invert(one);
    System.out.println("Inverted: ");
    Bfs.breadthFirstWithLevel(one);
  }
}
