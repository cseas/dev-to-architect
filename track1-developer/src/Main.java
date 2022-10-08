import java.util.LinkedList;
import java.util.Queue;

public class Main {
  public static <T> void breadthFirst(Node<T> root) {
    if (root == null) {
      return;
    }

    Queue<Pair<Node<T>, Integer>> queue = new LinkedList<>(); // Pair(data of node, level of node)

    int level = 0;
    queue.add(new Pair<>(root, level));

    while (!queue.isEmpty()) {
      Pair<Node<T>, Integer> pair = queue.remove();
      System.out.print(pair + " -> ");

      level = pair.getValue() + 1;

      Node<T> leftChild = pair.getKey().getLeftChild();
      if (leftChild != null) {
        queue.add(new Pair<>(leftChild, level));
      }

      Node<T> rightChild = pair.getKey().getRightChild();
      if (rightChild != null) {
        queue.add(new Pair<>(rightChild, level));
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
