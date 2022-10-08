package problems;

import basics.Node;

public class Count {
  public static <T> int countNodes(Node<T> root) {
    if (root == null) {
      return 0;
    }

    int numLeftNodes = countNodes(root.getLeftChild());
    int numRightNodes = countNodes(root.getRightChild());

    return 1 + numLeftNodes + numRightNodes;
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

    a.setLeftChild(b);
    a.setRightChild(c);

    b.setLeftChild(d);
    b.setRightChild(e);

    e.setLeftChild(f);
    e.setRightChild(g);

    f.setRightChild(h);
    h.setRightChild(i);

    System.out.println("No. of nodes: " + countNodes(a));
  }
}
