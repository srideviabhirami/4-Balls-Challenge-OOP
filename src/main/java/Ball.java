import processing.core.PApplet;

public class Ball {
    private int xPosition;
    private int yPosition;
    private int diameter;
    private int speed;

    public Ball(int xPosition, int yPosition, int diameter, int speed) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.diameter = diameter;
        this.speed = speed;
    }

    public void moveBall(PApplet pApplet) {
        pApplet.ellipse(xPosition, yPosition, diameter, diameter);
        incrementXPosition();
    }

    public void incrementXPosition() {
        xPosition += speed;
    }
}
