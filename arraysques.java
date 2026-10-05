
// class questions{


//     static void add(){

        
//         int arr[] = {4,6,3,5,8,2,1,10,11,12,13};
//         int x = 14;

//         int count = 0;
//         for (int i = 0; i < arr.length-1; i++) {
//             if (arr[0]+arr[i+1] == x) {
//                 count ++;
                
//             }
            
//         }

//         for (int i = 1; i < arr.length-1; i++) {
//             if (arr[1]+arr[i+1] == 7) {
//                 count ++;
                
//             }
            
//         }
//         for (int i = 2; i < arr.length-1; i++) {
//             if (arr[2]+arr[i+1] == 7) {
//                 count ++;
                
//             }
            
//         }
//         for (int i = 3; i < arr.length-1; i++) {
//             if (arr[3]+arr[i+1] == 7) {
//                 count ++;
                
//             }
            
//         }
//         for (int i = 4; i < arr.length-1; i++) {
//             if (arr[4]+arr[i+1] == 7) {
//                 count ++;
                
//             }
            
//         }
//         for (int i = 5; i < arr.length-1; i++) {
//             if (arr[5]+arr[i+1] == 7) {
//                 count ++;
                
//             }
            
//         }System.out.println("the count is: "+count);

//     }
// }

// public class arraysques{
//     public static void main(String[] args) {
//         questions.add();
        
//     }
// }

// import java.util.Scanner;


// class question{
    
//     public  void sum(){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter the length: ");
        
//         int n = sc.nextInt();
//         int arr [] = new int[n];
//         System.out.print("enter the elements: ");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
           
            
            
//         }
//         int target = 12;
//         int count = 0;
        
//         for (int i = 0; i < n; i++) {
//             for (int j = i+1; j < n; j++) {
//                 for (int k = j+1; k < n; k++) {
//                     if (arr[i]+arr[j]+ arr[k]== target) {
//                         System.out.println(arr[i] + " + "+ arr[j] + " + "+ arr[k]+ " == "+target);
//                         count ++;
//                 }
                    
//                 }   
//             }
            
//         }System.out.println("the count is: "+count);
//         sc.close();
//     }
// }

// public class arraysques{
//     public static void main(String[] args) {
//         question obj = new question();
//         obj.sum();
        
//     }
// }

// import java.util.Scanner;

// class question {


//     static void unique(){

//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter the number elements: ");
//         int n  = sc.nextInt();
//         int arr [] = new int[n];
//         System.out.print("enter the elements: ");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
  
//         }
        
        
//         for (int i = 0; i < n; i++) {
//             for (int j = i+1; j < n; j++) {
//                 if (arr[i] == arr[j]) {
//                     arr[i] = -1;
//                     arr[j] = -1;
                    
                  

                        
//                     } 
//                 }
                
//             }
//             int ans = -1;

//             for (int i = 0; i < n; i++) {
//                 if (arr[i] != -1) {
//                     ans = arr[i];
                    
//                 }
                
//             }System.out.println("the unique no is : "+ans);
            
//         }
        
//     }

// public class arraysques{

//     public static void main(String[] args) {
//         question.unique();
        
//     }
// }

// import java.util.Scanner;

// class Question {

//     static void secondLargest() {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the number of elements: ");
//         int n = sc.nextInt();

//         int arr[] = new int[n];

//         System.out.print("Enter the elements: ");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

        
//         int max = Integer.MIN_VALUE;   //  the largest element

//         for (int i = 0; i < n; i++) {
//             if (arr[i] > max) {
//                 max = arr[i];
//             }
//         }

        
//         int secondMax = Integer.MIN_VALUE;     //second largest element

//         for (int i = 0; i < n; i++) {
//             if (arr[i] != max && arr[i] > secondMax) {
//                 secondMax = arr[i];
//             }
//         }

//         System.out.println("Largest element = " + max);
//         System.out.println("Second largest element = " + secondMax);
//     }
// }

// public class arraysques {

//     public static void main(String[] args) {

//         Question.secondLargest();

//     }
// }

class question{

    static void first(){
        int arr [] = { 1,8,3,4,6,8,7};
        

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==arr[j]) {
                    System.out.println("the first repeated element is : "+arr[i]);
                    return;
              
               
                }
                
            }
            
        }
        System.out.println("No element is being repeated. ");
        
    }
}
public class arraysques{

    public static void main(String [] args){
        question.first();

    }
}