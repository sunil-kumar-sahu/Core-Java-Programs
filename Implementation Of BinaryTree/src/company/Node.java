package company;
import java.util.*;
class Node
{
    char key;
    Node left,right;
    Node(char key)
    {
        this.key=key;
    }
}
class TreeTraversal
{
    Node root;
    void preordertraversal(Node n )
    {
        if(n!=null)
        {
            System.out.print(n.key+" ");
            preordertraversal(n.left);
            preordertraversal(n.right);
        }
    }
    void postordertraversal(Node n)
    {
        if(n!=null)
        {
            preordertraversal(n.left);
            preordertraversal(n.right);
            System.out.print(n.key+" ");
        }
    }
    void inordertraversal(Node n)
    {
        if(n!=null)
        {
            preordertraversal(n.left);
            System.out.print(n.key+" ");
            preordertraversal(n.right);
        }
    }
}
class Traversal
{
    public static void main(String[] args) {
        TreeTraversal t1=new TreeTraversal();
        t1.root=new Node('A');
        t1.root.left=new Node('B');
        t1.root.right=new Node('C');
        t1.root.left.left=new Node('D');
        t1.root.left.right=new Node('E');
        System.out.println("The perorder Traversal of BinaryTree is:");
        t1.preordertraversal(t1.root);
        System.out.println();
        System.out.println("The postorder Traversal of BinaryTree is:");
        t1.postordertraversal(t1.root);
        System.out.println();
        System.out.println("The inorder Traversal of BinaryTree is:");
        t1.inordertraversal(t1.root);
    }
}

