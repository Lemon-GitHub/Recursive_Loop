package Recursive_Loop;

public class Fibonacci {
    //方法一
//    public int Fibonacci(int n) {
//        if (n < 1) {
//            return 0;
//        }
//        if (n == 1) {
//            return 1;
//        }
//        return Fibonacci(n - 1) +Fibonacci(n - 2);
//    }



    //方法二 时间复杂度O(n)
    public static int Fibonacci(int n) {
        if (n < 1) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        int last2 = 0;
        int last1 = 1;
        int cur = 0;

        for(int i = 2; i <= n; i++) {
            cur = last1 + last2;
            last2 = last1;
            last1 = cur;
        }
        return cur;
    }

    public static void main(String[] args) {
        System.out.println(Fibonacci(2));
    }
}
