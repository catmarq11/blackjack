package com.games.blackjack.controller;

import com.games.blackjack.Dealer;

class BlackJackApp {
    private boolean gameOver;
    private Dealer dealer = new Dealer();


    public void execute() {
        welcome();
        promptForHelp();
        promptForPlayer();
        startGame();
    }

    private void startGame() {
        while (!gameOver) {
            // do the rounds in BlackJack

            // gameOver = re-evaluated each time thru the loop
        }
    }

    private void promptForPlayer() {

    }

    private void promptForHelp() {

    }

    private void welcome() {
        
    }

}
