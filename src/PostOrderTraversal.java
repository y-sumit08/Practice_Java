import java.util.List;

/*
                    1
                  /  \
                 2    5
               /  \    \
             3     4    6
 */
public class PostOrderTraversal {

    public void postOrder(Node root, List<Integer> list) {
        if(root == null)
            return;

        postOrder(root.left, list);
        postOrder(root.right, list);
        //System.out.println(root.data);
        list.add(root.data);
    }

    public void preOrder(Node root, List<Integer> list) {
        if(root == null)
        {
            return;
        }
        //System.out.println(root.data);
        list.add(root.data);
        preOrder(root.left, list);
        preOrder(root.right, list);
    }
}
