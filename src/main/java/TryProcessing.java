import processing.core.PApplet;

public class TryProcessing extends PApplet {

    public static final int WIDTH = 600;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    int unitsperframe = 1;
    Ball ball1;

    public static void main(String[] args) {
        PApplet.main("TryProcessing",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        ball1 = new Ball(HEIGHT/5, DIAMETER, unitsperframe);
    }

    @Override
    public void draw() {
        moveBall(ball1);
    }

    private void moveBall(Ball ball) {
        ellipse(ball.ballSpeed,ball.position,ball.diameter,ball.diameter);
        ball.incrementSpeed();
    }


}
