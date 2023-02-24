package com.bridgelabz.assignmentsrfp259.day04.snakeladder;

public class SnakeLadder {
    public static void main(String[] args) {
        System.out.println("Welcome To Snake & Ladder Simulator");
        System.out.println();
        int singlePlayer = 0;
        System.out.println("Starting Position Of Single Player is :" +singlePlayer);
        int dieCheck = (int) Math.floor(Math.random() * 10) % 6 + 1;
        System.out.println("Player Rolls The Die & Get The Number :" +dieCheck);
    }
}
