public class Objects {
    public String name;
    public String college;

    public Objects(String name, String college){
        this.name = name;
        this.college = college;
    }
    public static void main(String[] args) {
        Objects student1 = new Objects("ashu" , "mmmut");
        System.out.println(student1.name);
    }
}
