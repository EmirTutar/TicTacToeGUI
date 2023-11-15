package com.j4n_r.tictactoegui;

import java.util.Random;

public class CPU extends Controller {
    Random randomInt = new Random();

    public void cpuPlayRound() {
        while (getCounter() % 2 == 0) {
            switch (randomInt.nextInt(0, 9)) {
                case 0:
                    button0OnAction();
                    break;
                case 1:
                    button1OnAction();
                    break;
                case 2:
                    button2OnAction();
                    break;
                case 3:
                    button3OnAction();
                    break;
                case 4:
                    button4OnAction();
                    break;
                case 5:
                    button5OnAction();
                    break;
                case 6:
                    button6OnAction();
                    break;
                case 7:
                    button7OnAction();
                    break;
                case 8:
                    button8OnAction();
                    break;
                default:
                    break;
            }
        }
    }




}
