// class Solution {
//     public  static Node reverseList(Node head) {
//         Node prev = null;
//         Node curr = head;

//         while (curr != null) {
//             Node nextNode = curr.next; 
//             curr.next = prev;              
//             prev = curr;                   
//             curr = nextNode;               
//         }

//         return prev; 
//     }
// }
