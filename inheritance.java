class base {
int x;

    base ( ) {
        System.out.println("Im base class constructor");
    }

    base ( int x) {
        System.out.println("the value of x is: " + x);
        
    } 

}

class derived extends base {
    int y;

    derived (int x , int y ) {
        super(x);
        System.out.println("the value of y is: " + y);
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class inheritance {

    public static void main(String[] args) {
   
        derived one1 = new derived(5,6);
     
    }
}
