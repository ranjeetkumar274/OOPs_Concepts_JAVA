class animal{  //base class or parent class
    public String name;  // fields of basse class
    public int age;
    private String breed;

    void setname(String name){
        this.name = name;
    }

    void setage(int age){
        this.age = age;
    }

    void display(){
        System.out.println("Name :"+ name);
        System.out.println("age :"+ age);
    }

     void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }
}
class Dog extends animal{  //inherited class from animal parent class
    String breed;

    void setBreed(String breed){
        this.breed = breed;
    }

    void display(){
        System.out.println("breed :" +breed);
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.setname("Buddy");
        myDog.setage(3);
        myDog.display();
    }
}
