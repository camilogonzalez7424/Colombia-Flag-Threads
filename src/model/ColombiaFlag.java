package model;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class ColombiaFlag {
    public final static String ESC = "\u001b[";
    private int height = 1;
    private double width = 4;
    private char space = ' ';
    private int color;
    private int sleep;
    private int large;
    private int position;
    private BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public ColombiaFlag(int color, int sleep, int position, int large){
        this.color = color;
        this.sleep = sleep;
        this.position = position;
        this.large = large;
    }

    public void initialize() throws IOException, InterruptedException {
        bw.write(ESC+position+";"+0+"f");

        //Si se quiere una bandera más grande aumentar height a 200.
        for(int j = 0; j < height && height<100; j++ ){
            for(int i = 0; i < large; i++){
                bw.write(ESC+color+"m"+space);
                bw.flush();
                Thread.sleep(sleep);
                int temPosition = position+i;
                bw.write(ESC+temPosition+";"+height+"f");
            }

            bw.write(ESC+color+"m"+space);
            bw.flush();
            height++;
            bw.write(ESC+position+";"+height+"f");
        }

    }

    //Getters and Setters

    //No son necesarios pero se evitan warnings.
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public char getSpace() {
        return space;
    }

    public void setSpace(char space) {
        this.space = space;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getSleep() {
        return sleep;
    }

    public void setSleep(int sleep) {
        this.sleep = sleep;
    }

    public int getLarge() {
        return large;
    }

    public void setLarge(int large) {
        this.large = large;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
