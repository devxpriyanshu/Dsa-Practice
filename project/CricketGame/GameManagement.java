package project.CricketGame;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class GameManagement {
    Scanner input=new Scanner(System.in);
    Random rand=new Random();

    GameCondition begining=new GameCondition();
    GameSummary ending=new GameSummary();

    private int duration; //attributes used
    private int target;
    private int flag;
    private int score;
    private int runs;
    private int extras;
    private int wickets;
    private int overs;
    private String how;

    private Vector<Batsman> bt=new Vector<Batsman>();
    private Vector<Bowler> bl=new Vector<Bowler>();

    public GameManagement() {
    }


    public static void main(String[] args) {
        GameManagement game=new GameManagement();
        game.KeepGoing();
    }


    private void KeepGoing(){

        begining.showCredits();
        begining.showMenue();
        begining.showControlls();

        addPlayers();
        setBowlers(begining.getCountry());
        setTarget(begining.getType(), begining.getDifficulty());
        readyToPlay();
        playInning();
        getFinal();


        ending.getProfiles(target, duration, runs, extras, wickets, overs, bt, bl);

    }


    private void addPlayers(){ //ddd the player to the inning
        for(int i=0; i<10; i++)
            bt.add(new Batsman(i+1));
        for(int i=0; i<6; i++)
            bl.add(new Bowler());
    }


    private void setBowlers(int country){ //defines the bowlers of the fielding team

        bl.get(0).setAction("Fast");
        bl.get(0).setIaction(0);
        bl.get(1).setAction("Fast");
        bl.get(1).setIaction(0);
        bl.get(2).setAction("Fast");
        bl.get(2).setIaction(0);
        bl.get(3).setAction("Fast");
        bl.get(3).setIaction(0);
        bl.get(4).setAction("Spin");
        bl.get(4).setIaction(1);
        bl.get(5).setAction("Spin");
        bl.get(5).setIaction(1);

        switch(country){ //defines the names bowlers of the fielding team
            case 1:
            {   bl.get(0).setName("Bret Lee");
                bl.get(1).setName("Michel Jhonson");
                bl.get(2).setName("Stuart Clarke");
                bl.get(3).setName("Shon Tait");
                bl.get(4).setName("Andrew Simond");
                bl.get(5).setName("Brad Hog"); }
            break;
            case 2:
            {   bl.get(0).setName("Chaminda Vass");
                bl.get(1).setName("Lasith Malinga");
                bl.get(2).setName("Dilhara Fernando");
                bl.get(3).setName("Fervees Maharoof");
                bl.get(4).setName("Muththaia Muralidaran");
                bl.get(5).setName("Ajantha Mendis"); }
            break;
            case 3:
            {   bl.get(0).setName("Zaheer Khan");
                bl.get(1).setName("Ishant Sharma");
                bl.get(2).setName("R.P. Sing");
                bl.get(3).setName("Munaf Patel");
                bl.get(4).setName("Harbajan Sing");
                bl.get(5).setName("Anil Kumble"); }
            break;
            case 4:
            {   bl.get(0).setName("Mohomad Aseef");
                bl.get(1).setName("Sohel Tanveer");
                bl.get(2).setName("Shoib Akthar");
                bl.get(3).setName("Umar Gull");
                bl.get(4).setName("Shaheed Afridi");
                bl.get(0).setName("Shoib Malik"); }
            break;
            case 5:
            {   bl.get(0).setName("Steve Harmison");
                bl.get(1).setName("James Anderson");
                bl.get(2).setName("Andrew Flintof");
                bl.get(3).setName("Rayon Sidebottom");
                bl.get(4).setName("Monti Panesar");
                bl.get(5).setName("Ashly Giles"); }
            break;
            case 6:
            {   bl.get(0).setName("Shane Bond");
                bl.get(1).setName("Jacob Oram");
                bl.get(2).setName("Darel Tuffy");
                bl.get(3).setName("James Franklin");
                bl.get(4).setName("Daniel Vitory");
                bl.get(5).setName("Jeetan Patel"); }
            break;
        }
    }


    private void setTarget(int type, int difficulty){

        switch(type){
            case 1:
                duration=5;
                break;
            case 2:
                duration=10;
                break;
            case 3:
                duration=20;
                break;
        }

        switch(difficulty){
            case 1:
            { switch(duration){
                case 5:
                    target=((duration*6)+rand.nextInt(10));
                    break;
                case 10:
                    target=((duration*5)+rand.nextInt(10));
                    break;
                case 20:
                    target=((duration*4)+rand.nextInt(10));
                    break; }
                break;}
            case 2:
            { switch(duration){
                case 5:
                    target=((duration*8)+rand.nextInt(10));
                    break;
                case 10:
                    target=((duration*7)+rand.nextInt(10));
                    break;
                case 20:
                    target=((duration*6)+rand.nextInt(10));
                    break; }
                break;}
            case 3:
            {switch(duration){
                case 5:
                    target=((duration*10)+rand.nextInt(10));
                    break;
                case 10:
                    target=((duration*9)+rand.nextInt(10));
                    break;
                case 20:
                    target=((duration*8)+rand.nextInt(10));
                    break; }
                break;}

        }

    }


    private void readyToPlay(){ //enter into the inning
        int start;

        System.out.println("\n\nTarget to be achieved: "+this.target);
        System.out.println("\nMaximum number of overs to be faced: "+this.duration);

        try{
            System.out.print("\n\nPress 9 to play  or  Press 7 to exit : ");
            start=input.nextInt();
        }catch(InputMismatchException e){
            start=0;
        }

        if(start==7)
            System.exit(0);
        else if(start==9)
            System.out.println("\n\nGet Ready! Game is about to begin.....\n");
        else
            readyToPlay();

    }


    private void getResult(int ishot, int itype, int idirection){ //getting the detail
        switch(itype){
            case 1: case 2: case 3:    //apply the logic for select the status of the batsman
            {
                switch(ishot){
                    case 0:
                    { if(idirection==2){
                        flag=0;
                        score=0;
                        int r=rand.nextInt(2);
                        switch(r){
                            case 0:
                                how="LBW";
                                break;
                            case 1:
                                how="Bowled";
                                break;

                        }
                    }else{
                        flag=1;
                        score=0;
                    }}
                    break;
                    case 1:
                        flag=1;
                        score=0;
                        break;
                    case 2:
                    { int r=rand.nextInt(7);
                        switch(r){
                            case 0:
                                flag=0;
                                score=0;
                                how="Caught";
                                break;
                            case 1: case 2: case 3: case 4: case 5:
                                flag=1;
                                score=rand.nextInt(7);
                                if(score==5)
                                    score=4;
                                break;
                            case 6:
                                flag=0;
                                score=1;
                                how="Run Out";
                                break;

                        }}
                    break;
                    case 3:
                        flag=1;
                        score=rand.nextInt(5);
                        break;
                    case 4:
                    {int r=rand.nextInt(8);
                        switch(r){
                            case 0: case 1:
                                flag=0;
                                score=0;
                                how="Caught";
                                break;
                            case 2: case 3: case 4: case 5: case 6: case 7: case 8:
                                flag=1;
                                score=rand.nextInt(7);
                                if(score==5)
                                    score=1;
                                break;
                            case 9:
                                flag=0;
                                score=2;
                                how="Run Out";
                                break;

                        }}
                    break;
                    case 5:
                    { int r=rand.nextInt(5);
                        switch(r){
                            case 0: case 1:
                                flag=0;
                                score=0;
                                how="Caught";
                                break;
                            case 2: case 3: case 4:
                                flag=1;
                                score=rand.nextInt(7);
                                if(score==5)
                                    score=4;
                                break;

                        }}
                    break;
                    case 6:
                    { int r=rand.nextInt(10);
                        switch(r){
                            case 0:
                                flag=0;
                                score=0;
                                how="Caught";
                                break;
                            case 1:
                                flag=0;
                                score=0;
                                how="Bowled";
                                break;
                            case 2: case 3: case 4: case 5: case 6: case 7:
                                flag=1;
                                score=rand.nextInt(7);
                                if(score==5)
                                    score=2;
                                break;
                            case 8: case 9:
                                int s=rand.nextInt(3);
                                switch(s){
                                    case 0: case 1:
                                        flag=0;
                                        score=0;
                                        how="Stumped";
                                        break;
                                    case 3:
                                        flag=0;
                                        score=1;
                                        how="Run Out";
                                        break;
                                }


                        }}
                    break;
                    default:
                    { if(idirection==2){
                        flag=0;
                        score=0;
                        int r=rand.nextInt(2);
                        switch(r){
                            case 0:
                                how="LBW";
                                break;
                            case 1:
                                how="Bowled";
                                break;

                        }
                    }else{
                        flag=1;
                        score=0;
                    }}
                }}break;
            case 4:
            {
                switch (ishot){
                    case 0:
                        flag=1;
                        score=0;
                        break;
                    case 1:
                    { int r=rand.nextInt(5);
                        switch(r){
                            case 0:
                                flag=0;
                                score=0;
                                how="Caught";
                                break;
                            case 1: case 2: case 3: case 4:
                                flag=1;
                                score=0;
                                break;
                        }}
                    break;
                    case 2: case 4: case  5:
                    { int r=rand.nextInt(7);
                        switch(r){
                            case 0: case 1:
                                flag=0;
                                score=0;
                                how="Caught";
                                break;
                            case 2: case 3: case 4: case 5:
                                flag=1;
                                score=rand.nextInt(7);
                                if(score==5)
                                    score=4;
                                break;
                            case 6:
                                flag=0;
                                score=2;
                                how="Run Out";
                                break;

                        }}break;
                    case 3: case 6:
                        flag=0;
                        score=0;
                        how="Caught";
                        break;
                    default:
                    {   flag=1;
                        score=0;}

                }
            }break;
            case 5:
            {
                if(idirection==2){
                    switch(ishot){
                        case 1:
                        {int r=rand.nextInt(3);
                            switch(r){
                                case 0:
                                    flag=1;
                                    score=0;
                                    break;
                                case 1:
                                    flag=0;
                                    score=0;
                                    how="Bowled";
                                    break;
                                case 2:
                                    flag=0;
                                    score=0;
                                    how="LBW";
                                    break;
                            }}
                        break;
                        default:
                        {   flag=0;
                            score=0;
                            int r=rand.nextInt(2);
                            switch(r){
                                case 0:
                                    how="Bowled";
                                    break;
                                case 1:
                                    how="LBW";
                                    break;
                            }
                        }
                    }
                }else{
                    flag=1;
                    score=0;
                }

            }break;
            case 6: case 7:
            {
                switch(ishot){
                    case 0:
                    { if(idirection==2){
                        flag=0;
                        score=0;
                        int r=rand.nextInt(2);
                        switch(r){
                            case 0:
                                how="LBW";
                                break;
                            case 1:
                                how="Bowled";
                                break;

                        }
                    }else{
                        flag=1;
                        score=0;
                    }}
                    break;
                    case 1:
                    {int r=rand.nextInt(6);
                        switch(r){
                            case 0:
                                flag=0;
                                score=0;
                                how="Caught";
                                break;
                            case 1:
                                flag=0;
                                score=0;
                                how="Stumped";
                                break;
                            default:
                            {  flag=1;
                                score=0;
                            }
                        }
                    }break;
                    case 2: case 3: case 4: case 5: case 6:
                    {
                        int r=rand.nextInt(13);
                        if(r<=6){
                            flag=1;
                            score=r;
                            if (score==5){
                                score=0;
                            }
                        }else{
                            flag=1;
                            score=0;
                            switch(r){
                                case 7: case 8:
                                    how="caught";
                                    break;
                                case 9: case 10: case 11:
                                    how="Stumped";
                                    break;
                                case 12:
                                    how="Run Out";
                                    break;
                            }
                        }
                    }break;
                    default:
                    { if(idirection==2){
                        flag=0;
                        score=0;
                        int r=rand.nextInt(2);
                        switch(r){
                            case 0:
                                how="LBW";
                                break;
                            case 1:
                                how="Bowled";
                                break;

                        }
                    }else{
                        flag=1;
                        score=0;
                    }}

                }
            }break;
        }
    }


    private void playInning(){ //core of the game

        int maxOver=(duration/5);     //local variables
        int batNo=0;
        int arr[] =new int[duration+1];

        while((overs<duration)&&(wickets<10)&& (runs<target)){ //inning duration

            int r=rand.nextInt(6);

            if((bl.get(r).getOvers()<maxOver)&(arr[overs])!=r){ //checking the bowler

                bl.get(r).setOvers(bl.get(r).getOvers()+1);
                bl.get(r).setHow("Bowled");
                overs++;

                try{
                    Thread.sleep(2000);
                }catch(InterruptedException e){
                    System.out.println(e);
                }
                System.out.println("\n\n\n**********************************");
                System.out.println("Starting the over no:"+overs+"\n\n"); //valuable details
                System.out.println("Overs remaining: "+(duration-overs+1));
                System.out.println("Runs to be collected: "+(target-runs));
                System.out.println("Wickets in hand: "+(10-wickets));
                System.out.println("**********************************\n");
                try{
                    Thread.sleep(2000);
                }catch(InterruptedException e){
                    System.out.println(e);
                }

                int balls=1;
                while(balls<7){ //using the overs

                    bl.get(r).deliverBall();

                    if(bl.get(r).getFlag()==0){ //checking extras

                        bl.get(r).setRuns(bl.get(r).getRuns()+1);
                        bl.get(r).setExtras(bl.get(r).getExtras()+1);
                        extras++;
                        runs++;

                        try{
                            Thread.sleep(2000);
                        }catch(InterruptedException e){
                            System.out.println(e);
                        }

                        System.out.println("\n\n"+bl.get(r).getName()+" "+bl.get(r).getAction()+" "+"Bowler "+"Bowling: "+bl.get(r).getExtra());
                        System.out.println("Total Number of extras: "+extras);
                        System.out.println("Total Score: "+runs); //display result

                        if(this.runs>=target) //checking the status
                            break;
                        else{}
                    }

                    else{ // continue with leagal a ball

                        balls++;
                        bt.get(batNo).setBalls(bt.get(batNo).getBalls()+1);

                        try{
                            Thread.sleep(2000);
                        }catch(InterruptedException e){
                            System.out.println(e);
                        }

                        System.out.print("\n\n"+bl.get(r).getName()+" "+bl.get(r).getAction()+" "+"Bowler "+"Bowling: "+bl.get(r).getType()+" ball on "+bl.get(r).getDirection());

                        bt.get(batNo).payShot(bl.get(r).getIaction(), bl.get(r).getItype(), bl.get(r).getIdirection());
                        System.out.println("You "+bt.get(batNo).getShot());

                        getResult(bt.get(batNo).getIshot(), bl.get(r).getItype(), bl.get(r).getIdirection());

                        runs=runs+score; //updating profile
                        bt.get(batNo).setRuns(bt.get(batNo).getRuns()+score);
                        bl.get(r).setRuns(bl.get(r).getRuns()+score);

                        if(flag==0){ // if the batsman is out

                            System.out.println("Out!!!..How: "+how);

                            wickets++; //updating profiles
                            bl.get(r).setWickets(bl.get(r).getWickets()+1);
                            bt.get(batNo).setHow(how);

                            System.out.println("Wicket No: "+wickets); //display result
                            System.out.println("Score for the previous ball: "+score);
                            System.out.println("Total Score: "+runs);

                            if(this.runs>=target)
                                break;
                            else{}
                            if(this.wickets>=10) //checking the status
                                break;
                            else{
                                batNo++; //getting the next batsman
                                bt.get(batNo).setHow("Not out");
                            }

                        }else{ //if not out
                            System.out.println("Score for the previous ball: "+score); //display results
                            System.out.println("Total Score: "+runs);
                            if(runs>=target)
                                break;
                            else{}

                        }
                    }
                }
                arr[overs]=r;
            }else{}
        }
    }


    private void getFinal(){ //display the final result
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
            System.out.println(e);
        }
        System.out.println("\n\n\n$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$44\n");

        if(runs>=target){
            System.out.println("\n\nCongratulation! You Won !");}
        else if(runs==(target-1)){
            System.out.println("\n\nScores are Level !");}
        else{
            System.out.println("\n\nSorry! You Lost !");}

    }
}
