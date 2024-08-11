import java.util.*;

public class basicpro2 {
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

    static class pair {
        int hd;
        node nod;

        public pair(int hd, node nod) {
            this.hd = hd;
            this.nod = nod;
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

        public static void topview(node root) {
            if (root == null) {
                return;
            }
            Map<Integer, Integer> map = new TreeMap<>();
            Queue<pair> q = new LinkedList<>();
            q.add(new pair(0, root));
            while (!q.isEmpty()) {
                pair curr = q.remove();
                 if (!map.containsKey(curr.hd)) {
                 map.put(curr.hd, curr.nod.data);
                }

                if (curr.nod.left != null) {
                    q.add(new pair(curr.hd - 1, curr.nod.left));
                }
                if (curr.nod.right != null) {
                    q.add(new pair(curr.hd + 1, curr.nod.right));
                }

            }
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                System.out.print(entry.getValue() + " ");
            }
        }

    }

    public static void main(String[] args) {
        jkl s1 = new jkl();
        int arr1[] = { 6, 2, -1, 3, -1, 4, -1, -1, 1, -1, 5, -1, -1 };
        node root1 = s1.create(arr1);
        s1.topview(root1);
    }
}
