// import java.util.*;

// public class string {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the string: ");
//         String str = sc.nextLine();
//         System.out.println("the required string is: ");
//         System.out.print(str);


//     }
// }



// ----------------------------------------------------------------------


// public class string{
//     public static void main(String[] args) {
//         String str = "arpanthegreat";
//         for(int j = 2; j<4;j++){
//             System.out.print(str.substring(j));
//         }
//     }
// }


// -----------------------------------------------------------------


// public class string{
//     public static void main(String[] args) {
//         String str = "abcd";
//         for(int i = 0; i <= 3;i++){
//             for(int j = i+1; j <= 4;j++){
//                 System.out.print(str.substring(i,j)+" ");

//             }
            
//         }
//     }
    
// }









// ---------------------------------------------------------------------------------------------------





// import java.util.*;

// public class string{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the uneven string: ");
//         StringBuilder str = new StringBuilder(sc.nextLine());
//         for(int i = 0; i < str.length();i++){
//             char ch = str.charAt(i);
//             if(ch == ' ') continue;
//             int ascii = (int)ch;
//             if (ascii >= 97) {
//                 ascii -=32;
//                 char dh = (char)ascii; 
//                 str.setCharAt(i, dh);
//             }
//             else{
//                 ascii +=32;
//                 char dh = (char)ascii; 
//                 str.setCharAt(i, dh);

//             }
//         }
//         System.out.println("the required output is : ");
//         System.out.println(str);


//     }
// }





// ----------------------------------------------------------------------------------------------------------------


// public class string{
//     public static void main(String[] args) {
//         String str = "abcdcba";
//         int st = 0, end = str.length()-1;
//         boolean flag = true;
//         while (st<=end) {
//             if (str.charAt(st) != str.charAt(end)) {
//                 flag = false;
//                 break;
                
//             }
//             st++;
//             end--;
            
//         }
//         if(flag == true) System.out.println("the given string "+ str +" is a palindrome.");
//         else System.out.println("the given string " +str+ " is not a palindrome.");

//     }
// } 











// --------------------------------------------------------------------------------------------------------------------


// public class string{
//     public static void main(String[] args) {
//         String str = "aaabbbbccdddeeeeef";
//         String ans = " "+ str.charAt(0);
//         int count = 1;
//         for(int i = 1; i< str.length();i++){
//             char curr = str.charAt(i);
//             char prev = str.charAt(i-1);
//             if (curr == prev) {
//                 count++;  
//             }
//             else{
//                 ans += count;
//                 count = 1;
//                 ans += curr;
//             }
//         }
//         ans+= count;
//         System.out.println(ans);
//     }
// }





public class fraction{
    int num;
    int den;

    public fraction(int num, int den){
        this.num = num;
        this.den = den;
    }
}
public class string{
    public static void main(String[] args) {
        fraction f = new fraction (3,7);
        System.out.println(f.num + "/" + f.den);
        
    }
}
