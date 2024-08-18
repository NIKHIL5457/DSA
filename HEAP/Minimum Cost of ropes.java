class Solution
{
    //Function to return the minimum cost of connecting the ropes.
    long minCost(long arr[], int n) 
    {
        PriorityQueue<Long> s=new PriorityQueue<>();
        for(int i=0;i<n;i++){
            s.add(arr[i]);
        }
        long totalsum=0;
        while(!s.isEmpty()){
            if(s.size()==1){
                break;
            }
            long t1=s.remove();
            long t2=s.remove();
            long t=t1+t2;
            s.add(t);
            totalsum+=t;
        }
        return totalsum;
    }
}
