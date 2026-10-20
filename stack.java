// import java.util.Stack;

// public class stack{
//     public static void main(String[] args) {
//         Stack <Integer> st = new Stack <>();

//         st.push(1);
//         st.push(2);
//         st.push(3);
//         st.push(5);
//         System.out.println(st);

//         Stack <Integer> reverse = new Stack<>();
//         while (st.size()>0) {
//             int x = st.peek();
//             reverse.push(x);
//             st.pop();
//         }
//         Stack <Integer> ans = new Stack<>();
//         while (reverse.size()>0) {
//             ans.push(reverse.pop());
            
//         }
//         System.out.println(ans);
        
//     }
// }





// // ------------------------------------------------------------------------------------------------------
// //  insertion in stack / at any index

import java.util.Stack;

public class stack{
    public static void main(String[] args) {
        Stack <Integer> st = new Stack <>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(5);
        st.push(6);
        System.out.println(st);
        int idx = 2;


        Stack <Integer> copy = new Stack<>();
        while (st.size()>idx) {
            copy.push(st.pop());
        }
        st.push(7);
        while (copy.size()>0) {
            st.push(copy.pop());
        }
        System.out.println();
        
        System.out.println(st);
        
        
    }
}





// // ------------------------------------------------------------------------------------------------------
// Question - balance bracket question 

// import java.util.Scanner;
// import java.util.Stack;

// public class stack{

//     public static boolean isBalanced(String str){
//         Stack<Character> st = new Stack <>();
//         int n = str.length();
//         for(int i = 0; i < n ; i++){
//             char ch = str.charAt(i);
//             if (ch == '(') {
//                 st.push(ch);
//             }
//             else{
//                 if(st.size()==0)
//                     return false;
//                 if(st.peek() == '(') st.pop();
//             }
//         }
//         if(st.size()>0)

//             return false;
//         else 
//             return true;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         System.out.println("enter the required string: ");
//         System.out.println("enter the required string: ");
//         String str = sc.nextLine();
//         System.out.println("the required ans : ");
//         System.out.println(isBalanced(str));
//     }
// }