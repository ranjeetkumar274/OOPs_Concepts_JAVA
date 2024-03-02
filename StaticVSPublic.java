public class StaticVSPublic {
    //Static method
    static void method1(){
        System.out.println("Hello static method.");
    }

    //Public method
    public void method2(){
        System.out.println("Hello public method.");
    }

    public static void main(String[] args) {
        //calling the Static function without creating object
        method1();

        //calling the public function by creating object
        StaticVSPublic MyObj = new StaticVSPublic();
        MyObj.method2();
    }


}
