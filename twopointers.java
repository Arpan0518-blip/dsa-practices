
import java.util.Scanner;


// import java.util.Scanner;
// class array{

//     public void pointers(){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter the number of elements you want in the array: ");
//         int n = sc.nextInt();
//         int arr [] = new int[n];

//         System.out.print("enter those  elements: ");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
           
//         }
//         int count = 0;
//         for (int i = 0; i < n; i++) {
//             if (arr[i] == 0) {
//                 count++;
                
//             }  
//         }
//         for(int i = 0; i < n; i++){
//             if(i<=count-1){
//                 arr[i] = 0;

//             }else{
//                 arr[i] = 1;
//             }
//             System.out.print(arr[i]+" ");
//         }
//     }
// }
// public class twopointers {
//     public static void main(String[] args) {
//         array obj = new array();
//         obj.pointers();
//     }
    
// }


// import java.util.Scanner;
// class array{

//     static void swap(int arr[], int i, int j) {
//         int temp = arr[i];
//         arr[i] = arr[j];
//         arr[j] = temp;
//     }

//     public void pointers(){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter the number of elements you want in the array: ");
//         int n = sc.nextInt();
//         int arr [] = new int[n];

//         System.out.print("enter those  elements: ");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
           
//         }
        
//         int left = 0;
//         int right = n-1;

//         while (left<right) {
//             if (arr[left] == 1 && arr[right] == 0) {
//                 swap(arr, left,right);
//                 left++ ;
//                 right -- ;

//                 if (arr[left] == 0) 
//                     left++;
                    
//                 if (arr[right] == 1) 
//                     right--;        
//             }
      
//             }
//             System.out.print("the required array is: ");
//             for (int i = 0; i < n; i++) {
                
//                 System.out.print(arr[i]+ " ");  
//             }
            
//         }
       
//     }

// public class twopointers {
//     public static void main(String[] args) {
//         array obj = new array();
//         obj.pointers();
//     }
    
// }

// import java.util.Scanner;

// class question {

//     static void swap(int arr[], int i , int j){

//         int temp = arr[i];
//         arr[i] = arr[j];
//         arr[j]= temp;
//     }

//     public void pointers(){

//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the number of elements: ");
//         int n = sc.nextInt();
//         int [] arr = new int[n];

//         System.out.println("enter the elements in the arary : ");

//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
//         System.out.println("the elements in the array are : ");
//         for (int i = 0; i < n; i++) {
//             System.out.println(arr[i]+" ");
//         }

//         int left = 0;
//         int right = n-1;

//         while (left<right ) {
//             if (arr[left] %2 != 0  && arr[right] %2 ==0 ) {
//                 swap(arr,left,right);
//                 left ++;
//                 right --;
                
//             }

//             if (arr[left] %2 == 0 ) {
//                 left++;
                
//             }

//             if (arr[right] %2 != 0 ) {
//                 right--;
                
//             }
            
//         }
//         System.out.println("the sorted array is : ");

//         for (int i = 0; i < n; i++) {
//             System.out.print(arr[i]+" ");
            
//         }
//     }
// }

// public class twopointers{

//     public static void main(String[] args) {
//         question obj = new question();

//         obj.pointers();
        

//     }
// }



// class question{


//     public  void sort(){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter the number of elements: ");
//         int n = sc.nextInt();
//         int [] arr = new int[n];

//         System.out.print("enter those elements: ");

//         for (int i = 0; i < n; i++) {
//             arr[i]= sc.nextInt();

            
//         }
//         System.out.print("the array is : ");

        
//         for (int i = 0; i < n; i++) {
//             System.out.print(arr[i]+" ");

//     }
//     System.out.println();


//     int ans [] = new int[n] ;
//     int k = 0;

//     int left = 0;
//     int right = n-1;

//     while (left<=right) {

//         if (Math.abs(arr[left])> Math.abs(arr[right])) {
//             ans [k] = arr[left]*arr[left];
//             left++;
            
//         }else{
//             ans [k] = arr[right]*arr[right];
//             right--;


//         }   

//         k++; 

        
//         System.out.print(ans[k]+" "); 
        
//     }

// }
// }

// public class twopointers{
//     public static void main(String[] args) {
//         question obj = new question();
//         obj.sort();
        
//     }
// }



