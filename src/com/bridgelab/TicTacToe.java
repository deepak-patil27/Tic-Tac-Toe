package com.bridgelab;

import java.util.Scanner;

public class TicTacToe {

	static char[] board = new char[10];
    static Scanner scr = new Scanner(System.in);
    static char playerLetter;
    static char computerLetter;
    static void createBoard(char[] board){

        for(int i=1;i<10;i++){
            board[i]=' ';
        }
    }
    static void getLetter(){
        System.out.println("Choose the letter(X or O)");
        playerLetter = scr.next().toUpperCase().charAt(0);
        computerLetter = (playerLetter=='X')?'O':'X';
        System.out.println("Your Letter is "+ playerLetter);
        System.out.println("Computer Letter is "+ computerLetter);
    }
    static void showBoard(char[] board){
        System.out.println(" "+ board[1]+"  |"+board[2]+"    |"+board[3]);
        System.out.println(" "+ board[4]+"  |"+board[5]+"    |"+board[6]);
        System.out.println(" "+ board[7]+"  |"+board[8]+"    |"+board[9]);
    }

	public static void main(String[] args) {
		System.out.println("----------Welcome To Tic Tac Toe----------");
		createBoard(board);
        getLetter();
        showBoard(board);

	}

}
