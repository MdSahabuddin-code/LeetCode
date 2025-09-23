import java.util.*;
class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;
        int n=x,rev=0;
        while (n!=0){
            int temp=n%10;
            rev=rev*10+temp;
            n=n/10;
        }
        if(rev==x)
            return true;
        else 
            return false;
    }
    public static void main(String args[]){
        int num;
        Scanner sc=new Scanner (System.in);
        num=sc.nextInt();
        Solution ob=new Solution();
        boolean result;
        result=ob.isPalindrome(num);
        System.out.println(result);
    }
}