package ch7;

public class PointTest2 {
    public static void main(String[] args) {
        Point3D2 p3 = new Point3D2();
        System.out.println(p3.getLocation());
    }
}

class Point3D2 extends Point2 {
    int z;

    public Point3D2() {
        this(100, 200, 300);
    }
    public Point3D2(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    @Override
    String getLocation() {
        return x + " " + y + " " + z;
    }
}
