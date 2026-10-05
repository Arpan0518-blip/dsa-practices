// import java.util.Scanner;

// class question{

//     static int Sumof(int [][] arr, int l1, int l2, int r1, int r2){
//         int sum = 0;
//         for(int i = l1; i <=r1; i++){
//             for(int j = l2; j <=r2; j++){
//                 sum = sum + arr[i][j];
//             }
//         }
//         return sum;
        
//     }
// }

// public class rectanglesum {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the value of r and c: ");
//         int r = sc.nextInt();
//         int c = sc.nextInt();

//         int [] [] arr = new int[r][c];
//         System.out.println("enter the elements of matrix: ");
//         for (int i = 0; i < r; i++) {
//             for (int j = 0; j < c; j++) {
//                 arr[i][j] =  sc.nextInt();
                
//             }
            
//         }

//         System.out.println("enter the value of l1: ");
//         int l1 = sc.nextInt();
//         System.out.println("enter the value of r1: ");
//         int r1 = sc.nextInt();
//         System.out.println("enter the value of l2: ");
//         int l2 = sc.nextInt();
//         System.out.println("enter the value of r2: ");
//         int r2 = sc.nextInt();

//         int ans = question.Sumof(arr, l1, l2, r1, r2);

//         System.out.println("Rectangle Sum = " + ans);
//     }
// }




import java.util.Scanner;

class question{

    static int Sumof(int [][] arr, int l1, int l2, int r1, int r2){
        int sum = 0;
        for(int i = l1; i <=r1; i++){
            for(int j = l2; j <=r2; j++){
                sum = sum + arr[i][j];
            }
        }
        return sum;     
    }

    static void prefix(int [][] arr){
        int r = arr.length;
        int c = arr[0].length;
        for(int i = 0; i < r ; i++){
            for(int j = 1; j < c ; j++){
                arr[i][j] = arr[i][j] + arr[i][j-1];
                
            }
            
        }
        System.out.println("the required prefix array is: ");
        for(int i = 0; i < r ; i++){
            for(int j = 0; j < c ; j++){
                System.out.print(arr[i][j]+" ");
                
            }
            System.out.println();
            
        }


    }

    static int Sumof2(int [][] arr, int l1, int l2, int r1, int r2){
        prefix(arr);
        int ans = 0;
        for(int i = l1 ; i <= l1 ; i++){
            if(r1>=1)
                ans += arr[i][r2] + arr[i][r1-1];
            else
                ans += arr[i][r2];
            }
            return ans;
        

    }
}

public class rectanglesum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of r and c: ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int [] [] arr = new int[r][c];
        System.out.println("enter the elements of matrix: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] =  sc.nextInt();
                
            }
            
        }

        System.out.println("enter the value of l1: ");
        int l1 = sc.nextInt();
        System.out.println("enter the value of r1: ");
        int r1 = sc.nextInt();
        System.out.println("enter the value of l2: ");
        int l2 = sc.nextInt();
        System.out.println("enter the value of r2: ");
        int r2 = sc.nextInt();

        int ans = question.Sumof(arr, l1, l2, r1, r2);

        System.out.println("Rectangle Sum = " + ans);

        int ans2 = question.Sumof2(arr, l1, l2, r1, r2);

        System.out.println("Rectangle Sum = " + ans2);
    }
}


