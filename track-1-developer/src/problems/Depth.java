package problems;

import basics.Node;

// Length of the longest path from the root node to a leaf node
public class Depth {
  public static <T> int maxDepth(Node<T> root) {
    if (root == null) {
      return 0;
    }

    if (root.getLeftChild() == null && root.getRightChild() == null) {
      System.out.printf("%s maxDepth: 0\n", root);
      return 0;
    }

    int leftMaxDepth = maxDepth(root.getLeftChild());
    int rightMaxDepth = maxDepth(root.getRightChild());

    int maxDepth = 1 + Math.max(leftMaxDepth, rightMaxDepth);

    System.out.printf("%s { leftMaxDepth: %s, rightMaxDepth: %s } current maxDepth: %s\n", root,
        leftMaxDepth, rightMaxDepth, maxDepth);

    return maxDepth;
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

    System.out.println("Answer: " + maxDepth(a));
  }
}
