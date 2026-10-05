public class mergesort {

    static void merge(int arr [] , int l , int mid,int r){

        int n1 = mid-l+1;
        int n2 = r - mid;
        int left [] = new int[n1];
        int right [] = new int[n2];

        for(int i = 0; i < n1 ; i++) left[i] = arr[l+i];
        for(int j= 0;j < n2 ; j++) right[j] = arr[mid+1+j];

        int i = 0;
        int j = 0;
        int k = l;
        while(i < n1 && j < n2){

            if(left[i]<right[j]){
                arr[k] =  left[i];
                k++;
                i++; 
            }
            else{
                arr[k] = right[j];
                k++;
                j++;
            }
        }
        while(i < n1){
             arr[k] =  left[i];
                k++;
                i++; 

        }
        while(j < n2){
            arr[k] = right [j];
            k++;
            j++; 

        }

    }
    static void sort(int arr [] , int l , int r){
        int n = arr.length;

        if(l>= r) return;

        int mid = (l+r)/2;

        sort(arr, l , mid);
        sort(arr, mid+1, r);
        merge(arr, l, mid, r);


    }
    public static void main(String[] args) {
        
        int arr [] = { 4,5,2,1,7,3,6};
        
        mergesort.sort(arr, 0, arr.length-1);
        System.out.println("Sorted array:");


        for (int ans : arr ) {

            System.out.print(ans + " ");
        }

    }
}
