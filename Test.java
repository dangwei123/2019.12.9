编写一个函数来查找字符串数组中的最长公共前缀。

如果不存在公共前缀，返回空字符串 ""。
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
            return "";
        }if(strs.length==1){
            return strs[0];
        }
        StringBuffer sb=new StringBuffer();
        int minlen=Integer.MAX_VALUE;
        for(String s:strs){
            minlen=Math.min(minlen,s.length());
        }
        char c=0;
        for(int i=0;i<minlen;i++){
            for(int j=1;j<strs.length;j++){
                c=strs[j].charAt(i);
                if(c!=strs[0].charAt(i)){
                    return new String(sb);
                }
            }
            sb.append(c);
        }
        return new String(sb);
    }
}


给你一个整数 n，请你帮忙计算并返回该整数「各位数字之积」与「各位数字之和」的差。

 class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int sub=1;
        while(n!=0){
            sum+=n%10;
            sub*=n%10;
            n/=10;
        }
        return sub-sum;
    }
}

