import processing.core.PApplet;

public class TryProcessing extends PApplet {

    public static final int WIDTH = 600;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    int unitsperframe = 1;
    public static final int BALLCOUNT=4;
    Ball[] balls=new Ball[BALLCOUNT];

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
        for(int i=1;i<=BALLCOUNT;i++) {
            balls[i-1] = new Ball(i * HEIGHT / 5, DIAMETER, unitsperframe);
            incrementUnitsPerFrame();
        }
    }

    @Override
    public void draw() {
        for(int i=0;i<BALLCOUNT;i++){
            moveBall(balls[i]);
        }
    }

    private void moveBall(Ball ball) {
        ellipse(ball.ballSpeed, ball.position, ball.diameter, ball.diameter);
        ball.incrementSpeed();
    }

    private void incrementUnitsPerFrame(){
        unitsperframe+=1;
    }


}
