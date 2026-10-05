// public class twoDarray {
//     public static void main(String[] args){
//         int arr[][] = { {1,2,3} , {4,5,6} , {7,8,9} };
//         for(int i = 0; i<arr.length; i++){
//             for(int j = 0; j<arr.length; j++){
//                 System.out.print(arr[i][j]+" ");
//             }System.out.println();
            
//         }





//     }
// }

// import java.util.Scanner;

// class question {

//     static void addition(int [][] a, int r1, int c1,int [][] b, int r2, int c2 ){
//         if(r1 != r2 || c1 != c2){
//             System.out.print("wrong input - Addition not possible. ");
//             return;
//         }
//         int [][] sum = new int[r1][c1];
//         for(int i = 0; i< r1; i++){
//             for(int j = 0; j< c1; j++){
//                 sum[i][j] = a[i][j]+b[i][j];

//             }
//         }
//         System.out.println("the requires sum matrix is : ");

//         for(int i = 0; i< r1; i++){
//             for(int j = 0; j< c1; j++){

//                 System.out.print(sum[i][j]+" ");  
//     }
//     System.out.println(" ");
    
// }
//     }
// }


// public class twoDarray {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter the value of r: ");
//         int r = sc.nextInt();
//         System.out.print("enter the value of c: ");
//         int c = sc.nextInt();
//         int [][] arr = new int[r][c];
//         System.out.println("enter the elements of 1st matrix "+ r*c + " elements: ");
//         for(int i = 0; i<r; i++){
//             for(int j = 0; j<c; j++){
//                 arr[i][j] = sc.nextInt();
//         } 
         
//             }
//             int [][] arr2 = new int[r][c];

//             System.out.println("enter the elements of 2nd matrix "+ r*c + " elements: ");

//             for(int i = 0; i<r; i++){

//                 for(int j = 0; j<c; j++){
//                 arr2[i][j] = sc.nextInt();
//         } 
         
//             }

//             question.addition(arr, r, c, arr2, r, c);
        
        
// }

// }

// import java.util.Scanner;


// class question {

//     static void multiply(int [][] arr, int r1, int c2, int r2, int c1, int [][] arr2){
//         if(c1 != r2){
//             System.out.println(" wrong input ");
//             return;


//         }

//         int [][] multiply = new int[r1][c2];
//         for (int i = 0; i < r1; i++) {
//             for (int j = 0; j < c2; j++) {
//                 for (int k = 0; k < c1; k++) {
                
//                 multiply[i][j] = multiply[i][j]+ (arr[i][k]*arr2[k][j]);
 
//             }
 
//             }
            
//         }
//         System.out.println("the required result is:  ");

//         for (int i = 0; i < r1; i++) {
//             for (int j = 0; j < c2; j++) {
//                 System.out.print(multiply[i][j]+" ");
                
//             }
//             System.out.println();
//         }
//     }
// }
// public class twoDarray{

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter the value of r1: ");
//         int r1 = sc.nextInt();
//         System.out.print("enter the value of c1 : ");
//         int c1 = sc.nextInt();
//         int arr [][] = new int[r1][c1];
//         System.out.println("enter the value of 1st matrix");
//         for (int i = 0; i < r1; i++) {
//             for (int j = 0; j < c1; j++) {
//                 arr[i][j] = sc.nextInt();  
//             }  
//         }
//         System.out.print("enter the value of r2: ");
//         int r2 = sc.nextInt();
//         System.out.print("enter the value of c2: ");
//         int c2 = sc.nextInt();

//         int arr2 [][] = new int[r2][c2];
//         System.out.println("enter the value of 2nd matrix");
//         for (int i = 0; i < r2; i++) {
//             for (int j = 0; j < c2; j++) {
//                 arr2[i][j] = sc.nextInt();
                
//             }  
//         }
//         question.multiply(arr, r1, c2, r2, c1, arr2);
//     }
// }


// import java.util.Scanner;


// class question {

    // static void transpose (int [][] arr,int r , int c){
        // int [][] transpose = new int[c][r];
        // for (int i = 0; i < c; i++) {
        //     for (int j = 0; j < r; j++) {
        //         transpose[i][j] = arr[j][i];
 
        //     }    
        // }
        // System.out.println("Transpose matrix is: ");
        // for (int i = 0; i < c; i++) {
        //     for (int j = 0; j < r; j++) {
        //         System.out.print(transpose[i][j]+" ");
        //     }
        //     System.out.println();  
        // }         
        //     }

//             static void swap(int arr [] [], int i, int j ){
//                 int temp = arr[i][j];
//                 arr[i][j] = arr[j][i];
//                 arr[j][i] = temp;


//             }

//         static void transposeinplace(int [][] arr, int r , int c){

//             System.out.println("the transpose in place is: ");
//             for (int i = 0; i < c; i++) {
//             for (int j = i; j < r; j++) {
                
//                 swap(arr, i, j);
                

//                 // int temp = arr[i][j];
//                 // arr[i][j] = arr[j][i];
//                 // arr[j][i] = temp;
               
                
//                 System.out.print(arr[i][j]+" ");

 
//             }  
//              System.out.println();
              
//         }

//             }
            
//         }

// public class twoDarray{

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter the value of r: ");
//         int r = sc.nextInt();
//         System.out.print("enter the value of c: ");
//         int c = sc.nextInt();
//         int arr [][] = new int[r][c];
//         System.out.println("enter the value of  matrix is: ");
//         for (int i = 0; i < r; i++) {
//             for (int j = 0; j < c; j++) {
//                 arr[i][j] = sc.nextInt();  
//             }  
//         }
//         // question.transpose(arr, r, c);

//         question.transposeinplace(arr, r, c);
//     }
// }

import java.util.Scanner;



class question {


    static void reverse(int[] arr ){
        int i = 0 ,  j = arr.length-1;

        while(i< j){
            int temp = arr [i];
            arr [i] = arr [j];
            arr [j] = temp;
            i++;
            j-- ;
        }
    }

    static void rotate (int [] [] arr, int r , int c){

        transpose(arr, r, c);
        for (int i = 0; i < arr.length ; i++) {
            reverse(arr[i]);
            
        }
        System.out.println("Rotated Matrix:");


            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {

                    System.out.print(arr[i][j] + " ");
    }

    System.out.println();
}
    }
    static void swap(int [][] arr , int i , int j ){
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
    }
    static void transpose (int [] []  arr, int r, int c){
        
        for(int i = 0; i < r; i++){
            for(int j = i; j < r; j++){
                
                swap(arr , i, j);

            }


        }
        System.out.println("Transpose Matrix:");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


        
    }
}
public class twoDarray{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of r: ");
        int r = sc.nextInt();
        System.out.println("enter the value c: ");
        int c = sc.nextInt();
        int [][] arr = new int[r][c];
        System.out.println("enter the values of matrix: ");
        for(int i = 0 ; i<r; i++){
            for(int j = 0; j < c; j++){

                arr[i][j] = sc.nextInt();

            }
        }
        
        question.rotate(arr, r, c);
        



    }
}

