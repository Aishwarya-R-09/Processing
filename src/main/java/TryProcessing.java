import processing.core.PApplet;

public class TryProcessing extends PApplet{
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;

    drawCircle circleOne = new drawCircle(this,0,HEIGHT/5,1);
    drawCircle circleTwo = new drawCircle(this,0,2 * HEIGHT/5,2);
    drawCircle circleThree = new drawCircle(this,0,3 * HEIGHT/5,3);
    drawCircle circleFour = new drawCircle(this,0,4 * HEIGHT/5,4);

    public static void main(String[] args) {
        PApplet.main( "TryProcessing", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH,HEIGHT);
    }

    @Override
    public void draw() {
        circleOne.draw();
        circleTwo.draw();
        circleThree.draw();
        circleFour.draw();
    }

}
