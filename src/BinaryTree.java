/*
                    1
                  /  \
                 2    5
               /  \    \
             3     4    6
 */

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {
    Node root;

    BinaryTree() {
        root = null;
    }

    BinaryTree(int data) {
        root = new Node(data);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(5);

        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(4);

        tree.root.right.right = new Node(6);

        //System.out.println(tree.String());
        PostOrderTraversal post = new PostOrderTraversal();

        List<Integer> list1 = new ArrayList<>();
        post.postOrder(tree.root, list1);
        System.out.println("List after Post order Traversal --->"+list1);

        List<Integer> list2 = new ArrayList<>();
        post.preOrder(tree.root, list2);
        System.out.println("List after Pre order Traversal --->"+list2);
    }
}
