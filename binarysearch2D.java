// public class binarysearch2D {
//     static  boolean findtarget(int arr[][], int target){

//         int n = arr.length , m = arr[0].length;
//         int st = 0 , end = n*m -1;

//         while (st<=end) {
//             int mid = st+(end-st)/2;
//             int mididx = arr[mid/m][mid%m];

//             if (mididx == target) return true;
//             else if (mididx>target) end = mid-1;
//             else st = mid+1;
//         }
//         return false;
//     }
//     public static void main(String[] args) {
//         int arr[][] = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
//         int target = 6;
//         System.out.println(findtarget(arr, target));
//     }
    
// }







// -----------------------------------------------------------
// ques - peak mountain array 





// public class binarysearch2D {

//     static int peakmountain(int arr []){

//         int st = 0, end = arr.length-1;
//         int ans = -1;
//         while (st<=end) {
//             int mid = st +(end-st)/2;
//             if (arr[mid] < arr[mid+1]) st = mid+1;
//             else 
//                 end = mid-1;       
//         }
//         return st;

//     }
//     public static void main(String[] args) {
//         int arr [] = {1,2,3,8,9,3,2,1};
//         System.out.println(peakmountain(arr));
//     }
// }


















// ------------------------------------------------------------------------------
// ques : find the peak element which is greater then both of its neighbouring element 





public class binarysearch2D {

    static int peakmountain(int arr []){
        int st = 0, end = arr.length-1;
        while (st<=end) {
            int mid = st +(end-st)/2;
            if (arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1] ) return mid;
            else if (arr[mid] < arr[mid + 1]) 
                st = mid + 1;
            else 
                end = mid - 1;  
        }    
        return -1; 
    }
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,1};
        System.out.print("the required highest element is at index : ");
        System.out.println(peakmountain(arr));
    }
}