class Solution {

    // Note that the size of the array is n-1
    int missingNumber(int n, int arr[]) {

        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        int sum1=0;
        for(int i=1;i<=n;i++){
            sum1+=i;
        }
        return sum1-sum;
    }
}
