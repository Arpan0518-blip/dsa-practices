public class quicksort {

    
    static int partition(int arr [], int st, int end ){
        int pivot = arr[st];
        int cnt = 0;

        // yha bs -- Count elements smaller than or equal to pivot
        for(int i = st+1; i <= end; i++){
            
            if(arr[i] <= pivot){

                cnt++;
            }
        }       
        
        // yha pivot ki  correct position pta chli ..jitne chote the uske bad pivot ayega , swap kr denge 
            int pivotIdx = st + cnt;
            swap(arr, st, pivotIdx);
            int i = st , j = end ;
            while(i <= pivotIdx && j >= pivotIdx){
                while(arr[i]< pivot) i++;
                while(arr[j]> pivot) j--;

                if(i <= pivotIdx && j >= pivotIdx){
                    swap(arr, i, j);
                    i++;
                    j--;
                }
            }
            return pivotIdx;
    }
    static void sort (int [] arr , int st , int end){
        if(st >= end ) return;

            int pi = partition(arr, st, end);
            sort(arr, st ,pi-1);
            sort(arr, pi+1 ,end);
    }
    static void swap(int arr [], int x , int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    public static void main(String[] args) {
        int arr [] = { 7,13,8,5,10,2,4};
        sort(arr, 0, arr.length - 1);
        System.out.println("the required sorted array is : ");
        for(int ans : arr){
            System.out.print(ans+" ");
        }

    }
}
