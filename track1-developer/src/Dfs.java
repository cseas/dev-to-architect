public class Dfs {
  public static <T> void inOrder(Node<T> root) {
    if (root == null) {
      return;
    }

    inOrder(root.getLeftChild());
    System.out.print(root.getData() + " -> ");
    inOrder(root.getRightChild());
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
