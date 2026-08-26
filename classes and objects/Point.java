public class Point {
    private double x ,y;

    Point( ){
        this.x = 0.0;
        this.y = 0.0;
    }

    Point(double x , double y ){
        this.x = x;
        this.y = y;
    }

    Point(Point p ){
        this.x = p.x;
        this.y = p.y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void show ( ){
        System.out.println("the val of (x , y) is: (" + this.x + " , " + this.y + ")" );
    }

    public double distance (Point p ){
        return Math.sqrt((p.y - this.y) * (p.y - this.y) + (p.x - this.x) * (p.x - this.x) );
    }

    public double distance (Point p1 , Point p2 ){
        return Math.sqrt((p2.y - p1.y) * (p2.y - p1.y) + (p2.x - p1.x) * (p2.x - p1.x) );
    }

    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point(1,2);
        Point p3 = new Point(p2 );

        p3.show();
    }
}
