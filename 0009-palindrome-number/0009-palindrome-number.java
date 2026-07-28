class Solution {
    public boolean isPalindrome(int x) {
        int reverse_no=0;
        int dup=x;
        while(x>0){
            int lastdigit = x % 10;
          reverse_no = (reverse_no * 10) + lastdigit;
            x = x / 10;
           
        }
       if(dup==reverse_no){
       return true;
       } else{
        return false;
       }
       
    
}
}
    