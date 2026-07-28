import java.util.*;
class Solution {
    public int maximumProduct(int[] arr) {
        int n=arr.length;
        Arrays.sort(arr);
        // if(arr[n-1]<0){
        //     return arr[n-1]*arr[n-2]*arr[n-3];

        // }
        if(arr[0]*arr[1] > arr[n-2]*arr[n-3] && arr[n-1]>0)
        {
            return arr[n-1]*arr[0]*arr[1];
        }

        return arr[n-1]*arr[n-2]*arr[n-3];
    }
}