
import java.util.Scanner;



//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter the first n factorial: ");
//         int n = sc.nextInt();
//         int fact = 1;

//         for (int i = 1; i <= n; i++) {

//             fact = fact *i;
//             System.out.println("the required factorial  " +fact);

            
            
            
//         }

        

//     }
// }








// --------------------------------------------------------------------------------


// public class loops{

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter the value of a: ");
//         int a = sc.nextInt();
//         System.out.print("enter the value of b: ");
//         int b = sc.nextInt();
//         int ans = 1;

//         for (int i = 1; i <= b; i++) {
//             ans = ans*a;
            

            
//         }
//         System.out.println(a+" raise to the power "+b+ " is "+ans);

//     }
// }



// -----------------------------------------------------------------------------------------------------

// public class loops{
//     public static void main(String[] args) {
//         for(int i =0; i < 10; i++)
//             System.out.print(i);
        
//     }
// }





// -------------------------------------------------------------------------------------

// public class loops{
//     public static void main(String[] args) {
//         int i = 1;
//         while(i<=10){
//             System.out.print(i+" ");
//             i = i+2;
//         }
//     }
// }




// ------------------------------------------------------------------------------------------


//  write a program to make multiplicative of 5 upto 10 value



// public class loops{
//     public static void main(String[] args) {
//         int i = 1;
//         while(i<=10){
//             System.out.print(i*5+" ");
//          i++;
//         }
//     }
// }





//  -------------------------------------------------------------------


// public class loops{

//     public static void main(String[] args) {
//         int n = 0;
//         do{
//             System.out.print(n+" ");
//             n++;
//         }
//         while(n<=10);

//     }
// }






// ------------------------------------------------------------------------------------


// public class loops {

//     public static void main(String[] args) {

//         for(int i = 5; i <= 50; i = i + 5) {
//             System.out.print(i);
//         }

//     }
// }





// ------------------------------------------------------------------------------------
//  write a program to print sum of 1 to 10


// public class loops {

//     public static void main(String[] args) {

//         int sum = 0;

//         for(int i = 1; i <= 10; i++) 
//             sum = sum + i;
//         System.out.println("Sum = " + sum);
//     }
// }






// ---------------------------------------------------------------------------


public class loops {

    public static void main(String[] args) {

        int sum = 0;

        for(int i = 1; i <= 50; i++) {
            if(i % 2 == 0) {
                sum = sum + i;
            }
        }

        System.out.println("Sum of even numbers = " + sum);
    }
}
