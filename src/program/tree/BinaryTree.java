package program.tree;

import java.util.ArrayList;
import java.util.Scanner;

public class BinaryTree {
    public static void main(String[] args) {
        GenericTree tree = new GenericTree();
        tree.display();
        System.out.println(tree.height());
        System.out.println(tree.size());
        System.out.println(tree.max());
        System.out.println(tree.find(3));
    }
}

// class generic tree
class GenericTree {
    class Node {
        int data;
        ArrayList<Node> children;

        Node(int data) {
            this.data = data;
            children = new ArrayList<>();
        }

    }

    // menambah element tree
    private Node root;

    GenericTree() {
        Scanner s = new Scanner(System.in);
        this.root = constructGT(s, null, 0);
    }

    private Node constructGT(Scanner s, Node parent, int i) {
        if (parent == null) {
            System.out.println("Masukan data ke root node");
        } else {
            System.out.println("Masukan data ke " + i + " Pada Child " + parent.data);
        }

        int data = s.nextInt();
        Node node = new Node(data);

        System.out.println("Masukan nomor anak ke " + node.data);
        int n = s.nextInt();

        for (int j = 0; j < n; j++) {
            Node child = constructGT(s, node, j);
            node.children.add(child);
        }

        return node;
    }

    public void display() {
        display(this.root);
    }

    private void display(Node node) {
        String str = node.data + " => ";

        for (Node child : node.children) {
            str += child.data + ", ";
        }
        System.out.println(str);

        for (Node child : node.children) {
            display(child);
        }
    }

    // mencari tinggi tree
    public int height() {
        return this.height(root);
    }

    private int height(Node node) {
        int th = 0;

        for (Node child : node.children) {
            int ch = height(child);
            if (ch > th) {
                th = ch;
            }
        }
        return th + 1;
    }

    // mencari ukuran tree
    public int size() {
        return this.size(this.root);
    }

    private int size(Node node) {
        int ts = 1;

        for (Node nn : node.children) {
            int cs = size(nn);
            ts += cs;
        }
        return ts;
    }

    // max (large element)
    public int max() {
        return this.max(this.root);
    }

    private int max(Node node) {
        int tm = node.data;

        for (Node child : node.children) {
            int cm = max(child);
            if (cm > tm)
                tm = cm;
        }
        return tm;
    }

    // mencari elemen di tree
    public boolean find(int element){
        return find(this.root, element);
    }
    
    private boolean find(Node node, int element){
        if(node.data == element){
            return true;
        }

        for(Node child: node.children){
            if(find(child, element)){
                return true;
            }
        }
        return false;
    }
}
