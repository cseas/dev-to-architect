package problems;

import basics.Node;

// Checks if a given binary tree is a full binary tree
// i.e. all parents have 2 children or no children
public class Full {
  public static <T> boolean isFull(Node<T> root) {
    if (root == null) {
      return true;
    }

    if (root.getLeftChild() == null && root.getRightChild() == null) {
      return true;
    }

    if (root.getLeftChild() != null && root.getRightChild() != null) {
      return isFull(root.getLeftChild()) && isFull(root.getRightChild());
    }

    return false;
  }

  public static void main(String[] args) {
    Node<Character> a = new Node<>('A');
    Node<Character> b = new Node<>('B');
    Node<Character> c = new Node<>('C');
    Node<Character> d = new Node<>('D');
    Node<Character> e = new Node<>('E');
    Node<Character> f = new Node<>('F');
    Node<Character> g = new Node<>('G');
    Node<Character> h = new Node<>('H');
    Node<Character> i = new Node<>('I');
    Node<Character> j = new Node<>('J');

    a.setLeftChild(b);
    a.setRightChild(c);

    c.setLeftChild(d);
    c.setRightChild(e);

    d.setLeftChild(f);
    d.setRightChild(h);

    b.setLeftChild(i);
    b.setRightChild(j);

    System.out.printf("isFull: %s\n", isFull(a)); // true

    e.setRightChild(g);
    System.out.printf("isFull: %s\n", isFull(a)); // false
  }
}
