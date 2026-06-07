import java.util.ArrayList;
import java.util.Scanner;

public class Palindrome_Twelve_and_Two_Terms {

    public static boolean check(long num) {
        String str = Long.toString(num);
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static long[] pal(long num) {
        ArrayList<Long> arr = new ArrayList<>();

        for (long i = 1; i <= num; i++) {
            if (check(i)) {
                arr.add(i);
            }
        }

        long[] res = new long[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            res[i] = arr.get(i);
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t > 0) {

            long n = sc.nextLong();

            long[] arr = pal(n);

            boolean found = false;

            for (int i = 0; i < arr.length; i++) {
                long val = n - arr[i];

                if (val >= 0 && val % 12 == 0) {
                    System.out.println(arr[i] + " " + val);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println(-1);
            }

            t--;
        }

        sc.close();
    }
}