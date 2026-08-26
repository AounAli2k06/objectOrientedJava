class Phone {
     boolean isCameraOpen = true;
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

class FlipPhone extends Phone {

    void accessInsta ( ) {
        System.out.println("opening insta");
    }

    void on ( ) {
        System.out.println("turning on flip phone " + isCameraOpen);
    }
}

class Samsung extends Phone {

    void accessInsta ( ) {
        System.out.println("opening insta");
    }

    void on ( ) {
        System.out.println("turning on samsung phone");
    }
}

public class dynamicMethod {
    public static void main(String[] args) {
        Phone  phones [] = {new FlipPhone(), new SmartPhone(), new Samsung()};

        for (Phone phone : phones) {
            phone.on();
        }
        
        // Phone obj = new SmartPhone( );
        // obj.on( );

    }

}
