// import java.util.Scanner;

// public class recursioString {
//     public static void main(String[] args) {
//         // String s = "arpan";
//         // System.out.println(s);

//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the string :");
//         String s =  sc.nextLine();
//         System.out.println(s);
//         char ch = s.charAt(1);
//         System.out.println(ch);

//         for(int i = 0; i<s.length();i++){
//             System.out.print(s.charAt(i));
            

//         }
//         System.out.println(s.substring(1, 2));

//     }
// }





//ques --------------------------------------------------------------------------------


// import java.util.Scanner;

// public class recursioString{


//     static String foundA(String s, int index){
//         if(index == s.length()){
//             return " ";
//         }

//         String subprob = foundA(s, index+1);
//         char currch = s.charAt(index);
//         if(currch != 'a') return currch + subprob;
//         else return subprob;
//     }



//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter the string : ");
//         String s = sc.nextLine();
       
//         System.out.println(recursioString.foundA(s, 0));
//     }
// }





//ques ----------------------------------------------------------------------------


// import java.util.Scanner;

// public class recursioString{
//     static String reverse(String s, int index){

//         if(index == s.length()){
//             return " ";
//         }
//         String subprob = reverse(s, index+1);
//         String ans = subprob + s.charAt(index);
         
//         return ans ;
       
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter the string : ");
//         String s = sc.nextLine();
//        String rev = reverse(s, 0);
//         System.out.println("the reverse of the string is : ");
//         System.out.println(recursioString.reverse(s, 0));
//         if(s.equals(rev)) System.out.printf("%s is a pallindrone",s);
//         else System.out.printf("%s is not a pallindrone",s);
        
        
//     }
// }








//ques ----------------------------------------------------------------------------


// import java.util.ArrayList;
// import java.util.Scanner;

// public class recursioString{
//     static ArrayList<String> subsequece(String s){
//         ArrayList<String> ans = new ArrayList<>();

//         if(s.length()== 0){
//             ans.add(" ");
//             return ans;
//         }
//         char curr = s.charAt(0);
//         ArrayList<String> smallans = subsequece(s.substring(1));


//         for (int i = 0; i < smallans.size(); i++) {
//             ans.add(smallans.get(i));
//         }

//         // take curr
//         for (int i = 0; i < smallans.size(); i++) {
//             ans.add(curr + smallans.get(i));
//         }

//         return ans;

        

        
//     }
//     public static void main(String[] args) {
//         String s = "abc";
//         System.out.println(recursioString.subsequece(s));
       
        
//     }
// }






//ques ----------------------------------------------------------------------------



// public class recursioString{

//     static void printseq(String s , String currAns){
//         if(s.length() == 0 ){
//             System.out.println(currAns);
//             return;
//         }
//         char curr = s.charAt(0);
//         String remString = s.substring(1);
//         printseq(remString, currAns+curr);
//         printseq(remString, currAns);

//     }
// public static void main(String[] args) {
//     printseq("abc", " ");
    
// }

// }





//ques ----------------------------------------------------------------------------


public class recursioString{
    static void subsetsum(int [] a, int n ,int idx, int sum ){
        if(idx >= n ){
            System.out.println(sum);
            return;
        }
        subsetsum(a, n, idx+1, sum+a[idx]);
        subsetsum(a, n, idx+1, sum);


    }

    public static void main(String[] args) {
        int [] a = {2,4,5};
        subsetsum(a, a.length, 0, 0);
    }

}