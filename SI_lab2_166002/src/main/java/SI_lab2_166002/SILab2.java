package SI_lab2_166002;

public class SILab2 {
	static boolean checkPrime(int n) {
        if (n < 0) {
            throw new RuntimeException("Number should not be negative");
        }
        int m = n / 2;
        if (n == 0 || n == 1) {
            return false;
        } else {
            for (int i = 2; i <= m; i++) {
                if (n % i == 0) {
                    return true;
                }
            }
            return false;
        }
    }
}
