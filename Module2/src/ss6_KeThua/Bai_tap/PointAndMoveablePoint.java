package ss6_KeThua.Bai_tap;

public class PointAndMoveablePoint {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point);

        Point point1 = new Point(2,3);
        System.out.println("2D"+point1);


        MoveblePoint moveblePoint1 = new MoveblePoint(0.0f, 0.0f, 0.0f,0.0f);
        System.out.println("Move"+moveblePoint1);

        moveblePoint1.setSpeed(4.0f,5.0f);
        moveblePoint1.move();
        System.out.println("1 :"+moveblePoint1);

        moveblePoint1.setSpeed(1.0f,2.0f);
        moveblePoint1.move();
        System.out.println("2 :"+moveblePoint1);

        moveblePoint1.setSpeed(3.0f,4.0f);
        moveblePoint1.move();
        System.out.println("3 :"+moveblePoint1);

        moveblePoint1.move();
        System.out.println("4 :"+moveblePoint1);


    }
}
    class Point{
        public float x = 0;
        public float y = 0;

        public Point(){

        }
        public Point(float x, float y) {
            this.x = x;
            this.y = y;
        }

        public float getX() {
            return x;
        }

        public void setX(float x) {
            this.x = x;
        }

        public float getY() {
            return y;
        }

        public void setY(float y) {
            this.y = y;
        }
        public void setXY(float x, float y){
            this.x = x;
            this.y = y;
        }
        public float[] getXY(){
            float[] array = {x,y};
            return array;
        }

        @Override
        public String toString() {
            return "In 2D "
                    +" (" + x + " , " + y + " ) ";
        }

}
class MoveblePoint extends Point{
    public float xSpeed = 0;
    public float ySpeed = 0;

    public MoveblePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveblePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MoveblePoint(){

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
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        float[] arr = {xSpeed, ySpeed};
        return arr;
    }


    @Override
    public String toString() {
        return "MoveblePoint "
                +" (" + x + " , " + y + " ), speed = ( " +xSpeed + ", "+ ySpeed +" )";
    }
    public MoveblePoint move(){
        x += xSpeed;
        y += ySpeed;
        return this;
    }
}