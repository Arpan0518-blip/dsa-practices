
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


public class loops{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("enter the value of b: ");
        int b = sc.nextInt();
        int ans = 1;

        for (int i = 1; i <= b; i++) {
            ans = ans*a;
            

            
        }
        System.out.println(a+" raise to the power "+b+ " is "+ans);

    }
}


