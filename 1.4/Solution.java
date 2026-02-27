public class Solution {

    public static long fibonacci(long n) {
        if (n == 1) {
            return 1;

        } else if(n == 0) {
            return 0;

        } else if(n<0) {
            return -1;

        }

        else {
            int a = 0;
            int b = 1;
            for (int i = 2; i <= n; i++){
                
                if (a > Long.MAX_VALUE -b ) {
                    return Long.MAX_VALUE; 
                }
                int fibed = b + a;
                a = b;
                b = fibed;

            }return b;
        }
    }
}