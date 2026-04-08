package shabbir.com;

public class Concept {
    static void main(String[] args) {
        fun(5);
    }
    static void fun(int n){
        if (n==0){
            return;
        }

        fun(--n);
        System.out.println(n);
    }
}
