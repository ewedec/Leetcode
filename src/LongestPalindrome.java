public class LongestPalindrome {
    public int getLongestPalindrome(String A, int n) {
        // write code here
        boolean[][] dp = new boolean[n][n];
        int max =0;
        for (int d=0; d<n;d++){
            for (int i= 0; i<n-d;i++){
                int j =i+d;
                if(A.charAt(i) == A.charAt(j)) {
                    if (d==0 ||d==1){
                        dp[i][j] =true;
                    }else {
                        dp[i][j]= dp[i+1][j-1];
                    }
                    if (dp[i][j]){
                        max = Math.max(max ,d+1);
                    }
                }
            }
        }
        return max;
    }
}
