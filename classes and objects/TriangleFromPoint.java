public class TriangleFromPoint {

    private Point p1 , p2 , p3 ;

    TriangleFromPoint( ){
        p1 = new Point( 1 , 1);
        p2 = new Point( 1 , 1);
        p2 = new Point( 1 , 1);
    }

        TriangleFromPoint(Point p1 , Point p2 , Point p3 ){
        this.p1 = new Point(p1);
        this.p2 = new Point(p2);
        this.p3 = new Point(p3);
    }

    public double sideAb ( ){
        return this.p1.distance(this.p2);
    }

    public double sideAc ( ){
        return this.p1.distance(this.p3);
    }

    public double sideCb ( ){
        return this.p2.distance(this.p3);
    }

    public boolean isRightAngled ( ){
        return this.sideAc() * this.sideAc() == this.sideAb() * this.sideAb() + this.sideCb() * this.sideCb();
    }

    public String toString ( ){
        return "side 1 = " + this.sideAb() + " side 2 = " + this.sideAc() + " side 3 = " + this.sideCb() + 
        (this.isRightAngled()? " and it is right angled" : " and it is not right angled");
    }

    public static void main(String[] args) {
        Point p1 = new Point(4, 5);
        Point p2 = new Point(1, 2);
        Point p3 = new Point( p2 );

        TriangleFromPoint t1 = new TriangleFromPoint( p1 , p2, p3);
        System.out.println(t1);
    }
}

