public class MoveablePoint extends Point{
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MoveablePoint() {
    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "MoveablePoint{" + "(x, y)= (" +super.getX()+ ", "+super.getY()+ "), "+
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                "} ";
    }

    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        return new float[]{this.getxSpeed(), this.getySpeed()};
    }
    public MoveablePoint move(){
        this.x += this.xSpeed;
        this.y += this.ySpeed;
        return this;
    }

}
