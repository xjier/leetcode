/**
 * 求N以内的素数
 */
public class PrimeNumber {
    public static void main(String[] args) {

        System.out.println(eratosthenes(100));
    }

    private static int eratosthenes(int n) {
        int count = 0;
        boolean[] isPrime = new boolean[n];
        for (int i = 2; i < n; i++) {
            if (!isPrime[i]) {
                count++;
                for (int j = i; j < n; j += i) {
                    isPrime[j] =true;
                    System.out.println("i "+i + "    j "+j);
                }
            }
        }

        return count;
    }

}
