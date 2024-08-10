import java.util.*;

public class basicpro {
    static class node {
        int data;
        node left;
        node right;

        node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class jkl {
        static int index = -1;

        public static node create(int arr[]) {
            index++;
            if (arr[index] == -1) {
                return null;
            }
            node temp = new node(arr[index]);
            temp.left = create(arr);
            temp.right = create(arr);
            return temp;
        }
       public static void preorder(node root) {
            if (root == null) {
                return;
            }
            System.out.print(root.data);
            preorder(root.left);
            preorder(root.right);
        }
         public static void inorder(node root) {
            if (root == null) {
                return;
            }
            inorder(root.left);
            System.out.print(root.data);
            inorder(root.right);
        }

        public static void postorder(node root) {
            if (root == null) {
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data);

        }
    }
   public static void main(String[] args) {
        int arr[] = { 1, 2, 3, -1, -1, 4, 5, -1, -1, 6, -1, -1, 6, 7, -1, -1, 8, -1, 9, -1, -1 };
        jkl s1 = new jkl();
        node root = s1.create(arr);
        s1.preorder(root);
        System.out.println("");
       s1.inorder(root);
       System.out.println("");
       s1.postorder(root);
   }
}
