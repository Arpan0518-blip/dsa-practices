// import java.util.Scanner;


// public class remainder{
    
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter value of a: ");
//         int a = sc.nextInt();
//         System.out.print("enter value of b: ");
//         int b = sc.nextInt();
//         int q = a/b;
//         int r = a-(b*q);
//         System.out.println("the required remainder when " + a + " is divided by "+ b +" is " + r);
      


//     }
// }

import java.util.Scanner;

public class remainder{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("the value of a is: ");
        int a = sc.nextInt();
        System.out.print("the value of b is: ");
        int b = sc.nextInt();
        int r = a%b;
        System.out.println("the required reminder when " +a+ "is divided by" +b+ " is " +r);

    }
}