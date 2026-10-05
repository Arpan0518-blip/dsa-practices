

//ques ------------------------------------------------------------------------------------------------


// import java.util.Scanner;



// public class recursion{

//     static void print(int n ){
//         if(n == 1){
//             System.out.println(n);
//             return;
//         }

//         print(n-1);
//         System.out.println(n);


//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter the value of n: ");

        
//         int n = sc.nextInt();
        
//         recursion.print(n);


//     }
// }


//ques ------------------------------------------------------------------------------------------------




// import java.util.Scanner;

// public class recursion{

//     static void printdecreasing(int n){
//         if(n == 1){    // ye mera base case hogya 
//             System.out.println(1);
//             return;

//         }
//         System.out.println(n);    // ye self work hogya
//         printdecreasing(n-1);     //ye recursive work hogya

//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter the value of n: ");
//         int n = sc.nextInt();
//         recursion.printdecreasing(n);

//     }
// }



//ques ------------------------------------------------------------------------------------------------




// import java.util.Scanner;

// public class recursion{

//     static int factorial(int n){
//         if(n == 0){    // ye mera base case hogya             
//             return 1;
//         }


           
//         int smallproblem = factorial(n-1); 
//         int ans = n * smallproblem;    
//         return ans;

//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter the value of n: ");
//         int n = sc.nextInt();
//         recursion.factorial(n);

//         int ans = recursion.factorial(n);
//         System.out.println("the reqired facorial is: "+ans);

//     }
// }


//ques ------------------------------------------------------------------------------------------------


// one more to solve the above problem : 



// import java.util.Scanner;

// class question {

//     static int factorial(int n){
//         if(n == 0){    // ye mera base case hogya             
//             return 1;
//         }


           
//         int smallproblem = factorial(n-1); 
//         int ans = n * smallproblem;    
//         return ans;

//     }
// }

// public class recursion{

    

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter the value of n: ");
//         int n = sc.nextInt();
//         question.factorial(n);

//         int ans = question.factorial(n);
//         System.out.println("the reqired facorial is: "+ans);

//     }
// }



//ques ------------------------------------------------------------------------------------------------




// import java.util.Scanner;

// public class recursion{
    
//     static int fib(int n){
//         if(n == 0)    return 0;
//         if(n == 1)    return 1;
        
        
//         int previous = fib(n-1) ;
//         int preprevious = fib(n-2) ;
//         int ans =  fib(n-1)+fib(n-2);
//         return ans;

//     }

    

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter the value of n: ");
//         int n = sc.nextInt();
//         recursion.fib(n);

//         int ans = recursion.fib(n);
//         System.out.println("the reqired value in fib series is: "+ans);

//     }
// }







// another way to solve the problem:




//ques ------------------------------------------------------------------------------------------------



// import java.util.Scanner;

// public class recursion{
    
//     static int fib(int n){
//         if(n == 0)    return 0;
//         if(n == 1)    return 1;  
//         int previous = fib(n-1) ;
//         int preprevious = fib(n-2) ;
        
//         return previous+preprevious;

//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter the value of n: ");
//         int n = sc.nextInt();
//         recursion.fib(n);

//         int ans = recursion.fib(n);
//         System.out.println("the reqired value in fib series is: "+ans);

//     }
// }




//ques ------------------------------------------------------------------------------------------------




// import java.util.Scanner;

// public class recursion{
    
//     static int sumofdigits(int n){
//         if(n >= 0 && n<= 9)    return n;
        
//        int smallprob = sumofdigits( n / 10);
//        int ans = smallprob + n%10;
       
        
//         return ans;

//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter the value of n: ");
//         int n = sc.nextInt();
//         recursion.sumofdigits(n);

//         int ans = recursion.sumofdigits(n);
//         System.out.println("the reqired value in fib series is: "+ans);

        
//     }
// }





//ques ------------------------------------------------------------------------------------------------



// import java.util.Scanner;

// public class recursion{
    
//     static int countofdigits(int n){
//         if(n >= 0 && n<= 9)    return 1;
        
//        int smallprob = countofdigits( n / 10);
//        int ans =  smallprob + 1 ;

//         return ans;

//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter the value of n: ");
//         int n = sc.nextInt();
//         recursion.countofdigits(n);

//         int ans = recursion.countofdigits(n);
//         System.out.println("the reqired digit is : "+ans);

        
//     }
// }





//ques ------------------------------------------------------------------------------------------------




// import java.util.Scanner;

// public class recursion{
    
//     static int power(int p, int q){
//         if(q == 0)    return 1;
        
//        int smallprob = power(p, q-1);
    

//         return p * smallprob;

//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter the value of p: ");
//         int p = sc.nextInt();
//         System.out.print("enter the value of q: ");
//         int q = sc.nextInt();
//         recursion.power(p, q);

//         int ans = recursion.power(p, q);
//         System.out.println("the reqired digit is : "+ans);

        
//     }
// }




//ques ------------------------------------------------------------------------------------------------





// import java.util.Scanner;

// public class recursion{
    
//     static void multiples(int n , int k ){
//         if(k == 1){
//             System.out.println(n);
//             return;
          
//         }
//         multiples(n, k-1);
//         System.out.println(n*k);
        
 

//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter the value of n: ");
//         int n = sc.nextInt();
//         System.out.print("enter the value of k: ");
//         int k = sc.nextInt();
//         recursion.multiples(n, k);

   
       

        
//     }
// }




//ques ------------------------------------------------------------------------------------------------



// import java.util.Scanner;

// public class recursion{
    
//     static int Sum(int n){
//         if(n==0){
//             return 0;
//         }
//         int subprob = Sum(n-1);
//         int ans = subprob + n;
//         return ans;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter the value of n: ");
//         int n = sc.nextInt();
//         System.out.println("the sum upto "+n+ " is  : "+recursion.Sum(n));  
//     }
// }




//ques ------------------------------------------------------------------------------------------------


// import java.util.Scanner;

// public class recursion{
    
//     static int Sum(int n){
//         if(n==0)  return 0;

//         if(n%2 != 0)  return Sum(n-1) + n;

//         else return Sum(n-1) - n;   
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter the value of n: ");
//         int n = sc.nextInt();
//         System.out.println("the sum upto "+n+ " is  : "+recursion.Sum(n));  
//     }
// }





//ques ------------------------------------------------------------------------------------------------

// import java.util.Scanner;

// public class recursion{
//     static int gcd(int x, int y){
//         int rem = 0;
//         while (x%y != 0) {
//             rem = x%y;
//             x = y;
//             y = rem;
//         }
//         return y;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter the value of x : ");
//         int x = sc.nextInt();
//         System.out.print("enter the value of y : ");
//         int y = sc.nextInt();

//         System.out.println("the required gcd is: "+recursion.gcd(x, y));

//     }
// }




//ques ------------------------------------------------------------------------------------------------
//Another way to calculate gcd by Eculid's academy ----------------------------------------------------


import java.util.Scanner;

public class recursion{
    static int gcd(int x, int y){
        if(y == 0){
            return x;
        }
        return gcd(y, x%y);
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of x : ");
        int x = sc.nextInt();
        System.out.print("enter the value of y : ");
        int y = sc.nextInt();

        System.out.println("the required gcd is: "+recursion.gcd(x, y));

    }
}
