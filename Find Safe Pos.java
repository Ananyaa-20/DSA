class Solution {
    static int safePos(int n, int k) {
        // code 
        return jos(n, k)+1;
    }
    static int jos(int n, int k){
        if(n==0) return 0;
        else return (jos(n-1, k)+k)%n;
    }
};
