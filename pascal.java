import java.util.Scanner;

class question{

    static void pascal(int n){


        int [][] ans = new int[n][];
        
        for(int i = 0; i< n; i ++){
            ans[i] = new int[i+1];
            ans[i][0] = ans[i][i] = 1;

            for(int j = 1; j< i; j++){

                ans[i][j] = ans[i-1][j-1]+ ans[i-1][j];
                }
        }

        for(int i = 0; i< n; i ++){
            for(int j = 0; j< ans[i].length; j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
public class pascal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of n: ");
        int n = sc.nextInt();
        question.pascal(n);
    }
}
