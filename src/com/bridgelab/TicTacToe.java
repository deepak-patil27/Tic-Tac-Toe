package com.bridgelab;

import java.util.Scanner;

public class TicTacToe {
	static char[] board = new char[10];
	static Scanner scr = new Scanner(System.in);
	static char playerLetter;
	static char computerLetter;
	static int position;


	static void createBoard(char[] board) {

		for (int i = 1; i < 10; i++) {
			board[i] = ' ';
		}
	}

	static void getLetter() {
		System.out.println("Choose the letter(X or O)");
		playerLetter = scr.next().toUpperCase().charAt(0);
		computerLetter = (playerLetter == 'X') ? 'O' : 'X';
		System.out.println("Your Letter is " + playerLetter);
		System.out.println("Computer Letter is " + computerLetter);
	}

	static void showBoard(char[] board2) {
		System.out.println(" " + board[1] + "  |  " + board[2] + "   |" + board[3]);
		System.out.println(" " + board[4] + "  |  " + board[5] + "   |" + board[6]);
		System.out.println(" " + board[7] + "  |  " + board[8] + "   |" + board[9]);
	}

	public static void makeMove() {
		int playLocation;
		System.out.println("Enter Location 1-9 to Make Move");
		playLocation = scr.nextInt();
		if (playLocation < 10 && playLocation > 0) {
			board[playLocation] = playerLetter;			
		} else {
			System.out.println("Invalid Choice");
		}
	}
	
	static void playerMove() {
		System.out.println("Enter the new position for move(1-9)");
		position = scr.nextInt();
		while (board[position] != ' ') {
			System.out.println("Invalid option!! Please Try Again");
			position = scr.nextInt();
		}
		makeMove();
        System.out.println("Player move to position "+position);
	}
	
	static CurrentPlayer toss(){
        if((int)(Math.random()*10)%2==1){
            System.out.println("\nPlayer Won The Toss! Player Starts");
            return CurrentPlayer.PLAYER;
        }
        else{
            System.out.println("\nComputer Won The Toss! Computer Starts");
            return CurrentPlayer.COMPUTER;
        }
    }
    public static void main(String[] args) {
    	System.out.println("----- Welcome To The Game Of Tic Tac Toe -----");
        createBoard(board);
        getLetter();
        makeMove();
        showBoard(board);
        playerMove();
        showBoard(board);
        toss();
        

    }

}
