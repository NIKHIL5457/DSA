class Solution{
    static int heapHeight(int N, int arr[]){
        // code here
        if(N==1){
            return 1;
        }
        int count=0;
        do{
            N=N/2;
            count++;
        }while(N!=1);
        
        return count;
    }
}
