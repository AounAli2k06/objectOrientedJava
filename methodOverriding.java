class first {
    int a;
    first( ) {
        System.out.println( " constructor");
    }
    public void meth1 ( ) {
        System.out.println( "Im method 1 of class first");
    }
}

class second extends first {
    
    @Override
    public void meth1() {
        System.out.println( "Im method 1 of class second");
    }
    public void meth2 ( ) {
        System.out.println( "Im method 2 of class second");

    }
}

public class methodOverriding {

    public static void main(String[] args) {
        second s = new second( );
        s.meth1( );
    }
}
