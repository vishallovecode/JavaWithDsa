public class Sqrt {
    public static int SquareRoot (int n) {
        if(n==0 && n==1) {
            return n;
        }
        int temp = 2;
        while(temp*temp<=n) {
            temp++;
        }
        return temp-1;
    }
    public static void main(String[] args) {
        int n = 68;
        int sqrt =  SquareRoot(n);
        System.out.println(sqrt);
    }
}
