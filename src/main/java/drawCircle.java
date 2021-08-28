import processing.core.PApplet;
public class drawCircle {
    public static final int DIAMETER = 10;
    int xValue;
    int yValue;
    int speed;
    PApplet canvas;
    public drawCircle(PApplet canvas, int x, int y, int speed){
        this.canvas = canvas;
        xValue = x;
        yValue = y;
        this.speed = speed;
    }

    public void draw(){
        canvas.ellipse(xValue,yValue,DIAMETER,DIAMETER);
        xValue+=speed;
    }
}
