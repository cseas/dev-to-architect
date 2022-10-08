package basics;

public class Dfs {
  public static <T> void inOrder(Node<T> root) {
    if (root == null) {
      return;
    }

    inOrder(root.getLeftChild());
    System.out.print(root.getData() + " -> ");
    inOrder(root.getRightChild());
  }

  public static <T> void preOrder(Node<T> root) {
    if (root == null) {
      return;
    }

    System.out.print(root.getData() + " -> ");
    preOrder(root.getLeftChild());
    preOrder(root.getRightChild());
  }

  public static <T> void postOrder(Node<T> root) {
    if (root == null) {
      return;
    }

    postOrder(root.getLeftChild());
    postOrder(root.getRightChild());
    System.out.print(root.getData() + " -> ");
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

    System.out.println("In order:");
    inOrder(a);
    System.out.println("\n");

    System.out.println("Pre order:");
    preOrder(a);
    System.out.println("\n");

    System.out.println("Post order:");
    postOrder(a);
  }
}
