// import java.util.Scanner;
// class question{


    

//     public void prefix(){


//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter the number of elements: ");
//         int n = sc.nextInt();
//         int [] arr = new int[n];

//         System.out.print("enter the elements: ");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
           

            
//         }
//         int [] pref = new int[n];

//         pref[0] = arr[0];
//         System.out.println("the result is : ");

//         for (int i = 1; i < n; i++) {
//             pref[i] = pref[i-1] + arr[i];
            
//         }
//         for (int i = 0; i <= n-1; i++) {
//             System.out.print(pref[i]+" ");
            
//         }
        

//     }
// }

// public class prefixsum {
//     public static void main(String[] args) {
//         question obj = new question();
//         obj.prefix();
        
//     }
// }

import java.util.Scanner;

class question {

    public void prefix() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("The elements are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        
        int[] pref = new int[n + 1];

        pref[0] = 0;

        
        for (int i = 1; i <= n; i++) {
            pref[i] = pref[i - 1] + arr[i - 1];
        }

        System.out.print("Prefix array: ");
        for (int i = 0; i <= n; i++) {
            System.out.print(pref[i] + " ");
        }

        System.out.println();

        System.out.println("Enter range:");
        System.out.print("Enter value of l: ");
        int l = sc.nextInt();

        System.out.print("Enter value of r: ");
        int r = sc.nextInt();

        
        int ans = pref[r] - pref[l - 1];

        System.out.println("Sum = " + ans);
    }
}

public class prefixsum {

    public static void main(String[] args) {
        question obj = new question();
        obj.prefix();
    }
}