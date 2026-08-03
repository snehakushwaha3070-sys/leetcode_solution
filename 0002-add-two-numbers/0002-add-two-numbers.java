class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Dummy head to simplify the result list creation
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carry = 0;

        // Traverse both lists until both are null and there is no carry left
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;
            
            // Add l1's value if available, then move to the next node
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            
            // Add l2's value if available, then move to the next node
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            
            // Calculate the new carry for the next position
            carry = sum / 10;
            
            // Create a new node with the digit part of the sum
            current.next = new ListNode(sum % 10);
            
            // Move the current pointer forward
            current = current.next;
        }

        // Return the actual head of the result list
        return dummyHead.next;
    }
}