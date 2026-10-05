public class insertionsort {

    static void sort (int [] arr, int n){
        for(int i = 1; i <n;i++){
            for(int j = i; j > 0 ;j--){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp ;

                }

            }
        }
    }
    public static void main(String [] args){
        int [] arr = {9,6,4,8,7,5};
        insertionsort.sort(arr, arr.length);
        System.out.print("the sorted array is : ");
        for(int i = 0; i <arr.length;i++){
            System.out.print(arr[i]+" ");

        }

    }

    
}
