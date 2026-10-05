// public class linkedlist{

//     public static class Node{
//         int data;
//         Node next;
//         Node(int data){
//             this.data = data;
//         }

//         }
//         public static int length(Node head){

//             int count = 0;
//             while (head!= null) {
//                 count++;
//                 head = head.next;             
//             }
//             return count;
//     }
//     public static void main(String[] args) {
//         Node a = new Node(3);
//         // System.out.println(a.next);
//         Node b = new Node(1);
//         Node c = new Node(5);
//         Node d = new Node(8);

//         a.next = b;
//         b.next = c;
//         c.next = d;
        
//         // System.out.println(a.next.data);
//        System.out.println(length(a));

        
//     }
// }






// -------------------------------------------------------------------------------------------------------------------
// ques - find the nth element from the end of the linkedlist-



// public class linkedlist{
//     public static Node nthNode(Node head,int n ){
//         int size = 0;
//         Node temp = head;
//         while(temp != null){
//             size++;
//             temp = temp.next;
//         }
//         temp = head;
//         int m = size -n +1;
//         for(int i=1; i<= m-1 ;i++){
//             temp = temp.next;
//         }
//         return temp;
//     }
//     public static class Node{
//         int data;
//         Node next;
//         Node(int data){
//             this.data = data;

//         }

//     }
//     public static void main(String[] args) {
//         Node a = new Node(10);
//         Node b = new Node(20);
//         Node c = new Node(30);
//         Node d = new Node(40);
//         Node e = new Node(50);
//         a.next = b;
//         b.next = c;
//         c.next = d;
//         d.next = e;
//         Node q = nthNode(a,3);
//         System.out.println(q.data);

//     }
// }





// --------------------------------------------------------------------------------------------------------
//  same question with better approch and single loop only 



// public class linkedlist{

//     public static void display(Node head){
//         Node temp = head;
//         while (temp != null) {
//             System.out.print(temp.data + " ");
//             temp = temp.next;   
//         }
//         System.out.println();
//     }
//     public static void deletenode(Node head, int n){
//         Node slow = head;
//         Node fast = head;
//         for(int i = 0; i <= n; i++){
//             fast = fast.next;
//         }
//         while (fast.next != null ) {
//             slow = slow.next;
//             fast = fast.next;
//         }
//         slow.next = slow.next.next;

//     }
//     public static class Node{
//         int data;
//         Node next;
//         Node(int data){
//             this.data = data;
//         }
//     }
//     public static Node nthelement(Node head, int n){
//         Node fast = head;
//         Node slow = head;
//         for(int i = 0; i<n;i++){
//             fast = fast.next;
//         }
//         while (fast != null) {
//             slow=slow.next;
//             fast = fast.next;
//         }
//         return slow;

//     }
//     public static void main(String[] args) {
//         Node a = new Node(10);
//         Node b = new Node(20);
//         Node c = new Node(30);
//         Node d = new Node(40);
//         Node e = new Node(50);
//         a.next = b;
//         b.next = c;
//         c.next = d;
//         d.next = e;
//         // Node q = nthelement(a, 2);
//         // System.out.println(q.data);
//         display(a);
//         deletenode(a, 2);
//         display(a);
        
//     }
// }












// --------------------------------------------------------------------------------


public class linkedlist{
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static void displayreverse(Node head){
        if(head == null) return;
        displayreverse(head.next);
        System.out.print(head.val+" ");
       
    }
    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(5);
        Node c = new Node(6);
        Node d = new Node(7);
        Node e = new Node(2);
        Node f = new Node(1);
        Node g = new Node(9);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = null;
        displayreverse(a);
    }
}