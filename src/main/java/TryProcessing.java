import processing.core.PApplet;
public class TryProcessing extends PApplet{
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    int w=0,x=0,y=0,z=0;

    public static void main(String[] args) {
        PApplet.main( "TryProcessing", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH,HEIGHT);
    }

    @Override
    public void setup() {
    }

    @Override
    public void draw() {
        getCircle();
    }

    private void getCircle() {
        ellipse(w,HEIGHT/5,DIAMETER,DIAMETER);
        ellipse(x,2 *HEIGHT/5,DIAMETER,DIAMETER);
        ellipse(y,3 *HEIGHT/5,DIAMETER,DIAMETER);
        ellipse(z,4 *HEIGHT/5,DIAMETER,DIAMETER);
        w++;
        x+=2;
        y+=3;
        z+=4;
    }
}
