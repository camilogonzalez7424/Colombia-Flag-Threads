package thread;

import model.ColombiaFlag;

import java.io.IOException;

public class ColombiaFlagThread extends Thread {

    private ColombiaFlag colombiaflag;

    public ColombiaFlagThread(int color, int sleep, int position, int large){
        colombiaflag = new ColombiaFlag(color,sleep,position,large);
    }

    public void run(){
        try {
            colombiaflag.initialize();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
