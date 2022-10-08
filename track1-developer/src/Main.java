import java.util.LinkedList;
import java.util.Queue;

public class Main {
  public static <T> void breadthFirst(Node<T> root) {
    if (root == null) {
      return;
    }

    Queue<Node<T>> queue = new LinkedList<>();
    queue.add(root);

    while (!queue.isEmpty()) {
      Node<T> node = queue.remove();
      System.out.print(node + " -> ");

      if (node.getLeftChild() != null) {
        queue.add(node.getLeftChild());
      }

      if (node.getRightChild() != null) {
        queue.add(node.getRightChild());
      }
    }
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

    a.setLeftChild(b);
    a.setRightChild(c);

    c.setLeftChild(d);
    c.setRightChild(e);

    d.setLeftChild(f);
    d.setRightChild(h);

    e.setRightChild(g);

    breadthFirst(a); // A -> B -> C -> D -> E -> F -> H -> G
  }
}
