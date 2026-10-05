// public class RotatedSearch {

//     static int find(int arr []){
//         int n = arr.length;
//         int st = 0, end = n-1;

//         int ans = -1;
 
//         while (st<=end) {
//             int mid = st + (end-st)/2;
//             if (arr[mid] <= arr[n-1]) {
//                 ans = mid;
//                 end = mid-1; 
//             }
//             else 
//                 st = mid+1;
            
//         }
//         return ans;
//     }
//     public static void main(String[] args) {
//         int [] arr = {10,11,12,1,2,3,4,5,6,7,8,9};
//         System.out.print("the required ans is: ");
//         System.out.println(find(arr));

//     }
// }







// ------------------------------------------------------------------------------------
//  ques - find the index of the given target ------------------------------------------------------------

public class RotatedSearch {

    static int findtarget(int arr [], int target){
        int n = arr.length;
        int st = 0, end = n-1;

        while (st<=end) {
            int mid = st + (end-st)/2;

            if (target == arr[mid]) return mid;
            else if (arr[mid]< arr[end])
                if (target > arr[mid] && target <= arr[end]) 
                    st = mid+1;
                else end = mid-1;

            else 
                if (arr[st]< arr[mid]) 
                    if (target >= arr[st] && target < arr[mid]) 
                        end = mid-1;
                    else st = mid+1;

            
        
            
        } return -1;
       
    }
    public static void main(String[] args) {
        int [] arr = {10,11,12,1,2,3,4,5,6,7,8,9};
        int target = 11;
        System.out.print("the required ans is: ");
        System.out.println(findtarget(arr, target));

    }
}
