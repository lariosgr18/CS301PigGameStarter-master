package edu.up.cs301.pig;

import edu.up.cs301.game.infoMsg.GameState;

/**
 * Created by lariosgr18 on 10/14/2015.
 */


public class PigGameState extends GameState{

    private int playerID;
    private int player1Score;
    private int player2Score;
    private int currentTotal;
    private int currentDie;


    public PigGameState (){
        playerID=0;
        player1Score=0;
        player2Score=0;
        currentTotal=0;
        currentDie=0;


    }

    public int getPlayerID() {
        return playerID;
    }

    public int getPlayer1Score() {
        return player1Score;
    }

    public int getPlayer2Score() {
        return player2Score;
    }

    public int getCurrentTotal() {
        return currentTotal;
    }

    public int getCurrentDie() {
        return currentDie;
    }

    public PigGameState ( int plyID1, int ply1Score, int ply2Score, int curTot, int curDie ){
        playerID= plyID1;
        player1Score= ply1Score;
        player2Score= ply2Score;
        currentTotal= curTot;
        currentDie= curDie;


    }




}
