package session.first;

public class Loops {
    public static void main(String[] args) {

        int a = 1;

        if (a == 1) {
            System.out.println("True");
        }
        while (a < 5) {
            System.out.println(a);
            a++;
        }
        for (a = 1; a < 5; a++) {
            System.out.println(a + "For");
        }
    }
}