

public class Ball{
    int position;
    int diameter;
    int ballSpeed;
    int unitsPerFrame;

    public Ball( int position, int diameter,int unitsPerFrame) {
        this.position = position;
        this.diameter = diameter;
        this.ballSpeed = 0;
        this.unitsPerFrame = unitsPerFrame;
    }

    public void incrementSpeed(){
        ballSpeed+=unitsPerFrame;
    }
}
