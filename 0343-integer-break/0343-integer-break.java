class Solution {
    public int integerBreak(int n) {
        int[] dp=new int[n+1];
        dp[1]=1;
        return integerBreakRec(n,n,dp);
        
    }
    
     public static int integerBreakRec(int n,int num,int[] dp) {
        if(dp[n]!=0)
            return dp[n];
        if(num==n)
            dp[n]=0;
         else{
             dp[n]=n;
         }
       
        for(int i=1;2*i<=n;i++)
        {
          int value=integerBreakRec(i,num,dp)*integerBreakRec(n-i,num,dp);
          dp[n]=Math.max(dp[n],value);  
        }
        return dp[n];
    }
}