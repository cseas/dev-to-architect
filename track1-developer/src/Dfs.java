import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Dfs {
  public static <T> void inOrder(Node<T> root) {
    if (root == null) {
      return;
    }

    Set<Node<T>> visitedNodes = new HashSet<>();
    Stack<Node<T>> stack = new Stack<>();
    stack.push(root);

    while (!stack.isEmpty()) {
      Node<T> top = stack.pop();

      if (top.getLeftChild() == null && top.getRightChild() == null) {
        System.out.print(top + " -> ");
      } else if (visitedNodes.contains(top)) {
        System.out.print(top + " -> ");
      } else {
        visitedNodes.add(top);

        if (top.getRightChild() != null) {
          stack.push(top.getRightChild());
        }

        stack.push(top);

        if (top.getLeftChild() != null) {
          stack.push(top.getLeftChild());
        }
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
    Node<Character> i = new Node<>('I');

    a.setLeftChild(b);
    a.setRightChild(c);

    b.setLeftChild(d);
    b.setRightChild(e);

    c.setLeftChild(f);
    c.setRightChild(g);

    d.setLeftChild(h);
    d.setRightChild(i);

    inOrder(a);
  }
}
