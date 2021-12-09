package program.tree;

import java.util.ArrayList;
import java.util.Scanner;

public class BinaryTree {
    public static void main(String[] args) {
        GenericTree tree = new GenericTree();
        tree.display();
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

    public void display(){
        display(this.root);
    }

    private void display(Node node){
        String str = node.data + " => ";

        for(Node child: node.children){
            str += child.data + ", ";
        }
        System.out.println(str);

        for(Node child: node.children){
            display(child);
        }
    }
}
