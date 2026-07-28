class Solution {
    public int maxProduct(int n) {
        int fm=0;
        int sm=0;
        while(n!=0){
            int r=n%10;
            n=n/10;

            if(r>fm){
                sm=fm;
                fm=r; 
            }
            else if(r>sm){
                sm=r;
            }
        }
        return fm*sm;
    }
}