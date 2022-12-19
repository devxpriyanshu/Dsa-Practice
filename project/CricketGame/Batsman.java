package project.CricketGame;

import java.util.Scanner;

public class Batsman {
    Scanner input=new Scanner(System.in);

    private String name;  //attributes used
    private int runs=0;
    private int balls=0;
    private String how="Didn't Bat";
    private int number;

    private String shot="didn't play a shot....";
    private int ishot=-1;

    public Batsman() {
    }

    Batsman(int number) {
        this.number=number;
    }

    int getBalls() {
        return balls;
    }

    void setBalls(int balls) {
        this.balls = balls;
    }

    String getHow() {
        return how;
    }

    void setHow(String how) {
        this.how = how;
    }

    int getIshot() {
        return ishot;
    }

    void setIshot(int ishot) {
        this.ishot = ishot;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    int getNumber() {
        return number;
    }

    void setNumber(int number) {
        this.number = number;
    }

    int getRuns() {
        return runs;
    }

    void setRuns(int runs) {
        this.runs = runs;
    }

    String getShot() {
        return shot;
    }

    void setShot(String shot) {
        this.shot = shot;
    }


    void payShot(int iaction, int itype, int idirection){
        long startTime=System.currentTimeMillis();
        long endTime=startTime+4000L;

        while(true){
            try{
                System.out.print("\nBatsman "+number+"  Play a shot :");
                ishot=input.nextInt();
            }catch(Exception e){
                ishot=8;
            }

            if((ishot!=-1)||(System.currentTimeMillis()>=endTime))
                break;
        }


        if((idirection==1)&(ishot==4)) //get the mismatches in the shot
            ishot=8;
        if((iaction==1)&(ishot==5))
            ishot=8;
        if((itype==4)&&(ishot==6))
            ishot=8;
        if((itype==5)&&((ishot==5)|(ishot==2)))
            ishot=8;


        switch(ishot){  //details of the played shot
            case -1:
                shot="didn,t play a shot....";
                break;
            case 0:
                shot="left the ball behind....";
                break;
            case 1:
                shot="played a defensive shot....";
                break;
            case 2:
                shot="played a pull shot....";
                break;
            case 3:
                shot="played a drive shot....";
                break;
            case 4:
                shot="played a cut shot....";
                break;
            case 5:
                shot="played a hook shot....";
                break;
            case 6:
                shot="played a sweep shot....";
                break;
            default:
                shot="played an unwanted shot....";
        }
    }
}
