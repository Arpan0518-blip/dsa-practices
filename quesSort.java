// public class quesSort {
//     static void sort(int [] arr , int n){
//         for(int i = 0; i < n-1;i++){
//             for(int j = 0; j < n-i-1;j++){
//                 if(arr[j] == 0 && arr[j+1] != 0 ){
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                 }

//             }
//         }
//     }
//     public static void main(String[] args) {
//         int arr [] = {0,5,0,3,42};
//         quesSort.sort(arr, arr.length);
//         System.out.print("the sorted array is : " );
//         for(int ans : arr){
//             System.out.print(ans +" ");

//         }
//     }
// }





//------------------------------------------------------------------------------------------
// LEXICOGRAPHY - means arrangement of string accoring to alphabhets letter in increasing way.


public class quesSort{

    static void sort(String[] fruits){        
        int n = fruits.length;
        for(int i = 0 ; i < n-1 ; i++){
            int min_idx = i;
            for(int j = i+1 ; j < n ; j++){
                if(fruits[j].compareTo(fruits[min_idx])< 0){
                    min_idx = j;
                }
            }
            String temp = fruits[i];
            fruits[i] = fruits[min_idx];
            fruits[min_idx] = temp;
        }
    }
    public static void main(String[] args){

        String [] fruits = {"papaya","lime", "watermelon", "apple", "mango","kiwi"};
        quesSort.sort(fruits);
        System.out.println("the sorted string according to lexicography is : ");
        for(String ans : fruits){
            System.out.print(ans+" ");

        }
    }

}



