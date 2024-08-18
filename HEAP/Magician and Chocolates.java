import java.util.Collections;
import java.util.PriorityQueue;

public class Solution {
    public int nchoc(int A, int[] B) {
      
        PriorityQueue<Integer> s1 = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < B.length; i++) {
            s1.add(B[i]);
        }
        int totalTime = 0;
        for (int i = 0; i < A; i++) {
            int curr = s1.poll(); 
            totalTime += curr;
            int half = curr / 2;
            s1.add(half);
        }
        return totalTime;
    }
}
