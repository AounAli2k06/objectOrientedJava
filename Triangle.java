class Triangle{
    double s1 ,s2 ,s3,a1,a2,a3;
    double res;

    Triangle( double s1, double s2,double s3, double a1, double a2,double a3){
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
    }
    Triangle( ){
        this.s1 = 1;
        this.s2 = 1;
        this.s3 = 1;
        this.a1 = 1;
        this.a2 = 1;
        this.a3 = 1;
    }
    
    double perimeterOfTriangle( double s1, double s2,double s3 ){
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        return res = s1 + s2 + s3;
    }
    
    double areaOfTriangle( double s1, double s2,double s3 ){
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        
        double s = s1 + s2 + s3;
        return res = Math.sqrt( s * (s - s2) * (s - s2) * (s - s3));
    }
    
    double missingAngle ( double a1, double a2){
        this.a1 = a1;
        this.a2 = a2;
        return res = 180 - a1 - a2;
    }

    void show (double res ){
        System.out.println(res);
    }


    public static void main(String[] args) {
        Triangle tri = new Triangle( );

        tri.show( 
            tri.perimeterOfTriangle(2, 6, 1)
        ); 


    }
}
