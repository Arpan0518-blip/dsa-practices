// public class binarysearch {

//     static boolean search(int[] arr, int target){
//         int n = arr.length;
//         int st = 0 , end = n-1;
//         while (st<=end) {
//             int mid = (st+end)/2;

//             if(arr[mid] == target) return true;
//             else if (target> arr[mid]) st = mid+1;
//             else if (target< arr[mid]) end = mid-1;            
//         }
//         return false;
//     }
//     public static void main(String[] args) {
//         int arr [] = {1,2,3,4,5,6,8,9};
//         int target = 0;
//         while (target !=10) {
//             System.out.printf("%d exist in arr : %b \n", target, search(arr, target));
//             target++;
//         }
        
//     }
// }










// ------------------------------------------------------------------------------------------------
// - BY RECURSION SAME CODE
 
// public class binarysearch{
//     static boolean search(int[] arr, int st, int end ,int target){
//         if(st>end) return false;
//         int mid = (st+end)/2;
//         if (arr[mid] == target)  return true;
//         else if (target > arr[mid]) 
//             return search(arr, mid+1, end, target );
//         else
//             return search(arr,st, mid-1, target);
            
//     }


//     public static void main(String[] args) {
//         int arr [] = {1,2,3,4,5,6,8,9};
//         int target = 0;
//         while (target != 10) {
//             System.out.printf("%d exist in the arr : %b \n",target,search(arr, 0, arr.length-1,target));
//             target++;
            
//         }
        
        
//     }
// }






// ---------------------------------------------------------------------------------------------------------------------------
// question - find the first occurance of given target in the array : 






public class binarysearch{

    static int search(int arr[] ,int x){
        int n = arr.length;
        int st = 0, end = n-1;
        int fo = -1;
        while (st<= end) {
            int mid = st +(end-st)/2;
            if (arr[mid] == x) {
                fo = mid;
                end = mid-1;
            }else if (x < arr[mid]){
                end = mid-1;
            }else
                st = mid+1;
        }
        return  fo;
    }
    public static void main(String[] args) {
        int arr [] = {1,2,2,5,5,5,5,6,6,8,8};
        int x = 5;
        System.out.println(search(arr, x));
    }
}