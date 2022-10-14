package session.first;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String Rev="";
        String Str = sc.next();
        int n = Str.length();
        for(int i=n-1; i>=0;i--){
            Rev = Rev + Str.charAt(i);
        }
        if(Str.equals(Rev)){
            System.out.println("String is Palindrome.");

        }
        else{
            System.out.println("String is not Palindrome.");
        }
    }
}