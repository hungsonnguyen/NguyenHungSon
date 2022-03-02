package ss6_KeThua.Bai_tap;

import java.util.Arrays;

public class Point2DPoint3d {
    public static void main(String[] args) {

        Point2D point2D = new Point2D();
        System.out.println(point2D);
        System.out.println(Arrays.toString(point2D.getXY()));

        Point2D point2D1 = new Point2D(3, 4);
        System.out.println(point2D1);
        System.out.println(Arrays.toString(point2D1.getXY()));

        Point3D point3D = new Point3D();
        System.out.println(point3D);
        System.out.println(Arrays.toString(point3D.getXYZ()));

        Point3D point3D1 = new Point3D(1, 2, 3);
        System.out.println(point3D1);
        System.out.println(Arrays.toString(point3D1.getXYZ()));

    }
}

class Point2D {
    public float x = 0;
    public float y = 0;

    public Point2D() {

    }

    public Point2D(float x, float y) {
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

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float[] array = {x, y};
        return array;
    }

    @Override
    public String toString() {
        return "In 2D "
                + " (" + x + " , " + y + " ) ";
    }
}

class Point3D extends Point2D {
    public float z = 0;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {

    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public float[] getXYZ() {
        float[] array = {x, y, z};
        return array;
    }

    @Override
    public String toString() {
        return "In 3D"
                + " (" + x + " , " + y + " , " + z + " ) ";

    }
}