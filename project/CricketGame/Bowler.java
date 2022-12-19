package project.CricketGame;

import java.util.Random;

public class Bowler {
    Random rand=new Random();

    private String name; //attributes used
    private String action;
    private int overs=0;
    private int wickets=0;
    private int runs=0;
    private int extras=0;
    private int iaction;
    private String how="Didn't Bowl";

    private String type;
    private String direction;
    private String extra;
    private int itype;
    private int idirection;
    private int flag;


    public Bowler() {
    }

    String getAction() {
        return action;
    }

    void setAction(String action) {
        this.action = action;
    }

    int getExtras() {
        return extras;
    }

    void setExtras(int extras) {
        this.extras = extras;
    }

    String getHow() {
        return how;
    }

    void setHow(String how) {
        this.how = how;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    int getOvers() {
        return overs;
    }

    void setOvers(int overs) {
        this.overs = overs;
    }

    int getRuns() {
        return runs;
    }

    void setRuns(int runs) {
        this.runs = runs;
    }

    int getIaction() {
        return iaction;
    }

    void setIaction(int sign) {
        this.iaction = sign;
    }

    int getWickets() {
        return wickets;
    }

    void setWickets(int wickets) {
        this.wickets = wickets;
    }

    String getDirection() {
        return direction;
    }

    void setDirection(String direction) {
        this.direction = direction;
    }

    String getExtra() {
        return extra;
    }

    void setExtra(String extra) {
        this.extra = extra;
    }

    int getFlag() {
        return flag;
    }

    void setFlag(int flag) {
        this.flag = flag;
    }

    int getIdirection() {
        return idirection;
    }

    void setIdirection(int idirection) {
        this.idirection = idirection;
    }

    int getItype() {
        return itype;
    }

    void setItype(int itype) {
        this.itype = itype;
    }

    String getType() {
        return type;
    }

    void setType(String type) {
        this.type = type;
    }



    void deliverBall(){ //method to select the ball to be delivered

        int r1,r2,r3;     //local variables
        r1=rand.nextInt(7);
        r2=rand.nextInt(7);
        r3=rand.nextInt(25);
        if(r3==0){ //delivers no ball
            extra="No";
            flag=0;
        }
        else if(r3==1){ //delivers fo wide ball
            extra="Wide";
            flag=0;
        }else{ // apply the logic to generate a ball
            flag=1;
            switch(iaction){
                case 0:
                {switch(r1){
                    case 0:
                        type="Toss";
                        itype=1;
                        break;
                    case 1: case 2: case 3:
                        type="Length";
                        itype=2;
                        break;
                    case 4:
                        type="Short";
                        itype=3;
                        break;
                    case 5:
                        type="Bouncer";
                        itype=4;
                        break;
                    case 6:
                        type="Yoker";
                        itype=5;
                        break;
                }
                    switch(r2){
                        case 0:
                            direction="Leg";
                            idirection=1;
                            break;
                        case 1: case 2: case 3:
                            direction="Middle";
                            idirection=2;
                            break;
                        case 4: case 5: case 6:
                            direction="Off";
                            idirection=3;
                            break;
                    }}break;
                case 1:
                {switch(r1){
                    case 0:
                        type="Toss";
                        itype=1;
                        break;
                    case 1: case 2: case 3:
                        type="Length";
                        itype=2;
                        break;
                    case 4:
                        type="Short";
                        itype=3;
                        break;
                    case 5:
                        type="Doosra";
                        itype=6;
                        break;
                    case 6:
                        type="Gugly";
                        itype=7;
                        break;
                }
                    switch(r2){
                        case 0:
                            direction="Leg";
                            idirection=1;
                            break;
                        case 1: case 2: case 3:
                            direction="Middle";
                            idirection=2;
                            break;
                        case 4: case 5: case 6:
                            direction="Off";
                            idirection=3;
                            break;
                    }}break;
            }
        }
    }

}
