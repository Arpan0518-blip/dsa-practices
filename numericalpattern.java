// public class numericalpattern {
    
//     public static void main(String[] args) {
//         int r = 7;

//         for (int i = 1; i <= r; i++) {
//             for (int j = i; j <= r; j++) {
//                 System.out.print(j);
                
//             }
//             for (int k = 1; k <= i-1; k++) {
//                 System.out.print(k);
                
//             }
//             System.out.println();
            
//         }
//     }
// }


// public class numericalpattern {
    
//     public static void main(String[] args) {
//         int r = 4;
//         int c = 6;

//         for (int i = 1; i <= r; i++) {
//             for (int j = 1; j <= c; j++) {
//                 System.out.print(j);
                
//             }
            
//             System.out.println();
            
//         }
//     }
// }

// public class numericalpattern {
    
//     public static void main(String[] args) {
//         int r = 4;
//         int c = 6;


//         for (int i = 1; i <= r; i++) {
//             for (int j = 1; j <= c; j++) {
//                 if ((i+j)%2 == 0) {
//                     System.out.print(1);

                    
//                 }else{
//                     System.out.print(2);
//                 }
                
//             }
            
//             System.out.println();
            
//         }
//     }
// }

public class numericalpattern {
    public static void main(String[] args) {

        int r = 4;

        for (int i = 1; i <= r; i++) {

           
            for (int j = 1; j <= r - i; j++) {  // space print krne ke liye 

                System.out.print("  ");
            }

            // no print krne ke liye 

            for (int k = 1; k <= 2 * i - 1; k++) {

                if (i == r || k == 1 || k == 2 * i - 1) {
                    System.out.print(i + " ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}