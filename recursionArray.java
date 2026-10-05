// public class recursionArray {

//     static void Arrayrecursion(int [] arr, int index){
       
//         if(index == arr.length) return;

//         System.out.println(arr[index]);
//         Arrayrecursion(arr, index+1);

//     }
//     public static void main(String[] args) {
//         int n = 5;
//         int [] arr = {5,6,7,8,9};
//         recursionArray.Arrayrecursion(arr, 0);

//     }
// }






//ques ------------------------------------------------------------------------------------------------


// public class recursionArray {

//     static int  maxinArray(int [] arr, int index){
       
//         if(index == arr.length-1) return arr[index];

//        int smallprob = maxinArray(arr, index+1);
//        int ans = Math.max(smallprob, arr[index]);
//        return ans;


//     }
//     public static void main(String[] args) {
       
//         int [] arr = {3,10,13,200,20};
//         System.out.println("the max value in the array is : "+ recursionArray.maxinArray(arr, 0));

//     }
// }






//ques ------------------------------------------------------------------------------------------------


// public class recursionArray {

//     static int  sum(int [] arr, int index){
       
//         if(index == arr.length) return 0;

//        int smallprob = sum(arr, index+1);
      
//        return smallprob + arr[index];


//     }
//     public static void main(String[] args) {
       
//         int [] arr = {30,20,130,201,20};
//         System.out.println("the max value in the array is : "+ recursionArray.sum(arr, 0));

//     }
// }






//ques ------------------------------------------------------------------------------------------------


// public class recursionArray {

//     static boolean search(int [] arr, int target,int idx){
//         if(idx >= arr.length)    return false;       // base case h ye
        
//         if(arr[idx] == target)    return true;      // ye self work kiye h 
            
//         // if(search(arr, target, idx+1))   return true;    //yha recursive work
            
//         // else   return false;
//         return search(arr, target, idx+1);

//     }
//     public static void main(String[] args) {
//         int [] arr = { 2,4,6,24,78,9};
//         int target = 23;

//     //    if(search(arr, target, 0)){
//     //     System.out.println("Yes found");

//     //    }else{
//     //     System.out.println("Not Found");
//     //    } 

//     System.out.println(recursionArray.search(arr, target, 0));

//     }

// }







//ques ------------------------------------------------------------------------------------------------


public class recursionArray{
    static int checkindex(int []arr,int x,int index){
        if(index >= arr.length){
            return -1 ;
        }
       if(arr[index] == x) System.out.println(index);
       return (checkindex(arr, x, index+1)) ; 
       

    }
    public static void main(String[] args){

        int [] arr = {1,3,2,4,2,5,6,2};
        int x = 2;
       System.out.println( recursionArray.checkindex(arr, x, 0));

    }
}