public class froggjump {
    static int best(int [] a , int n , int idx){
        if(idx == n-1) return 0;
        int op1 = best(a, n, idx+1)+ Math.abs(a[idx]-a[idx+1]);
        if(idx == n-2) return op1;
        int op2 =best(a, n, idx+2)+ Math.abs(a[idx]-a[idx+2]);
        return Math.min(op1, op2);
    }
    public static void main(String[] args) {
        int [] a = {10,30,40,20};
        System.out.print("the required min cost is : ");
        System.out.println(best(a, a.length, 0));
    }
}








