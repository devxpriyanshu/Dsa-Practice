package project.CricketGame;

import java.util.Vector;

public class GameSummary {
    public GameSummary() {
    }
    void getProfiles(int target, int duration, int runs, int extras, int wickets, int overs, Vector<Batsman> bt, Vector<Bowler> bl){

        try{
            Thread.sleep(4000);
        }catch(InterruptedException e){
            System.out.println(e);
        }
        double sr, ec, rr;  //local variables to calculate profiles
        try{
            rr=(double)runs/(double)overs;
        }catch(ArithmeticException e){
            rr=0.0;
        }
        System.out.println("\n\n$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$44\n");

        System.out.println("\n\nThe target you got: "+target+" in "+duration+" overs.");
        System.out.println("Your team's total score: "+runs);
        System.out.println("Nubber of extras: "+extras);
        System.out.println("Number of wickets fell: "+wickets);
        System.out.println("Numer of overs consummed: "+overs);
        System.out.println("Runrate maintained: "+rr);


        System.out.println("\n\nBatsmans' Contribution: ");

        for(int i=0; i<10; i++){ //catogorize and display the batsmans' profiles
            try{
                sr=((double)bt.get(i).getRuns()/(double)bt.get(i).getBalls())*100.00;
            }catch(ArithmeticException e){
                sr=0.0;
            }
            System.out.println("\n\nBatsman "+(i+1)+" : ");
            System.out.println("What Happened :"+bt.get(i).getHow());
            System.out.println("Runs Scored:"+bt.get(i).getRuns());
            System.out.println("Balls Faced:"+bt.get(i).getBalls());
            System.out.println("Strike Rate :"+sr);
        }


        System.out.println("\n\nBowlers' Performance: ");

        for(int i=0; i<6; i++){ //catogorize and display the bowlers' profiles
            try{
                ec=(double)bl.get(i).getRuns()/(double)bl.get(i).getOvers();
            }catch(ArithmeticException e){
                ec=0.0;
            }
            System.out.println("\n\nBowler "+bl.get(i).getName()+" : ");
            System.out.println("Contribution :"+bl.get(i).getHow());
            System.out.println("Runs :"+bl.get(i).getRuns());
            System.out.println("Extras :"+bl.get(i).getExtras());
            System.out.println("Overs :"+bl.get(i).getOvers());
            System.out.println("Wickets :"+bl.get(i).getWickets());
            System.out.println("Economy :"+ec);
        }
        System.out.println("\n\n\n$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$44\n");
    }
}
