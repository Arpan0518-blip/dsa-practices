
//     static void swapping(int a, int b){
//         System.out.println("the value before swapping is : ");
//         System.out.println("a = "+a);
//         System.out.println("b = "+b);
//         // int temp = a ; 
//         a = a+b ; //12
//         b = a-b ; // 3
//         a = a-b; //9
//         System.out.println("the value after swapping is: ");
//         System.out.println("a = "+a);
//         System.out.println("b = "+b);
        
        

//     }
// }


// public class Swap {
//     public static void main(String[] args) {
//         question.swapping(3, 9);
        
//     }
// }



// class question {

//     static void swap(){

//         int arr [] = {1,2,3,4,5};
//         int ans[] = new int[arr.length];
       
//         int j = 0;

//         for (int i = arr.length-1 ;i >= 0; i--) {
//             ans[j] = arr[i];
//             j++;
            
                
//             }System.out.println("reversed arrays is : ");
//             for (int i = 0; i < arr.length; i++) {
//                 System.out.println(ans[i]);
                
//             }
            
//         }

//     }

// public class Swap{

//     public static void main(String[] args) {
//         question.swap();
        
//     }
// }

// import java.util.Scanner;

// class question {

//     static void rotate(int k){
//         int [] arr = { 1,2,3,4,5,6,7};
//         int [] arr_2 = new int [arr.length];
//         k = k % arr.length;
//         int j = 0;
//         for (int i = arr.length-k; i < arr.length; i++) {
//             arr_2[j] = arr[i];
//             j++;

            
//         }
//         for (int i = 0; i <= arr.length-k-1; i++) {
//             arr_2[j]=arr[i];
//             j++;
            
//         }
//         System.out.println("rotated array is: ");
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr_2[i]+ " ");

            
//         }
 

//     }
// }

// public class Swap{

//     public static void main (String [] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the value of k: ");
//         int k = sc.nextInt();
//         question.rotate(k);


//     }
// }

