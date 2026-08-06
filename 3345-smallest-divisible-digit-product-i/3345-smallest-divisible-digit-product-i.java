class Solution {
    public int smallestNumber(int n, int t) {
        for(int i=n;i<n+10;i++){
            int prod=1;
            int num=i;
            while(num>0){
                int digit=num%10;
                prod=digit*prod;
                num=num/10;
            }
            if(prod%t==0){
                return i;
            }
        }
        return -1;
    }
}