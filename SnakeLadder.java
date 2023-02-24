package com.bridgelabz.assignmentsrfp259.day04.snakeladder;

public class SnakeLadder {
    public static void main(String[] args) {
        System.out.println("Welcome To Snake & Ladder Simulator");
        System.out.println();
        int singlePlayer = 0;
        System.out.println("Starting Position Of Single Player is :" + singlePlayer);
        int dieCheck = (int) Math.floor(Math.random() * 10) % 6 + 1;
        System.out.println("Player Rolls The Die & Get The Number :" + dieCheck);
        int optionCheck = (int) Math.floor(Math.random() * 10) % 3;

        switch (optionCheck) {
            case 0:
                singlePlayer += dieCheck;
                System.out.println("Player Gets a Ladder & Player Moves ahead By Number Of Position :" + singlePlayer);

                System.out.println("Player Current Position :" + singlePlayer);
                break;

            case 1:
                singlePlayer -= dieCheck;
                System.out.println("Player Bites By Snake & Player Moves Behind By Number Of Position :" + singlePlayer);

                System.out.println("Player Current Position :" + singlePlayer);
                break;

            case 2:
                singlePlayer += 0;
                System.out.println("No Play - Player Stay At Same Position");
                System.out.println("Player Current Position :" + singlePlayer);
                break;
        }
    }
}
