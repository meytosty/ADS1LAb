import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(findBin(n, k));
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
    public static int findPow(int a, int n) {
        if (n == 1) {
            return a;
        }
        else {
            return a * findPow(a, n-1);
        }
    }
    public static String findReverse(int n, int[] numbers) {
        if (n == 1) {
            return Integer.toString(numbers[0]);
        }
        else {
            return Integer.toString(numbers[n-1]) + " " + findReverse(n-1, numbers);
        }
    }
    public static boolean isAllNumbers(String text) {
        if (text.length() == 1) {
            return Character.isDigit(text.charAt(0));
        }
        else {
            return Character.isDigit(text.charAt(0)) && isAllNumbers(text.substring(1));
        }
    }
    public static int findBin(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }
        else {
            return findBin(n-1, k-1) + findBin(n-1, k);
        }
    }
}