public class App {
    public static void main(String[] args) {
        Student s = new Student();
        s.age = 19;
        s.cource = 2;
        s.name = "Magerram Zeynalov";
        s.IsAlive = true;
        System.out.println(s);
    }


}
class Student {
    public String name;
    public int age;
    public int cource;
    public boolean IsAlive;

    public String toString(){
        return this.name + " " + this.age + " y.o.";
    }
}