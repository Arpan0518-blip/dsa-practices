

// public class star {
    
//     public static void main(String[] args) {
//         int row = 3;
//         int column = 6;

//         for (int i = 1; i <= row; i++) {
//             for (int j = 1; j <=column ; j++) {

//                 System.out.print("*");
                
//             }
//             System.out.println();
            
//         }

//     }
// }


// public class star {
    
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter no of rows: ");
//         int row = sc.nextInt();
//         System.out.print("Enter no of column: ");
//         int column = sc.nextInt();

//         for (int i = 1; i <= row; i++) {
           
//             for (int j = 1; j <=column ; j++) { 

//                  if (i ==1 ||  i ==row || j ==1 || j== column) {
//                     System.out.print("*");
                
//             }else{

//                 System.out.print(" ");
//             }

                
                
//             }
//             System.out.println();
            
//         }

//     }
// }


// public class star {
    
//     public static void main(String[] args) {
//         int row = 3;
        

//         for (int i = 1; i <= row; i++) {
//             for (int j = 1; j <=i ; j++) {

//                 System.out.print("*");
                
//             }
//             System.out.println();
            
//         }

//     }
// }




public class star {
    
    public static void main(String[] args) {
        int row = 4;
        

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <=row-i ; j++) { //space print krne ke liye bs 

                

                System.out.print(" ");
                
            }

            for (int k = 1; k <= 2*i-1; k++) {
                System.out.print("*");
                
            }

            System.out.println();
            
        }

    }
}


