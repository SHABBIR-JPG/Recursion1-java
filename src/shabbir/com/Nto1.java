package shabbir.com;

public class Nto1 {
    static void main(String[] args) {
        fun(5);

    }
    static void fun(int n){
        if (n==0){
            return;
        }
        System.out.print(n);
        fun(n-1);
    }
}
