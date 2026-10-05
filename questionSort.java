// public class questionSort {
//     static void sort(int arr []){
//         int n = arr.length;
//         int first_violation = -1;
//         int second_violation = -1;
//         for(int i = 1; i < n; i++){
//             if (arr[i-1]>   arr[i]){
//                 if(first_violation == -1){
//                     first_violation = i-1;
//                     second_violation = i;
//                 }else{
//                     second_violation = i;
//                 }
//             }
//         }
//         // bs yha pe aake swap kr do 
//         int temp = arr[first_violation];
//         arr[first_violation] = arr[second_violation];
//         arr[second_violation] = temp;
//     }
//     public static void main(String[] args) {
//         int [] arr = {1,2,7,4,6,3,8,9};  //{1,2,3,4,6,7,8,9} ye h answer
//         sort(arr);
//         for(int ans : arr) System.out.print(ans+" ");
//     }
// }









// -------------------------------------------------------------------------------------------------------------------
// question : 2 -


// public class questionSort{
//     static void partition(int arr []){
//         int l = 0;
//         int r = arr.length-1;
//         while(l<r){
//             while(arr[l]< 0) l++;
//             while(arr[r]> 0) r--;
//             if(l<r) {
//                 int temp = arr [l];
//                 arr [l] = arr [r];
//                 arr [r] =  temp ;
//                 l++;
//                 r--;
//             }
//         }
//     }
//     public static void main(String[] args) {
//         int [] arr = {-13,20,7,-4,-1, 11,-5,-13};
//         System.out.println("the required sorted array is: ");
//         partition(arr);
//         for( int ans : arr){
//             System.out.print(ans+" ");
//         }
//     }
// }







// ---------------------------------------------------------------------------------------------------

// question - 3




public class questionSort{
    

    static void sort(int arr []){
        int n = arr.length;
    
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr [] = {0,2,1,2,0,0};
        sort(arr);
        System.out.println("the required array is : ");
        for(int ans : arr){
            System.out.print(ans+" ");
        }
        

    }
}