

// class Arrayseg{

//     static void demo(){
//         int ages [] = new int[300];
//         ages[0]= 5;
//         ages[1]= 4;
//         ages[2]= 8;
//         ages[2]= 87;
        
        

        
//         System.out.println("the required age is: "+ages[5]);

//     }
// }

// public class arrays{
//     public static void main(String[] args) {
       
//         Arrayseg.demo();
        
       
       
       

        

        
//     }
// }


// class Arrayseg{

//     static void demo(){
//         int ages [] = new int[11];
//         for (int i = 0; i <= 11; i++) {
//             System.out.println(i);
            
//         }

//     }
// }

// public class arrays{
//     public static void main(String[] args) {
       
//         Arrayseg.demo();
        
       
       
       

        

        
//     }
// }

// class sumArrays{

//     static void sumarray(){
        
//         int[] arr = {1,5,3};
//         int sum = 0;
        
//         for (int i = 0; i < arr.length; i++) {
//             sum = sum + arr[i];
            
            
//         }
//         System.out.println("the required value of sum is : "+sum);
       
       

//     }
    
// }
// public class arrays{

//     public static void main(String[] args) {

//         sumArrays.sumarray();

        
//     }
// }






// class Array{

//     static void largest(){

//         int arr []= {1,5,7,3,8,9,6,3};
//         int ans = 0;

//     for(int i = 0; i < arr.length; i++){
//         if (arr[i]> ans ) {
//             ans = arr[i];
            
//         }
       


//     }
//      System.out.println("the largest number in the array is: "+ans);
        
//     }

   
// }
// public class arrays{
//     public static void main(String[] args) {
//         Array.largest();

        
//     }
// }

// class Array{

//     static void find(){
//         int arr [] = {1,3,5,7,9};
//         int x = 4;
//         int ans = -1;
        
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == x) {
//                 ans= i;   
//                 break;          
//             }           
//         }
//         System.out.println("the required no: "+x+ " is found at index: "+ans);


//     }
// }
// public class arrays{

//     public static void main(String[] args) {

//         Array.find();
        
//     }
// }

// import java.util.Scanner;

// public class arrays{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter the size of elements: ");
//         int n = sc.nextInt();
//         int [] arr = new int [n];

//         System.out.print("enter the elemets: ");

//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = sc.nextInt();

            
//         }
//         for (int i = 0; i < n; i++) {
//             System.out.println(arr[i] + " ");
            
//         }

//     }
// }


// public class arrays{
//     public static void main(String[] args) {
//         int arr [] = {1,2,3,4,5};
//         int[] copy =  arr.clone();
        
//         System.out.println("enter the orginal number: ");

//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] +" ");

            
//         }
//         System.out.println("enter the copy number: ");
//         for (int i = 0; i < copy.length; i++) {
//             System.out.print(copy[i]+" ");
            
//         }
//     }
// }
// class occurance{


//     void count(){
//         int [] arr = {1,5,3,4,5,6,5,7};
//         int x = 5;
//         int count = 0;

//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == x) {
//                 count ++;
             
              
                
                

                
//             }
            
            
            
//         }

//         System.out.println(x + " occurs " + count + " times.");
        
       





        

//     }


// }
// public class arrays{
//     public static void main(String[] args) {
//         occurance obj = new occurance();
//         obj.count();

        
//     }

    
// }

// class occurance{


//     void count(){
//         int [] arr = {1,5,3,4,5,6,5,7,5};
//         int x = 5;
//         int lastcount = 0;

//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == x) {
//                 lastcount = i;
                
//             }   
//         }
        
//         System.out.println(x + " occurs at last on " + lastcount + " index .");  
//     }
// }
// public class arrays{
//     public static void main(String[] args) {
//         occurance obj = new occurance();
//         obj.count();  
//     }   
// }


// class greater{


//     void countofno(){
//         int [] arr = {1,2,3,4,5,6,8,7,9};
//         int x = 2;
//         int count = 0;

//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] > x) {
//                 count ++;
                
//             }   
//         }
        
//         System.out.println("the numbers which are greater than "+x+ " is "+count);  
//     }
// }
// public class arrays{
//     public static void main(String[] args) {
//         greater obj = new greater();
//         obj.countofno();  
//     }   
// }




// class Array{

//     static void Arraysorted(){

//         int arr [] = {1,2,4,9,5,7};
//         boolean sorted = true;
        
        
//         for (int i = 1; i < arr.length; i++) {
//             if (arr[i]<arr[i-1]) {
//                 sorted = false;
//                 break;
              
//             }
                
//             }
//             System.out.println("the given element is: "+sorted);
            
            

            
  
//         }
        
        

//     }

// public class arrays{
//     public static void main(String[] args) {
//         Array.Arraysorted();
        
//     }
// }






// import java.util.Arrays;

// class question{

//     static void sort(){
//         int arr[] = {2,4,3,1,8,5,7,6};
//         Arrays.sort(arr);

//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i]+" ");
            
//         }

//     }
// }

// public class arrays{


//     public static void main(String[] args) {
//         question.sort();
        
//     }
// }
import java.util.Arrays;

class question{

    static void smallestlargest(){

        int [] arr = {1,2,3,4,6,7,9};
        Arrays.sort(arr);

        int smallest = arr[0];
        int largest = arr[arr.length-1];

    
        System.out.println("smallest: A"+smallest);
        System.out.println("largest: "+largest);

    }

}
public class arrays{

    public static void main(String[] args) {
        question.smallestlargest();
        
    }
}