package ui;

import thread.ColombiaFlagThread;

public class Main {
    public final static String ESC =  "\u001b[";
    public final static int YELLOW = 43;
    public final static int BLUE = 44;
    public final static int RED = 41;

    public static void main(String[] args){
        System.out.println(ESC+"2J");

        printFlag();

    }

    public static void printFlag(){
        ColombiaFlagThread colorYellow = new ColombiaFlagThread(YELLOW,5,1,10);
        ColombiaFlagThread colorBlue = new ColombiaFlagThread(BLUE,15,11,5);
        ColombiaFlagThread colorRed = new ColombiaFlagThread(RED,25,16,5);
        colorYellow.start();
        colorBlue.start();
        colorRed.start();
    }
}
