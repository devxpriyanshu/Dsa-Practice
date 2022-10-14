package session.first;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int n1,n2,n3,n;
        Scanner sc = new Scanner(System.in);

        System.out.print("How many number do you want in the Fibonacci Series: ");
        n = sc.nextInt();
        n1=1;
        n2=2;
        System.out.println(n1+"\n"+n2);
        for(int i=0; i<=n; i++){
            n3=n1+n2;
            System.out.println(n3);
            n1=n2;
            n2=n3;
        }

    }
}