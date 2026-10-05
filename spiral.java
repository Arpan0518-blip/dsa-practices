import java.util.Scanner;



class question{

    static void output(int r , int c, int arr[] [] ){

        int toprow = 0, bottomrow = r-1, leftcol = 0, rightcol = c-1; 
        
        int elements = 0;

        while (r*c> elements) { 
            for (int j = leftcol; j <= rightcol; j++) {
                System.out.print(arr[toprow][j]+"  ");  
                elements++; 
                
            }
            toprow++;
            for (int i = toprow; i <= bottomrow; i++) {
                System.out.print(arr[i][rightcol]+"  ");
                elements++; 
   
            }
            rightcol--;

            for (int j = rightcol; j >= leftcol; j--) {
                System.out.print(arr[bottomrow][j]+"  ");
                elements++; 
            }
            bottomrow--;
            for (int i = bottomrow; i >= toprow; i--) {
                System.out.print(arr[i][leftcol]+"  ");   
                elements++; 

            }   
            leftcol++;
        }
    }
}
public class spiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of r: ");
        int r = sc.nextInt();
        System.out.print("enter the value of c: ");
        int c = sc.nextInt();
        int [] []  arr = new int[r][c];
        System.out.println("enter the elements of matrix: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();   
            }         
        }
        System.out.println("the required matrix is: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j]+" ");  
            }
            System.out.println();    
        }
        question.output(r, c, arr);
        
    }


}
