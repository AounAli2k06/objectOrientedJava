
class store {
    int id;
    String name;
    int price;

    public void printDetails(int price) {
        if (price > 1000) {

            System.out.println("the product name is " + name + " and it is a luxury item and its price is " + price + "rs");
        } else {

            System.out
                    .println("the product name is " + name + " and it is a not luxury item and its price is " + price + "rs");
        }
    }
}

public class new1 {
    public static void main(String[] args) {
        store item1 = new store( );
        item1.id = 1;
        item1.name = "toffee";
        item1.price = 1 ;  
        item1.printDetails( item1.price);
    }

}