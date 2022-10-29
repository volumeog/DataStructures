package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    Node root;

    BinaryTree(int key){ root = new Node(key);}

    BinaryTree(){root = null;}

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.root = new Node(1);

        tree.root.left = new Node(2);
        tree.root.right = new Node(3);

        tree.root.left.left = new Node(4);
    }

    public void traverseLevelOrder(Node root){
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node tempNode = queue.poll();
            System.out.printf("%d", tempNode.key);
            if(tempNode.left!=null)
                queue.add(tempNode.left);
            if(tempNode.right!=null)
                queue.add(tempNode.right);
        }
    }

    public void traverseInOrder(Node node){
        if(node != null){
            traverseInOrder(node.left);
            System.out.println(" " + node.key);
            traverseInOrder(node.right);
        }
    }



}
