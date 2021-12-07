/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tree;

/**
 *
 * @author lenovo
 */
public class TreeApp {
    public static void main(String[] args) {
        Tree tree = new Tree();
        
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
 
        System.out.println(
            "Traversal tidak berurutan dari pohon yang diberikan");
        tree.inorder();
 
        System.out.println("\nDelete 20");
        tree.deleteKey(20);
        System.out.println(
            "Traversal tidak berurutan dari pohon yang diberikan");
        tree.inorder();
 
        System.out.println("\nDelete 30");
        tree.deleteKey(30);
        System.out.println(
            "Traversal tidak berurutan dari pohon yang diberikan");
        tree.inorder();
 
        System.out.println("\nDelete 50");
        tree.deleteKey(50);
        System.out.println(
            "Traversal tidak berurutan dari pohon yang diberikan");
        tree.inorder();
    }
}
