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





// ------------------------------------------------------------------------------------------------------
//  insertion in stack / at any index

import java.util.Stack;

public class stack{
    public static void main(String[] args) {
        Stack <Integer> st = new Stack <>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(5);
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
        
        System.out.println(st);
        
        
    }
}
