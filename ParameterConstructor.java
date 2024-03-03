public class ParameterConstructor {
    int marks;
    String name;

    //create a class constructor
    public ParameterConstructor(int a, String s){
        marks = a;
        name = s;
    }

    public static void main(String[] args) {
        ParameterConstructor MyObj = new ParameterConstructor(45,"ashu yadav");
        System.out.println("Name of the student is " +MyObj.name);
        System.out.println("The marks are "+MyObj.marks);
    }
}
