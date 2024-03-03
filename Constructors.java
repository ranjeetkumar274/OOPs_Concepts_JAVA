public class Constructors {
    int x ;
    public Constructors(int y){ // this is a class constructor.
        x = y+y;
    }

    public static void main(String[] args) {
        Constructors MyObj = new Constructors(67); //this will call the constructor. and parameter constructor.
        System.out.println(MyObj.x);
    }
}
