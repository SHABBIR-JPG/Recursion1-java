package shabbir.com;

public class CountZeros {
    static void main(String[] args) {
        System.out.println(count(1045000));
    }
    static int count(int n){
        return helping(n,0);
    }
    private static int helping(int n, int c) {
        if (n==0){
            return c;
        }
        int rem=n%10;
        if (rem==0){
         return helping(n/10,c+1);
        }
        return helping(n/10,c);
    }
}
