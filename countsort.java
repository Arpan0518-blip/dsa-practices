public class countsort {

    static int findmax(int [] arr){
        int mx = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i]> mx){
                mx = arr[i];
            }

        }
        return mx;
    }

    static void sort (int []arr){
        //to find the laegest element in the array 
        int max = findmax(arr);
        int count [] =  new int[max+1];
        for(int i = 0; i < arr.length; i++){
            count[arr[i]]++;
        }
        
        int k = 0;
        for(int i = 0; i < count.length; i++){
            for(int j = 0; j < count[i]; j++){
                arr[k] = i;
                k++;
            }

        }


        
    }question

    public static void main(String[] args) {
        int arr [] = {1,4,2,5,2,3,5,4,1};
        countsort.sort(arr);
        System.out.println("the required count sorted array is ");
        for(int ans : arr){
            System.out.print(ans+" ");
        }

    }
}
