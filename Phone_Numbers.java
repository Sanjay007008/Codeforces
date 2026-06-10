import java.util.Scanner;

public class Phone_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();

        int count8 = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '8') {
                count8++;
            }
        }

        System.out.println(Math.min(count8, n / 11));
    }
}