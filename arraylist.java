


// import java.util.ArrayList;

// public class arraylist {
//     public static void main(String[] args) {
//         Integer a = 10;
//         System.out.println(a);

//         Float b = 2.0f;
//         System.out.println(b);

//         ArrayList<Integer> n1 = new ArrayList<>();

//         n1.add(5);
//         n1.add(6);
//         n1.add(7);
//         n1.add(8);

//         System.out.println(n1);

//         for(int i = 0; i < n1.size();i++){
//             System.out.println(n1.get(i));


//         }
//         System.out.println(n1);

//         n1.add(1,100);
//         System.out.println(n1);

//         n1.set(1, 10);
//         System.out.println(n1);

//         n1.remove(1);
//         System.out.println(n1);

//         n1.remove(Integer.valueOf(7));
//         System.out.println(n1);

//         Boolean ans = n1.contains(Integer.valueOf(60));
//         System.out.println(ans);

//         ArrayList  n = new ArrayList();


//         n.add(1);
//         n.add(true);
//         n.add("abc");
//         System.out.println(n);

//     }
// }

// import java.util.ArrayList;
// import java.util.Collections;


// class question{

//     static void reverse(ArrayList<Integer> n){
//         int i = 0 , j = n.size()-1;
//         while(i<j){
//             Integer temp = Integer.valueOf(n.get(i));
//             n.set(i, n.get(j));
//             n.set(j, temp);
//             i++;
//             j--;

//         }
        
//     }
// }

// public class arraylist{

//     public static void main(String[] args) {
//         ArrayList<Integer> n = new ArrayList<>();
//         n.add(0);
//         n.add(10);
//         n.add(3);
//         n.add(5);
//         n.add(22);
//         n.add(10);
//         System.out.println("before reverse : " + n);
       
//         // question.reverse(n);
        
//         Collections.reverse(n);
//         System.out.println("after reverse : "+n);
//     }
// }



import java.util.ArrayList;

import java.util.Collections;

public class arraylist{



    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(2);
        list.add(5);
        list.add(1);
        list.add(3);

        System.out.println("original list : " + list);
        Collections.reverse(list);
        System.out.println("reverse list is : " + list);
        Collections.sort(list); 
        System.out.println("ascending order list : "+list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("descending order list : "+list);

    
        

    }
}
