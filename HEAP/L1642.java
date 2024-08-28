class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> s=new PriorityQueue<>();
        for(int i=1;i<heights.length;i++){
            int diff=heights[i]-heights[i-1];
            if(diff>0){
                if(s.size()<ladders){
                    s.add(diff)
                }
                else{
                    int br=diff;
                    if(s.size()>0 && s.peek()<diff){
                        br=s.remove();
                        s.add(diff);
                    }
                    if(bricks-br>=0){
                        bricks-=br;
                    }else{
                        return i-1;
                    }
                }
            }
        }
        return heights.length-1;
    }
}
