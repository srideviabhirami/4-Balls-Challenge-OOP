import processing.core.PApplet;

public class TryProcessing extends PApplet {

    public static final int WIDTH = 600;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    int speed = 1;
    public static final int BALL_COUNT = 4;
    Ball[] balls = new Ball[BALL_COUNT];

    public static void main(String[] args) {
        PApplet.main("TryProcessing", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        initialiseBalls();
    }


    private void initialiseBalls() {
        for (int i = 1; i <= BALL_COUNT; i++) {
            balls[i - 1] = new Ball(0, i * HEIGHT / 5, DIAMETER, speed);
            incrementSpeed();
        }
    }

    @Override
    public void draw() {
        for (int i = 0; i < BALL_COUNT; i++) {
            balls[i].moveBall(this);
        }
    }

    private void incrementSpeed() {
        speed += 1;
    }

}
