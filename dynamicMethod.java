class Phone {

    void showTime ( ) {
        System.out.println("its 8 am ");
    }

    void on ( ) {
        System.out.println("turning on phone");
    }
}

class SmartPhone extends Phone {

    void accessInsta ( ) {
        System.out.println("opening insta");
    }

    void on ( ) {
        System.out.println("turning on smart phone");
    }
}
public class dynamicMethod {
    public static void main(String[] args) {
        
        Phone obj = new SmartPhone( );
        obj.on( );

    }

}
