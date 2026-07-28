class Solution {
    public int reverse(int x) {
        int reverse_no = 0;
        
        while (x != 0) {
            int lastdigit = x % 10;
            
            // 1. Calculate the new reversed number temporarily
            int new_reverse = (reverse_no * 10) + lastdigit;
            
            // 2. Undo the math to check if it broke (Overflow Check)
            if ((new_reverse - lastdigit) / 10 != reverse_no) {
                return 0; // The math broke, meaning it overflowed!
            }
            
            // 3. If it didn't break, make it official and move to the next digit
            reverse_no = new_reverse;
            x = x / 10;
        }
        
        return reverse_no;
    }
}