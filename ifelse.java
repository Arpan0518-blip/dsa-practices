
import java.util.Scanner;



//         if(n%2 == 0){

//             System.out.println("The given no " +n+ " is an even no. ");

//         }else{

//             System.out.println("The given no " +n+ " is odd no. ");
//         }

//     }
// }









// import java.util.Scanner;

// public class ifelse{

//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number : ");
//         int n = sc.nextInt();

//         if(n%5 == 0){
//             System.out.println("The given number "+n+ " is divisible by 5.");

//         }

//         if(n%5 != 0){

//             System.out.println("The given number "+n+ " is not divisible by 5");

//         }
//     }
// }







// import java.util.Scanner;

// public class ifelse{
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the year: ");
//         int n = sc.nextInt();

//         if((n%400 == 0 ) || (n%4 ==0 && n%100 != 0)){
//             System.out.println("The given year "+n+" is a leap year. ");

//         }else{
//             System.out.println("The given year "+n+" is not a leap year.");
//         }


//     }
// }









// import java.util.Scanner;

// public class ifelse{

//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         System.out.print("Enter the number: ");
//         int n = sc.nextInt();
        

//         if (n<0) {
//             n = n*(-1);
//             System.out.println("The absolute value of given integer  is "+n );

            
//         }else{
//             System.out.println("The absolute value of given integer  is "+n);
//         }

    

//     }
// }


// public class ifelse{

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the Cost price: ");
//         int CP = sc.nextInt();
//         System.out.print("Enter the Selling price: ");
//         int SP = sc.nextInt();

//         if(SP>CP){
//            int  profit = SP -CP;
//             System.out.println("The shopkeeper has profit of : " +profit);
//         }else{
//             int loss = CP-SP;

//             System.out.println("The shopkeeper has loss of : "+loss);
//         }

//     }
// }
// import java.util.Scanner;

// public class ifelse{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter the length: ");

//         int l = sc.nextInt();
//         System.out.print("enter the breadth: ");
//         int b = sc.nextInt();
//          int area = l*b;
//         System.out.println("The required area is : " +area);
//         int perimeter = 2*(l+b);
//         System.out.println("The required perimeter is : "+perimeter);

//         if(area> perimeter){
//             System.out.println("The area is greater. ");

//         }else if(perimeter> area){
//             System.out.println("The perimetr  is greater .");
//         }
//         else{
//             System.out.println("BOth are equal.");
//         }
       

//     }
// }


// public class ifelse{

//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the marks: ");
//         int marks = sc.nextInt();

//         if(marks<40){
//             System.out.println("The student is fail. Better luck next time. ");
        
//             }
//             else if(marks <40 || marks <50){
//                 System.out.println("marks is below avereage. ");


//             }
//             else if(marks <51 || marks <60){
//                 System.out.println("Marks is  avereage. ");


//             }
//             else if(marks <61 || marks <70){
//                 System.out.println("Can do better . ");


//             }
//             else if(marks <71 || marks <80){
//                 System.out.println("Marks are Good. ");


//             }
//             else if(marks <81 || marks <90){
//                 System.out.println("Marks are very good. ");


//             }
//             else if(marks <91 || marks <100){
//                 System.out.println("Marks are excellent. ");


//             }else{
//                 System.out.println("NO record found.");
//             }
            
            
            
            


            
//         }
//     }



// public class ifelse{

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter the number : ");
//         int n = sc.nextInt();

//         if(n <1000 && n > 99){
//             System.out.println("The number is of three digit.");

//         }else{
//             System.out.println("The number is not valid. ");

//         }
//     }
// }


// public class ifelse{

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the number: ");
//         int n = sc.nextInt();

//         if(n%5==0 &&  n%3==0){
//             System.out.println("the number is divisible by both 3 and 5. ");


//         }

//         else if(n%3==0){

//             System.out.println("the number is divisible by 3. ");
//         }


//         else if(n%5==0 ){

//             System.out.println("the number is divisible by both 5.");
//         }
//         else{
//             System.out.println("the number is not divisible by both. ");
//         }
        


//     }
// }


// public class ifelse{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter the integer a : ");
//         int a = sc.nextInt();
//         System.out.print("enter the integer b : ");
//         int b = sc.nextInt();
//         System.out.print("enter the integer c : ");
//         int c = sc.nextInt();

//         if (a>b && a>c) {
//             System.out.println("a is the greatest integer with value "+a);

            
//         }
//         if (b>a && b>c) {
//             System.out.println("b is the greatest integerwith value "+b);
            
            
//         }
//         if (c>a && c>b) {
//             System.out.println(" c is the greatest integer with value "+c);
            
            
//         }

//     }
// }


// public class ifelse{

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter the number : ");

//         int n = sc.nextInt();

//         if (n%3==0 || n%5==0) {
//             if (n%15 != 0) {
//                 System.out.println("the number is divisible by 3 or 5 but not by 15. ");
                
//             }else{
//                 System.out.println("the number is invalid.");
//             }
            
//         }else{
//                 System.out.println("the number is invalid.");

        
            
        
            
//     }
// }
// }




// public class ifelse {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the age of Ram: ");
//         int ram = sc.nextInt();

//         System.out.print("Enter the age of Shyam: ");
//         int shyam = sc.nextInt();

//         System.out.print("Enter the age of Ajay: ");
//         int ajay = sc.nextInt();

//         if (ram < shyam && ram < ajay) {
//             System.out.println("Ram is the youngest boy.");
//         }
//         else if (shyam < ram && shyam < ajay) {
//             System.out.println("Shyam is the youngest boy.");
//         }
//         else if (ajay < ram && ajay < shyam) {
//             System.out.println("Ajay is the youngest boy.");
//         }
//         else {
//             System.out.println("Two or more boys have the same age.");
//         }

//         sc.close();
//     }
// }


// public class ifelse {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the age of Ram: ");
//         int ram = sc.nextInt();

//         System.out.print("Enter the age of Shyam: ");
//         int shyam = sc.nextInt();

//         System.out.print("Enter the age of Ajay: ");
//         int ajay = sc.nextInt();

//         if (ram<shyam) {
//             if (ram<ajay) {
                
//                 System.out.println("ram is the youngest");
                
//             }else{
//                 System.out.println("ajay is the youngest ");

//             }
            
            
//         }else{
//             if (shyam<ajay) {
//                 System.out.println("shyam is the younger");

                
//             }else{
//                 System.out.println("ajay is the younger");
//             }
//         }


        
//         }




//     }


// public class ifelse{

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter the value of x: ");
//         int x = sc.nextInt();
//         System.out.print("enter the value of y: ");
//         int y = sc.nextInt();

//         if (x==0 && y==0) {
//             System.out.println("point is at origin. "+x+ " , "+y);
            
            
//         }else if(x==0){
//             System.out.println("the point is at x axis. "+x+ " ,"+y);

//         }
//         else if(y==0){
//             System.out.println("the point is at y axis. "+y+ " ,"+x);


//         }else{
//             System.out.println("the point is on both axis. "+x+ " , "+y);
//         }

//     }
// }







// public class ifelse{
//     public static void main(String[] args) {
//         int marks = 80; 
//         if (marks<= 75) {
//             System.out.println("good");
            
//         }else
//             System.out.println("very good");
//     }
// }





// public class ifelse{

//     public static void main(String[] args) {
//         int age = 21;

//         if (age>=18) {
//             System.out.println("eligible");
            
//         }else
//             System.out.println("not eligible");
//     }
// }





public class ifelse{
    public static void main(String[] args) {
        int point = 50;

        if (point>=90) 
            System.out.println("grade A");

        else if (point >= 80 && point  < 90)
            System.out.println("grade B");

        else if (point >= 70 && point  < 80)
            System.out.println("grade B");

        else System.out.println("grade C");

        
        

    }
}

