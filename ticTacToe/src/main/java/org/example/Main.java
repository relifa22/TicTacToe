package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        char[] pos = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};

        Scanner scanner = new Scanner(System.in);
        int input;
        char turn = 'x';
        int currentturn = 1;

        while(true) {
            do {
                System.out.println("Enter a position: ");
                input = scanner.nextInt();
            } while (pos[input - 1] == 'x' || pos[input - 1] == '0');


            pos[input - 1] = turn;

            System.out.println("\n " + pos[6] + " | " + pos[7] + " | " + pos[8] + " ");
            System.out.println("---+---+---");
            System.out.println(" " + pos[3] + " | " + pos[4] + " | " + pos[5] + " ");
            System.out.println("---+---+---");
            System.out.println(" " + pos[0] + " | " + pos[1] + " | " + pos[2] + " \n ");

            if (pos[0] == turn && pos[1] == turn && pos[2] == turn
                    || pos[3] == turn && pos[4] == turn && pos[5] == turn
                    || pos[6] == turn && pos[7] == turn && pos[8] == turn
                    || pos[0] == turn && pos[3] == turn && pos[6] == turn
                    || pos[1] == turn && pos[4] == turn && pos[7] == turn
                    || pos[2] == turn && pos[5] == turn && pos[8] == turn
                    || pos[0] == turn && pos[4] == turn && pos[8] == turn
                    || pos[2] == turn && pos[4] == turn && pos[6] == turn){

                System.out.println(turn + " is a winner!");
                break;
            }

                if (turn == 'x') {
                    turn = '0';
                } else if (turn == '0') {
                    turn = 'x';
                }

            currentturn++;
                if (currentturn > 9){
                    System.out.println("draw");
                    break;
                }


        }


    }
}