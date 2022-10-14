package session.first;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float P = sc.nextFloat();
        float R = sc.nextFloat();
        float T = sc.nextFloat();

        float SI = (P*(1+R*T));

        System.out.println("Simple Inerest = " + SI);
    }
}