package project.CricketGame;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GameCondition {
    Scanner input=new Scanner(System.in);
    Random rand=new Random();

    private int type;
    private int difficulty;
    private int country;

    public GameCondition() {
    }

    int getCountry() {
        return country;
    }

    int getDifficulty() {
        return difficulty;
    }

    int getType() {
        return type;
    }


    void showCredits(){ //showing the background of the game
        int userin;

        try{
            System.out.println("\n\nThank you for using Cricket CS2010");
            System.out.println("\n\nCricket CS2010\n\nDeveloped by :\nB.P.P. Fernando\n070123R\nDepartment of Computer Science & Engineering\nUniversity of Moratuwa.\n\n");
            System.out.println("This game was developed in November,2008, as the mini project for the module CS2010 of level 2 semester 1 in UoM\n\n");
            System.out.println("Special Thanks for:\nMr. Prasad Samarakoon, Department of Computer Science & Engineering\nMr. Chandana Gamage, Department of Computer Science & Engineering\nMr. Kishan Wimalawrne, Department of Computer Science & Engineering\n\n\n");
            System.out.print("Enter any number to continue with the game: ");

            userin=input.nextInt(); //getting the user input
        }catch(InputMismatchException e){
        }

        System.out.println("\n\n");
    }


    void showMenue(){ //showing the menu to get the user choices to proceed

        System.out.println("\n\n................................Game Menu................................");


        try{
            System.out.println("\n\nGame Type:  \n");
            System.out.println("1:  5 Overs < press 1 >");
            System.out.println("2: 10 Overs < press 2 >");
            System.out.println("3: 20 Overs < press 3 >\n");
            System.out.print("Enter the number of your Selection: ");

            type=input.nextInt(); //getting the user input
        }catch(InputMismatchException e){
            type=0;
        }

        if(!(type==1||type==2||type==3)){
            System.out.println("\n\nPlease Enter a Valid Game Type !, Try Again: ");
            showMenue();
        }

        try{
            System.out.println("\n\nOpposition Country:  \n");
            System.out.println();
            System.out.println("1: Australia    < press 1 >");
            System.out.println("2: Sri Lanka    < press 2 >");
            System.out.println("3: India        < press 3 >");
            System.out.println("4: Pakistan     < press 4 >");
            System.out.println("5: England      < press 5 >");
            System.out.println("6: New Zealand  < press 6 >\n");
            System.out.print("Enter the number of your Selection: ");

            country=input.nextInt(); //getting the user input
        }catch(InputMismatchException e){
            country=0;
        }

        if(!(country==1||country==2||country==3||country==4||country==5||country==6)){
            System.out.println("\n\nPlease Enter a Valid Opposition Country !, Try Again: ");
            showMenue();
        }

        try{
            System.out.println("\n\nDifficulty Level:  \n");
            System.out.println("1: Easy     < press 1 >");
            System.out.println("2: Medium   < press 2 >");
            System.out.println("3: Hard     < press 3 >\n");
            System.out.print("Enter the number of your Selection: ");

            difficulty=input.nextInt(); //getting the user input
        }catch(InputMismatchException e){
            difficulty=0;
        }

        if(!(difficulty==1||difficulty==2||difficulty==3)){
            System.out.println("\n\nPlease Enter a Valid Difficulty Level !, Try Again: ");
            showMenue();
        }

    }


    void showControlls(){ //displayingthe guidences

        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
            System.out.println(e);
        }

        System.out.println("\n\nThis is the way of playing shots : \n");
        System.out.println("0: Leave    < press 0 >");
        System.out.println("1: Defend   < press 1 >");
        System.out.println("2: Pull     < press 2 >");
        System.out.println("3: Drive    < press 3 >");
        System.out.println("4: Cut      < press 4 >");
        System.out.println("5: Hook     < press 5 >");
        System.out.println("6: Sweep    < press 6 >\n");
        System.out.println("\nUse your numpad when playing");
        System.out.println("\nAfter presssing a number you must press the enter key to validate your input");

        try{
            Thread.sleep(10000);
        }catch(InterruptedException e){
            System.out.println(e);
        }

    }
}
