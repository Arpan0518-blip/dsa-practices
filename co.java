

//     int age = 20;
//     int no = 1235;


    
//     public static void main(String[] args) {
//         co rohan = new co();
//         System.out.println(rohan.age);
//         System.out.println(rohan.no);
        
//     }
// }


// class student {

//     int rollno;
//     String studentname;
//     int mobile;
// }

// public class co{
//         public static void main(String[] args) {
//         student obj1 = new student();
//         obj1.rollno = 1;
//         obj1.studentname = "Arpan";
//         obj1.mobile = 8896;

//         System.out.println("the required roll no is : "+obj1.rollno);
//         System.out.println(obj1.studentname);
//         System.out.println(obj1.mobile);

//         student obj2 = new student();
        
//         obj2.rollno = 21;
//         obj2.studentname = "Arpit";
//         obj2.mobile = 9795;
//         System.out.println(obj2.rollno);
//         System.out.println(obj2.studentname);
//         System.out.println(obj2.mobile);

//         student obj3 = new student();

//         obj3.rollno = 31;
//         obj3.studentname = "Arpitaa";
//         obj3.mobile = 97976;
//         System.out.println(obj3.rollno);
//         System.out.println(obj3.studentname);
//         System.out.println(obj3.mobile);


//     }


// }

    

    
// class co{

//     public void welcome() {
//         System.out.println("hello arpan");  
        
//     }
//     public static void main(String[] args) {

//         co obj = new co();
//         obj.welcome();

        
//     }



//


class sum{   //  ye class h 
    int add(int a, int b){  // or yha hm mehtod bnaye h class ka 
        int ans = a+b;  // us mehtod ke sath kya krna h hme wo h 
        return ans;


    }
    
}

public class co{

    public static void main(String[] args) {
        sum obj = new sum();   // class ko call kiya h or object ka nam diya 
        
        System.out.print("the sum of the numbers is: ");

        int ans = obj.add(3, 5); // yha method ko call kiye h 
        System.out.println(ans);
        
        
    }
}