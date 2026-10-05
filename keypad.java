public class keypad {

    static void print(String dig,String [] kp, String res){

        // base case 

         if(dig.length() == 0){
            System.out.print(res +" ");
            return;
    }

        // subproblem 


        int currnum = dig.charAt(0) - '0'; // 2 aayega 
        String currchoices = kp[currnum];  // "abc"

        for(int i = 0; i < currchoices.length(); i++){
            print(dig.substring(1), kp , res+ currchoices.charAt(i));
        }




    }

    public static void main(String[] args) {
        String dig = "253";

        String [] kp = {" ", " ", " abc", "def ", "ghi ", " jkl", "mno ", "pqrs ", "tuv ", "wxyz "};
        //               0    1      2      3       4         5     6        7       8        9

        print(dig, kp, " ");

        
    }
}
