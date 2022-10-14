package session.first;

public class Armstrong {

    static void findArmstrong(int low, int high) {
        for (int i = low; i <= high; i++) {

            int x = i;
            int n = 0;

            while (x != 0) {
                x = x / 10;   // to find the number of digits
                ++n;        // number digits is set to be n
            }

            x = i;
            int digit;
            double sum = 0;

            while (x != 0) {
                digit = x % 10;
                sum = sum + Math.pow(digit, n);
                x = x / 10;
            }

            if (i == sum) {
                System.out.println(i + " Number is Armstrong");
            }

        }
    }

    public static void main(String[] args) {
        findArmstrong(100, 200);
    }

}