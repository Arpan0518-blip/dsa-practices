import java.util.Scanner;

class question {

    static int total(int [] arr){
        int total = 0;
        for(int i = 0; i < arr.length ; i++){
            total = total + arr[i];

        }
        return total;
    }

    
    static boolean prefixsum(int [] arr ){

        int total = total(arr);
        int pref = 0;
        int suffix = total;
        

        for(int i = 0; i < arr.length ; i++){
            pref = pref + arr[i];
            suffix = total - pref;
            if(pref == suffix){
                return true;

            }
                
            }return false;
        

        }

    }


public class suffixsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of n: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.print("enter the elements: " );
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("the elements are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
            
            
        }
        System.out.println();

        int sum = question.total(arr);
        System.out.println("the total sum is : "+sum);

        boolean ans = question.prefixsum(arr);
        System.out.print("the answer is : "+ans);
    }
}
