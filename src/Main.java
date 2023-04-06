import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(findFib(n));
    }
    public static int findMin(int n, int[] arr) {
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    public static double findAverage(int n, int[] numbers) {
        double total = numbers[0];
        for (int i = 1; i < n; i++) {
            total += numbers[i];
        }
        return total / n;
    }
    public static boolean isNumberPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static int findFact(int n) {
        if (n == 1) {
            return 1;
        }
        else {
            return n * findFact(n-1);
        }
    }
    public static int findFib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        else {
            return findFib(n-1) + findFib(n-2);
        }
    }
}